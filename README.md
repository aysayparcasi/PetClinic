#petCLinicWithJsfAndSpring

<h1>Uygulamayı çalıştırmak için öncelikle Intellij kurulumu gerekmektedir. Yada java idelerinden herhangi biri ile çalışabilirsiniz. Postgresql kurulumu gerçekleştirilmelidir. <h1>
<h1>Uygulamayı ayağa kaldırmak için:<h1>
<h1>url: http://localhost:8070/petClinic/index.xhtml -- Bu url'i browsera yazmanız gerekmektedir. Sekmeler arası geçişi bu sayfadan sağlayabilirsiniz.<h1>
<h1>petClinic - Veteriner Uygulamasını geliştirirken; backend-java için intellij kullandım.Spring, Spring-MVC, JPA, Hibernate ve Maven teknolojilerinden faydalandım.<h1>
<h1>Java 8 ile projemi tamamladım. Lombok kütüphanesi de kullandım.<h1>
<h1>Frontend için ise Jsf kullandım. Projede gördüğünüz .xhtml uzantılı dosyalar jsf dosyalarımdır.<h1>
<h1>Database bağlantısını PostgreSql ile gerçekleştirdim.<h1>
<h1>Projede 4 sekme yer almaktadır. Bunlar;<h1>
<h1>Pet(Hayvan), Owner(Hayvan Sahibi), PetType(Hayvan Türleri),Research(Listeleme)<h1>
<h1>Pet, Owner, PetType -> verileri listeleme, kaydetme, silme ve güncelleme gibi CRUD işlemleri yapılabilmektedir.<h1>

Spring kullanmamın sebebi;
1. Spring Boot, sizi kodlama ve gereksiz yapılandırma zahmetinden kurtarması. 
2. Gömülü bir web sunucusu ile gelmesi(Bu proje için Tomcat).
3. Build konfigürasyonunu kolaylaştırmak için sağladığı starter’lar.
4. Otomatik konfigürasyon.
5. Kod üretimi(code generation) ve XML konfigürasyona ihtiyaç duymaması.
6. Daha az veritabanı kodu yazarak daha az vakit kaybı ile daha hızlı geliştirme yapabilmesi.
7. Anotasyonlar kullanarak uygulama ve uygulama içi mimari değişiklikler yapılabilmesi.

JSF kullanmamın sebebi;
1. Convertion (Veriyi dönüştürme) - Kullanıcı, forma bir veri girdiğinde belirli bir formata çevirerek kaydetmeyi veya belirli format ile kullanıcıya veriyi sunulabilmektedir.
2. Componentler sayesinde kullanıcı arayüzü oluşturabiliyoruz.
3. AJAX desteği - Bu özellik JSF’in tercih edilmesindeki en büyük sebeblerden biri olabilir. Çünkü AJAX’ı kullanmak pratik.
4. Facelets - Web uygulamanızı bir konumda bulunan tema üzerinden yönetebilirsiniz, her sayfa için değişiklik yapmanıza gerek kalmaz.
5. Open-source kütüphaneler var. Bunlar; Primefaces(bu projede kullanılan), Icefaces, Richfaces.
6. Çok katmanlı mimari için avantaj sağladığını düşünmekteyim. Kod okuması kolaydır.
7. IDE ile basitçe kodlama yapabilme.

Postgresql kullanmamın sebebi;
1. Öğrenmesi ve kurması kolaydır. Güncel, detaylı, herkese açık ve erişimi kolay yaygın dokümantasyonu vardır.
2. Yönetimi, yedeklemesi, bakımı ve izlemesi kolaydır.
3. Hata mesajları ve log sistemi açıktır, anlaşılırdır.
4. PostgreSQL'de sorgu yazmak ve sorguları okuyabilmek anlaşılır ve kolaydır.

İletişim: https://www.linkedin.com/in/ay%C5%9Fe-aypar%C3%A7as%C4%B1-5b230a167/


