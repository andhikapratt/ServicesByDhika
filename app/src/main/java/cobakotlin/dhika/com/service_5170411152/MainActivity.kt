package cobakotlin.dhika.com.service_5170411152

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_fb.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"))
            startActivity(i)
        })

        bt_ig.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com"))
            startActivity(i)
        })

        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.darkness)

        bt_play.setOnClickListener{
            MediaPlayer?.start()
        }

        bt_pause.setOnClickListener{
            MediaPlayer?.pause()
        }

        bt_stop.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}
