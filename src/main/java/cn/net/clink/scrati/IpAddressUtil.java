package cn.net.clink.scrati;

import org.apache.log4j.Logger;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 * 获取序列网卡上第一个IP地址, 外网地址优先返回
 */
public class IpAddressUtil {

	private static final Logger logger = Logger.getLogger(IpAddressUtil.class);

	public static String getFristIPv4() {
		// 外网IP
		String wanIp 	= null;
		// 本地IP，如果没有配置外网IP则返回它
		String lanIp 	= null;
		try{
			Enumeration<NetworkInterface> netInterfaces =
					NetworkInterface.getNetworkInterfaces();
			boolean found = false;
			Enumeration<InetAddress> address;
			while (!found && netInterfaces.hasMoreElements()) {
				address = netInterfaces.nextElement().getInetAddresses();
				while (address.hasMoreElements()) {
					InetAddress inetAddress = address.nextElement();
					if(!inetAddress.isLoopbackAddress() &&
							!inetAddress.getHostAddress().contains(":")){
						if (!inetAddress.isSiteLocalAddress()) {
							// 外网IP
							wanIp = inetAddress.getHostAddress();
							found = true;
							break;
						} else if (lanIp == null) {
							// 内网IP
							lanIp = inetAddress.getHostAddress();
						}
					}
				}
			}
		} catch(Throwable th) {
			logger.error("< Get First IPv4 On Error", th);
		}
		if (wanIp != null && !"".equals(wanIp)) return wanIp;
		return lanIp;
	}
}
