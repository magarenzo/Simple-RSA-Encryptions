import java.math.BigInteger;
/**
 * RSAEncryptionSequence (Assignment 8)
 * 
 * Michael Agarenzo
 * 03/28/2018
 */

public class RSAEncryptionSequence {
    
    public static void main(String[] args) {
        
        // Given variables
        BigInteger p = new BigInteger("885320963");
        BigInteger q = new BigInteger("238855417");
        BigInteger e = new BigInteger("9007");
        
        // Solve for n
        BigInteger n = p.multiply(q);
        
        // Solve for phi
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        
        // Encrypt Alice's input
        BigInteger input = new BigInteger("30120");
        System.out.println("Alice encrypts: " + input);
        byte[] inputAsBytes = input.toByteArray();        
        byte[] inputAsBytesEncrypted = (new BigInteger(inputAsBytes)).modPow(e, n).toByteArray();
        BigInteger inputEncrypted = new BigInteger(inputAsBytesEncrypted);
        System.out.println("Alice sends: " + inputEncrypted);
        
        // Decrypt Alice's input
        BigInteger d = e.modInverse(phi);
        System.out.println("Bob computes: " + d);
        byte[] inputDecrypted = (new BigInteger(inputAsBytesEncrypted)).modPow(d, n).toByteArray();
        BigInteger decrypted = new BigInteger(inputDecrypted);
        System.out.println("Bob decrypts: " + decrypted);
        
    }
    
}