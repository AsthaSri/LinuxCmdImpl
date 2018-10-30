package com.linux.cmd;

import java.util.Scanner;

public class LinuxCommands {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter command: ");
			String commands = sc.nextLine();
			String command[] = commands.split(" ");
			switch (command[0]) {
			case "pwd":
				Pwd pwd = new Pwd();
				pwd.getPwd(command[0]);
				break;
			case "mkdir":
				Mkdir mkdir = new Mkdir();
				mkdir.getMkDir(command[0], command[1]);
				break;
			default:
				System.out.println("command not found");
			}
		}
	}

}
