# Simple RSA Encryptions

Encrypt input using RSA

## Overview

`RSAEncryptionSequence.java` is a class in which the input is encrypted using a public key and is decrypted using a private key, as according to the RSA algorithm

`RandomPrimesRSAEncryption.java` is another class that uses randomly generated prime numbers to encrypt the input

### Output

#### RSAEncryptionSequence.java

```
Alice encrypts: 30120
Alice sends: 113535859035722866
Bob computes: 116402471153538991
Bob decrypts: 30120
```

#### RandomPrimeRSAEncryption.java

```
Encrypting: cat
Encrypted: 219612603106372657

Encrypting: bat
Encrypted: 370835932170181688

Encrypting: hat
Encrypted: 405633329098680001

Encrypting: encyclopedia
Encrypted: 454826265002399103

Encrypting: antidisestablishmentarianism
Encrypted: 113324033011292054
```

## Owner

[Michael A.](https://linkedin.com/in/magarenzo)

This was created as an assignment in CSC381 (Applied Cryptography)
