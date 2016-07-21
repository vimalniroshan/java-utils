package com.sparg.java;

import com.sparg.java.utils.IpAddressMatcher;
import com.sparg.java.utils.IpAddressV4CIDRMatcher;
import com.sparg.java.utils.IpAddressV6CIDRMatcher;

/**
 * @author: vimal.sengoden
 * Date: 7/12/2016
 * Time: 6:25 PM
 */
public class TestIPAddressMatcher {

    public static void main(String[] args) {
        IpAddressMatcher ipAddressV4CidrMatcher = new IpAddressV4CIDRMatcher("192.168.8.92/21");

        System.out.println(String.format("192.168.7.91 isAllowed %s", ipAddressV4CidrMatcher.matches("192.168.7.91")));
        System.out.println(String.format("192.168.14.91 isAllowed %s", ipAddressV4CidrMatcher.matches("192.168.14.91")));


        /*System.out.println(String.format("192.168.8.91 isAllowed %s", ipAddressV4CidrMatcher.matches("192.168.8.91")));
        System.out.println(String.format("192.168.9.91 isAllowed %s", ipAddressV4CidrMatcher.matches("192.168.9.91")));
        System.out.println(String.format("192.168.10.91 isAllowed %s", ipAddressV4CidrMatcher.matches("192.168.10.91")));
        System.out.println(String.format("192.168.11.91 isAllowed %s", ipAddressV4CidrMatcher.matches("192.168.11.91")));
        System.out.println(String.format("192.168.12.91 isAllowed %s", ipAddressV4CidrMatcher.matches("192.168.12.91")));
        System.out.println(String.format("192.168.13.91 isAllowed %s", ipAddressV4CidrMatcher.matches("192.168.13.91")));
        System.out.println(String.format("192.168.14.91 isAllowed %s", ipAddressV4CidrMatcher.matches("192.168.14.91")));
        System.out.println(String.format("192.168.15.91 isAllowed %s", ipAddressV4CidrMatcher.matches("192.168.15.91")));
        System.out.println(String.format("192.168.15.255 isAllowed %s", ipAddressV4CidrMatcher.matches("192.168.15.255")));
        System.out.println(String.format("192.168.15.0 isAllowed %s", ipAddressV4CidrMatcher.matches("192.168.15.0")));
        System.out.println(String.format("192.168.15.91 isAllowed %s", ipAddressV4CidrMatcher.matches("192.168.15.91")));
        System.out.println(String.format("192.168.16.91 isAllowed %s", ipAddressV4CidrMatcher.matches("192.168.16.91")));
        System.out.println(String.format("192.168.17.91 isAllowed %s", ipAddressV4CidrMatcher.matches("192.168.17.91")));
        System.out.println(String.format("192.168.18.91 isAllowed %s", ipAddressV4CidrMatcher.matches("192.168.18.91")));
        System.out.println(String.format("192.168.19.91 isAllowed %s", ipAddressV4CidrMatcher.matches("192.168.19.91")));*/


        IpAddressMatcher ipAddressV6CidrMatcher;
        ipAddressV6CidrMatcher = new IpAddressV6CIDRMatcher("2001:DB8::f/126");
        ipAddressV6CidrMatcher = new IpAddressV6CIDRMatcher("2001:db8:a0b:12f0::1/120");
        ipAddressV6CidrMatcher = new IpAddressV6CIDRMatcher("2001:01ff:ffff:ffff:ffff:ffff:ffff:ffff/128");

    }
}
