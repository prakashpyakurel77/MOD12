package module12;

public static String decimalToBinaryRecursive(int n) {
    if (n == 0) return "0";
    if (n == 1) return "1";
    return decimalToBinaryRecursive(n / 2) + (n % 2);
}
	
	