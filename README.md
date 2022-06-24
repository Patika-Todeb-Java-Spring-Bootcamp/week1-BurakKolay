# Ödev 1-Immutable Class

## Immutable Class Nedir?

Immutable (değişmez), nesneler bir kez oluşturulduktan sonra içeriği değiştirilemeyen sınıflardır.

## Tanımlamalar

- Modeller için ilk olarak bir enum sınıfı oluşturuldu.

![Model Enumları](https://user-images.githubusercontent.com/107641642/175661277-79d91bd8-c0c6-4bf9-a699-ea8355b39cf4.png)

- Immutable bir sınıf oluşturduğumuz için final ataması kullanıldı.

![Tanımlama](https://user-images.githubusercontent.com/107641642/175661562-37dfb836-cbf4-46a0-b432-b6f34150f30c.png)

- Bu değişkenler için yapıcı metod oluşturuldu.

![Yapıcı Metot](https://user-images.githubusercontent.com/107641642/175661647-0c404ed6-5da4-470e-a8ba-ac51c7793626.png)

- Immutable class olduğu için getter'lar ayarlandı fakat setter'lar oluşturulmadı.

![Get and Açıklama](https://user-images.githubusercontent.com/107641642/175661875-aa344c87-9a10-4c00-8653-0b64dc89dca0.png)

- Bunlar main sınıfında çağırıldı.

![Main](https://user-images.githubusercontent.com/107641642/175661908-47c840d5-5e56-4c07-afc2-8c5f9a4bad22.png)
