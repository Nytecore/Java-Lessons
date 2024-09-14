/*

BİR ÖRNEK




`((SavingAccount) account2).applyInterest();` satırını detaylı bir şekilde açıklayalım.

### Type Casting ve `instanceof` Kullanımı

Java'da farklı türdeki nesneleri yönetirken bazen tür dönüşümüne (type casting) ihtiyaç duyabilirsiniz.
`((SavingAccount) account2)` ifadesi, `account2` nesnesinin `SavingAccount` türüne dönüştürülmesini sağlar.
Bunu daha iyi anlamak için aşağıdaki konuları inceleyelim:

        #### 1. **Type Casting (Tür Dönüşümü)**

        Type casting, bir nesneyi bir türden başka bir türe dönüştürmek anlamına gelir. Java'da bu genellikle
        iki durum için kullanılır:

        - **Yukarı doğru casting (Upcasting)**: Bir alt sınıf nesnesinin üst sınıf türüne dönüştürülmesi.
        - **Aşağı doğru casting (Downcasting)**: Bir üst sınıf nesnesinin alt sınıf türüne dönüştürülmesi.

Örneğin:

Account account = new SavingAccount(); // Upcasting: SavingAccount bir Account türüdür.

Ancak `account` nesnesinin `SavingAccount` türünde olup olmadığını bilmediğimizde, aşağıdaki gibi bir downcasting
yapabiliriz:

SavingAccount savingAccount = (SavingAccount) account; // Downcasting

        #### 2. **Örnek: `((SavingAccount) account2).applyInterest();`**

Bu satırda, `account2` nesnesi aslında `Account` türünde bir nesne olabilir, fakat `SavingAccount` türündeki özel
metodları (`applyInterest()`) kullanmak istiyorsunuz. Bu nedenle:

- **Casting (Dönüştürme)**: `account2` nesnesini `SavingAccount` türüne dönüştürüyorsunuz. Bu, `account2` nesnesinin
aslında bir `SavingAccount` nesnesi olduğunu ve bu türün özel metodlarına erişim sağlamak istediğinizi belirtir.

- **Method Call (Metod Çağırma)**: Casting işleminden sonra `applyInterest()` metodunu çağırıyorsunuz. Bu metod sadece
`SavingAccount` sınıfında tanımlandığı için, `account2` nesnesinin gerçekten `SavingAccount` türünde olduğunu
doğrulamanız gerekir.

        ### Neden Casting Yapıyoruz?

Casting işlemi, `Account` türündeki bir nesnenin aslında `SavingAccount` türünde olduğunu ve bu özel türün metodlarına
erişmek istediğinizi gösterir. Eğer `account2` gerçekten bir `SavingAccount` nesnesi değilse ve casting yapılırsa, Java
`ClassCastException` hatası fırlatır. Bu nedenle, casting yapılmadan önce genellikle `instanceof` operatörü ile
nesnenin gerçek türü kontrol edilir.

### Örnek

Diyelim ki `account2` nesnesi `SavingAccount` türünde:
        ```java
Account account2 = new SavingAccount(); // account2 bir SavingAccount nesnesi
((SavingAccount) account2).applyInterest(); // Casting ile applyInterest() metodunu çağırıyoruz
```

Ancak `account2` nesnesi `SavingAccount` değilse:
        ```java
Account account2 = new CheckingAccount(); // account2 bir CheckingAccount nesnesi
((SavingAccount) account2).applyInterest(); // Burada ClassCastException hatası alırsınız
```

        ### `instanceof` Kullanımı

Casting yapmadan önce `instanceof` ile tür kontrolü yapmak iyi bir uygulamadır:
        ```java
if (account2 instanceof SavingAccount) {
        ((SavingAccount) account2).applyInterest();
} else {
        System.out.println("The account is not a SavingAccount.");
}
        ```

        Bu kontrol, sadece `account2` gerçekten `SavingAccount` türünde olduğunda `applyInterest()` metodunu
        çağırmanızı sağlar.

### Özet

`((SavingAccount) account2).applyInterest();` ifadesi, `account2` nesnesini `SavingAccount` türüne dönüştürür ve
ardından bu türün özel bir metodunu (`applyInterest()`) çağırır. Bu, sadece `account2` nesnesi gerçekten
`SavingAccount` türünde olduğunda güvenlidir, aksi halde bir `ClassCastException` hatası alabilirsiniz. Bu nedenle,
`instanceof` ile tür kontrolü yapmak bu tür hataları önlemeye yardımcı olur.

 */