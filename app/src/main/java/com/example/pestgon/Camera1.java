package com.example.pestgon;

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

import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Camera1 extends AppCompatActivity {
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
        setContentView(R.layout.activity_camera1);

        getPermission();


        capt = findViewById(R.id.capture);

        viewimage =

                findViewById(R.id.view23);

        result =

                findViewById(R.id.result);

        pest1 =

                findViewById(R.id.pest2);

        result.setText("Bakit at saan ito nangyayari\n" +
                "Ang mga weevil ay naaakit sa mainit at mamasa masang kapaligiran. Sila ay lumalabas sa huling bahagi ng tagsibol at naghahanap ng kanlungan sa mainit, tuyong buwan ng Hunyo at Hulyo, naghahanap ng mga lugar upang magparami at mangitlog. Kung pumasok sila sa inyong tahanan, naaakit sila sa mga butil at iba pang pagkain at infest ang mga ito. Kung makakakuha ka ng pagkain na puno ng weevil, ang pag init nito sa temperatura ng kuwarto ay maaaring magsulong ng mabilis na paglago ng weevils, na nagiging sanhi ng infestation.\n" +
                "Paano tukuyin ang\n" +
                "-Ang mga weevil ay maliliit na beetle na may kapansin pansin na mga ilong.\n" +
                "-Ang mga ito ay kadalasang bombilya- o peras-hugis.\n" +
                "-Ang mga immature, legless, grub-like larvae feed sa mga halaman.\n" +
                "-Ang mga weevil ng matatanda ay naghahanap ng kanlungan sa hindi magandang kondisyon ng panahon,lalo na kapag mainit at tuyo.\n" +
                "-Ang mga weevil ay pumapasok sa mga gusali sa pamamagitan ng pag-crawl sa mga bitak o butas sa paligid ng mga pundasyon, pinto at bintana.\n" +
                "-Ang mga ito ay isang pansamantalang kaguluhan.\n" +
                "Paano pangasiwaan ang\n" +
                "-Limang itim na beetles na may pahaba snouts, dalawang antennae at anim na binti bawat isa.\n" +
                "-Strawberry ugat weevils\n" +
                "-Ang pagpipigil sa mga weevil ay ang pinakamainam na paraan ng pagkontrol.\n" +
                "-Caulk bitak at matiyak snug-fitting screen at pinto upang mabawasan ang bilang ng mga weevils na maaaring pumasok sa isang gusali.\n" +
                "            -Ang mga weevil, lalo na ang strawberry root weevils, ay naaakit sa kahalumigmigan. Maaari mong bitag ang mga ito sa mababaw na kawali ng tubig na inilagay sa paligid ng mga pundasyon o pader ng bahay.\n" +
                "            -Ang mga kawaling ito ay hindi nakakakuha ng sapat na mga weevil para mabawasan ang bilang ng mga weevil na pumapasok sa mga tahanan.\n" +
                "                Matuto nang higit pa\n" +
                "            Tingnan ang buong fact sheet\n" +
                "            Tubig weevil sa IRRI Rice Knowledge Bank\n" +
                "            Ano ang ginagawa nito\n" +
                "            Ang weevil ay isang uri ng beetle mula sa Curculionoidea superfamily123. Karaniwang maliliit ang mga ito, mas mababa sa 6 milimetro ang haba, at herbivorous12. Ang mga weevil ay kilala sa kanilang pahaba na ilong at kadalasang tinatawag na snout beetle123. Ang mga ito ay may iba't ibang kulay at may libu libong uri ng weevil34. Ang mga immature larvae ay kumakain sa mga halaman, habang ang mga adult weevil ay naghahanap ng kanlungan sa hindi kanais nais na kondisyon ng panahon5.");


        pest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Camera1.this, Pest3.class);
                startActivity(intent1);

            }
        });


        home1 = findViewById(R.id.home2);
        home1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Camera1.this, HomeMainActivity3.class);
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
        inflater.inflate(R.menu.item_file1, menu);


        return true;





}@Override
public boolean onOptionsItemSelected(MenuItem item) {
    if(item.getItemId()==R.id.E){
        Intent intent = new Intent( Camera1.this,Camera.class);
        startActivity(intent);
    }
    if(item.getItemId()==R.id.W){
        Intent intent = new Intent( Camera1.this,Camera2.class);
        startActivity(intent);
    }
    return super.onOptionsItemSelected(item);
}

    void getPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Camera1.this, new String[]{Manifest.permission.CAMERA}, 11);


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
        try {
            Insect model = Insect.newInstance(getApplicationContext());
            // Creates inputs for reference.
            TensorBuffer inputFeature0 = TensorBuffer.createFixedSize(new int[]{1, 224, 224, 3}, DataType.FLOAT32);
            ByteBuffer byteBuffer=ByteBuffer.allocateDirect(4*imageSize*imageSize*3);
            byteBuffer.order(ByteOrder.nativeOrder());
            int [] intValues = new int[imageSize*imageSize];
            bitmap.getPixels(intValues,0, bitmap.getWidth(), 0,0, bitmap.getWidth(),bitmap.getHeight());
            int pixels=0;
            for(int i =0;i<imageSize;) {
                for (int j = 0; j < imageSize;) {
                    int val = intValues[pixels++];
                    byteBuffer.putFloat(((val >> 16) & 0xFF) * (1.f /255.f));
                    byteBuffer.putFloat(((val >> 8) & 0xFF) * (1.f / 255.f));
                    byteBuffer.putFloat(((val & 0xFF) * (1.f / 255.f)));

                }

            }

            inputFeature0.loadBuffer(byteBuffer);

            // Runs model inference and gets result.
            Insect.Outputs outputs = model.process(inputFeature0);

            TensorBuffer outputFeature0 = outputs.getOutputFeature0AsTensorBuffer();

            float[]confidence=outputFeature0.getFloatArray();
            int maxPos=0;
            float maxConfidence=0;
            for(int i =0; i<confidence.length;){
                if(confidence[i]>maxConfidence){
                    maxConfidence=confidence[i];
                    maxPos=i;



                }}

            String [] classes ={"Chesnut Munia\n \n      Birds are a group of warm-blooded vertebrates constituting the class Aves, characterised by feathers, toothless beaked jaws, the laying of hard-shelled eggs, a high metabolic rate, a four-chambered heart, and a strong yet lightweight skeleton.\n",
                    "Snail\n \n     A snail is a shelled gastropod. The name is most often applied to land snails, terrestrial pulmonate gastropod molluscs. However, the common name snail is also used for most of the members of the molluscan class Gastropoda that have a coiled shell that is large enough for the animal to retract completely into\n",
                    "Rat\n \n       are various medium-sized, long-tailed rodents, typically having a pointed snout and a long, sparsely haired tail. Some kinds have become cosmopolitan and are sometimes responsible for transmitting diseases.Rice field rats cut or pull up transplanted plants. They also chop down the young seedlings.At booting stage, they feed on rice panicles.\n",
                    "Rice field cricket\n \n    Crickets, also called gryllids, feed on leaves by making irregular to longitudinal exit holes. They also feed on stems, seeds, and on young panicles of the rice plant. When feeding damage is excessive, they can cause deadheart.\n",
                    "Rice mole cricket\n \n      Mole crickets are polyphagous. They feed on the underground parts of almost all-upland crops. They occasionally become sufficiently abundant to cause heavy damage to roots and basal parts of rice plants growing in raised nursery beds or upland conditions\n ",
                    "Root aphid\n \n    Root aphids are aphid species defined by their habit of feeding on plant roots during part of their lifecycle. In general they are 2-3mm long, colour varies depending on species, environmental conditions and host plant, they can be yellow, green or brown often with a white waxy appearance.\n",
                    "Root grub\n \n     Root grubs generally prefer plants with fibrous root system.They are widespread in upland and rainfed rice environments.The adults are nocturnal and are attracted to light traps. Eggs are laid and developed in moist soil made by the burrowing females. In the soil, they usually remain close to where moisture is available. Root grubs feed on rice during the seedling stage of the crop.  During drought, damage caused by the insect pest is higher.\n",
                    "Ant\n \n       a small insect, often with a sting, that usually lives in a complex social colony with one or more breeding queens. It is wingless except for fertile adults, which often form large mating swarms, and is proverbial for industriousness.\n",
                    "Rice thrips\n \n       These insects are present in all rice  environments. In the tropics, the rice thrips becomes abundant  in dry periods from July to September and January to March. In temperate areas, the insects migrate and hibernate on graminaceous weeds during the winter season.\n",
                    "Rice skipper\n \n      are found in all rice environments but they are more abundant in rainfed rice fields. They are light brown with orange markings and have a characteristic pattern of white spots  on the wings. The adults are diurnal and they have erratic flight movement as they skip from plant to plant, thereby their name.\n",
                    "Rice gall midge\n \n       is a species of small fly in the family Cecidomyiidae. It is a major insect pest of rice. The damage to the crop is done by the larvae  which form galls commonly known as silver shoots or onion shoots\n",
                    "Rice hispa \n \n       a species of leaf beetle from Southeast Asia, often known by its common name: the rice hispa. These beetles are a well known invasive pest, and are responsible for significant crop damage across many countries. The male to female ratio is between 1:1.26 and 1:1.46.\n",
                    "Rice stem borer\n\n         rice stemborer, is a moth of the family Crambidae. It is a widespread species, known from Iran, India, Sri Lanka, China, eastern Asia, Japan, Taiwan, Malaysia to the Pacific. It is a serious pest of rice\n",
                    "Rice water weevil\n\n      the most economically damaging of the invertebrate pests found in California. Root pruning by larvae is the major cause of reduced yields. Plants with damaged roots may become stunted and lose yield through reduction of tillers and panicles or because maturity is delayed.\n",
                    "Rice zigzag leafhopper\n\n       found in all rice environments. It is abundant during the early rainy season in the early  growth stages of the rice plant. It rarely occurs in large numbers. The adults usually stay in the upper parts of the rice plants\n",
                    "Rice brown planthopper\n\n      Nilaparvata lugens is a planthopper species that feeds on rice plants.These insects are among the most important pests of rice, which is the major staple crop for about half the world's population. \n",
                    "Rice green leafhopper\n\n      Green leafhoppers are common in rainfed and irrigated wetland environments. They are not prevalent in upland rice.  Both the nymphs and adults feed on the dorsal surface of the leaf  blades rather than the ventral surface. They prefer to feed on the lateral leaves rather than the leaf sheaths and the middle leaves. They also prefer rice plants that have been fertilized with large amount of nitrogen.\n",
                    "Rice mealy bug \n\n         The rice mealybug is found in upland and  rainfed environments. It is not common in irrigated rice. It occurs in great number during the rainy season. The nymphs are active until they molt\n",
                    "Rice black bug \n\n         The insect is common in rainfed and irrigated wetland environments. It prefers continuously cropped irrigated rice  areas and poorly drained fields. Damages are observed more  frequently in dry season rice crops and densely planted fields. Black bug flight patterns are affected by the lunar cycle; on full moon nights, large numbers of adults swarm to light sources.\n",
                    "Rice earbug \n\n        ice ear bug, is an insect from the family Alydidae, the broad-headed bugs. This species is commonly confused with Leptocorisa  acuta, and other similar, related rice bug genera and species.\n",
                    "Rice green horned caterpillar\n\n      minor pests of rice. Their potential severity is generally too low to cause yield loss. Natural enemies usually control their populations and  the plant can recover from the feeding damage of greenhorned caterpillars.\n",
                    "Rice army worm \n\n        the true armyworm moth, white-speck moth, common armyworm or rice armyworm, is a nocturnal agricultural pest belonging to the family Noctuidae. This moth is also commonly referred to by the scientific name Pseudaletia unipuncta.\n",
                    "Rice cutworms \n\n         The insect occurs in all types of rice environments during the vegetative stages. The adult moths are  nocturnal and highly attracted to light traps. During the day,they hide at the bases of rice plants and grassy weeds.The eggs usually hatch in the early hours of the morning\n",
                    "Rice green semilooper\n\n         Green semiloopers are found in wetland environments. They are abundant during the rainy season. The adult moths hide at the base of the plants in rice fields or in grassy areas during daytime and are active at night. Prior to pupation,the older larvae fold a rice leaf and secure it with silk to form a pupal chamber.\n",
                    "Rice short-horned grasshopper\n\n      The short-horned grasshoppers are common in moist and swampy areas. These nocturnal insect pests are abundant during September and October. Oriental migratory locusts are commonly found in all rice environments but they are more concentrated in rainfed areas.\n",
                    "Rice leaf roller\n\n       Rice leaffolders occur in all rice environments and are more abundant during the rainy seasons. They are commonly found in shady areas and areas where rice is heavily fertilized. In tropical rice areas, they are active year-round, whereas in temperate countries they are active from May to October. The adults are nocturnal and during the day, they stay under shade to escape predation. Moths fly short distances when disturbed.\n",
                    "Rice leaf folder\n\n       Rice leaffolders occur in all rice environments and are more abundant during the rainy seasons.They are commonly found in shady areas and areas where rice  is heavily fertilized. In tropical rice areas, they are active year-round, whereas in temperate countries they are active from May to Octobe\n",
                    "Rice caseworm\n\n          Rice caseworms or case  bearers cut off leaf tips to make leaf cases. Their feeding damage can cut leaves at right angles as with a pair of scissors.\n",
                    "Rice whorl maggot\n\n      The rice whorl maggot is semi-aquatic. It is common in irrigated fields and feeds on the central whorl leaf of the vegetative stage of the rice plant.It does not occur in upland rice. It also prefers ponds,streams and lakes or places with abundant calm water and lush vegetation.\n"


            };

            result.setText(classes[maxPos]);



            // Releases model resources if no longer used.
            model.close();
        } catch (IOException e) {
            // TODO Handle the exception
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