package com.basic.uuid;

import java.util.UUID;
import com.fasterxml.uuid.Generators;
  
/*
 * 5 types of UUID generator
 * 1. time based generator
 * 2. DCE security
 * 3. namespace based with md5 algorithm
 * 4. random secured number
 * 5. namespace based with sha1 algorithm
 * 
 */

/**
 * The version number associated with this {@code UUID}.  The version
 * number describes how this {@code UUID} was generated.
 *
 * The version number has the following meaning:
 * <ul>
 * <li>1    Time-based UUID
 * <li>2    DCE security UUID
 * <li>3    Name-based UUID
 * <li>4    Randomly generated UUID
 * </ul>
 *
 * @return  The version number of this {@code UUID}
 */
public class UUIDGenerator {

  public static void main(String[] args) {

    // Generate time-based UUID - version 1
    UUID uuid1 = Generators.timeBasedGenerator().generate();
    System.out.println("UUID : " + uuid1);
    System.out.println("UUID Version : " + uuid1.version());
    System.out.println("UUID Variant : " + uuid1.variant());

    // Generate random UUID - version 4
    UUID uuid2 = Generators.randomBasedGenerator().generate();
    System.out.println("UUID : " + uuid2);
    System.out.println("UUID Version : " + uuid2.version());
    System.out.println("UUID Variant : " + uuid2.variant());

    // initialize byte array
    byte[] bs = {1, 2, 3};
    // initialize uuid using byte array
    UUID uuid_bs = UUID.nameUUIDFromBytes(bs);
    System.out.println("UUID using byte array : " + uuid_bs);
    System.out.println("UUID Version : " + uuid_bs.version());

    // initialize uuid
    UUID uuid4 = UUID.randomUUID();
    System.out.println(uuid4);


    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();

    System.out.println("Random UUID String = " + randomUUIDString);
    System.out.println("UUID version       = " + uuid.version());
    System.out.println("UUID variant       = " + uuid.variant());
    
    UUID uuid5 = UUID5.fromUTF8("954aac7d-47b2-5975-9a80-37eeed186527");
    
    System.out.println("uuid5 :  " + uuid5);
    System.out.println(uuid5.variant());
    System.out.println(uuid5.version());
  }

}
