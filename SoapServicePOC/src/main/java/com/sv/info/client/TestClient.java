package com.sv.info.client;

import com.sv.info.ipservice.GeoIPService;
import com.sv.info.ipservice.GeoIPServiceSoap;

public class TestClient {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("You need to pass one IP address");
		} else {
			String ipAddress = args[0];
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap geoIpServiceSoap = ipService.getGeoIPServiceSoap();
			String getLocation = geoIpServiceSoap.getIpLocation(ipAddress);
			System.out.println(getLocation);
		}
	}

}
