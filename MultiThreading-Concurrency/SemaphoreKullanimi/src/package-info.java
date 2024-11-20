
        /*       ------ ANLATIM ------

        Normalde, Reentrant block veya synchronized codeblocklarda sadece tek bir
        thread'in oraya girmesine izinveriyorduk, başka bir thread olunca o bloğa
        başka bir thread giremiyordu. "Semaphore" kullanarak birden çok thread'in
        bir yere girmesini sağlayabilriz ve daha sonra başka threadlerin de buraya
        girmesini engelleyebiliriz. Yani aynı anda 3-4-5 thread'i aynı anda çalış-
        tırabilir ve başka threadler varsa da onları engelleyebilir.



         */