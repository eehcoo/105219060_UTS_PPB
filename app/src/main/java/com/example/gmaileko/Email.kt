package com.example.gmaileko

data class Email (
    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val stared: Boolean,
    val unread: Boolean,
    val selected: Boolean = false
    )
class EmailBuilder {
    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var stared: Boolean = false
    var unread: Boolean = false
    fun build() : Email = Email(user, subject, preview, date, stared, unread, false)

}
fun email(block: EmailBuilder.() ->Unit): Email = EmailBuilder().apply(block).build()
fun fakeEmails() = listOf(
    email {
        user = "Mobile Legend"
        subject = "10 Detik Membuat Pertandingan, 10 Menit Bertarung, Lorong, Hutan, Menghancurkan Tower, Pertarungan Tim, Semua Kesenangan Itu Dari PC MOBAs Dan Permainan Action Itu Berada Di Tangan Mu! Tunjukan Semangat E-sports Kamu!"
        preview = "Bergabung Dengan Teman Anda Di Brand Baru Game moba 5v5 Melawan Pemain Manusia Sungguhan, Mobile Legends: Bang Bang! Pilih Hero Favorit Kamu Dan Buat Team Yang Sempurna Dengan Kawanmu!"
        stared = false
        },
    email {
        user = "Mobile Legend"
        subject = "10 Detik Membuat Pertandingan, 10 Menit Bertarung, Lorong, Hutan, Menghancurkan Tower, Pertarungan Tim, Semua Kesenangan Itu Dari PC MOBAs Dan Permainan Action Itu Berada Di Tangan Mu! Tunjukan Semangat E-sports Kamu!"
        preview = "Bergabung Dengan Teman Anda Di Brand Baru Game moba 5v5 Melawan Pemain Manusia Sungguhan, Mobile Legends: Bang Bang! Pilih Hero Favorit Kamu Dan Buat Team Yang Sempurna Dengan Kawanmu!"
        stared = false
    },email {
        user = "Mobile Legend"
        subject = "10 Detik Membuat Pertandingan, 10 Menit Bertarung, Lorong, Hutan, Menghancurkan Tower, Pertarungan Tim, Semua Kesenangan Itu Dari PC MOBAs Dan Permainan Action Itu Berada Di Tangan Mu! Tunjukan Semangat E-sports Kamu!"
        preview = "Bergabung Dengan Teman Anda Di Brand Baru Game moba 5v5 Melawan Pemain Manusia Sungguhan, Mobile Legends: Bang Bang! Pilih Hero Favorit Kamu Dan Buat Team Yang Sempurna Dengan Kawanmu!"
        stared = false
    },email {
        user = "Mobile Legend"
        subject = "10 Detik Membuat Pertandingan, 10 Menit Bertarung, Lorong, Hutan, Menghancurkan Tower, Pertarungan Tim, Semua Kesenangan Itu Dari PC MOBAs Dan Permainan Action Itu Berada Di Tangan Mu! Tunjukan Semangat E-sports Kamu!"
        preview = "Bergabung Dengan Teman Anda Di Brand Baru Game moba 5v5 Melawan Pemain Manusia Sungguhan, Mobile Legends: Bang Bang! Pilih Hero Favorit Kamu Dan Buat Team Yang Sempurna Dengan Kawanmu!"
        stared = false
    },email {
        user = "Mobile Legend"
        subject = "10 Detik Membuat Pertandingan, 10 Menit Bertarung, Lorong, Hutan, Menghancurkan Tower, Pertarungan Tim, Semua Kesenangan Itu Dari PC MOBAs Dan Permainan Action Itu Berada Di Tangan Mu! Tunjukan Semangat E-sports Kamu!"
        preview = "Bergabung Dengan Teman Anda Di Brand Baru Game moba 5v5 Melawan Pemain Manusia Sungguhan, Mobile Legends: Bang Bang! Pilih Hero Favorit Kamu Dan Buat Team Yang Sempurna Dengan Kawanmu!"
        stared = false
    },email {
        user = "Mobile Legend"
        subject = "10 Detik Membuat Pertandingan, 10 Menit Bertarung, Lorong, Hutan, Menghancurkan Tower, Pertarungan Tim, Semua Kesenangan Itu Dari PC MOBAs Dan Permainan Action Itu Berada Di Tangan Mu! Tunjukan Semangat E-sports Kamu!"
        preview = "Bergabung Dengan Teman Anda Di Brand Baru Game moba 5v5 Melawan Pemain Manusia Sungguhan, Mobile Legends: Bang Bang! Pilih Hero Favorit Kamu Dan Buat Team Yang Sempurna Dengan Kawanmu!"
        stared = false
    },email {
        user = "Mobile Legend"
        subject = "10 Detik Membuat Pertandingan, 10 Menit Bertarung, Lorong, Hutan, Menghancurkan Tower, Pertarungan Tim, Semua Kesenangan Itu Dari PC MOBAs Dan Permainan Action Itu Berada Di Tangan Mu! Tunjukan Semangat E-sports Kamu!"
        preview = "Bergabung Dengan Teman Anda Di Brand Baru Game moba 5v5 Melawan Pemain Manusia Sungguhan, Mobile Legends: Bang Bang! Pilih Hero Favorit Kamu Dan Buat Team Yang Sempurna Dengan Kawanmu!"
        stared = false
    },email {
        user = "Mobile Legend"
        subject = "10 Detik Membuat Pertandingan, 10 Menit Bertarung, Lorong, Hutan, Menghancurkan Tower, Pertarungan Tim, Semua Kesenangan Itu Dari PC MOBAs Dan Permainan Action Itu Berada Di Tangan Mu! Tunjukan Semangat E-sports Kamu!"
        preview = "Bergabung Dengan Teman Anda Di Brand Baru Game moba 5v5 Melawan Pemain Manusia Sungguhan, Mobile Legends: Bang Bang! Pilih Hero Favorit Kamu Dan Buat Team Yang Sempurna Dengan Kawanmu!"
        stared = false
    },email {
        user = "Mobile Legend"
        subject = "10 Detik Membuat Pertandingan, 10 Menit Bertarung, Lorong, Hutan, Menghancurkan Tower, Pertarungan Tim, Semua Kesenangan Itu Dari PC MOBAs Dan Permainan Action Itu Berada Di Tangan Mu! Tunjukan Semangat E-sports Kamu!"
        preview = "Bergabung Dengan Teman Anda Di Brand Baru Game moba 5v5 Melawan Pemain Manusia Sungguhan, Mobile Legends: Bang Bang! Pilih Hero Favorit Kamu Dan Buat Team Yang Sempurna Dengan Kawanmu!"
        stared = false
    },email {
        user = "Mobile Legend"
        subject = "10 Detik Membuat Pertandingan, 10 Menit Bertarung, Lorong, Hutan, Menghancurkan Tower, Pertarungan Tim, Semua Kesenangan Itu Dari PC MOBAs Dan Permainan Action Itu Berada Di Tangan Mu! Tunjukan Semangat E-sports Kamu!"
        preview = "Bergabung Dengan Teman Anda Di Brand Baru Game moba 5v5 Melawan Pemain Manusia Sungguhan, Mobile Legends: Bang Bang! Pilih Hero Favorit Kamu Dan Buat Team Yang Sempurna Dengan Kawanmu!"
        stared = false
    },email {
        user = "Mobile Legend"
        subject = "10 Detik Membuat Pertandingan, 10 Menit Bertarung, Lorong, Hutan, Menghancurkan Tower, Pertarungan Tim, Semua Kesenangan Itu Dari PC MOBAs Dan Permainan Action Itu Berada Di Tangan Mu! Tunjukan Semangat E-sports Kamu!"
        preview = "Bergabung Dengan Teman Anda Di Brand Baru Game moba 5v5 Melawan Pemain Manusia Sungguhan, Mobile Legends: Bang Bang! Pilih Hero Favorit Kamu Dan Buat Team Yang Sempurna Dengan Kawanmu!"
        stared = false
    },
)