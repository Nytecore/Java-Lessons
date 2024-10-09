package com.bora.matematik;

        // com.bora.matematik paketinde IMatematik referansında bir Interface oluşturuldu.

public interface IMatematik {

    void toplama (int a , int b);
    void cikarma (int a , int b);
    void carpma(int a , int b);
    void bolme(int a , int b);

            // Interface özellikleri basitçe belirlendi bunlar, extend ( yani implement ) edildiği classta
                // Mutlaka kullanılması gerekecektir.
}
