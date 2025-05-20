package Modif;

import Modif.Packet1.Person;

 class Test extends Person {
    // protected int id;
    // public, private, default(доступно пределах пакета), protected (доступны в пределах
    // одного пакета, доступны всем подклассам, даже если эти подклассы вне пакета)
    public Test(){
        name = "Tom";
    }
}
