package android.example.signin

import android.example.signin.daos.PostDao
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CreatePostActivity : AppCompatActivity() {

    private lateinit var postButton: Button
    private lateinit var postInput: EditText
    private lateinit var postDao: PostDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)

        postDao = PostDao()
        postButton = findViewById<Button>(R.id.postButton)
        postInput = findViewById(R.id.postInput)
        postButton.setOnClickListener {
            val input = postInput.text.toString().trim()
            if(input.isNotEmpty()){
                postDao.addPost(input)
                finish()

            }
        }
    }
}