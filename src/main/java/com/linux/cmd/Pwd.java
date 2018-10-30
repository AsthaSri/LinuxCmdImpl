package com.linux.cmd;

import java.io.File;

public class Pwd {

	public void getPwd(String cmd) {
		try {
			if (cmd.equals("pwd")) {
				final String path = new File(Pwd.class.getProtectionDomain().getCodeSource().getLocation().toURI())
						.getPath();
				System.out.println(path);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
