#petCLinicWithJsfAndSpring

<h5>Uygulamayı çalıştırmak için öncelikle Intellij kurulumu gerekmektedir. Yada java idelerinden herhangi biri ile çalışabilirsiniz. Postgresql kurulumu gerçekleştirilmelidir. <h5>
<h5>Uygulamayı çalıştırmak için:<h5>
<h5>url: http://localhost:8070/petClinic/index.xhtml -- Bu url'i browsera yazmanız gerekmektedir. Sekmeler arası geçişi bu sayfadan sağlayabilirsiniz.<h5>
<h5>petClinic - Veteriner Uygulamasını geliştirirken; backend-java için intellij kullandım.Spring, Spring-MVC, JPA, Hibernate ve Maven teknolojilerinden faydalandım.<h5>
<h5>Java 8 ile projemi tamamladım. Lombok kütüphanesi de kullandım.<h5>
<h5>Frontend için ise Jsf kullandım. Projede gördüğünüz .xhtml uzantılı dosyalar jsf dosyalarımdır.<h5>
<h5>Database bağlantısını PostgreSql ile gerçekleştirdim.<h5>
<h5>Projede 4 sekme yer almaktadır. Bunlar;<h5>
<h5>Pet(Hayvan), Owner(Hayvan Sahibi), PetType(Hayvan Türleri),Research(Listeleme)<h5>
<h5>Pet, Owner, PetType -> verileri listeleme, kaydetme, silme ve güncelleme gibi CRUD işlemleri yapılabilmektedir.<h5>
<h5>Research(listeleme) sekmesinde : Hayvan sahibine göre hayvan listeleme işlemi yapılmıştır.<h5>
<h5>Login Page eklenerek, Login yapılması koşuluyla sisteme giriş yapılması sağlanmıştır.<h5>

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


