package android.example.signin.models

data class Post(val test: String = "",
                val createdBy: User = User(),
                val createdAt: Long = 0L,
                val linkedBy: ArrayList<String> = ArrayList())