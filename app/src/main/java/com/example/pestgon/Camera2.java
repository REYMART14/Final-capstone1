package com.example.pestgon;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pestgon.ml.Ant;
import com.example.pestgon.ml.Armyworm;
import com.example.pestgon.ml.Insect;
import com.example.pestgon.ml.Model;

import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.image.TensorImage;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class Camera2 extends AppCompatActivity {
    private ImageButton pest1;
    private ImageButton home1;

    private ImageButton capt;
    private ImageButton predict;


    ImageView viewimage;
    TextView result;

    Bitmap bitmap;

    int imageSize = 224;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera2);

        getPermission();

        capt = findViewById(R.id.capture);

        viewimage =

                findViewById(R.id.view23);

        result =

                findViewById(R.id.result);

        pest1 =

                findViewById(R.id.pest2);

        result.setText("Kasagaran nga ngaran\n" +
                "May-ada unom nga klase hin mga asno nga nasulong ha mga palay. Amo ini an yellow stem borer, white stem borer, striped stem borer, gold-fringed stem borer, dark-headed striped stem borer, ngan an pink stem borer.\n" +
                "Ha mga parasito, an pink stem borer amo an pinakamakuri makadaot han dugos, tungod kay mas damu an ira gin-iinom nga tubo (sugarcane) kay han dugos.\n" +
                "Kon ano an ginbubuhat hito\n" +
                "An aphid mahimo makadaot ha alga ha bisan ano nga bahin han pagtubo han alga tikang ha pag-anak tubtob ha pagkahamtong.\n" +
                "\n" +
                "Nakaon ito han mga sanga. Nagriresulta liwat ini hin kamatay o pagkauga han butnga nga bahin. Mahimo ito mahitabo tikang ha panahon han pag-anak tubtob ha panahon han pagtubo han mga tanom antes magbunga. Nagriresulta ito hin mga whiteheads tikang ha panahon han pag-anak tubtob ha panahon han pag-anak.\n" +
                "Kon kay ano ngan diin ito nahinabo\n" +
                "An blast mahimo makita ha mga lugar nga may blast spores.\n" +
                "\n" +
                "Nahitatabo ini ha mga lugar nga diri gud humid, naeksperyensyahan hin hilawig ngan agsob nga uran, ngan may-ada malamrag nga temperatura ha aga. Ha gawas nga mga lugar, an daku nga pagkalainan han temperatura ha adlaw ngan gab-i nga nagriresulta hin tun-og ha mga dahon nakakapahadlok han pagtikadamu han sakit.\n" +
                "\n" +
                "An itom nga itom mahimo magkaada blast ha bisan ano nga bahin han pag-uswag hito. Kondi, nagtitikaluya liwat ito samtang nagtitikadako an mga tanom.\n" +
                "Kon paonan-o ito ginhihisgotan\n" +
                "Usisaha an pallet para ha mga sintomas han masunod nga mga kadaot:\n" +
                "\n" +
                "Mga patay nga sanga nga masayon kuhaon tikang ha kahoy ha panahon han pagtubo tubtob ha pagtubo han sanga antes han pagbunga\n" +
                "Mga puti nga puno tikang ha pag-anak tubtob ha pag-bunga (reproductive phase) han tanom diin an mga tanom puti ngan waray puno o waray sulod\n" +
                "Mga butok ha puno ngan sanga\n" +
                "Bug nga hugaw ha sulod han nadaot nga kahoy\n" +
                "An patay nga mga sanga ngan mga puti nga ugat o barahibo mahimo magin hinungdan han pag-atake hin mga bitin, neck blast, ngan mga sakit nga iginhahatag han itom nga ugat.\n" +
                "\n" +
                "Basi masiguro an kadaot han aksip, usisaha an aksip para han patay nga mga sanga ha panahon tikang ha pagtubo ngadto ha pag-uswag han aksip antes han pananom (vegetative phase), ngan para han mga puti nga mga puno (whiteheads) ha panahon tikang ha pag-anak ngadto ha pananom (reproductive phase). An mga tangbo mahimo kuhaon, i-cut, ngan usisahon basi makita kon may-ada na an mga ulod o mga ulod.\n" +
                "\n" +
                "Kon Kay Ano nga Importante Ini\n" +
                "An sobra nga pagbubo han taklap mahimo makadaot han tanom. An kadaot nga resulta hito mahimo magpaluya han reproductive tillers. Kon an impeksyon nahitabo ha urhi nga mga bahin han pagtubo han alga, mahimo ito magresulta hin mga puti nga ulod o mga buhok.\n" +
                "An kadaot han yellow stem borer mahimo magresulta hin 20% nga pagkunhod ha mga prutas ha temprano nga pagtanom, ngan 80% ha mga prutas ha urhi nga pagtanom\n" +
                "An white stem borer usa nga makamaratay nga peste ha mga lunhaw. Mahimo ito magtikaduro ngan makadaot han bug-os nga balay.\n" +
                "An striped stem borer usa han pinakagrabe nga peste ha Asia. Ha grabe nga mga kaso, an kadaot mahimo umabot ha 100%.\n" +
                "An goldfringe stem borer, usa nga klase hin aksip, mahimo magresulta hin 30% nga pagkunhod han mga abot.\n" +
                "Kon Paonan-o Ini Magmamando\n" +
                "Gamiton an mga varietado nga resistente ha mga bitin\n" +
                "Kuhaa ngan pataya an mga itlog ha kahoy ngan ha kada pagbalhin hin tanom\n" +
                "Pag-abot hin panahon, iton tubig masusugad hin tubig basi an mga itlog nga naabot ha ubos han kulon mahulog\n" +
                "Antes magtanom, kuhaa an hitaas nga bahin han dahon basi diri magdala hin itlog tikang ha pugon ngadto ha pugon\n" +
                "Pag-adjust han panahon han pagtanom basi diri makaurosa an pag-ani han mga dahon ha pagpadamu han mga dahon. Pananglitan, an mga populasyon han mga asno hitaas tikang Abril tubtob Mayo ngan Oktubre tubtob Disyembre. An pagtanom kinahanglan himoon tikang han Hunyo tubtob han Hulyo o Disyembre tubtob han Enero basi malikyan an matinumanon nga pag-ani durante han panahon han pagpadamu han mga ubas.\n" +
                "Pagtanom hin duha ka semana\n" +
                "Kuhaa an mga tanom ngan an mga tanom nga nagtitikadamu. Pag-arado ngan pag-awas han tuna antes itanom.\n" +
                "Ginagamit an natural nga kaaway han aksip sugad han: braconid, eulophid, mymarid, scelionid, chalcid, ptermalid ngan trichogrammatid wasps, mga tamsi, lady beetles, staphylinid beetles, gryllid, green meadow grasshopper, mirid, phorid ngan platystomatid flies, bethylid, elasmid, eurytomid ngan ichneumonid wasps, carabid ngan ladybird beetles, chloropid fly, gerrid ngan pentatomid bugs, tungaw, earwigs, manok, asilid fly, vespid wasp, dragonflies, damselflies, gagamba, mermithid nematode, elascid, chalmid ngan eulophid\n" +
                "Pag-inom hin nitrogen (N) ha husto nga kadamu ngan panahon.\n" +
                "\t\t\t\n" +
                "\n" +
                "\n" +
                "\n");


        pest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Camera2.this, Pest5.class);
                startActivity(intent1);

            }
        });


        home1 = findViewById(R.id.home2);
        home1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Camera2.this, HomeMainActivity4.class);
                startActivity(intent);
            }
        });


        capt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 11);
            }
        });

        viewimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 11);
            }
        });

        Toolbar mtoolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);


    }@Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item_file2, menu);


        return true;





    }@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.E){
            Intent intent = new Intent( Camera2.this,Camera.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.T){
            Intent intent = new Intent( Camera2.this,Camera1.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    void getPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Camera2.this, new String[]{Manifest.permission.CAMERA}, 11);


            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if (requestCode == 11) {
            if (grantResults.length > 0) {
                if (grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                    this.getPermission();
                }

            }
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }
    public void classifyImage(Bitmap bitmap){

        bitmap = Bitmap.createScaledBitmap(bitmap, 224, 224, true);
        try { Log.d(TAG,"try");
            Insect model = Insect.newInstance(getApplicationContext());
            // Creates inputs for reference.
            TensorBuffer inputFeature0 = TensorBuffer.createFixedSize(new int[]{1, 224, 224, 3}, DataType.UINT8);
            TensorImage tensorImage = new TensorImage(DataType.UINT8);
            tensorImage.load(bitmap);
            ByteBuffer byteBuffer = tensorImage.getBuffer();

            inputFeature0.loadBuffer(byteBuffer);
            // Runs model inference and gets result.
            Insect.Outputs outputs = model.process(inputFeature0);
            TensorBuffer outputFeature0 = outputs.getOutputFeature0AsTensorBuffer();
            // Releases model resources if no longer used.
            model.close();
            result.setText(getMax(outputFeature0.getFloatArray()));//txtPrediction.setText(outputFeature0.getFloatArray()[0] + "\n" + outputFeature0.getFloatArray()[1] + "\n" + outputFeature0.getFloatArray()[2]);
            getMax(outputFeature0.getFloatArray());
            Log.d("Result", Arrays.toString(outputFeature0.getFloatArray()));
        } catch (IOException e) {
            Log.e(TAG,"IOException " + e.getMessage());
        }
    }

    private String getMax(float [] outputs) { Log.d(TAG,"getMax( " + Arrays.toString(outputs) + ")");
        if (outputs.length != 0 & outputs[0] > outputs[1] & outputs[0] > outputs[2] & outputs[0] > outputs[3]) {
            return "armyworm";
        } else if (outputs.length != 0 & outputs[1] > outputs[0] & outputs[1] > outputs[2] & outputs[1] > outputs[3]) {
            return "brown planthopper";
        } else if (outputs.length != 0 & outputs[2] > outputs[0] & outputs[2] > outputs[1] & outputs[2] > outputs[3]) {
            return "gall midge";
        }else if (outputs.length != 0 & outputs[3] > outputs[0] & outputs[3] > outputs[1]  & outputs[3] > outputs[2]) {
            return "grasshopper";
        } else {
            return "";
        }
    }

@Override
protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {


        try {
        if (requestCode == 11 && resultCode == RESULT_OK) {

        bitmap = (Bitmap) data.getExtras().get("data");
        int dimension=Math.min(bitmap.getWidth(),bitmap.getHeight());
        bitmap = ThumbnailUtils.extractThumbnail(bitmap,dimension,dimension);
        viewimage.setImageBitmap(bitmap);
        bitmap=Bitmap.createScaledBitmap(bitmap, imageSize, imageSize, false);

        classifyImage(bitmap);

        super.onActivityResult(requestCode, resultCode, data);
        }
        }catch (Exception e) {
        if (requestCode == 12) {

        bitmap = (Bitmap) data.getExtras().get("data");
        viewimage.setImageBitmap(bitmap);
        }
        super.onActivityResult(requestCode, resultCode, data);


        }}}