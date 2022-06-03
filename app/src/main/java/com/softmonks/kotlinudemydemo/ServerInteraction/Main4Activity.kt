package com.softmonks.kotlinudemydemo.ServerInteraction

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.softmonks.kotlinudemydemo.R
import kotlinx.android.synthetic.main.activity_main4.*
import org.json.JSONException
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.Exception
import java.net.HttpURLConnection
import java.net.URL

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        //btCallApi.setOnClickListener {
        //    getVersion()
        //}

        btCallApi.setOnClickListener({ view -> getVersion() })
    }

    protected fun getVersion(){
        var url = "https://nextcarrental.com/rentalApp/getVersion.php"

        val stringRequest = StringRequest(
            Request.Method.GET,
            url,
            Response.Listener<String> { s ->
                try {
                    val obj = JSONObject(s)
                    val response = obj.getString("rentalAppCode")
                    tvResponse.text = response
                    /*if (!obj.getBoolean("error")) {
                        val array = obj.getJSONArray("artists")

                        for (i in 0..array.length() - 1) {
                            val objectArtist = array.getJSONObject(i)
                            val artist = Artist(
                                objectArtist.getString("name"),
                                objectArtist.getString("genre")
                            )
                            artistList!!.add(artist)
                            val adapter = ArtistList(this@ViewArtistsActivity, artistList!!)
                            listView!!.adapter = adapterval stringRequest = StringRequest(
            Request.Method.GET,
            url,
            Response.Listener<String> { s ->
                try {
                    val obj = JSONObject(s)
                    val response = obj.getString("rentalAppCode")
                    tvResponse.text = response
                    /*if (!obj.getBoolean("error")) {
                        val array = obj.getJSONArray("artists")

                        for (i in 0..array.length() - 1) {
                            val objectArtist = array.getJSONObject(i)
                            val artist = Artist(
                                objectArtist.getString("name"),
                                objectArtist.getString("genre")
                            )
                            artistList!!.add(artist)
                            val adapter = ArtistList(this@ViewArtistsActivity, artistList!!)
                            listView!!.adapter = adapter
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), obj.getString("message"), Toast.LENGTH_LONG).show()
                    }*/

                } catch (e: JSONException) {
                    e.printStackTrace()
                }
            }, Response.ErrorListener { volleyError -> Toast.makeText(applicationContext, volleyError.message, Toast.LENGTH_LONG).show() })

        val requestQueue = Volley.newRequestQueue(this)
        requestQueue.add<String>(stringRequest)
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), obj.getString("message"), Toast.LENGTH_LONG).show()
                    }*/

                } catch (e: JSONException) {
                    e.printStackTrace()
                }
            }, Response.ErrorListener { volleyError -> Toast.makeText(applicationContext, volleyError.message, Toast.LENGTH_LONG).show() })

        val requestQueue = Volley.newRequestQueue(this)
        requestQueue.add<String>(stringRequest)
    }
}


//{"rentalAppCode":"100"}