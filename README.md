## Ödev 3-Thread

# Dosya işlemleri

- İlk olarak dosya işlemleri için dosya adı, yazıcı ve okuyucu ayarlandı. Ardından da dosya oluşturulmadıysa dosya oluşturuldu.

![image](https://user-images.githubusercontent.com/107641642/175662890-19a4399c-76cb-4a53-aa84-5cae5eeb33c3.png)

# Thread

- Okuma işlemleri için Consumer threadi oluşturuldu.

![image](https://user-images.githubusercontent.com/107641642/175662998-053c2671-9ce0-4522-90b0-dc52cb92af4b.png)

Burada "score.txt" dosyasındaki tüm karakterleri okuyup "line" adındaki değişkene atadı. Ardından line değişkenini
ekrana yazdı ve ardından okuma fonksiyonunu kapattı.

- Yazma işlemleri için Producer threadi oluşturuldu.

![image](https://user-images.githubusercontent.com/107641642/175663278-4d0861a8-151e-45c5-af63-6b0b715fbe73.png)

Burada kullanıcıdan inputlar alındı. Eğer ki skor hatalı girildiyse uyarı verildi. Girilen skorlarda eğer ki sorun
yoksa yazma işlemi yapıldı ve ardından "Consumer" threadi başlatıldı.

# Çıktılar

- Doğru çıktı

![image](https://user-images.githubusercontent.com/107641642/175663518-0c6b2557-6350-4c7c-b9c1-7c90494cd24c.png)

- Hatalı çıktı

![image](https://user-images.githubusercontent.com/107641642/175663619-5cc57909-3f53-4fa1-bcdf-d053a1161939.png)

- score.txt dosyası

![image](https://user-images.githubusercontent.com/107641642/175663752-43eef8c9-882f-4171-bdbf-7e9007fbc9c6.png)
