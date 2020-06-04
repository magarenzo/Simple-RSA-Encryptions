import java.math.BigInteger;
import java.security.SecureRandom;
/**
 * RandomPrimesRSAEncryption
 * 
 * Michael Agarenzo
 */

public class RandomPrimesRSAEncryption {
    
    /*
     * Found help for checking if BigInteger is prime here: https://bit.ly/2pVKSHN
     */
    public static boolean isPrime(BigInteger x, int certainty) {
        
        // Variables to check if x is prime
        BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");
        
        // check certainty
        if (!x.isProbablePrime(certainty))
            return false;
            
        // check if even
        if (!two.equals(x) && BigInteger.ZERO.equals(x.mod(two)))
            return false;
            
        // find divisor from 3 to x
        for (BigInteger i = three; i.multiply(i).compareTo(x) < 1; i = i.add(two)) {
            if (BigInteger.ZERO.equals(x.mod(i)))
                return false;
        }
        return true;        
        
    }
    
    public static void main(String[] args) {
        
        // Variables to produce random BigInteger
        BigInteger p = new BigInteger("1111"); // temp filler
        BigInteger q = new BigInteger("2222"); // temp filler
        int bitLength = 30;
        int certainty = 90;
        SecureRandom rand = new SecureRandom();
        boolean bool = false;
        boolean bool2 = false;
        String plaintext = "cat";
        String plaintext2 = "bat";
        String plaintext3 = "hat";
        String plaintext4 = "encyclopedia";
        String plaintext5 = "antidisestablishmentarianism";
        
        // Random variables
        while (bool == false) {
            p = new BigInteger(bitLength, certainty, rand);
            bool = isPrime(p, certainty);
        }
        while (bool2 == false) {
            q = new BigInteger(bitLength, certainty, rand);
            bool2 = isPrime(q, certainty);
        }
        
        // Chosen variable
        BigInteger e = new BigInteger("1337");
        
        // Solve for n
        BigInteger n = p.multiply(q);
        
        // Solve for phi
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        
        //Encrypt inputs
        System.out.println("Encrypting: " + plaintext);
        byte[] plaintextAsBytes = plaintext.getBytes();
        byte[] plaintextAsBytesEncrypted = (new BigInteger(plaintextAsBytes)).modPow(e, n).toByteArray();
        BigInteger plaintextEncrypted = new BigInteger(plaintextAsBytesEncrypted);
        System.out.println("Encrypted: " + plaintextEncrypted + "\n");
        
        System.out.println("Encrypting: " + plaintext2);
        byte[] plaintextAsBytes2 = plaintext2.getBytes();
        byte[] plaintextAsBytesEncrypted2 = (new BigInteger(plaintextAsBytes2)).modPow(e, n).toByteArray();
        BigInteger plaintextEncrypted2 = new BigInteger(plaintextAsBytesEncrypted2);
        System.out.println("Encrypted: " + plaintextEncrypted2 + "\n");
        
        System.out.println("Encrypting: " + plaintext3);
        byte[] plaintextAsBytes3 = plaintext3.getBytes();
        byte[] plaintextAsBytesEncrypted3 = (new BigInteger(plaintextAsBytes3)).modPow(e, n).toByteArray();
        BigInteger plaintextEncrypted3 = new BigInteger(plaintextAsBytesEncrypted3);
        System.out.println("Encrypted: " + plaintextEncrypted3 + "\n");
        
        System.out.println("Encrypting: " + plaintext4);
        byte[] plaintextAsBytes4 = plaintext4.getBytes();
        byte[] plaintextAsBytesEncrypted4 = (new BigInteger(plaintextAsBytes4)).modPow(e, n).toByteArray();
        BigInteger plaintextEncrypted4 = new BigInteger(plaintextAsBytesEncrypted4);
        System.out.println("Encrypted: " + plaintextEncrypted4 + "\n");
        
        System.out.println("Encrypting: " + plaintext5);
        byte[] plaintextAsBytes5 = plaintext5.getBytes();
        byte[] plaintextAsBytesEncrypted5 = (new BigInteger(plaintextAsBytes5)).modPow(e, n).toByteArray();
        BigInteger plaintextEncrypted5 = new BigInteger(plaintextAsBytesEncrypted5);
        System.out.println("Encrypted: " + plaintextEncrypted5 + "\n");
        
    }
    
}
