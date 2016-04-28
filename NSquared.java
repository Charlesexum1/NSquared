/*
 * NSquared.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;
public class NSquared {
	
	private int sum = 0;
	
	private void squareN(){
		Scanner keys = new Scanner(System.in);
		System.out.println("Enter an integer.");
		int n = keys.nextInt();
		for (int x = 1; x <= n; x++) {
			sum = sum + (x * x);
			}
		System.out.println("Sum of all x^2 of factorial n: " + sum);	
		}
	
	public static void main (String args[]) {
		
		NSquared demo = new NSquared();
		demo.squareN();
	}
}

