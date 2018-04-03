# simple-rsa-encryption
Encrypt input using RSA

---

[*RSAEncryptionSequence.java*](https://github.com/magarenzo/simple-rsa-encryption/blob/master/RSAEncryptionSequence.java) is a class in which the input is encrypted using a public key and is decrypted using a private key, as according to the RSA algorithm.

[*RandomPrimesRSAEncryption.java*](https://github.com/magarenzo/simple-rsa-encryption/blob/master/RandomPrimesRSAEncryption.java) is another class that uses randomly generated prime numbers to encrypt the input. 

---

<h3>Output:</h3>

<h5><i>RSAEncryptionSequence.java</i></h5>

Alice encrypts: 30120<br>Alice sends: 113535859035722866<br>Bob computes: 116402471153538991<br>Bob decrypts: 30120

<h5><i>RandomPrimeRSAEncryption.java</i></h5>

Encrypting: cat<br>Encrypted: 219612603106372657<br><br>Encrypting: bat<br>Encrypted: 370835932170181688<br><br>Encrypting: hat<br>Encrypted: 405633329098680001<br><br>Encrypting: encyclopedia<br>Encrypted: 454826265002399103<br><br>Encrypting: antidisestablishmentarianism<br>Encrypted: 113324033011292054

---


This was created as an assignment in CSC381 (Applied Cryptography).
