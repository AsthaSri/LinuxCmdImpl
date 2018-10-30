package com.linux.cmd;

import java.io.File;

public class Mkdir {
	public void getMkDir(String cmd, String name) {
		if (cmd.equals("mkdir")){
			File theDir = new File(name);
			if (!theDir.exists()) {
			    try{
			        theDir.mkdir();
			    } 
			    catch(Exception se){
			        se.printStackTrace();
			    }        
			}
		}
	}
}
