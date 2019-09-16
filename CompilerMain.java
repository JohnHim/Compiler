import java.util.*;
import java.io.*;


public class CompilerMain {
	static HashMap<String,Integer> MAP = new HashMap();	//maps keyword to corresponding index

	public static void main(String[] args) {
		MAP.put(",",6);
		MAP.put(";", 7);
		MAP.put("prog", 10);
		MAP.put("main", 11);
		MAP.put("fcn", 12);
		MAP.put("class", 13);
		MAP.put("float", 14);
		MAP.put("int", 15);
		MAP.put("string", 16);
		MAP.put("prog", 17);
		MAP.put("if", 18);
		MAP.put("elseif", 19);
		MAP.put("else", 20);
		MAP.put("while", 21);
		MAP.put("input", 22);
		MAP.put("print", 23);
		MAP.put("new", 24);
		MAP.put("return", 25);
		MAP.put("var", 26);
		MAP.put("<", 31);
		MAP.put(">", 32);
		MAP.put("{", 33);
		MAP.put("}", 34);
		MAP.put("[", 35);
		MAP.put("]", 36);
		MAP.put("(", 37);
		MAP.put(")", 38);
		MAP.put("*", 41);
		MAP.put("^", 42);
		MAP.put(":", 43);
		MAP.put(".", 44);
		MAP.put("=", 45);
		MAP.put("-", 46);
		MAP.put("+", 47);
		MAP.put("/", 48);
		MAP.put("&", 49);
		MAP.put("->", 51);
		MAP.put("==", 52);
		MAP.put("!=", 53);
		MAP.put("<=", 54);
		MAP.put(">=", 55);
		MAP.put("<<", 56);
		MAP.put(">>", 57);
		
		
		
		
	}

	
}
