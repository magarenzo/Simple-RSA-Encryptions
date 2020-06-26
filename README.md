# Simple RSA Encryptions

Encrypt input using RSA

## About

[*RSAEncryptionSequence.java*](src/RSAEncryptionSequence.java) is a class in which the input is encrypted using a public key and is decrypted using a private key, as according to the RSA algorithm.

[*RandomPrimesRSAEncryption.java*](src/RandomPrimesRSAEncryption.java) is another class that uses randomly generated prime numbers to encrypt the input. 

## Output

#### RSAEncryptionSequence.java

Alice encrypts: 30120<br>Alice sends: 113535859035722866<br>Bob computes: 116402471153538991<br>Bob decrypts: 30120

#### RandomPrimeRSAEncryption.java

Encrypting: cat<br>Encrypted: 219612603106372657<br><br>Encrypting: bat<br>Encrypted: 370835932170181688<br><br>Encrypting: hat<br>Encrypted: 405633329098680001<br><br>Encrypting: encyclopedia<br>Encrypted: 454826265002399103<br><br>Encrypting: antidisestablishmentarianism<br>Encrypted: 113324033011292054

## Owner

Michael A. Agarenzo

This was created as an assignment in CSC381 (Applied Cryptography)
