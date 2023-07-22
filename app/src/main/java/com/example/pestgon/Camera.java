package com.example.pestgon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.example.pestgon.ml.Insect;
import com.example.pestgon.ml.Model;
import com.example.pestgon.ml.Model1;
import com.example.pestgon.ml.Pes;


import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.image.TensorImage;
import org.tensorflow.lite.support.metadata.schema.ImageSize;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

public class Camera extends AppCompatActivity {

    private ImageButton pest1;
    private ImageButton home1;

    private ImageButton capt;
    private ImageButton predict;
    ImageView viewimage;
    TextView result;

    Bitmap bitmap;

    int imageSize=224;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        getPermission();

        capt = findViewById(R.id.capture);
        viewimage = findViewById(R.id.view23);
        result = findViewById(R.id.result);
        pest1 = findViewById(R.id.pest2);

        result.setText("Six species of stemborer attack rice. These are the yellow stemborer, white stemborer, striped stemborer, gold-fringed stemborer, dark-headed striped stemborer, and the pink stemborer.\n" +
                "\n" +
                "Among the stem borers, the pink stem borer is less important. It is polyphagous and prefers sugarcane to rice.\n" +
                "\n" +
                "Damage : Stem borers can destroy rice at any stage of the plant from seedling to maturity.\n" +
                "\n" +
                "They feed upon tillers and causes deadhearts or drying of the central tiller, during vegetative stage; and causes white\n" +
                "\n" +
                "Why and where it occurs\n" +
                "The stem borer larvae bore at the base of the plants during the vegetative stage. On older plants, they bore through the upper nodes and feed toward the base.\n" +
                "\n" +
                "The yellow stem borer is a pest of deepwater rice. It is found in aquatic environments where there is continuous flooding. Second instar larvae enclose themselves in body leaf wrappings to make tubes and detach themselves from the leaf and falls onto the water surface. They attach themselves to the tiller and bore into the stem.\n" +
                "\n" +
                "Striped stem borer is most abundant in temperate countries and in non-flooded areas. Their final instars remain dormant in temperate areas during winter.\n" +
                "\n" +
                "The pink stem borer is found in upland rice, which is grown near sugarcane or related grasses. The presence of alternate hosts encourages the pink stem borer to develop, multiply and survive during winter or dry season. Unlike other species of stem borers, the pink stem borer lay bare eggs between the leaf sheath and the stem.\n" +
                "\n" +
                "High nitrogenous field favors population buildup of the stem borers. Fields planted later favors more damage by the insect pests that have built up in fields that have been planted earlier. Stubble that remains in the field can harbor stem borer larvae and or pupae.\n" +
                "You sent\n" +
                "How to identify\n" +
                "Check the field for the following damage symptoms:\n" +
                "\n" +
                "Deadhearts or dead tillers that can be easily pulled from the base during the vegetative stages\n" +
                "Whiteheads during reproductive stage where the emerging panicles are whitish and unfilled or empty\n" +
                "Tiny holes on the stems and tillers\n" +
                "Frass or fecal matters inside the damaged stems\n" +
                "Deadhearts and whiteheads symptoms may sometimes be confused with damages caused by rats, neck blast, and black bug diseases.\n" +
                "\n" +
                "To confirm stem borer damage, visually inspect rice crop for deadhearts in the vegetative stages and whiteheads in reproductive stages. Stems can be pulled and dissected for larvae and pupae for confirmation of stem borer damage.\n" +
                "You sent\n" +
                "Why is it important\n" +
                "Excessive boring through the sheath can destroy the crop. Its damage can reduce the number of reproductive tillers. At late infection, plants develop whiteheads.\n" +
                "\n" +
                "Yellow stemborer damage can lead to about 20% yield loss in early planted rice crops, and 80% in late-planted crops.\n" +
                "White stemborer is an important pest in rainfed wetland rice. It can cause outbreaks and destroy rice fields.\n" +
                "Striped stemborer is one of the most important insect pests in Asia. Its damage can be as high as 100% when severe.\n" +
                "Gold-fringed stemborer can cause yield loss of about 30%.\n" +
                "How to manage\n" +
                "Use resistant varieties\n" +
                "At seedbed and transplanting, handpick and destroy egg masses\n" +
                "Raise level of irrigation water periodically to submerge the eggs deposited on the lower parts of the plant\n" +
                "Before transplanting, cut the leaf-top to reduce carry-over of eggs from the seedbed to the field\n" +
                "Ensure proper timing of planting and synchronous planting, harvest crops at ground level to remove the larvae in stubble, remove stubble and volunteer rice, plow and flood the field\n" +
                "Encourage biological control agents: braconid, eulophid, mymarid, scelionid, chalcid, pteromalid and trichogrammatid wasps, ants, lady beetles, staphylinid beetles, gryllid, green meadow grasshopper, and mirid, phorid and platystomatid flies, bethylid, braconid, elasmid, eulophid, eurytomid and ichneumonid wasps, carabid and lady bird beetles, chloropid fly, gerrid and pentatomid bugs, ants, and mites,  earwigs, bird, asilid fly, vespid wasp, dragonflies, damselflies, and spiders\n" +
                "Bacteria and fungi also infect the larvae: mermithid nematode, chalcid, elasmid and eulophid\n" +
                "Apply nitrogen fertilizer in split following the recommended rate and time of application.");

        pest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Camera.this, Pest.class);
                startActivity(intent1);

            }
        });
        
        home1 = findViewById(R.id.home2);
        home1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Camera.this, HomeMainActivity2.class);
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
        inflater.inflate(R.menu.item_file, menu);


        return true;


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.T){
            Intent intent = new Intent( Camera.this,Camera1.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.W){
            Intent intent = new Intent( Camera.this,Camera2.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
    void getPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Camera.this, new String[]{Manifest.permission.CAMERA}, 11);


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
            for(int i =0;i<imageSize;i++) {
                for (int j = 0; j < imageSize; j++) {
                    int val = intValues[pixels++];
                    byteBuffer.putFloat(((val >> 16) & 0xFF) * (1.f / 255.f));
                    byteBuffer.putFloat(((val >> 8) & 0xFF) * (1.f / 255.f));
                    byteBuffer.putFloat(((val & 0xFF) * (1.f / 255.f)));

                }

            }

            inputFeature0.loadBuffer(byteBuffer);

            // Runs model inference and gets result.
            Insect.Outputs outputs = model.process(inputFeature0);

            TensorBuffer outputFeature0 = outputs.getOutputFeature0AsTensorBuffer();
            TensorBuffer outputFeature1 = outputs.getOutputFeature0AsTensorBuffer();
            float[]confidences=outputFeature0.getFloatArray();
            int maxPos=0;
            float maxConfidence=0;
            for(int i =0; i<confidences.length;i++){
                if(confidences[i]>maxConfidence){
                    maxConfidence=confidences[i];
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

            String S="";
            for(int i=0;i< classes.length;i++) {
                S += String.format("%s: %.1f%\n", classes[i], confidences[i] * 100 );
            }
            result=findViewById(R.id.result);
            result.setText(S);

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
        }catch (Exception e){
            if (requestCode == 12 ) {

                bitmap = (Bitmap) data.getExtras().get("data");
                viewimage.setImageBitmap(bitmap);
            }
            super.onActivityResult(requestCode, resultCode, data);

        }}}