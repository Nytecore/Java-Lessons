public final class Database {
    // final keywordunun yukarıdaki gibi classta kullanımı da vardır.
    // Bu şekildeki bir kullanım bizim o classı başka bir classa extend edemememizi sağlar.
    // Yani biz bu classtan hiç bir şekilde alt sınıf türetemeyiz (Inheritance)
    // Alt sınıf türetilmesini istemediğimiz durumlarda bu şekilde bir kullanım yapabiliriz.


        // Final keywordunun aşağıdaki şekilde bir kullanımı da vardır.
        // Değiştirilmesini istemediğimiz bir parametre varsa bu şekilde kullanım yapabiliriz.

     public void baglantiKur (final String username , final String password) {
        System.out.println(username);
        System.out.println(password);
      }

        // Ya da aşağıdaki şekilde bir kullanım da yapabiliriz. (final method)

    public final void baglantiKur2 (String username , String password) {
        System.out.println(username);
        System.out.println(password);

        // Böyle bir kullanım da bizim bu methodu hiç bir şekilde override edilmemesini sağlar.
            // Bir methodun override edilmemesini istiyorsak bu şekilde bir oluşum yapabiliriz.

    }
}
