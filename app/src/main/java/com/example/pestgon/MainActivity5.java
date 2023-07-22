package com.example.pestgon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    private ImageButton camera1;
    private ImageButton pest1;
    TextView tView;
    TextView tView1;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main5);

        tView = findViewById(R.id.textview1);
        tView1 = findViewById(R.id.textview2);
        image = findViewById(R.id.view23) ;


        Intent intent = getIntent();
        tView.setText(intent.getStringExtra("select"));
        tView1.setText(intent.getStringExtra("select"));
        image.setImageResource(intent.getIntExtra("image", 0));
        String pest = tView.getText().toString();


        if(pest.equals("Tubak")){
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText(
                    "Syentipiko nga ngaran\n" +
                            "Solenopsis geminata (Fabricius)\n" +
                            "Kon ano an ginbubuhat hito\n" +
                            "An mga Tubak nakaon han mga liso ngan mga bulong ngan naglabay hira ha uma.\n" +
                            "\n" +
                            "Nakakaapekto ito ha katindog han tanom ngan nag-aaghat hin daku nga posibilidad nga magkaada mga sakit nga iginpapadara han mga insekto nga Homoptera sugad han kabayo, mga bugas, ngan mga aphids.\n" +
                            "\n" +
                            "Kon kay ano ngan diin ito nahinabo\n" +
                            "Damu an mga tubak ha gawasnon nga kagurangan o higtaas nga katunaan diin hira naukoy o nag-uokoy ha ilarom han tuna. An mga suhol nga sugad hin mga surugoon, gin-aataman nira pinaagi hin mga paratigo.\n" +
                            "\n" +
                            "An kadaot han mga Tubak waray pulos. Agsob hira kumaon samtang nagtitikadako pa an mga tanom.\n" +
                            "\n" +
                            "Kon paonan-o ito ginhihisgotan\n" +
                            "Hibaroi kon may-ada ba nawawara nga mga tanom ngan kon nagtitikaluya an mga tanom.\n" +
                            "\n" +
                            "Ini nga sakit pariho han mga sintomas han mole cricket. Basi mahibaroan an kalainan, usisaha kon may-ada mga tubak ha balay.\n" +
                            "\n" +
                            "An mga Tubak agsob makita ha mga lugar nga may-ada kadaot. May mga liso nga makikita ha mga salag han mga tubak.\n" +
                            "\n" +
                            "Kon Kay Ano nga Importante Ini\n" +
                            "An mga tubak diri gud nakakadaot ha palay. Kon diri grabe an kadaot, an palay puydi gihapon makaopay tikang han iya kadaot.\n" +
                            "\n" +
                            "Kon Paonan-o Ini Magmamando\n" +
                            "Basi malikyan an kadaot han mga tubak, dugangi an kadamu han mga liso nga igintanom.\n" +
                            "\n" +
                            "An mga tubak mahimo makadaot han mga nematode, fungus, langaw, strepsipteran, ngan eukaritine wasps. Ginkaon liwat hira han katamsihan, mga halas, mga langaw, ngan mga bugsok.\n");

        }else if(pest.equals("Harabas")){
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText("An mga armyworm amo an mga ulod nga naabot ha palayan. May-ada tulo nga klase hin armyworm nga naatake ha mga palayan ha Asia. Amo ini an rice swarming caterpillar, an common cutworm, ngan an rice ear-cutting caterpillar.\n" +
                    "An usa nga bunay han armyworm mayada ginatos nga itlog. An tagsa nga babaye nga armyworm naglalaga hin 800-1000 nga itlog ha bug-os niya nga kinabuhi nga nag-iiha la hin mga usa ka semana.\n" +
                    "Kon ano an ginbubuhat hito\n" +
                    "An armyworm nangangaon hin mga sanga pinaagi ha pagputos han mga dahon ngan mga sanga ha punoan han tanom. An mga armyworm naggisi liwat hin mga tangbo.\n" +
                    "Kon kay ano ngan diin ito nahinabo\n" +
                    "An mga armyworm mas mabubuhi ngan mag-aanak ha mga temperatura nga diri na maglabaw ha 15°C, ngan kon natural an ginagamit nga abono. An panahon han kamingawan nga sinundan hin duro nga uran ngan an presensya han iba nga mga tanom nga puy-anan han armyworm nabulig liwat ha pag-uswag hini.\n" +
                    "An armyworm aktibo ha gab-i.\n" +
                    "\n" +
                    "An mga ulod han armyworm kasagaran nga nagpipinangaon ha bawbaw han mga sanga kon masirom o kon gab-i na; an mga armyworm nagpipinangaon, nagpaparopata, ngan nagbibiyahe ha gab-i. Durante han adlaw, an mga armyworm nagpapahilom ha ubos han tanom.\n" +
                    "\n" +
                    "Ha mamara nga mga palay, an alga han armyworm aada ha tuna o ha ubos han palda. Ha mga salog, an mga pipas aada ha mismo nga tanom o ha mamara nga bahin ha ligid han uma.\n" +
                    "\n" +
                    "Kon paonan-o ito ginhihisgotan\n" +
                    "Hibaroi kon ano an epekto han pagkaon.\n" +
                    "\n" +
                    "An mga armyworm nangangaon han mga tumoy ngan mga sidsid han dahon. Mahimo nira pag-unlad an bug-os nga dahon ngan bayaan la an butnga nga gamot (midrib).\n" +
                    "\n" +
                    "An kadaot han armyworm mahimo magin sugad ka grabe han kadaot han cutworm. An kadaot han armyworm amo an pagbulag han mga dahon. Basi masiguro an hinungdan han kadaot, kitaa kon may-ada mga armyworm ngan mga itlog hito.\n" +
                    "Kon Kay Ano nga Importante Ini\n" +
                    "Mahimo magin problema ha ngatanan nga yugto han pagtubo han tanom an mga palda.\n" +
                    "\n" +
                    "An pagkadunot mahimo mahitabo kon daku an populasyon han armyworm. Nagigin makamaratay ini ngan mahimo magresulta hin daku nga kadaot ha mga tanom.\n" +
                    "\n" +
                    "Ha mga panahon han duro nga kakusog han mga armyworm, nagsasarang hira ha mga uma basi kumaon ngan makadaot ha mga tanom.\n" +
                    "\n" +
                    "Kon Paonan-o Ini Magmamando\n" +
                    "An pagpahitaas han tubig ha tuburan amo an pinakaepektibo nga paagi ha pag-ato han mga armyworm.\n" +
                    "\n" +
                    "Basi malikyan an kadaot han armyworm:\n" +
                    "\n" +
                    "Ibutang an mga tanom hirayo ha mga banwa.\n" +
                    "Panalipdi an uma nga waray uma.\n" +
                    "Limpyohi an uma ngan kuhaa an mga banwa.\n" +
                    "Pagkontrol:\n" +
                    "\n" +
                    "Ibutang an mga abo ha mga kanal basi diri makagawas an mga ulod.\n" +
                    "Ibutang an mga sanga ha palibot han uma basi mag-ukoy an mga armyworm ngan magin mas masayon an pag-ani han parauma.\n" +
                    "Likayi an pagpatay ha natural nga kaaway han mga armyworm sugad han mga bugoy ngan mga ulod. An insecticide sadang magin kataposan nga solusyon ha pagkontrol han armyworm.\n");


        }else if(pest.equals("Tamsi")) {
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText(
                    "Tamsi\n" +
                            "Syentipiko nga ngaran\n" +
                            "Ha sobra 70 nga espisye han mga tamsi nga makikita ha mga palayan, lima la ha Pilipinas (ngan napulo kag upat ha Southeast) an nakaon hin palayan.\n" +
                            "\n" +
                            "An pipira han mga tamsi nga nag-aaghat hin hangin amo an:\n" +
                            "\n" +
                            "Eurasian Tree Sparrow (Passer montanus),\n" +
                            "Chestnut Munia (Lonchura malacca),\n" +
                            "Scaly-Breasted Munia (Lonchura punctulata) ngan\n" +
                            "White-Bellied Munia (Lonchura leucogastra).\n" +
                            "Kon ano an ginbubuhat hito\n" +
                            "An mga tamsi nga nakaon han mga lugas ha balay mahimo magresulta hin mga whiteheads o waray sulod nga mga lugas.\n" +
                            "\n" +
                            "Gin-aagom nira an mga liso samtang nagtitinubog ito, o ginkaon nira an mga liso kon hinog na ito. An ira pagkaon nagpapabilin hin maasin nga tinaksan ha mga liso.\n" +
                            "\n" +
                            "Kon kay ano ngan diin ito nahinabo\n" +
                            "Nagigin problema an mga tamsi tikang han panahon han pag-anak han mga tanom kon an mga tangbo nagsusulod han mga liso tubtob han pag-ani ngan pag-ani.\n" +
                            "\n" +
                            "An iba nga katamsihan nag-aagom hin mga liso pinaagi ha pag-abot ha ira o ha mga butang nga hirani ha ira (sugad han alad o poste), o pinaagi ha pagkaon hin mga liso nga nahulog ha tuna durante han pag-ani. Nagtitikadamo an mga tamsi kada panahon han pag-ani.\n" +
                            "\n" +
                            "Kon paonan-o ito ginhihisgotan\n" +
                            "Usisaha kon may-ada likido nga may-ada gatas ha mga puno han liso ngan kon may-ada itom nga mga puno o mga whiteheads.\n" +
                            "\n" +
                            "An mga puti o busag nga mga sanga mahimo himoon han mga stem borer. Basi masiguro an hinungdan han kadaot:\n" +
                            "\n" +
                            "Diri ngatanan nga peste nga ginbubuhat han mga tamsi nagpapabilin hin mga sanga.\n" +
                            "Tungod han kadaot han mga tangkob, waray pulos an ngatanan nga liso ngan masayon mabungkag an mga dahon.\n" +
                            "Kon Kay Ano nga Importante Ini\n" +
                            "An kadaot nga resulta han pag-abot han mga tamsi basi kumaon han mga lugas nagriresulta hin gutiay nga pag-ani.\n" +
                            "\n" +
                            "Kon Paonan-o Ini Magmamando\n" +
                            "Importante nga tagdon an magkalainlain nga paagi han pag-ataman han mga palabilabi. An mga paagi han pag-ataman may-ada magkalainlain nga kapulsanan ngan epekto. Damu nga opsyon an puydi himoon hin temporaryo o bug-os-tuig:\n" +
                            "Mga bata\n" +
                            "Hira an mga trabahador ha balay nga nag-aawas o nag-aabre han mga tamsi. Epektibo ini kon an mga paagi han pagdakop o paghadlok diri mag-iiba ngan kon maaram hira kon ano nga klase hin granivorous nga mga tamsi an sadang la pagdakop.\n" +
                            "Paggawas gamit an net\n" +
                            "An paggamit hin pukot para ha pagluto epektibo kondi mahal. Posible liwat ito nga makapaiwas o makamatay han mga tamsi nga nabulig ha mga tanom. Kon posible, likayi an ira kamatayon.\n" +
                            "Bird-tape\n" +
                            "An mga bird tape iginbubutang ha bawbaw han salog. Usa ini han pinakaepektibo nga mga paagi ha paghadlok ha mga tamsi labi na kon gin-aaghat ito han hangin.\n" +
                            "Mga Nagbubuhat hin Kasamok\n" +
                            "An mga noisemakers mahimo gamiton ha paghimo hin iba-iba nga aringasa ngan mga rekording nga mahimo magin makainsulto ha mga tamsi. Kondi, masayon ito hinumdoman han katamsihan salit diri ito maiha nga ginagamit. An iba-iba nga aringasa nakakadaot ha ngatanan nga tamsi samtang an mga rekording nakakaapekto ha partikular nga mga klase hin tamsi. May-ada liwat ultrasonic noisemakers, kondi diri ngatanan nga tamsi nakakabati hito.\n" +
                            "Chemical repellents Mga kemikal nga repellents\n" +
                            "Kasagaran ini tikang ha tsokolate. Damu nga mga repellent nga kemikal an posible gamiton. Usa ka litro hito an magagamit ha usa ka ektarya. An repellent kinahanglan ipadapat ha tanom kada duha ka semana. Sadang liwat ito isul-ot katapos han uran.\n" +
                            "Mga tamsi nga mangangamang\n" +
                            "An paggamit hin decoy birds masayon nga paagi ha pag-ato han mga tamsi; barato liwat ito. Puydi ito gamiton ha pag-akit o pagpaiwas ha mga tamsi, depende ha klase han tamsi nga ginagamit.\n" +
                            "Paggamit hin bandera, scarecrow, o bird kites\n" +
                            "An mga resulta hito pariho han paggamit hin bird tape ngan mas barato ito. An mga bandera, scarecrows, ngan bird kites nabulig ha hangin nga makapalagyw han mga tamsi.\n" +
                            "Kondi, an mga tamsi naeksperyensyahan liwat hini nga mga paagi ngan an ira paggamit diri mag-iiha.\n" +
                            "An eco-engineering\n" +
                            "An eco-engineering usa nga paagi han pagkontrol ha mga tamsi diin ginpapabay-an an dagku nga mga tamsi nga mangangawat han gudtiay. Ito an natural nga paagi han pagmando ngan pagbalanse han natural nga sistema han mga palayan.\n" +
                            "Ini an pinakamaraot nga paagi kondi bangin magkalainlain an resulta.\n" +
                            "\n" +
                            "An paggamit han dagku nga mga tamsi ha paghadluk o pagpaiwas han gutiay nga mga tamsi amo an paggamit han natural nga food web nga nakakabulig ha mga mag-uuma. An mga peste nahiuyon ha damu nga mga pagbag-o kondi mas maluloton kon aada an natural nga biodiversity ha uma.\n" +
                            "\n" +
                            "An eco-engineering natural nga paagi nga kinahanglan hibaroan han mga tawo. An pagwara han komersyal nga pag-ihaw ha mga tamsi makakabulig nga makabalik an natural nga balanse ha mga tamsi.\n");

        }else if(pest.equals("Itom nga asno")){
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText(
                    "Itom nga asno\n" +
                            "Tulo nga klase hin itom nga bug an nasasamad han itom nga bug: an common black bug, an Malay black bug, ngan an Japanese rice black bug.\n" +
                            "\n" +
                            "Kon ano an ginbubuhat hito\n" +
                            "An itom nga ugang nag-aabre han salsa han tanom. Tungod hito, mahimo hira magresulta hin pagkit-on han mga dahon, pagkabungkag han mga sanga (deadheart), ngan pagkadulom ngan kamatay han bugburn. An ira pagbungkag nakakadaot han mga sanga, nagriresulta hin gutiay nga numero han mga itlog, ngan nagriresulta hin pagbusag han buhok.\n" +
                            "\n" +
                            "Ha makuri nga mga kahimtang, an itom nga mga tamsi nagpapaluya ngan nakakapugong liwat han pag-anak han mga liso.\n" +
                            "\n" +
                            "Kon kay ano ngan diin ito nahinabo\n" +
                            "Kasagaran nga nakakadaot an itom nga asno ha irrigated ngan rainfed nga mga lugar.\n" +
                            "\n" +
                            "Nabubuhi ito ha mga lugar nga may-ada matambok nga tubig ngan ha mga lugar nga may-ada diri maopay nga tubig. Mas agsob ini nga mga peste makadaot ha panahon han katpaso ngan ha mga lugar nga may-ada hilawig nga mga tanom.\n" +
                            "\n" +
                            "An pagbalhin han bulan nakakaapekto ha paglupad ngan pag-uswag han mga manok. Kon puno an bulan, an mga lagas nga itom nga insekto mas damu an nakakadaot.\n" +
                            "\n" +
                            "An diri-pagkapariho nga pagtanom ngan sobra nga nitroheno nagriresulta hin pag-uswag han mga parasito. Kon waray tanom, an itom nga mga tamsi namimiling hin iba nga lugar ha pag-anak, sugad han mga banwa ha palibot.\n" +
                            "\n" +
                            "Kon paonan-o ito ginhihisgotan\n" +
                            "Usisaha an mga dahon kon may-ada iba nga kolor. An pagbungkag han itom nga mga sanga nagriresulta hin pagbusag (redish brown) o pagbul-og han mga sanga. An mga dahon mahimo magkaada mga pagputos.\n" +
                            "\n" +
                            "Tigamni liwat kon nagtitikaluya ba an pag-inom han manok. An mga sintomas han bugburn nagpapakita hin pagkauga han mga sanga kondi waray makita nga dugos ngan anit.\n" +
                            "\n" +
                            "An mga tanom may-ada liwat sakit ngan mahimo makaapekto ha pagburod han manok. Mahimo ito magresulta hin mga tanom nga waray sulod o nagtitikadako o mga tanom nga diri gud natitikang.\n" +
                            "\n" +
                            "Usisaha liwat kon may-ada patay nga ulo o patay nga kasingkasing. An deadheart mahimo magin sayop nga epekto han pagkaon hin stem borer. Basi masiguro ito, kuhaon an patay nga mga sanga. Kon an karat-an ginpapahinabo han itom nga alkitran, an patay nga alkitran diri nakakasulod ha iya bug-os.\n" +
                            "\n" +
                            "An makamaratay nga pagbungkag han peste ngan bugburn makikita katapos han panahon han pag-ani o pagkahamtong han mga bugas.\n" +
                            "\n" +
                            "Kon Kay Ano nga Importante Ini\n" +
                            "An itom nga mga parrot nakakaon han tamsi, tikang ha bulong tubtob ha pagtubo. An kada napulo nga pag-ani ha usa nga tanom mahimo magresulta hin 35% nga kakulang ha ani.\n" +
                            "\n" +
                            "Kon Paonan-o Ini Magmamando\n" +
                            "Basi malikyan an pag-atake han itom nga asno:\n" +
                            "\n" +
                            "Gamiton an klase nga resistente ha itom nga alga. Pamiling hin pinakabag-o ngan komprehensibo nga lista han mga klase hin mga bag-o nga kahoy tikang ha pinakamahirani nga opisina han agrikultura.\n" +
                            "Katapos han pag-ani, pag-aradohi an palanggana basi mawara o mamatay an nahibilin nga mga insekto.\n" +
                            "Tipigi nga uga an lampin samtang nag-aarado.\n" +
                            "Tipigi nga limpyo an lamesa. Pagdumiri hin mga banwa nga mahimo magtikang. Pagtanom hin varieties nga may-ada pariho nga panahon han pagtubo basi diri mag-aghat hin pag-uswag han mga peste.\n" +
                            "Gamiton an mga light trap nga may mercury bulbs o mga suga nga naglalawag lima ka adlaw antes o katapos han lunar eclipse.\n" +
                            "Gamita an natural nga mga kaaway han itom nga mga ulod sugad han mga langaw nga nagbubungkag han itom nga peste, mga bitin, mga bungad, mga ulod, mga red bird nga nagbubungkag han itom, mga tamsi ngan tigurang nga mga langaw, mga liyon, mga bugsok nga nag-iirignom han itom ngan mga tamsi, ngan pipira nga fungus.\n" +
                            "Para makontrol:\n" +
                            "\n" +
                            "Ha tinikangan han pag-atake han itom nga mga langaw, padad-a an tubig ha sulod han palay ngan tipigi ito ha sulod hin 2-3 ka adlaw basi pugngan an mga peste nga sumaka ngan mamatay an ira mga itom.\n");

        } else if(pest.equals("Ngusong Kabayo")) {
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText("\n" +
                    "Kabayo\n" +
                    "May-ada duha nga klase hin mga planthopper nga nakakadaot ha mga salog. Amo ini an brown planthopper o Nilaparvata lugens (Stal) ngan an whitebacked planthopper o Sogatella furcifera (Horvath).\n" +
                    "\n" +
                    "Kon ano an ginbubuhat hito\n" +
                    "An hitaas nga populasyon han kabayo-kahoy nagriresulta hin pag-an-an-an nga kolor han dahon antes mag-awas ngan mag-uga. Ini nga kahimtang gintatawag nga hopperburn.\n" +
                    "\n" +
                    "Mahimo liwat nga magdara hin sakit an mga brown-horse. Ini nga mga sakit amo an rice ragged stunt ngan an rice grassy stunt nga waray pagtambal.\n" +
                    "\n" +
                    "Kon kay ano ngan diin ito nahinabo\n" +
                    "Nagigin problema an mga kabayo ha mga lugar nga uranon ngan may-ada irrigasyon. Nakakadaot liwat ini ha mga surudlan nga aada ha tubig, ha masirom nga lugar, ngan ha humid nga kahimtang.\n" +
                    "\n" +
                    "An pagkahilig han pana, duro nga pag-uma, sobra nga paggamit han nitrogen (N), ngan temprano nga paggamit han insecticide nakakabulig ha pagtubo han mga insekto.\n" +
                    "\n" +
                    "Kon paonan-o ito ginhihisgotan\n" +
                    "Kitaa kon may-ada mga insekto:\n" +
                    "\n" +
                    "Mga puti nga itom nga crescent-shaped nga bulan ha butnga han butnga nga gamot o taklap han dahon\n" +
                    "Mga puti o brown nga mga nimpa\n" +
                    "An adulto nga puti o bruneton nga bugsok nga nag-iirignom han puno han mga sanga\n" +
                    "Usisaha an mga pakli para ha:\n" +
                    "\n" +
                    "Hopperburn o pagbusag, pagkabrown ngan pagkadunot han tanom\n" +
                    "Mga tigaman han itlog nga nagigin paagi ha pag-infect hito han fungus ngan mikrobyo\n" +
                    "Honeydew ngan humay ha ubos han apektado nga bahin\n" +
                    "Mga tanom nga may mga dahon o mga sanga\n" +
                    "An hopperburn pariho han bugburn nga ginpapahinabo han itom nga irong. Basi masiguro nga an hopperburn nagtitikang ha kabayo, usisaha kon may-ada kunot ha ubos han tanom.\n" +
                    "\n" +
                    "Kon Kay Ano nga Importante Ini\n" +
                    "An kadaot nga iginpapahinabo han kabayo nagriresulta hin pag-anod han mga tanom. Ha hitaas nga populasyon, an hopperburn makikita. Ha sugad nga kahimtang, an pagkamatay han mga tanom mahimo umabot ha 100%.\n" +
                    "\n" +
                    "Ha uma, an mga tanom nga hirani ha pagkahamtong mahimo magkaada hopperburn kon 400-500 nga mga tamsi an nadadaot han brunette. Han 1970s ngan 1980s, an brown-horseshoe usa han mga peligro ha produksyon hin sapin ha Asya. An itom nga kabayo nagdadara liwat hin sakit nga leafy-cell virus.\n" +
                    "\n" +
                    "An itom nga kabayo mahimo magresulta hin duro nga pag-anod han mga tanom. Nahitatabo ini ha mga balay nga may-ada 400-500 nga mga nimpa o 200 nga adulto nga mga kabayo ha tagsa nga tanom. An mga pag-uswag han mga kabayo nga puti naobserbahan ha Pakistan han 1978, ha Malaysia han 1979, ngan ha India han 1982, 1984, ngan 1985.\n" +
                    "\n" +
                    "Kon Paonan-o Ini Magmamando\n" +
                    "An paggamit hin mga pestisidyo nag-aaghat hin pag-uswag han peste tungod kay ini nakamatay liwat han natural nga kaaway han brown bear. An mga itlog han brown rhino nag-aanak nga diri nakikita, ngan an buhi nga mga itlog nag-aanak hin madagmit tungod han kadamu han kadaot nga mahimo ito makahatag. Nagsasarang liwat ito kon gindadara han hangin an mga longwinged planthopper.\n" +
                    "\n" +
                    "Basi malikyan an masamwak nga paghibaro han peste:\n" +
                    "\n" +
                    "Kuhaa an mga banwa ha uma ngan ha palibot hito.\n" +
                    "Likayi an sayop nga paggamit hin insecticide tungod kay an natural nga kaaway han kabayo nakakaapekto ngan napupuo liwat.\n" +
                    "Kritikal nga Kadamu: An pag-uswag han mga kabayo mahimo pa la mapugngan kon an kadamu hini maabot la hin usa ka kabayo ha kada panon o mas gutiay pa.\n" +
                    "Pamiling hin brunette kada adlaw ha burabod, kada semana ha uma, ha mga tangbo, ngan ha tubig. Kitaa an tagsa nga ligid han tuburan. Para ha magurang nga mga dahon, dad-a an tanom, buksi ini hin gutiay, ngan pag-atras hin gutiay ha ilarom basi makita kon may-ada nahulog nga mga kabayo. Para ha mga nag-aani nga mga kahoy, kitaa an ubos nga bahin han 10-20 ka pungtod samtang nagbibiyahe ha uma nga may mga binhi. Diri kinahanglan pamilngon an brown and white horseshoe katapos han pag-anak han baka.\n" +
                    "Gamiton an mga lampara nga sugad hin bulb o gas lampara nga hirani ha puti nga bungbong o ha bawbaw han tubig ha gab-i kon masayon an pag-atake han mga kabayo. Ayaw ibutang an mga suga hirani ha burutangan o palanggana. Kon an mga lamparahan napuno hin brown halawig, usa ini nga tigaman nga pamilnga dayon an brown halawig; ngan pamilnga an iba pa nga halawig. Kon an parauma nagkikita liwat hito kada adlaw, diri na kinahanglan an suga.\n" +
                    "Ha pagpugong han kabayo nga may sakit ha tiyan:\n" +
                    "\n" +
                    "Mekanikal ngan pisikal nga pamaagi\n" +
                    "\n" +
                    "Pag-awas hin tubig ha usa ka adlaw, basi an mga tumoy la han mga bulong an makita. Makakabulig ini ha pagkontrol han brown nose.\n" +
                    "Gin-aawas han usa nga pukot an bulong basi kuhaon an iba nga mga brownish-horse pero diri an mga itlog, labi na adton aada ha uga nga bulong. Ha mga lugar nga may-ada daku nga populasyon han brown-nosed horse, an pagbulag ha mga kabayo diri makakatalwas hin igo nga kadamu han mga kabayo nga nag-uukoy ha ubos han mga tanom.\n" +
                    "Biological nga pamaagi\n" +
                    "\n" +
                    "Kon mas damu an natural nga kaaway kay han brown-horse, mahimo liwat nga mas gutiay an posibilidad han hopperburn. An insecticide sadang diri gihapon gamiton ha mga sanga nga nasamad na han hopperburn. An natural nga mga kaaway han brown-nosed horse amo an mga waterfowl, mirid bugs, uging, ngan iba pa nga parasitoids.\n" +
                    "Kimikal nga pamaagi\n" +
                    "\n" +
                    "Gamiton la an inseksikida ha tinikangan para ha brown-nosed-equine o white-nosed-equine kon an ngatanan hini nga mga kondisyon nakikita:\n" +
                    "\n" +
                    "Labaw hin usa ka gatos nga kabayo ha kada kahoy,\n" +
                    "Damu pa an mga kabayo nga may-ada kaguol kay han natural nga kaaway,\n" +
                    "An tubig ha burabod diri sadang pag-ugtangon.\n");

        }else if(pest.equals("Kuhol")){
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText("May-ada sobra 100 nga klase hin mga tangkob ha kalibotan.\n" +
                    "\n" +
                    "An duha hito nga klase, an Pomacea canaliculata ngan Pomacea maculata, nga mas kilala sugad nga Golden Apple Snails (GAS), nakakadaot gud ha mga tangkob. Nagtikadamo liwat hira.\n" +
                    "\n" +
                    "Tikang ini ha Salatan nga Amerika ngan gindara ngadto ha Asya han 1980s sugad nga potensyal nga pagkaon para han mga tawo. Kondi ha urhi, nahimo ito nga daku nga peste han itlog.\n" +
                    "\n" +
                    "Kon ano an ginbubuhat hito\n" +
                    "Ginkaon han mga lubo an kabataan ngan nag-aaghat ha ira nga mag-utod hin mga itlog. Ginpukan ngan ginkaon nira an mga sanga han kahoy nga palma nga nagriresulta hin pagkabungkag han bug-os nga tanom.\n" +
                    "\n" +
                    "Kon kay ano ngan diin ito nahinabo\n" +
                    "An kuko iginpapadara pinaagi han tubig ha mga kanal, irrigasyon, ngan mga baha.\n" +
                    "\n" +
                    "Ha panahon han kakulang hin tubig, an mga kabayo natago ha ilarom han tun-og nga lapok, ngan nakaturog (naghihirayo) hin unom ka bulan. An nag-aandam nga mga tangbo mabalik kon bumalik an tubig.\n" +
                    "\n" +
                    "Ginbubungkag nira an mga tanom nga nag-uukoy ha matambok nga uma. Ginpupuo liwat nira an mga tanom nga may edad nga 30 ka adlaw. Ha pag-abot han 30 tubtob 40 ka adlaw, nahubas na ito hin igo nga kahuptan basi malamposan an pag-atake han mga ulod.\n" +
                    "\n" +
                    "Kon paonan-o ito ginhihisgotan\n" +
                    "Usisaha an kolor ngan kadako han mga tangke basi mahibaroan an kaibahan han mga golden apple snail ngan han mga natibo nga snail.\n" +
                    "\n" +
                    "An mga golden apple snail may-ada murag-ugaw (muddy brown) nga panit. An unod hito may-ada kolor-rosas o kolor-yelo. Mas daku hira ngan mas kolorido kay han mga lumad nga mga ugat. An ira mga itlog masilaw nga rosas.\n" +
                    "\n" +
                    "Basi masiguro nga an sakit nagresulta hin sakit ha tanom, usisaha kon may-ada na ba nagtitikaluya o nawawara nga mga sanga, ngan ginputol an mga dahon ngan sanga.\n" +
                    "\n" +
                    "Kon Kay Ano nga Importante Ini\n" +
                    "An golden apple snail gintatagad nga usa han pinakadaku nga problema han mga palasio.\n" +
                    "\n" +
                    "Kon diri ito mapugngan, mahimo ito makadaot hin usa ka metro kwadrado han balay ha sulod la hin usa ka gab-i. Ini nga kadaot mahimo magresulta hin 50% nga pagkunhod han mga abot.\n" +
                    "\n" +
                    "Kon Paonan-o Ini Magmamando\n" +
                    "An husto nga panahon ha pakig-away ha mga ulod amo samtang gin-aandam pa an tuna, ngan samtang nagtitikadako pa an mga tanom. Nagpapabuto ini ha siyahan nga 10 ka adlaw katapos mag-ani, ngan ha siyahan nga 21 ka adlaw katapos mag-ani ha matambok nga tuna.\n" +
                    "\n" +
                    "Katapos hito, an mga tanom diri na madadaot han mga ulod. Hini nga takna, an alfalfa nabulig na ha tanom pinaagi ha pagkaon han mga tanom ha sulod han palanggana.\n" +
                    "\n" +
                    "Pag-abat han sakit ha komunidad\n" +
                    "\n" +
                    "An pinakaepektibo nga paagi ha paglikay han mga tawo nga may sakit ha dughan amo an pagkaurosa han mga tawo ha komunidad.\n" +
                    "\n" +
                    "Paghimo hin bug-os-komunidad nga kampanya ha pagtirok han mga ugat ngan han ira mga itlog samtang gin-aandam an tuna ngan samtang gintatanom.\n" +
                    "Kon posible, tipigi nga mamara an palanggana ha mga panahon nga delikado an mga tanom (diri sobra 30 ka adlaw) o pagbalhina tikang ha burabod an mga liso nga 25-30 ka adlaw na an edad.\n" +
                    "Gamita an natural nga mga kaaway han kulba.\n" +
                    "Natural nga paagi han pagpuo\n" +
                    "\n" +
                    "An mga redbird nakaon han mga itlog, samtang an mga duckling o usahay pati an mga raton nakaon han kabataan nga itlog. An pipira nga ihalas nga klase hin tamsi nangaon na liwat hin mga golden apple snail. An mga ducklings puydi liwat ibutang ha palda ha kada pag-andam han tuna o katapos han pagtubo han tanom kon an mga tanom daku na (sugad han 30-35 ka adlaw katapos han pag-ani).\n" +
                    "Mahimo liwat nga pag-anihon, lutoon, ngan kaonon o ibaligya sugad nga pagkaon para ha mga hayop. Kondi, importante nga mag-amping ngan magluto hin mas hilawig kay kilala ito nga nagdadara hin rat lungworm, usa nga klase hin parasito nga ulod.\n" +
                    "Tradisyonal nga pagdumot\n" +
                    "\n" +
                    "Tiroka an mga ulod ngan pagburoka an itlog. Mas epektibo ini ha aga ngan ha kulop kon aktibo an mga kukol. Ibutang an banwa nga tungkod ha butnga han itlog basi magin masayon an pagtirok han itlog.\n" +
                    "Mahimo liwat gamiton an mga attractants sugad han mga dahon han papaya ngan han mga dahon han kahoy nga mango basi masayon an pag-agaw han alga.\n" +
                    "Paggamit hin tubig\n" +
                    "\n" +
                    "Nakukurian an mga ugat ha mansanas ha pag-agi ha tubig nga mas gutiay kay hin 2 cm. Tipigi ito ha mga panahon nga an mga tanom mas madadaot.\n" +
                    "Paghimo hin gutiay nga mga kanal (mga 15-25 cm an kahiluag ngan 5 cm an kahilarom) katapos pag-andam han tuna. Ibutang an usa nga sako nga puno hin mabug-at nga mga butang ha kada tumoy han palanggana o kada 10-15 metros. An gutiay nga mga kanal nabulig ha pag-agos han tubig, ngan nag-aalagad sugad nga lugar han pag-uok han mga tangke. Nagigin masayon ini ha pagtirok o pagpatay han mga lulid.\n" +
                    "Paggamit hin makaharadlok nga tanom\n" +
                    "Ibutang an mga nabilin\n" +
                    "\n");

        }else if(pest.equals("Burit")){
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText(
                    "Kon ano an ginbubuhat hito\n" +
                            "An rice grassy stunt virus (GSV) nakakadaot han ani tungod kay nakakaulang ito ha pag-uswag han mga liso.\n" +
                            "\n" +
                            "Kon kay ano ngan diin ito nahinabo\n" +
                            "An bugas nakakaapekto ha padayon nga pag-ani.\n" +
                            "\n" +
                            "An GSV iginpapadara pinaagi han mga insekto sugad han mga nimpa ngan han mga kag-anak han mga kabayo nga kasagaran nga nagdadara hini nga virus. An mga kabayo kinahanglan kumaon hin natapnan nga tanom sulod hin 30 ka minuto o sobra pa antes ito makakarawat han virus.\n" +
                            "\n" +
                            "An mga tanom mahimo maapektohan ha bisan ano nga yugto han pagtubo. An panahon han pag-inom amo an pinakamaopay nga panahon ha pag-ani. An mga sintomas han GSV makikita 10-12 ka adlaw katapos han impeksyon. An apektado nga mga sanga ngan an nagtitikadako nga mga sanga amo liwat an mga burabod. Diri ito naipadara pinaagi han mga itlog han brown rhino.\n" +
                            "\n" +
                            "Kon paonan-o ito ginhihisgotan\n" +
                            "Basi hibaroan kon an tanom may-ada bulong, pamilnga ini nga mga sintomas:\n" +
                            "\n" +
                            "Daku nga pagkabungkag han tanom\n" +
                            "An Excessive Breastfeeding\n" +
                            "Pagtubo hin mga tanom nga sobra ka tuok o magtikadako\n" +
                            "Damu ngan rosas nga mga tanom\n" +
                            "May mga dahon nga mas gutiay ngan mas gutiay kay ha kasagaran\n" +
                            "Mga dahon nga nag-uulay bisan kon may-ada igo nga nitrogen (N)\n" +
                            "Damu nga gutiay nga kolor-bulawanon nga mga patis ha mga dahon, nga nagtitirok basi maghimo hin mas daku nga patis\n" +
                            "An mga dahon may-ada magkusog nga mga kolor\n" +
                            "An mga sugaranon diri nakakaopay\n" +
                            "An mga sintomas han tigdas mahimo liwat magin sayop nga mga sintomas han rice yellow dwarf ngan rice dwarf disease. Basi masiguro kon may sakit an tanom, usisaha kon rosas an porma han tanom ngan kon may-ada mga kolor-yelo nga mga pulbos ha mga dahon.\n" +
                            "\n" +
                            "Kon Kay Ano nga Importante Ini\n" +
                            "Kasagaran, an kadaot nga resulta han pag-atake diri gud madudugangan. Ini nga sakit nagigin seryoso nga problema ha mga bugsok la nga may-ada tigda nga pagsakot han brown planthopper.\n" +
                            "\n" +
                            "Kon Paonan-o Ini Magmamando\n" +
                            "Basi makontrol an peste, kinahanglan pugngan an brown planthopper nga nagsasarang hito.\n" +
                            "\n" +
                            "Mahimo gamiton an insecticide, magtanom hin mga varieties nga resistente ha brittle-horseback, o magtanom hin duha nga tanom. Kinahanglan pag-aradoan an mga natapnan katapos han pag-ani basi makunhuran an virus.\n");


        }else if(pest.equals("Yatot")){
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText("\n" +
                    "Syentipiko nga ngaran\n" +
                    "Rattus argentiventer (Robinson and Kloss, R. exulans Peale, R. rattus spp., R. tanezumi)\n" +
                    "Kon ano an ginbubuhat hito\n" +
                    "An mga mag-arani nag-aani o nag-aawas han mga tanom. Gin-aaghat liwat nira an mga batan-on. Durante han panahon han paghinog, an mga rato nangangaon hin mga bugsok ngan mga lugas nga hirani hin pagkahinog.\n" +
                    "\n" +
                    "Kon kay ano ngan diin ito nahinabo\n" +
                    "An mga igot makikita ha mga tubig ha salog. An hura ngan uran nga panahon maopay para ha pagpadamu ngan pag-atake han mga rato. Ha mga mag-asawa, an mga raton an pinakamasakit kada panahon han uran. An pagkaada pagkaon, tubig, ngan urukyan nagpapagios ha ira nga mag-uswag hin mas madali ngan mas madagmit. An mga banwa nabulig liwat ha ira ha pag-uswag tungod kay may-ada hira natagoan.\n" +
                    "\n" +
                    "An mga rato nag-aani kada gab-i. Hira aktibo ha kada adlaw nga nagtitikadlaw ngan nagtitikadlaw. Kada aga, makikita hira ha mga tanom, banwa, ngan ha mga sanga han mga kahoy. Kon waray uma, an mga kanal ngan tanaman amo an ira nangunguna nga urukyan. Nagtitago an mga rato samtang nag-aagom hira. Katapos nira mag-inom, nauli hira ha ira balay.\n" +
                    "\n" +
                    "Kon paonan-o ito ginhihisgotan\n" +
                    "An pag-ani hin mga parasito ha uma mahimo magresulta hin masunod nga kadaot:\n" +
                    "\n" +
                    "Nawara nga mga liso\n" +
                    "Nawara nga mga tinago\n" +
                    "Ginpukan an mga sanga\n" +
                    "Ginkunhod an mga tanom\n" +
                    "An abnormal pruning\n" +
                    "Matambok nga mga tanom o hinog nga mga liso\n" +
                    "Mga sanga nga may-ada 45° nga pagputol\n" +
                    "Pag-ani utro han mga puno han tanom\n" +
                    "An paghinog han mga liso\n" +
                    "Nawara nga mga liso\n" +
                    "Nawara nga mga kahoy\n" +
                    "An kadaot nga resulta han pagkaon han mga rato ha mga sanga han mga tanom mahimo magin sayop nga epekto han mga insekto. Kondi, an kadaot makikita ha mga uma tungod han pag-ukay han mga tanom hin 45°.\n" +
                    "\n" +
                    "An pagbungkag han mga liso mahimo liwat magin sayop nga pagbungkag han mga tamsi.\n" +
                    "\n" +
                    "Usisaha an mga lugar nga puno hin mga dalan, aktibo nga mga kanal, ngan mga tunob han mga tiil han mga parauma. Agsob nga hirani hira ha ira mga lugar han pag-antos.\n" +
                    "Usisaha kon may-ada mga igos, mga putok, ngan aktibo nga mga luong ha mga ngipon nga naglilibot ha balay.\n" +
                    "Kon posible, pangitaa an mga kahoy ha uma basi hibaroan kon ano nga klase ito. Pagbutang hin bitik ha ira agianan, ó pagukab hin mga tangbo tikang ha mga luong.\n" +
                    "Kon Kay Ano nga Importante Ini\n" +
                    "An Rattus argentiventer amo an nangunguna nga peste ha mga uma ha damu nga lugar ha Southeast Asia. Kasagaran nga 10-20% an pagkunhod han ani han mga pallet tungod hini nga peste. Kasagaran nga mas hiruhitaas an pag-ani ha ikaduha nga pagtanom ha mga kahoy nga gintanom hin duha ka beses ha usa ka tuig (double cropping).\n" +
                    "\n" +
                    "Ha mga uma nga hirani ha mga lungib sugad han mga kanal o hilarom nga kagurangan, may-ada iginreport nga duro nga pagkawala han mga abot nga maabot ha 30-50%. Mas duro liwat an nadadaot ha mga lugar nga may tulo ka pag-ani kada tuig (triple cropping) tungod han daku nga kadamu han mga tuna nga gintanom.\n" +
                    "\n" +
                    "Ha Malaysia, an parasito nga rat (Rattus argentiventer) nagriresulta hin 6-11 porsyento nga kakulangan hini. Ha Indonesia, ginbabanabana nga 17% han uma nga gintanom an gin-uangan han mga rato kada tuig.\n" +
                    "\n" +
                    "Kon Paonan-o Ini Magmamando\n" +
                    "Epektibo nga pagpuo ha panon:\n" +
                    "\n" +
                    "Pag-abre, pag-ukab, ngan pag-abre hin mga lungib ha mga uma\n" +
                    "Pag-andam ngan pagpaiwas han mga bitin ha hitaas nga banwa o ha mga hirani nga lugar (pinaagi hin pukot, ayam, mga palot, ngan iba pa nga paagi ha pagdakop hin mga bitin)\n" +
                    "An mga ayam kinahanglan mamiling han aktibo nga mga luong han mga uma, ngan katapos gamiton an siyahan nga pitad\n" +
                    "Pamilnga an mga uma ha gab-i pinaagi han mga lente o flashlight, mga palot, arrow, ngan mga pana\n" +
                    "Pagbutang hin bitik ha dalan han mga uma\n" +
                    "Gamiton an nakarehistrong nga mga bitin nga aada ha mga bitik nga may mga lidong (pero siguraduhin nga diri ito maabot han kabataan ngan mga hayop basi malikyan an pagkahilo).\n" +
                    "Mga paagi ha paglikay ha pagpadamu han mga rato:\n" +
                    "\n" +
                    "An mga tangbo ha tanom kinahanglan diri sobra 30 cm an kahalapad basi an mga tanom diri maghimo hin kanal.\n" +
                    "Pagtipig nga limpyo ngan waray hitaas nga banwa ha palibot han uma, uma, ngan iba pa nga hirani nga lugar basi diri makakatago an mga uma\n" +
                    "Pagtanom upod han igkasi uma o siguraduhin nga magtanom hin 15 ka adlaw antes o katapos han pagtanom han igkasi uma\n" +
                    "Ibutang ngan gamita an husto nga Trap Barrier System (TBS) ha panahon han pagtanom hin alkitran kon grabe an kadaot han mga tanom.\n" +
                    "Pagtipig nga limpyo (waray mga tambak, basura, o mga lugar nga may-ada hugaw) an palibot han balay, balay, ngan barangay.\n" +
                    "Tipigi nga limpyo an sulod ngan palibot han bodega.\n");

        }else if(pest.equals("Atangya")){
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText(
                    "Pag-ataman\n" +
                            "An Leptocorisa oratorius F. ngan an Leptocorisa acuta (Thunberg) amo an mga klase nga bug nga kasagaran nga nahitatabo.\n" +
                            "\n" +
                            "Kon ano an ginbubuhat hito\n" +
                            "Nagigin makamaratay ito pinaagi ha pag-inom hin masustansia tikang ha bulak tubtob ha pagputos han mga liso. Tungod hini, gutiay o waray gud lugas an mga liso, ngan nagkalainlain an kolor. An mga bata ngan an mga adulto nga mga parasito nagpipinangaon han mga liso han pipino.\n" +
                            "Kon kay ano ngan diin ito nahinabo\n" +
                            "Damu nga butang an mahimo magresulta hin hitaas nga kadamu han mga panhunahuna. An pipira hini amo an:\n" +
                            "\n" +
                            "Harani nga kagurangan\n" +
                            "Daku nga bungbong hirani ha balay\n" +
                            "Mga banwa ha ligid han mga kanal\n" +
                            "Pagtanom hin mga kahoy nga may mga sanga\n" +
                            "Nagigin aktibo an mga katamsihan kada panahon han uran. An mapaso nga panahon, masirom nga kalangitan, ngan agsob nga pag-ugtang nag-aaghat han ira pag-uswag.\n" +
                            "\n" +
                            "Nagtitikadamo an mga katamsihan katapos han panahon han uran.\n" +
                            "\n" +
                            "An mga tangke makikita ha ngatanan nga klase hin mga tangke. Agsob ini makita ha mga salog ngan mga salog. An insekto nagigin mas makamaratay samtang nagbuburong an bulak tubtob nga nagtitikadako ito.\n" +
                            "\n" +
                            "An mga adulto nga katamsihan aktibo ha gab-i ngan ha aga. Kon duro an kapawa han adlaw, nagtatago hira ha mga lugar nga hubag. Ha luyo nga bahin, diri hira aktibo ha panahon han kathagkot. An mga hamtong nga nag-uukoy ha mas malamrag nga lugar nag-aantos hin mas hinay-hinay nga pagtubo ha kabanwaan. Nag-uuma hira hin usa o duha ka henerasyon antes ito mag-uswag ngadto ha hinog nga uma. An mga nimpa makikita nga nagkakaurosa ngan nagkolor han mga dahon han palma. Didto, an mga hingyap agsob nga ginbabalewaray. Ha mga panahon han kakurian, an mga nimpa nahamutang ha ubos han tanom samtang an mga adulto nahamutang ha sugbong nga mga lugar.\n" +
                            "\n" +
                            "Kon paonan-o ito ginhihisgotan\n" +
                            "Usisaha an mga tanom para han kadaot nga resulta han pagkaon, sugad han:\n" +
                            "\n" +
                            "Gutiay nga mga liso\n" +
                            "Mga bala nga may-ada mga butok o mga bungot\n" +
                            "Waray sulod an mga liso\n" +
                            "Hito nga mga kahoy\n" +
                            "An mga sintomas mahimo magin sayop nga epekto han kakulang hin sustansya o han mga bulak. Basi matipigan an daku nga kadaot han antilope, pamilnga an insekto:\n" +
                            "\n" +
                            "Hilarom, makusog ngan pula-pula nga itom nga mga itlog ha butnga han mga gamot han dahon.\n" +
                            "An mga brown-green nga mga nympha ngan mga adulto nga nag-aani hin endosperma han liso nga ginkikinahanglan ha pag-ani han tanom.\n" +
                            "An awful smell.\n" +
                            "Kon Kay Ano nga Importante Ini\n" +
                            "An mga adulto nga katamnan ngan an mga nimpa nag-aani hin mga liso ha panahon han pag-uuma. Mahimo hira magin makuri nga peste han alkitran nga usahay nagriresulta hin pagkunhod han mga abot hin mga 30%.\n" +
                            "\n" +
                            "Kon Paonan-o Ini Magmamando\n" +
                            "Kuhaa an mga banwa ha uma ngan ha mga lugar nga hirani hito basi malikyan an pag-uswag han mga bitin. Buhata ini samtang waray nagtanom ha salog.\n" +
                            "Ibutang an tanom ngan ighatag an pariho nga kantidad han abono ngan tubig, basi masiguro nga mag-uuswag an mga tanom.\n" +
                            "An mga tamsi mahimo pagdakpon gamit an mga tamsi kada aga o bisan diin. Maopay ini ha mga lugar nga gutiay pa an mga ideya kondi posible ito.\n" +
                            "An natural nga mga kaaway o biological controls han katamsihan, sugad han mga katamsihan, katamsihan, ngan katamsihan, nabulig ha pag-atake ha katamsihan ngan ha ira mga itlog. An sayop nga paggamit han insecticide nakakadaot kay nakakamatay liwat ito han natural nga kaaway han mga langaw. Nagriresulta ini hin pag-uswag han mga peste.\n" +
                            "Para ha pagkontrol pinaagi hin kemikal:\n" +
                            "\n" +
                            "Antes gamiton an pesticida, kumonsulta anay ha usa nga espesyalista para hin sagdon, giya, ngan pahimangno mahitungod han kahimtang han imo mga tanom.\n" +
                            "\n" +
                            "Pag-obserbahan an kahoy kada adlaw antes pa ito magbunga tubtob nga hirani na ito magtubo. Ha sulod han uma, an mga katamsihan puydi maiihap kada aga o ha mga 20 ka pungtod samtang nagbabaktas. An mga kag-anak han duha nga bata agsob na lumupad antes ka makaabot ha ira salit an mga anak han duha nga bata an bangin makukuha. An direkta nga pagkontrol kinahanglan buhaton kon may-ada na 10 nga pag-abat ha kada 20 ka beses.\n" +
                            "An pagpili han insecticide iginbasar ha posible nga instrumento, presyo han insecticide, eksperyensya han nagamit, o presensya han isda. An mga peligro ha kahimsog ngan ha palibot sadang tagdon.\n" +
                            "\n" +
                            "\n" +
                            "\n");


        }else if(pest.equals("Ulalo sa ugat")){
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText(
                    "\n" +
                            "Syentipiko nga ngaran\n" +
                            "Leucopholis irrorata (Chevrolat)\n" +
                            "Kon ano an ginbubuhat hito\n" +
                            "An mga udyong o root grub nakakakaon han mga gamot nga mahimo magresulta ha diri normal nga kahitaas han tanom, pagkadiri-kolor han tanom, ngan pagkabulok.\n" +
                            "\n" +
                            "Kon kay ano ngan diin ito nahinabo\n" +
                            "An ugat nagpipili hin mga tanom nga may-ada urusahon nga mga gamot.\n" +
                            "\n" +
                            "Mabibilngan ini ha mga balay ngan mga balay nga may mga trabahador. An mga adulto nga mga langaw aktibo ha gab-i ngan nadadani ha mga lit-ag. Samtang an mga itlog hito nag-aanak ngan nagtitikadako ha matambok nga tuna ngan ha luong nga ginhimo han babaye nga duron.\n" +
                            "\n" +
                            "An ulod nakakakaon han tanom samtang nagtitikadako pa ito. An pag-antos hini nga peste daku an iya mahimo ha kada pag-ani.\n" +
                            "\n" +
                            "Kon paonan-o ito ginhihisgotan\n" +
                            "Usisaha kon may-ada ba mga tanom nga may-ada mga sanga ngan mga sakit. Sugad man, kitaa kon may-ada nawara nga ugat. An dahon mahimo liwat nga orange-yelo.\n" +
                            "\n" +
                            "An iba pa nga peste sugad han bugas ngan mga aphids mahimo makaapekto ha mga tanom. An orange yellow liwat usa nga sintomas han kakulang hin sustansya.\n" +
                            "\n" +
                            "Basi masiguro nga an sakit diri tungod han katamsihan, kitaa kon may-ada mga insekto:\n" +
                            "\n" +
                            "Milky-colored nga itlog\n" +
                            "An adult worm eats leaves\n" +
                            "An alligator\n" +
                            "Kon Kay Ano nga Importante Ini\n" +
                            "An mga whitefly diri gud nakakadaot ha mga udyong ngan agsob makita la ha bungkag. An mga adulto nga mga ulod nakaon han mga dahon, samtang an mga ulod nakaon han mga gamot.\n" +
                            "\n" +
                            "Kon Paonan-o Ini Magmamando\n" +
                            "An mga populasyun han duron ginpupuo han mga kaaway hito ngan han iba pa nga natural nga mga paagi. An pipira han natural nga kaaway han langaw amo an mga carabid beetles, mga tamsi, mga katamsihan, mga katamsihan, mga tigkahoy nga nangangaon hin mga langaw ngan mga adulto nga langaw, mga scoliid wasps nga parasito han langaw, ngan mga langaw nga nangangaon hin mga ulod.\n" +
                            "\n");

        }else if(pest.equals("Tayangaw")){
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText("Kasagaran nga ngaran\n" +
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

        }else if(pest.equals("Bukbok")){
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText(
                    "Bakit at saan ito nangyayari\n" +
                            "Ang mga weevil ay naaakit sa mainit at mamasa masang kapaligiran. Sila ay lumalabas sa huling bahagi ng tagsibol at naghahanap ng kanlungan sa mainit, tuyong buwan ng Hunyo at Hulyo, naghahanap ng mga lugar upang magparami at mangitlog. Kung pumasok sila sa inyong tahanan, naaakit sila sa mga butil at iba pang pagkain at infest ang mga ito. Kung makakakuha ka ng pagkain na puno ng weevil, ang pag init nito sa temperatura ng kuwarto ay maaaring magsulong ng mabilis na paglago ng weevils, na nagiging sanhi ng infestation.\n" +
                            "\n" +
                            " Paano tukuyin ang\n" +
                            " -Ang mga weevil ay maliliit na beetle na may kapansin pansin na mga ilong.\n" +
                            " -Ang mga ito ay kadalasang bombilya- o peras-hugis.\n" +
                            " -Ang mga immature, legless, grub-like larvae feed sa mga halaman.\n" +
                            " -Ang mga weevil ng matatanda ay naghahanap ng kanlungan sa hindi magandang kondisyon ng panahon,lalo na kapag mainit at tuyo.\n" +
                            "-Ang mga weevil ay pumapasok sa mga gusali sa pamamagitan ng pag-crawl sa mga bitak o butas sa paligid ng mga pundasyon, pinto at bintana.\n" +
                            " -Ang mga ito ay isang pansamantalang kaguluhan.\n" +
                            " \n" +
                            "Paano pangasiwaan ang\n" +
                            " -Limang itim na beetles na may pahaba snouts, dalawang antennae at anim na binti bawat isa.\n" +
                            " -Strawberry ugat weevils\n" +
                            " -Ang pagpipigil sa mga weevil ay ang pinakamainam na paraan ng pagkontrol.\n" +
                            " -Caulk bitak at matiyak snug-fitting screen at pinto upang mabawasan ang bilang ng mga weevils na maaaring pumasok sa isang gusali.\n" +
                            " -Ang mga weevil, lalo na ang strawberry root weevils, ay naaakit sa kahalumigmigan. Maaari mong bitag ang mga ito sa mababaw na kawali ng tubig na inilagay sa paligid ng mga pundasyon o pader ng bahay.\n" +
                            "-Ang mga kawaling ito ay hindi nakakakuha ng sapat na mga weevil para mabawasan ang bilang ng mga weevil na pumapasok sa mga tahanan.                \n" +
                            "\t\t\t          Matuto nang higit pa\n" +
                            "Tingnan ang buong fact sheet:\n" +
                            "Tubig weevil sa IRRI Rice Knowledge Bank\n" +
                            "Ano ang ginagawa nito\n" +
                            "Ang weevil ay isang uri ng beetle mula sa Curculionoidea superfamily123. Karaniwang maliliit ang mga ito, mas mababa sa 6 milimetro ang haba, at herbivorous12. Ang mga weevil ay kilala sa kanilang pahaba na ilong at kadalasang tinatawag na snout beetle123. Ang mga ito ay may iba't ibang kulay at may libu libong uri ng weevil34. Ang mga immature larvae ay kumakain sa mga halaman, habang ang mga adult weevil ay naghahanap ng kanlungan sa hindi kanais nais na kondisyon ng panahon5.\n");

        }else if(pest.equals("Puting nguso")) {
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText("Busag nga planthopper\n" +
                    "Kay ano ngan diin ito nahitatabo\n" +
                    " Kasagaran nga nakikita an puti nga mga bukad tungod han puti, malaw-ay nga mga sekreto han mga ninfa, nga bug-os nga nakakapalimbong han insekto. Ini nga baga nga materyal ginbabayaan ha mga dahon ngan mga sanga kon an adulto naabot o kon nabaraka an nymph ngan nalukso. An mga adulto mapula sugad hin niebe. An mag-awas nga sekreto han mga nymph pariho han mga mealybugs, wooly aphids, ngan iba pa nga bug-os nga mga itlog. Kondi, kon ginbabaraka an snow planthopper nymph, agsob ito magsalop hin pipira ka sentimetro samtang an mga mealybugs, aphids, ngan soft scales diri nagbubuhat hin bisan ano ngan hinay-hinay la nga nag-aagma kon ginbabaraka ito.\n" +
                    "\n" +
                    "Kon Paonan-o Makikilala\n" +
                    " Pamilnga an puti nga planthopper nga may-ada mabinaghag nga puti nga linya ha butnga han triangular nga taming nga nakakatabon hin bahin han ulo ngan dughan. Pamilnga an mga tanom nga may-ada mga agup-op ha base han tanom, ngan iba pa nga nag-uuga, nag-uuhaw, ngan nagkalumpag tungod han hopperburn.\n" +
                    "\n" +
                    "Kon Paonan-o Magmamaneho\n" +
                    "KINADADADANON NGA mga Kaaway\n" +
                    "An white-backed planthopper kasagaran nga ginkukontrol han mirid bug, Cyrtorhinus lividipennis (kitaa an Fact Sheet no. 419). Kondi, mahimo mawara an timbang kon ginagamit an mga insecticide nga damu an epekto basi mapugngan an planthopper o iba pa nga peste.\n" +
                    "\n" +
                    "\n" +
                    "KULTURAL CONTROL Antes magtanom: \n" +
                    "Pangitaa nga magtanom ka hin mga hardin nga hiraniay ha usa kag usa ha sulod hin tulo ka semana, basi malikyan an pagtapok han mga tanom ngan an pagbalhin han mga planthopper ha kada uma. Durante han pagtubo: Usisaha nga may lamparahan ha bawbaw han pan nga tubig, hirayo ha nursery ngan ha gawas han uma. Ibutang an nitroheno ha binagbinagon nga dosis, nga magbantay nga diri malabwan an lokal nga mga rekomendasyon. \n" +
                    "Pagtanom hin duha la nga tanom ha usa ka tuig, ngan gamita an mga varieties nga temprano na nga nag-aani. I-drain an mga uma hin tulo o upat ka adlaw kon may-ada duro nga peste. Katapos han pag-ani: Ayaw pag-arado han tanom, karuyag sidngon, ayaw itugot nga tumubo utro ngan magpadayon hin pagtubo katapos han pag-ani. Pag-arado han uma katapos han pag-ani, ngan kuhaon an mga tunok nga bangin makakatugot ha mga planthopper nga magpadayon ha pag-anak. RESISTENTE NGA KARABANGAN May-ada mga klase nga may-ada resistensya, ngan bahin ito han programa han IPM para hini nga planthopper nga nag-uupod hin mga paagi ha pagkontrol han kultura ngan maopay nga paggamit hin insecticide basi matipigan an natural nga mga kaaway, labi na an bug nga Cyrtorhinus lividipennis.\n" +
                    "CHEMICAL KONTROL\n" +
                    "Ginrirekomenda han IRRI nga gamiton la an mga pestisidyo ha nursery (seedbed) kon: i) sobra usa nga planthopper ha kada sanga, o ii) sobra pa nga planthopper kay han natural nga kaaway.\n" +
                    "\n" +
                    "Kon nagamit hin insecticide, likayi an sunod-sunod nga paggamit han pariho nga produkto. Kon may-ada iba nga mga insekto, ayaw paggamit hin mga produkto nga may-ada damu nga klase han insekto, labi na ha tinikangan han panahon. Pangalimbasugi nga gamiton an mga espisipiko para ha peste nga imo ginpipinamiling. Tagda an epekto han mga insecticide ha mga parasitoid ngan mga manunukob, labi na ha tinikangan. Usa nga komon nga problema an pag-uli han mga insekto katapos han paggamit hin mga insecticide nga may-ada daku nga epekto kay ginpupuo nira an natural nga mga kaaway.\n" +
                    "\n" +
                    "Kon nagamit hin pestisidyo, pirme magsul-ot hin panalipod nga bado ngan sundon an mga instruksyon ha label han produkto, sugad han dosis, panahon han paggamit, ngan interbyo antes han pag-ani.\n");

        }else{

        }

        camera1 = findViewById(R.id.camera);
        camera1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity5.this,Camera.class);
                startActivity(intent1);

            }});

        pest1= findViewById(R.id.home);
        pest1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this,HomeMainActivity4.class);
                startActivity(intent);
            }});
        Toolbar mtoolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);


    }@Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item_file2, menu);


        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item1) {


        int id = item1.getItemId();

        if (id == R.id.E) {
            TextView tView2 = findViewById(R.id.textview1);
            TextView tView3 = findViewById(R.id.textview2);
            ImageView imag4 = findViewById(R.id.view23);

            Intent intent = getIntent();
            tView2.setText(intent.getStringExtra("select"));
            tView3.setText(intent.getStringExtra("select"));
            imag4.setImageResource(intent.getIntExtra("image", 0));
            String pest = tView.getText().toString();

            if (pest.equals("Langgam")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText(
                        "Why and where it occurs\n" +
                                "Ants mainly occur in the upland fields where they nest below the soil surface. In rainfed wetland fields, they are confined to rice levees or bunds.\n" +
                                "\n" +
                                "Ants damage the field in patches. They usually feed on plant during seedling stage.\n" +
                                "\n" +
                                "How to identify\n" +
                                "Check for missing plants and loss of plant stand. \n" +
                                "\n" +
                                "These damages are also similar to feeding symptoms of mole cricket. To distinguish, check for the presence of the insect.\n" +
                                "\n" +
                                "Ants are often found in damaged area. Seeds may be found in their underground nests.\n" +
                                "\n" +
                                "Scientific name\n" +
                                "Solenopsis geminata (Fabricius)\n" +
                                "How to manage\n" +
                                "To reduce impact of ant damage, increase seeding rate.\n" +
                                "\n" +
                                "Ants are hosts to nematodes, fungi, phorid flies, strepsipterans, and eucharitine wasps. They are also prey to birds, snakes, bull frog, and ground lizards.\n" +
                                "\n" +
                                "Learn more\n" +
                                "View full fact sheet:\n" +
                                "Ants on IRRI Rice Knowledge Bank\n" +
                                "\n" +
                                "What it does\n" +
                                "Ants feed on rice seeds and seedlings.\n" +
                                "\n" +
                                "Their feeding damage cause rice seeds or plants to be missing. It also affects plant stand, and increases the incidence of diseases vectored by other insects such as planthoppers, leafhoppers, mealybugs, and aphids.\n");

            } else if (pest.equals("Harabas")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText("Why and where it occurs\n" +
                        "Armyworms live longer in areas with low temperature (15 °C maximum).\n" +
                        "\n" +
                        "Periods of drought followed by heavy rains, and presence of many alternate hosts also sustain the development of the insect pest.\n" +
                        "\n" +
                        "How to identify\n" +
                        "Check for feeding damage on leaf tips or along leaf margins. Armyworms can feed on whole leaves, leaving only the midribs.\n" +
                        "\n" +
                        "Check for cuts on stem or at plant base. The insect can also cut off panicles from base.\n" +
                        "\n" +
                        "Armyworm damage can be mistaken for cutworm feeding. To confirm, check for the presence of the insect. The characteristic form of armyworm damage is leaf removal.\n" +
                        "\n" +
                        "Scientific name\n" +
                        "At least three species of armyworms attack rice in Asia: the rice swarming caterpillar, Spodoptera mauritia (Boisduval); the common cutworm, Spodoptera litura (F.); and the rice ear-cutting caterpillar, Mythimna separata (Walker).\n" +
                        "\n" +
                        "How to manage\n" +
                        "To prevent:\n" +
                        "\n" +
                        "Establish seedbeds far from large areas of weeds.\n" +
                        "Plow fallow land .\n" +
                        "Remove weeds outside and inside of the field.\n" +
                        "To control:\n" +
                        "\n" +
                        "Flood seedbeds. This is the best defense against armyworms.\n" +
                        "Place ashes in the trenches to make it more difficult for the caterpillars to escape.\n" +
                        "Place branches around fields to give armyworms a place to congregate where they are easily collected by hand.\n" +
                        "Avoid killing natural enemies (e.g., wasps and spiders) of armyworms. Insecticides should be the last resort for armyworm control.\n" +
                        "Learn more\n" +
                        "View full fact sheet:\n" +
                        "Armyworm on IRRI Rice Knowledge Bank\n" +
                        "\n" +
                        "What it does\n" +
                        "Armyworms feed on rice leaves and can also cut off young seedlings at the plant or panicle base. They feed in the upper portion of the rice canopy on cloudy days or at night.\n");


            } else if (pest.equals("Ibon")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText(
                        "Why and where it occurs\n" +
                                "Birds become a problem from ripening phase—when the rice plant is already developing and filling in grains—until harvest.\n" +
                                "\n" +
                                "Some species will feed off of the panicles by either landing upon them, by perching on nearby objects (such as fences or posts) or by eating the dropped grain on the ground when fields are harvested. Bird pest species are most abundant during this time.\n" +
                                "\n" +
                                "How to identify\n" +
                                "Check for presence of milky substance on chewed grains, and for whiteheads with removed grains. Whiteheads can also be caused by stemborer. To confirm the cause of damage:\n" +
                                "\n" +
                                "in bird’s damage, not all grains are chaffy\n" +
                                "in stemborer's damage, all grains in a panicle are chaffy and the panicle can be pulled out easily\n" +
                                "Out of more than 70 species of birds found in the rice fields, only five species in the Philippines (and about 14 in Southeast Asia) are known to feed on rice. Some rice-eating birds include:\n" +
                                "\n" +
                                "How to manage\n" +
                                "Some management options that can be adopted include: \n" +
                                "\n" +
                                "Hire \"bird boys\" to shoo away birds in your farm.\n" +
                                "Set up nets over your field.\n" +
                                "Set up bird-tapes over the rice plants when at ripening phase.\n" +
                                "Use noisemakers to produce random sounds and recordings that can scare the birds.\n" +
                                "Use chemical repellents.\n" +
                                "Use decoy birds to attract or repel the birds in your farm.\n" +
                                "Use flags, scare crows, or bird kites.\n" +
                                "Eco-engineering or leave bigger birds to hunt naturally without persecution.\n" +
                                "Learn more\n" +
                                "View full fact sheet:\n" +
                                "Birds on IRRI Rice Knowledge Bank\n" +
                                "\n" +
                                "What it does\n" +
                                "Rice-eating birds chew rice grains, and can cause whitehead or unfilled panicles.\n" +
                                "\n" +
                                "They either squeeze the grains during the milky phase, or eat the entire grain once mature. The damage shows a milky white substance covering the grains.\n\n");

            } else if (pest.equals("Itim na atangya")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText(
                        "Why and where it occurs\n" +
                                "The insect is common in rainfed and irrigated wetland environments. It prefers continuously cropped irrigated rice areas and poorly drained fields. Damages are observed more frequently in dry season rice crops and densely planted fields.\n" +
                                "\n" +
                                "Black bug flight patterns are affected by the lunar cycle; on full moon nights, large numbers of adults swarm to light sources.\n" +
                                "\n" +
                                "Staggered planting of the rice crop and excessive nitrogen also favor the buildup of the pest. During non-rice periods, the presence of alternate breeding site favors population increase.\n" +
                                "\n" +
                                "Black bugs usually infest during the vegetative stages of the rice crop.\n" +
                                "\n" +
                                "How to identify\n" +
                                "Check leaves for discoloration. Black bug damage can cause reddish brown or yellowing of plants. Leaves also have chlorotic lesions.\n" +
                                "\n" +
                                "Check for decreased tillering. Bugburn symptoms show wilting of tillers with no visible honeydew deposits or sooty molds.\n" +
                                "\n" +
                                "Plants are also stunted; and can develop stunted panicles, no panicles, incompletely exerted panicles, and unfilled spikelets or whiteheads at booting stage.\n" +
                                "\n" +
                                "Check for deadhearts.\n" +
                                "\n" +
                                "Deadhearts can also be caused by stemborer. To confirm cause of damage, pull infected plants. In black bug damage, infected plants cannot be pulled at the bases.\n" +
                                "\n" +
                                "Scientific name\n" +
                                "Three species of black bugs attack rice: common black bug (Scotinophara coarctata), Malayan black bug (S. lurida) and, Japanese rice black bug (S. latiuscula).\n" +
                                "\n" +
                                "How to manage\n" +
                                "To prevent:\n" +
                                "\n" +
                                "Use resistant varieties.\n" +
                                "Maintain a clean field by removing the weeds and drying the rice field during plowing.\n" +
                                "Plant rice varieties of the same maturity date to break the insect’s cycle.\n" +
                                "Use of mercury bulbs as light traps for egg-laying adults, light trapping of insects should start 5 days before and after the full moon.\n" +
                                "Encourage biological control agents.\n" +
                                "To control:\n" +
                                "\n" +
                                "During early infestation, the water level in the field may be raised for 2-3 days to force the insects to move upwards.\n" +
                                "Flood the fields. This can cause higher egg mortality.\n" +
                                "After harvest, plow fields to remove remaining insects.\n" +
                                "Learn more\n" +
                                "View full fact sheet:\n" +
                                "Black bugs on IRRI Rice Knowledge Bank\n" +
                                "\n" +
                                "What it does\n" +
                                "Black bugs remove the sap of the plant. They can cause browning of leaves, deadheart, and bugburn. Their damage also causes stunting in plants, reduced tiller number, and formation of whiteheads.\n" +
                                "\n" +
                                "On severe cases, black bug weakens the plant preventing them from producing seeds.\n");

            } else if (pest.equals("Ngusong Kabayo")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText("Why and where it occurs\n" +
                        "Planthoppers can be a problem in rainfed and irrigated wetland environments, and in areas with continuous submerged conditions in the field, high shade and humidity.\n" +
                        "\n" +
                        "Closed canopy of the rice plants, densely seeded crops, excessive use of nitrogen, and early season insecticide spraying also favors isect development.\n" +
                        "\n" +
                        "How to identify\n" +
                        "Check for the presence of insect:\n" +
                        "\n" +
                        "crescent-shaped white eggs inserted into the midrib or leaf sheath\n" +
                        "white to brown nymphs\n" +
                        "brown or white adults feeding near the base of tillers\n" +
                        "Check the field for:\n" +
                        "\n" +
                        "Hopperburn or yellowing, browning and drying of plant\n" +
                        "Ovipositional marks exposing the plant to fungal and bacterial infections\n" +
                        "Presence of honeydew and sooty molds in the bases of areas infected\n" +
                        "Plants with ragged stunt or grassy stunt virus disease\n" +
                        "Hopperburn is similar to the feeding damage or \"bugburn\" caused by the rice black bug. To confirm hopperburn caused by planthoppers, check for the presence of sooty molds at the base of the plant.\n" +
                        "\n" +
                        "Scientific name\n" +
                        "Two species of planthopper infest rice. These are the brown planthopper (BPH), Nilaparvata lugens (Stal); and the whitebacked planthopper (WBH),  Sogatella furcifera (Horvath).\n" +
                        "\n" +
                        "Common name\n" +
                        "Brown planthopper, Whitebacked planthopper\n" +
                        "\n" +
                        "How to manage\n" +
                        "Outbreaks result when pesticides destroy natural enemies (BPH eggs hatch unchecked, and surviving BPH quickly build-up populations to damaging levels), or when longwinged planthoppers are carried in by the wind.\n" +
                        "\n" +
                        "To prevent outbreaks:\n" +
                        "\n" +
                        "Remove weeds from the field and surrounding areas.\n" +
                        "Avoid indiscriminate insecticide use, which destroys natural enemies.\n" +
                        "Use a resistant variety.\n" +
                        "Critical numbers: At a density of 1 BPH/stem or less there is still time to act in case the numbers increase.\n" +
                        "Look for BPH daily in the seedbed, or weekly in the field, on stems and the water surface. Check each side of the seed bed (or direct-seeded fields). For older rice plants, grasp the plant, bend it over slightly, and gently tap it near the base to see if planthoppers fall onto the water surface. For transplanted rice look at bases of 10 to 20 hills as you cross the field diagonally. There is no need to scout for BPH or WBPH beyond the milk stage.\n" +
                        "Use light traps (e.g., an electric bulb or kerosene lamp near a light colored wall or over a pan of water) at night when rice is prone to planthopper attack. Do not place lights near seedbeds or fields. If the light trap is inundated with hundreds of BPH, it's a signal to check your seedbed or field immediately; then scout every day for the next few weeks. If farmers monitor on a daily basis anyway, then a light trap is unnecessary.\n" +
                        "Learn more\n" +
                        "View full fact sheet:\n" +
                        "Planthopper on IRRI Rice Knowledge Bank\n" +
                        "\n" +
                        "What it does\n" +
                        "High populations of planthoppers cause leaves to initially turn orange-yellow before becoming brown and drying. This condition, called hopperburn, kills the plant. Brown planthoppers can also transmit ragged stunt and grassy stunt diseases. Neither disease can be cured.\n");

            } else if (pest.equals("Kuhol")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText("Why and where it occurs\n" +
                        "Snails are able to spread through irrigation canals, natural water distribution pathways, and during flooding events.\n" +
                        "\n" +
                        "When water is absent, apple snails are able to bury themselves in the mud and hibernate for up to 6 months . When water is re-applied to fields, snails may emerge.\n" +
                        "\n" +
                        "Higher sowing density in planting can attract more snails. They damage direct wet-seeded rice and transplanted rice up to 30 days old. Once the rice plant reaches 30 days, it is thick enough to resist the snail.\n" +
                        "\n" +
                        "How to identify\n" +
                        "To distinguish golden apple snails from native snails, check its color and size.\n" +
                        "\n" +
                        "Golden apple snails have muddy brown shell and golden pinkish or orange-yellow flesh. They are bigger and lighter in color compared to native snails. Its eggs are bright pink in color.\n" +
                        "\n" +
                        "To confirm snail damage, check for missing hills, cut leaves, and cut stems.\n" +
                        "\n" +
                        "Scientific name\n" +
                        "There are more than 100 species of apple snail that exist.\n" +
                        "\n" +
                        "Two species, Pomacea canaliculata and Pomacea maculata, are highly invasive and cause damage to rice crops.\n" +
                        "\n" +
                        "Common name\n" +
                        "Golden apple snails\n" +
                        "\n" +
                        "How to manage\n" +
                        "The critical time to manage golden apple snails is during land preparation and crop establishment or planting; specifically, first 10 days after transplanting, and first 21 days after direct wet-seeding.\n" +
                        "\n" +
                        "After this, the crop is generally resistant to snail damage and snails are actually beneficial by feeding on weeds.\n" +
                        "\n" +
                        "Community-based snail management\n" +
                        "\n" +
                        "To best control the snail, communities should work together to reduce snail numbers in their area.\n" +
                        "\n" +
                        "Conduct mass snail and egg collection campaigns, involving the whole community, during land preparation and planting or crop establishment.\n" +
                        "Keep fields drained as much as possible during the vulnerable stages of the rice plant (below 30 days) or transplant 25-30 day old seedlings from low density nursery beds.\n" +
                        "Biological control\n" +
                        "\n" +
                        "Encourage natural predators.\n" +
                        "Red ants feed on snail eggs.\n" +
                        "Ducks (and sometimes rats) eat young snails.\n" +
                        "Several wild bird species also feed on golden apple snails.\n" +
                        "Snails can also be harvested, cooke, and eaten or sold as animal feed.\n" +
                        "Cultural control\n" +
                        "\n" +
                        "Handpick snails and crush egg masses.\n" +
                        "Keep water level below 2 cm during vulnerable stages of the rice plant.\n" +
                        "Use toxic plants such as tobacco leaves, heartleaf false pickerelweed, and citrus leaves in strips across the  field or in canalettes.\n" +
                        "Where water enters and leaves the field, place a barrier.\n" +
                        "When possible, transplant rice in the field. Transplanted rice is less vulnerable than direct seeded rice.\n" +
                        "Chemical control\n" +
                        "\n" +
                        "Apply products only to low spots and canalettes rather than to the whole field. Always ensure safe application.\n" +
                        "If used, molluscicides should only be used immediately after transplanting or during the seedling establishment phase in direct seeded rice; and only for rice younger than 30 days old.\n" +
                        "Following normal fertilizer application rate and schedule, apply fertilizer in 2 cm of water to maximize negative effects on apple snails.\n" +
                        "Learn more\n" +
                        "View full fact sheet:\n" +
                        "Golden apple snail on IRRI Rice Knowledge Bank\n" +
                        "\n" +
                        "What it does\n" +
                        "Golden apple snails eat young and emerging rice plants. They cut the rice stem at the base, destroying the whole plant.\n");

            } else if (pest.equals("Burit")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText("Green Planthopper\n" +
                        "\n" +
                        "Why and where it occurs\n" +
                        "Staggered planting encourages population growth of GLH.\n" +
                        "\n" +
                        "Green leafhoppers are common in rainfed and irrigated wetland environments. They are not prevalent in upland rice. Both the nymphs and adults feed on the dorsal surface of the leaf blades rather than the ventral surface. They prefer to feed on the lateral leaves rather than the leaf sheaths and the middle leaves. They also prefer rice plants that have been fertilized with large amount of nitrogen.\n" +
                        "\n" +
                        "How to identify\n" +
                        "Rice fields infested by GLH can have tungro, yellow dwarf, yellow-orage leaf, and transitory yellowing diseases.\n" +
                        "\n" +
                        "Symptoms include:\n" +
                        "\n" +
                        "stunted plants and reduced vigor\n" +
                        "reduced number of productive tillers\n" +
                        "withering or complete plant drying\n" +
                        "Tungro infected crops may sometimes be confused with nitrogen deficiency or iron toxicity or acid soils. To confirm cause of problem, check for virus infected plants in the fields, and the presence of insect:\n" +
                        "\n" +
                        "white or pale yellow eggs inside leaf sheaths or midribs\n" +
                        "yellow or pale green nymphs with or without black markings\n" +
                        "pale green adults with or without black markings feeding on upper parts of the crop\n" +
                        "Scientific name\n" +
                        "Naranga aenescens (Moore)\n" +
                        "How to manage\n" +
                        "Use GLH-resistant and tungro-resistant varieties.\n" +
                        "Reduce the number of rice crops to two per year and synchronized crop establishment across farms reduces leafhoppers and other insect vectors.\n" +
                        "Transplant older seedlings (>3 weeks) to reduce viral disease susceptibility transmitted by leafhoppers.\n" +
                        "Plant early within a given planting period, particularly in the dry season to reduce the risk of insect-vector disease.\n" +
                        "Avoid planting during the peak of GLH activity (shown by historical records) to avoid infestation. Light traps can be used to show GLH numbers.\n" +
                        "Apply nitrogen as needed (e.g., using the LCC) to avoid contributing to population outbreaks by applying too much nitrogen, or hindering plant recovery from planthopper damage by applying insufficient nitrogen.\n" +
                        "Control weeds in the field and on the bunds to remove the preferred grassy hosts of GLH and promotes crop vigor.\n" +
                        "Perform crop rotation with a non-rice crop during the dry season to decrease alternate hosts for diseases.\n" +
                        "Intercrop upland rice with soybean to reduce the incidence of leafhoppers on rice.\n" +
                        "In areas without tungro source, insecticides are not needed, avoid spraying of insecticide (it is often unable to prevent or reduce tungro infections)\n" +
                        "Encourage biological control agents.\n" +
                        "Learn more\n" +
                        "View full fact sheet:\n" +
                        "Green leafhopper on IRRI Rice Knowledge Bank\n" +
                        "\n" +
                        "What it does\n" +
                        "Green leafhoppers are the most common leafhoppers in rice fields and are primarily important because they spread the viral disease tungro. Both nymphs and adults feed by extracting plant sap with their needle-shaped mouthparts.\n");


            } else if (pest.equals("Daga")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText("Why and where it occurs\n" +
                        "Rats occur in lowland irrigated rice crops. Both the wet and dry seasons are favourable for rat reproduction and crop damage. In rainfed rice crops rodents have their greatest impact in the wet season. The availability of food, water, and shelter are factors, which provide optimum breeding conditions. The presence of grassy weeds also triggers their development.\n" +
                        "\n" +
                        "Rice field rats feed at night with high activity at dusk and dawn. At daytime, they are found among vegetation, weeds, or maturing fields. During fallow period, they utilize major channels and village gardens as prime habitats. At tillering, 75% of time they are in burrows along the banks and after maximum tillering, 65% of time they are in rice paddies.\n" +
                        "\n" +
                        "How to identify\n" +
                        "Rat feeding can cause the following damages:\n" +
                        "\n" +
                        "Missing germinating seeds\n" +
                        "Missing hills\n" +
                        "Chopped young seedlings\n" +
                        "Missing plants\n" +
                        "Irregular cuttings of stem\n" +
                        "Chewed developing buds or ripening grains\n" +
                        "Tillers cut near base at 45° angle\n" +
                        "Retillering of stems\n" +
                        "Delayed grain maturity\n" +
                        "Missing grains\n" +
                        "Missing panicles\n" +
                        "The feeding damage on the stem caused by the rice field rats may resemble insect damage although rat damage is usually distinguished by the clean cut at 45° of the tiller. The damage on the grains is similar to bird damage.\n" +
                        "\n" +
                        "Check muddy areas for runways, active burrows, and footprints of rice field rats. These are usually near the damage they have created.\n" +
                        "Check for presence of rice field rats: cut tillers and active holes on the bunds that surround the fields.\n" +
                        "When possible, catch rats to identify the species. Place traps along runways, or dug the rats from their burrows.\n" +
                        "Scientific name\n" +
                        "Rattus argentiventer Robinson and Kloss, R. exulans Peale, R. rattus spp., R. tanezumi\n" +
                        "How to manage\n" +
                        "Effective community control\n" +
                        "\n" +
                        "Flooding, digging, or fumagating rat burrows\n" +
                        "Scare rats out of areas with high vegetation cover or around villages (using netting, dogs, clubs, and others to catch rats)\n" +
                        "Use dogs to locate active rat burrows, then do Step 1\n" +
                        "Hunt rats at night using flashlights, clubs, bow and arrows, and netting\n" +
                        "Set local kill-traps along runways of rats\n" +
                        "Use registered rat poisons that are placed in covered bait stations (but not where children, pets, or livestock have easy access).\n" +
                        "Management actions\n" +
                        "\n" +
                        "Keep rice bunds (banks) in the crops less than 30 cm wide to prevent rats from burrowing.\n" +
                        "Keep the edges of the field, the bunds, and surrounding areas clean and free of tall weeds and hiding areas for rats.\n" +
                        "Plant at the same time as your neighbors—within 2 weeks of each other.\n" +
                        "Strategic use of Trap Barrier System (TBS)—during the rice season with the most rodent damage.\n" +
                        "Keep area around fields, homes, and villages clean — no piles of wood or brush, no garbage heaps, no weedy areas.\n" +
                        "Keep grain stores and surrounding area clean.\n" +
                        "Learn more\n" +
                        "View full fact sheet:\n" +
                        "Rats on IRRI Rice Knowledge Bank\n" +
                        "\n" +
                        "What it does\n" +
                        "Rice field rats cut or pull up transplanted plants. They also chop young seedlings. At ripening stage, they feed on developing rice buds.\n");

            } else if (pest.equals("Atangya")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText("Rice Bug\n" +
                        "\n" +
                        "\n" +
                        "Why and where it occurs\n" +
                        "High rice bug populations are brought about by factors such as nearby woodlands, extensive weedy areas near rice fields, wild grasses near canals, and staggered rice planting. The insect also becomes active when the moonsoonal rains begin. Warm weather, overcast skies, and frequent drizzles favor its population buildup.\n" +
                        "\n" +
                        "The population of the rice bug increases at the end of the rainy season.\n" +
                        "\n" +
                        "Rice bugs are found in all rice environments. They are more common in rainfed and upland rice and prefer the flowering to milky stages of the rice crop. Adults are active during the late afternoon and early morning. Under bright sunlight, they hide in grassy areas. They are less active during the dry season. In cooler areas, the adults undergo aestivation or diapause in grasses. They feed on wild hosts for one to two generations before migrating into the rice fields at the flowering stages. The nymphs are found on the rice plant where they blend with the foliage. There, they are often left unnoticed. When disturbed, the nymphs drop to the lower part of the plants and the adults fly within a short distance.\n" +
                        "\n" +
                        "How to identify\n" +
                        "Check for feeding damage:\n" +
                        "\n" +
                        "Small or shrivelled grains\n" +
                        "Deformed or spotty grains\n" +
                        "Empty grains\n" +
                        "Erect panicles\n" +
                        "The symptoms can be confused with the damage caused by nutrient deficiency or flower thrips. To confirm rice bug infestation, check for presence of insect:\n" +
                        "\n" +
                        "oval, shiny, and reddish brown eggs along midrib of leaf\n" +
                        "slender and brown-green nymphs and adults feeding on endosperm of rice grains\n" +
                        "offensive smell\n" +
                        "Scientific name\n" +
                        "The most common species of rice bug are Leptocorisa oratorius F. and Leptocorisa acuta Thunberg.\n" +
                        "\n" +
                        "How to manage\n" +
                        "Remove weeds from fields and surrounding areas to prevent the multiplication of rice bugs during fallow periods.\n" +
                        "Level fields with even applications of fertilizer and water encourage rice to grow and develop is at the same rate. Planting fields, within a village, at the same time (synchronous planting) also helps reduce rice bug problems.\n" +
                        "Capturing rice bugs, in the early morning or late afternoon, by net can be effective at low rice bug densities, though labor intensive.\n" +
                        "Encourage biological control agents: Some wasps, grasshoppers and spiders attack rice bugs or rice bug eggs. Indiscriminate insecticide use disrupts biological control, resulting in pest resurgence.\n" +
                        "For chemical control\n" +
                        "\n" +
                        "Before using a pesticide contact a crop protection specialist for suggestions, guidance, and warnings specific to your situation.\n" +
                        "\n" +
                        "Begin scouting the field at pre-flowering and continue daily until the hard dough stage. Count rice bugs in the early morning or late afternoon from 20 hills while walking diagonally across a transplanted field. Adults often fly out of the way before you reach the rice plant, so counts may only reveal immature forms. Direct control may be required if there are more than 10 rice bugs/20 hills.\n" +
                        "The choice of insecticide depends on many factors such as the application equipment available, cost of the insecticide, experience of the applicator, or presence of fish. The benefits of using an insecticide must be weighed against the risks to health and the environment.\n" +
                        "Learn more\n" +
                        "View full fact sheet:\n" +
                        "Rice bug on IRRI Rice Knowledge Bank\n" +
                        "\n" +
                        "What it does\n" +
                        "Rice bugs damage rice by sucking out the contents of developing grains, from pre-flowering spikelets to soft dough stage. Immature and adult rice bugs both feed on rice grains.\n");


            } else if (pest.equals("Ulalo sa ugat")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText(
                        "Why and where it occurs\n" +
                                "Dry spells and the presence of grassy weeds that harbor this insect pest favor the population buildup of the rice mealybug. Likewise, well-drained soils are also suitable for the insect pest.\n" +
                                "\n" +
                                "The rice mealybug is found in upland and rainfed environments. It is not common in irrigated rice. It occurs in great number during the rainy season.\n" +
                                "\n" +
                                "The nymphs are active until they molt. They first stay under the body of the adult female and later crawl from plant to plant. They are also dispersed by wind. After dispersal, they stay between the leaf sheath and stem to feed and complete their entire larval development. After molting, the female attaches itself to the plant for life and grows in size.\n" +
                                "\n" +
                                "The adult females remain stationary and feed while the winged adult male flies off.\n" +
                                "\n" +
                                "The insect is abundant in April to early July where two generations are completed during this period.\n" +
                                "\n" +
                                "How to identify\n" +
                                "Mealybug damage causes:\n" +
                                "\n" +
                                "Wilting\n" +
                                "Plant stunting\n" +
                                "Yellowish curled leaves\n" +
                                "Damaged spots or chakdhora or soorai disease\n" +
                                "It does not have a uniform pattern of damage.\n" +
                                "\n" +
                                "Stunting is also a damage symptom caused by other  insect pests like root grubs and rice root aphids. To confirm the cause of damage, check for presence of insect:\n" +
                                "\n" +
                                "hyaline to yellowish to pinkish eggs\n" +
                                "crawlers or nymphs, unwinged pink female adults and winged pale yellow males removing plant sap\n" +
                                "appearance of wax covering the eggs, nymphs and adults that stick on the stem or leaf\n" +
                                "Scientific name\n" +
                                "Brevennia rehi (Lindinger)\n" +
                                "How to manage\n" +
                                "Where possible, the general management options for Mn toxicity are:\n" +
                                "\n" +
                                "In a temperate climate, coat seeds with oxidants (e.g., Ca peroxide) to improve germination and seedling emergence by increasing the supply of oxygen.\n" +
                                "Manage water efficiently. \n" +
                                "Balance the use of fertilizers (NPK or NPK + lime) to avoid nutrient stress as a source of Mn toxicity.\n" +
                                "Recycle straw or ash to replenish Si and K removed from the field\n" +
                                "Learn more\n" +
                                "View full fact sheet:\n" +
                                "Mealy bug on IRRI Rice Knowledge Bank\n" +
                                "\n" +
                                "What it does\n" +
                                "Both adult and nymph mealybugs remove plant sap by sucking. This results to curling of leaves and wilting of plants.\n");

            } else if (pest.equals("Aksip")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText("Why and where it occurs\n" +
                        "The yellow stem borer is a pest of deepwater rice. It is found in aquatic environments where there is continuous flooding. Second instar larvae enclose themselves in body leaf wrappings to make tubes and detach themselves from the leaf and falls onto the water surface. They attach themselves to the tiller and bore into the stem.\n" +
                        "\n" +
                        "Striped stem borer is most abundant in temperate countries and in non-flooded areas. Their final instars remain dormant in temperate areas during winter.\n" +
                        "\n" +
                        "The pink stem borer is found in upland rice, which is grown near sugarcane or related grasses. The presence of alternate hosts encourages the pink stem borer to develop, multiply and survive during winter or dry season. Unlike other species of stemborers, the pink Stem borer have bare eggs laid between the leaf sheath and the stem.\n" +
                        "\n" +
                        "High nitrogenous field favors population buildup of the stem borers. Fields planted later favors more damage by the insect pest that have built up in fields that have been planted earlier. Stubble that remains in the field can harbor stem borer larvae and or pupae.\n" +
                        "\n" +
                        "How to identify\n" +
                        "Check the field for the following damage symptoms:\n" +
                        "\n" +
                        "Deadhearts or dead tiller that can be easily pulled from the base during the vegetative stages\n" +
                        "Whiteheads during reproductive stage where the emerging panicles are whitish and unfilled or empty\n" +
                        "Tiny holes on the stems and tillers\n" +
                        "Frass or fecal matters inside the damaged stems\n" +
                        "Deadhearts and whiteheads symptoms may sometimes be confused with damages caused by rats, neck blast, and black bug diseases.\n" +
                        "\n" +
                        "To confirm stem borer damage, visually inspect rice crop for deadhearts in the vegetative stages and whiteheads in reproductive stages. Stems can be pulled and dissected for larvae and pupae for confirmation of stem borer damage.\n" +
                        "\n" +
                        "Scientific name\n" +
                        "The following stemborer species infest rice: yellow stem borer (YSB), Scirpophaga incertulas; white stem borer (WSB), S. innotata; striped stem borer (SSB), Chilo suppressalis; Gold-fringed stem borer, C. auricilius; Dark-headed stem borer, C. polychrysus; and, Pink stem borer, Sesamia inferens\n" +
                        "\n" +
                        "Common name\n" +
                        " \n" +
                        "\n" +
                        "How to manage\n" +
                        "Use resistant varieties\n" +
                        "At seedbed and transplanting, handpick and destroy egg masses\n" +
                        "Raise level of irrigation water periodically to submerge the eggs deposited on the lower parts of the plant\n" +
                        "Before transplanting, cut the leaf-top to reduce carry-over of eggs from the seedbed to the field\n" +
                        "Ensure proper timing of planting and synchronous planting, harvest crops at ground level to remove the larvae in stubble, remove stubble and volunteer rice, plow and flood the field\n" +
                        "Encourage biological control agents: braconid, eulophid, mymarid, scelionid, chalcid, pteromalid and trichogrammatid wasps, ants, lady beetles, staphylinid beetles, gryllid, green meadow grasshopper, and mirid, phorid and platystomatid flies, bethylid, braconid, elasmid, eulophid, eurytomid and ichneumonid wasps, carabid and lady bird beetles, chloropid fly, gerrid and pentatomid bugs, ants, and mites,  earwigs, bird, asilid fly, vespid wasp, dragonflies, damselflies, and spiders\n" +
                        "Bacteria and fungi also infect the larvae: mermithid nematode, chalcid, elasmid and eulophid\n" +
                        "Apply nitrogen fertilizer in split following the recommended rate and time of application.\n" +
                        "Learn more\n" +
                        "View full fact sheet:\n" +
                        "Stem borer on IRRI Rice Knowledge Bank\n" +
                        "\n" +
                        "What it does\n" +
                        "Stem borers can destroy rice at any stage of the plant from seedling to maturity.\n" +
                        "\n" +
                        "They feed upon tillers and causes deadheart or drying of the central tiller, during vegetative stage; and causes whiteheads at reproductive stage.\n");


            } else if (pest.equals("Bukbok")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText(
                        "Why and where it occurs\n" +
                                "Weevils are attracted to warm, moist environments. They emerge in late spring and seek shelter in the hot, dry months of June and July, looking for places to reproduce and lay their eggs. If they enter your home, they get attracted to grain and other food and infest them. If you get weevil-infested food, heating it to room temperature can promote rapid growth of weevils, causing infestation.\n" +
                                "\n" +
                                "How to identify\n" +
                                "\n" +
                                "-Weevils are small beetles that have noticeable snouts.\n" +
                                "-They are often lightbulb- or pear-shaped.\n" +
                                "-The immature, legless, grub-like larvae feed on plants.\n" +
                                "-Adult weevils look for shelter in unfavorable weather conditions,                          especially when it is hot and dry.\n" +
                                "-Weevils enter buildings by crawling through cracks or openings around foundations, doors and windows.\n" +
                                "-They are a temporary nuisance\n" +
                                "\n" +
                                "How to manage\n" +
                                "\n" +
                                "Five black beetles with elongated snouts, two antennae and six legs each\n" +
                                "Strawberry root weevils\n" +
                                "Keeping out weevils is the best control method.\n" +
                                "-Caulk cracks and ensure snug-fitting screens and doors to reduce the number of weevils that may enter a building.\n" +
                                "-Weevils, especially strawberry root weevils, are attracted to moisture. You can trap them in shallow pans of water placed around foundations or walls of the house.\n" +
                                "-These pans do not capture enough weevils to reduce the number of weevils entering homes.\n" +
                                "\n" +
                                "Learn to more\n" +
                                "View full fact sheet:\n" +
                                "Water weevil on IRRI Rice Knowledge Bank\n" +
                                "\n" +
                                "What it does\n" +
                                "\n" +
                                "A weevil is a type of beetle from the Curculionoidea superfamily123. They are usually small, less than 6 millimeters in length, and herbivorous12. Weevils are known for their elongated snouts and are often called \"snout beetles\"123. They come in various colors and there are tens of thousands of types of weevils34. The immature larvae feed on plants, while adult weevils look for shelter in unfavorable weather conditions5.\n");

            } else if (pest.equals("Puting nguso")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText(
                        "Why and where it occurs\n" +
                                "\n" +
                                " White planthoppers are usually noticed because of the white, fluffy secretions of the nymphs, which can completely obscure the insect. This fluffy material is left behind on leaves and stems when the adult emerges or when the nymph is disturbed and jumps away. The adults are also snowy white. The fluffy secretion of nymphs resembles that of mealybugs, woolly aphids, and certain soft scale insect egg masses. However, if the snowy planthopper nymph is disturbed, it often jumps for several inches whereas mealybugs, aphids, and soft scales are sedentary and crawl slowly if at all when disturbed.\n" +
                                "\n" +
                                "How to identify\n" +
                                "Look for a white planthopper with a distinctive white line in the centre of the triangular shield that covers part of the head and thorax. Look for plants that have sooty moulds at the base of the plant, and others that have wilted, dried out and collapsed due to hopperburn.\n" +
                                "\n" +
                                "How to manage\n" +
                                "NATURAL ENEMIES\n" +
                                "The white-backed planthopper is usually controlled the mirid bug, Cyrtorhinus lividipennis (see Fact Sheet no. 419). However, the balance can be disturbed if broad-spectrum insecticides are used to control the planthopper or other pests.\n" +
                                "\n" +
                                "CULTURAL CONTROL\n" +
                                "\n" +
                                "Before planting:\n" +
                                "\n" +
                                "Aim to plant neighbouring farms within 3 weeks of each other, to avoid overlapping crops, and movement of planthoppers between fields.\n" +
                                "During growth:\n" +
                                "\n" +
                                "Monitor with light bulb over pan of water away from nursery and outside of field.\n" +
                                "Apply nitrogen in split doses, being careful not to exceed local recommendations.\n" +
                                "Grow only two crops per year, and use early-maturing varieties.\n" +
                                "Drain fields for 3 or 4 days if heavy infestations occur.\n" +
                                "After harvest:\n" +
                                "\n" +
                                "Do not ratoon the crop, i.e., do not allow it to regrowand continue growing after harvest.\n" +
                                "Plough the field after harvest, removing the stubble that would otherwise allow the planthoppers to continue to breed.\n" +
                                "RESISTANT VARIETIES\n" +
                                "Tolerant varieties exist, and they are part of an IPM program for this planthopper that includes cultural control measures and careful use of insecticides to preserve natural enemies, importantly the rice bug, Cyrtorhinus lividipennis.\n" +
                                "\n" +
                                "CHEMICAL CONTROL\n" +
                                "The recommendation of IRRI is to only use pesticides in the nursery (seedbed) if: i) more than one planthopper per stem, or ii) more planthoppers than natural enemies.\n" +
                                "\n" +
                                "If using an insecticide, avoid the consecutive use of the same produce. If other insects are present, do not use broad-spectrum products, especially early in the season. Try to use those that are more specific for the pest that you are trying to manage. Consider the effect of insecticides on parasitoids and predators, especially early in the reason. Resurgence is a common problem after application of broad-spectrum insectides as they destroy natural enemies.\n" +
                                "\n" +
                                "When using a pesticide, always wear protective clothing and follow the instructions on the product label, such as dosage, timing of application, and pre-harvest interval.\n" +
                                "\n" +
                                "Learn to more\n" +
                                "View full fact sheet:\n" +
                                "White Planthopper on IRRI Rice Knowledge Bank\n" +
                                "\n" +
                                "What it does\n" +
                                "White Planthoppers are laterally flattened and hold their broad wings vertically, in a tent-like fashion, concealing the sides of the body and part of the legs.[3] White Planthopper of many fulgoroids produce wax from special glands on the abdominal terga and other parts of the body. These are hydrophobic and help conceal the insects. Adult females of many families also produce wax which may be used to protect eggs.[4]\n");


            }}

        if (id == R.id.T) {

            TextView tView2 = findViewById(R.id.textview1);
            TextView tView3 = findViewById(R.id.textview2);
            ImageView imag4 = findViewById(R.id.view23);

            Intent intent = getIntent();
            tView2.setText(intent.getStringExtra("select"));
            tView3.setText(intent.getStringExtra("select"));
            imag4.setImageResource(intent.getIntExtra("image", 0));
            String pest = tView.getText().toString();

            if (pest.equals("Langgam")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText(
                        "Bakit at saan ito nangyayari\n" +
                                "Ang mga langgam ay higit sa lahat ay nangyayari sa mga bukid sa itaas kung saan sila ay pugad sa ibaba ng ibabaw ng lupa. Sa rainfed wetland fields, nakakulong sila sa rice levees o bunds.\n" +
                                "\n" +
                                "Ang mga ants ay nakakasira sa patlang sa mga patch. Karaniwan silang kumakain sa halaman sa panahon ng seedling stage.\n" +
                                "\n" +
                                "Paano tukuyin ang\n" +
                                "Suriin ang mga nawawalang halaman at pagkawala ng stand ng halaman. \n" +
                                "\n" +
                                "Ang mga pinsala na ito ay katulad din ng mga sintomas ng pagpapakain ng mole cricket. Upang makilala, suriin ang pagkakaroon ng insekto.\n" +
                                "\n" +
                                "Ang mga langgam ay madalas na matatagpuan sa nasira na lugar. Ang mga buto ay maaaring matagpuan sa kanilang mga pugad sa ilalim ng lupa.\n" +
                                "\n" +
                                "Pangalan ng siyentipiko\n" +
                                "Solenopsis geminata (Fabricius)\n" +
                                "Paano pangasiwaan ang\n" +
                                "Upang mabawasan ang epekto ng pinsala sa langgam, dagdagan ang rate ng seeding.\n" +
                                "\n" +
                                "Ang mga langgam ay mga host sa mga nematode, fungi, phorid fly, strepsipterans, at eucharitine wasps. Sila rin ay biktima ng mga ibon, ahas, kalabaw na palaka, at mga ipis na giniling.\n" +
                                "\n" +
                                "Alamin ang higit pa\n" +
                                "Tingnan ang buong fact sheet:\n" +
                                "Langgam sa IRRI Rice Knowledge Bank\n" +
                                "\n" +
                                "Ano ang ginagawa nito\n" +
                                "Ang mga langgam ay kumakain ng mga buto ng palay at punla.\n" +
                                "\n" +
                                "Ang pagkasira ng kanilang pagpapakain ay nagiging sanhi ng pagkawala ng mga buto ng palay o halaman. Nakakaapekto rin ito sa plant stand, at nagpapataas ng insidente ng mga sakit na vectored ng iba pang mga insekto tulad ng planthoppers, leafhoppers, mealybugs, at aphids.\n");

            } else if (pest.equals("Harabas")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText("Bakit at saan ito nangyayari\n" +
                        "Armyworms nakatira mas mahaba sa mga lugar na may mababang temperatura (15 °C maximum).\n" +
                        "\n" +
                        "Ang mga panahon ng tagtuyot na sinusundan ng malakas na pag ulan, at pagkakaroon ng maraming mga kahaliling host ay nagpapanatili rin ng pag unlad ng mga pesteng insekto.\n" +
                        "\n" +
                        "Paano tukuyin ang\n" +
                        "Suriin para sa pagpapakain pinsala sa mga tip ng dahon o kasama ang mga margin ng dahon. Armyworms ay maaaring feed sa buong dahon, umaalis lamang ang midribs.\n" +
                        "\n" +
                        "Suriin kung may mga hiwa sa stem o sa base ng halaman. Ang insekto ay maaari ring putulin ang panicles mula sa base.\n" +
                        "\n" +
                        "Armyworm pinsala ay maaaring mapagkamalan para sa cutworm pagpapakain. Upang kumpirmahin, suriin para sa pagkakaroon ng insekto. Ang katangian form ng armyworm pinsala ay dahon pag alis.\n" +
                        "\n" +
                        "Pangalan ng siyentipiko\n" +
                        "Hindi bababa sa tatlong species ng armyworms ang umaatake sa bigas sa Asya: ang rice swarming caterpillar, Spodoptera mauritia (Boisduval); ang karaniwang cutworm, Spodoptera litura (F.); at ang higad ng palay na naghihiwa ng tainga, Mythimna separata (Walker).\n" +
                        "\n" +
                        "Alisin ang mga damo sa labas at loob ng bukid.\n" +
                        "Upang kontrolin ang:\n" +
                        "\n" +
                        "Baha seedbeds. Ito ang pinakamahusay na pagtatanggol laban sa armyworms.\n" +
                        "Maglagay ng abo sa mga trenches upang mas mahirap makatakas ang mga uod.\n" +
                        "Maglagay ng mga sanga sa paligid ng mga patlang upang bigyan ang mga armyworm ng isang lugar upang pagsamahin kung saan ang mga ito ay madaling nakolekta sa kamay.\n" +
                        "Iwasan ang pagpatay ng mga likas na kaaway (hal., wasps at spiders) ng mga armyworm. Insecticides ay dapat na ang huling resort para sa armyworm control.\n" +
                        "Alamin ang higit pa\n" +
                        "Tingnan ang buong fact sheet:\n" +
                        "Armyworm sa IRRI Rice Knowledge Bank\n" +
                        "\n" +
                        "Ano ang ginagawa nito\n" +
                        "Ang mga armyworm ay kumakain sa mga dahon ng palay at maaari ring putulin ang mga batang seedlings sa planta o panicle base. Kumakain sila sa itaas na bahagi ng kanopya ng bigas sa maulap na araw o sa gabi.\n");


            } else if (pest.equals("Ibon")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText(
                        "Bakit at saan ito nangyayari\n" +
                                "Ang mga ibon ay nagiging problema mula sa yugto ng pagkahinog—kapag ang halaman ng palay ay nabubuo na at napupuno na ang mga butil—hanggang sa pag-ani.\n" +
                                "\n" +
                                "Ang ilang mga species ay makakain ng mga panicle sa pamamagitan ng alinman sa paglapag sa kanila, sa pamamagitan ng perching sa kalapit na mga bagay (tulad ng mga bakod o poste) o sa pamamagitan ng pagkain ng mga nahulog na butil sa lupa kapag ang mga bukid ay naani. Ang mga species ng peste ng ibon ay pinaka masagana sa panahong ito.\n" +
                                "\n" +
                                "Paano tukuyin ang\n" +
                                "Suriin ang pagkakaroon ng milky substance sa chewed grains, at para sa whiteheads na may tinanggal na butil. Ang mga whitehead ay maaari ring sanhi ng stemborer. Upang kumpirmahin ang sanhi ng pinsala:\n" +
                                "\n" +
                                "sa bird's damage, hindi lahat ng butil ay chaffy\n" +
                                "Sa pinsala ni Stemborer, ang lahat ng butil sa isang panicle ay chaffy at ang panicle ay maaaring hilahin out madali\n" +
                                "Mula sa mahigit 70 uri ng ibon na matatagpuan sa palayan, lima lamang ang kilala sa Pilipinas (at mga 14 sa Timog Silangang Asya) na kumakain ng bigas. Ang ilang mga ibon na kumakain ng bigas ay kinabibilangan ng:\n" +
                                "\n" +
                                "Paano pangasiwaan ang\n" +
                                "Ang ilang mga pagpipilian sa pamamahala na maaaring pinagtibay ay kinabibilangan ng: \n" +
                                "\n" +
                                "Umarkila ng mga \"bird boys\" para mag shoo away ng mga ibon sa farm mo.\n" +
                                "Mag-set up ng mga lambat sa ibabaw ng iyong field.\n" +
                                "Mag-set up ng mga bird-tape sa ibabaw ng mga tanim na palay kapag hinog na.\n" +
                                "Gumamit ng mga noisemaker upang makabuo ng mga random na tunog at pag record na maaaring matakot ang mga ibon.\n" +
                                "Gumamit ng mga kemikal na repellents.\n" +
                                "\n" +
                                "Gumamit ng mga decoy bird upang maakit o mapalayas ang mga ibon sa iyong bukid.\n" +
                                "Gumamit ng mga watawat, panakot sa mga uwak, o mga ibon ng ibon.\n" +
                                "Eco-engineering o iwanan ang mas malalaking ibon na natural na nangangaso nang walang pag-uusig.\n" +
                                "Alamin ang higit pa\n" +
                                "Tingnan ang buong fact sheet:\n" +
                                "Mga Ibon sa IRRI Rice Knowledge Bank\n" +
                                "\n" +
                                "Ano ang ginagawa nito\n" +
                                "Ang mga ibong kumakain ng bigas ay nangunguya ng mga butil ng bigas, at maaaring maging sanhi ng whitehead o unfilled panicles.\n" +
                                "\n" +
                                "Sila ay alinman sa pisilin ang mga butil sa panahon ng milky phase, o kumain ng buong butil sa sandaling mature. Ang pinsala ay nagpapakita ng isang kulay gatas puting sangkap na sumasaklaw sa mga butil.\n");

            } else if (pest.equals("Itim na atangya")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText(
                        "Bakit at saan ito nangyayari\n" +
                                "Ang insekto ay karaniwan sa mga rainfed at irrigated wetland na kapaligiran. Mas gusto nito ang patuloy na ani irrigated rice areas at mahinang drained fields. Ang mga pinsala ay mas madalas na sinusunod sa dry season na mga pananim na palay at siksik na nakatanim na bukid.\n" +
                                "\n" +
                                "Ang mga pattern ng paglipad ng itim na bug ay apektado ng pag-ikot ng buwan; Sa buong buwan gabi, malaking bilang ng mga matatanda swarm sa liwanag pinagkukunan.\n" +
                                "\n" +
                                "Ang staggered planting ng pananim na palay at labis na nitrogen ay pabor din sa pagbuo ng peste. Sa mga panahong hindi palay, ang pagkakaroon ng alternatibong breeding site ay pabor sa pagtaas ng populasyon.\n" +
                                "\n" +
                                "Ang mga itim na bug ay karaniwang infest sa panahon ng vegetative yugto ng pananim na palay.\n" +
                                "\n" +
                                "Paano tukuyin ang\n" +
                                "Suriin ang mga dahon para sa pagkawalan ng kulay. Ang black bug damage ay maaaring maging sanhi ng mapula kayumanggi o yellowing ng mga halaman. Ang mga dahon ay mayroon ding mga sugat na chlorotic.\n" +
                                "\n" +
                                "Suriin kung nabawasan ang pagbubukid. Ang mga sintomas ng bugburn ay nagpapakita ng paglusaw ng mga tiller na walang nakikitang deposito ng honeydew o sooty molds.\n" +
                                "\n" +
                                "Ang mga halaman ay natigil din; at maaaring bumuo ng stunted panicles, walang panicles, hindi ganap na exerted panicles, at unfilled spikelets o whiteheads sa booting stage.\n" +
                                "\n" +
                                "Check mo kung may deadhearts.\n" +
                                "\n" +
                                "Ang deadhearts ay maaari ring sanhi ng stemborer. Upang kumpirmahin ang sanhi ng pinsala, hilahin ang mga nahawaang halaman. Sa itim na pinsala sa bug, ang mga nahawaang halaman ay hindi maaaring hilahin sa mga base.\n" +
                                "\n" +
                                "Pangalan ng siyentipiko\n" +
                                "Tatlong species ng itim na bug atake bigas: karaniwang itim na bug (Scotinophara coarctata), Malayan itim na bug (S. lurida) at, Hapon bigas itim na bug (S. latiuscula).\n" +
                                "\n" +
                                "Paano pangasiwaan ang\n" +
                                "Upang maiwasan ang:\n" +
                                "\n" +
                                "Gumamit ng mga lumalaban na varieties.\n" +
                                "Panatilihin ang malinis na bukid sa pamamagitan ng pagtanggal ng mga damo at pagpapatuyo ng palayan habang nag aararo.\n" +
                                "Magtanim ng rice varieties ng parehong petsa ng maturity upang masira ang siklo ng insekto.\n" +
                                "Ang paggamit ng mercury bulbs bilang light traps para sa mga matatanda na nagtatanim ng itlog, ang light trappping ng mga insekto ay dapat magsimula 5 araw bago at pagkatapos ng buong buwan.\n" +
                                "Hikayatin ang mga ahente ng biological control.\n" +
                                "Upang kontrolin ang:\n" +
                                "\n" +
                                "Sa panahon ng maagang infestation, ang antas ng tubig sa patlang ay maaaring itaas sa loob ng 2 3 araw upang pilitin ang mga insekto na lumipat pataas.\n" +
                                "Bahain ang mga bukid. Ito ay maaaring maging sanhi ng mas mataas na kamatayan ng itlog.\n" +
                                "After harvest, plow fields to remove remaining insects.\n" +
                                "Alamin ang higit pa\n" +
                                "Tingnan ang buong fact sheet:\n" +
                                "Black bugs sa IRRI Rice Knowledge Bank\n" +
                                "\n" +
                                "Ano ang ginagawa nito\n" +
                                "Ang mga itim na bug ay nag aalis ng katas ng halaman. Maaari silang maging sanhi ng browning ng mga dahon, deadheart, at bugburn. Ang kanilang pinsala ay nagdudulot din ng stunting sa mga halaman, nabawasan ang bilang ng mga tiller, at pagbuo ng mga whiteheads.\n" +
                                "\n" +
                                "Sa malubhang kaso, ang itim na bug ay nagpapahina sa halaman na pumipigil sa kanila na makagawa ng mga buto.\n");

            } else if (pest.equals("Ngusong Kabayo")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText("Bakit at saan ito nangyayari\n" +
                        "Ang mga planthoppers ay maaaring maging isang problema sa rainfed at irrigated wetland environment, at sa mga lugar na may patuloy na lumubog na mga kondisyon sa patlang, mataas na lilim at kahalumigmigan.\n" +
                        "\n" +
                        "Ang saradong kanopya ng mga tanim na palay, siksik na mga pananim, labis na paggamit ng nitrogen, at early season insecticide spraying ay pabor din sa pag unlad ng isect.\n" +
                        "\n" +
                        "Paano tukuyin ang\n" +
                        "Suriin ang pagkakaroon ng insekto:\n" +
                        "\n" +
                        "hugis crescent na puting itlog na ipinasok sa midrib o leaf sheath\n" +
                        "puti hanggang kayumanggi nymphs\n" +
                        "brown o puting mga matatanda na nagpapakain malapit sa paanan ng mga tiller\n" +
                        "Suriin ang patlang para sa:\n" +
                        "\n" +
                        "Hopperburn o yellowing, browning at pagpapatayo ng halaman\n" +
                        "Ovipositional marks paglalantad ng halaman sa fungal at bacterial impeksiyon\n" +
                        "Presensiya ng honeydew at sooty molds sa mga base ng mga lugar na nahawaan\n" +
                        "Mga halaman na may ragged stunt o grassy stunt virus disease\n" +
                        "Ang Hopperburn ay katulad ng pinsala sa pagpapakain o \"bugburn\" na dulot ng rice black bug. Upang kumpirmahin ang hopperburn na sanhi ng mga planthoppers, suriin para sa pagkakaroon ng mga sooty molds sa paanan ng halaman.\n" +
                        "\n" +
                        "Pangalan ng siyentipiko\n" +
                        "Dalawang species ng planthopper infest rice. Ito ang brown planthopper (BPH), Nilaparvata lugens (Stal); at ang whitebacked planthopper (WBH), Sogatella furcifera (Horvath).\n" +
                        "\n" +
                        "Karaniwang pangalan\n" +
                        "Brown planthopper, Whitebacked planthopper\n" +
                        "\n" +
                        "Paano pangasiwaan ang\n" +
                        "Ang mga pagsiklab ay nagreresulta kapag ang mga pestisidyo ay sumisira sa mga likas na kaaway (ang mga itlog ng BPH ay hindi naka check, at ang nakaligtas na BPH ay mabilis na bumubuo ng mga populasyon sa mga nakakapinsalang antas), o kapag ang mga longwinged planthoppers ay dinadala sa pamamagitan ng hangin.\n" +
                        "\n" +
                        "Upang maiwasan ang mga pagsiklab:\n" +
                        "\n" +
                        "Alisin ang mga damo sa bukid at mga karatig lugar.\n" +
                        "Iwasan ang walang pili pili na paggamit ng insecticide, na sumisira sa mga likas na kaaway.\n" +
                        "Gumamit ng isang lumalaban na iba't ibang.\n" +
                        "Mga kritikal na numero: Sa isang density ng 1 BPH / stem o mas mababa pa ay may oras pa upang kumilos sakaling tumaas ang mga numero.\n" +
                        "Hanapin ang BPH araw-araw sa seedbed, o linggu-linggo sa bukid, sa mga stem at sa ibabaw ng tubig. Suriin ang bawat gilid ng binhi kama (o direktang binhi patlang). Para sa mga matatandang halaman ng palay, hawakan ang halaman, yumuko ito nang bahagya, at dahan dahang i tap ito malapit sa base upang makita kung ang mga planthoppers ay bumabagsak sa ibabaw ng tubig. Para sa transplanted rice tumingin sa mga base ng 10 20 burol habang tumatawid ka sa patlang nang pahilis. Hindi na kailangang mag scout para sa BPH o WBPH lampas sa milk stage.\n" +
                        "Gumamit ng mga light traps (hal., isang electric bombilya o kerosene lamp malapit sa isang ilaw na kulay na pader o sa ibabaw ng isang kawali ng tubig) sa gabi kapag ang bigas ay madaling kapitan ng planthopper atake. Huwag maglagay ng mga ilaw malapit sa mga seedbed o bukid. Kung ang light trap ay binaha ng daan-daang BPH, ito ay hudyat na suriin kaagad ang iyong seedbed o field; tapos mag scout araw araw sa mga susunod na linggo. Kung ang mga magsasaka ay sumusubaybay sa isang pang araw araw na batayan pa rin, kung gayon ang isang light trap ay hindi kinakailangan.\n" +
                        "Alamin ang higit pa\n" +
                        "Tingnan ang buong fact sheet:\n" +
                        "Planthopper sa IRRI Rice Knowledge Bank\n" +
                        "\n" +
                        "\n" +
                        "Ano ang ginagawa nito\n" +
                        "Ang mataas na populasyon ng mga planthoppers ay nagiging sanhi ng mga dahon na sa simula ay nagiging orange yellow bago maging kayumanggi at tuyo. Ang kondisyong ito, na tinatawag na hopperburn, ay pumapatay sa halaman. Ang mga brown planthoppers ay maaari ring magpadala ng mga ragged stunt at grassy stunt diseases. Ni sakit ay hindi maaaring gamutin.\n");

            } else if (pest.equals("Kuhol")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText("Bakit at saan ito nangyayari\n" +
                        "Ang mga kuhol ay nakakapagkalat sa pamamagitan ng mga kanal ng patubig, mga natural na landas ng pamamahagi ng tubig, at sa panahon ng mga kaganapan sa baha.\n" +
                        "\n" +
                        "Kapag wala ang tubig, ang mga mansanas na snails ay nakakalibing sa putik at nag hibernate ng hanggang 6 na buwan . Kapag muling inilapat ang tubig sa mga bukid, maaaring lumabas ang mga kuhol.\n" +
                        "\n" +
                        "Ang mas mataas na paghahasik ng density sa pagtatanim ay maaaring maakit ang mas maraming snails. Pinsala nila ang direktang bigas na may basang buto at transplanted rice hanggang sa 30 araw na gulang. Kapag umabot na sa 30 araw ang tanim na palay, makapal na ito para labanan ang snail.\n" +
                        "\n" +
                        "Paano tukuyin ang\n" +
                        "Upang makilala ang mga golden apple snails mula sa katutubong snails, suriin ang kulay at laki nito.\n" +
                        "\n" +
                        "Ang mga golden apple snails ay may maputik na kayumanggi na shell at ginintuang pinkish o orange dilaw na laman. Ang mga ito ay mas malaki at mas magaan ang kulay kumpara sa mga katutubong snails. Ang mga itlog nito ay matingkad na kulay rosas ang kulay.\n" +
                        "\n" +
                        "\n" +
                        "Upang kumpirmahin ang pinsala sa snail, suriin kung may nawawalang burol, gupitin ang mga dahon, at gupitin ang mga tangkay.\n" +
                        "\n" +
                        "Pangalan ng siyentipiko\n" +
                        "Mayroong higit sa 100 species ng mansanas snail na umiiral.\n" +
                        "\n" +
                        "Ang dalawang species, ang Pomacea canaliculata at Pomacea maculata, ay lubhang nagsasalakay at nagdudulot ng pinsala sa mga pananim na palay.\n" +
                        "\n" +
                        "Karaniwang pangalan\n" +
                        "Golden snails\n" +
                        "\n" +
                        "Paano pangasiwaan ang\n" +
                        "Ang mahalagang panahon para pamahalaan ang mga golden apple snails ay sa panahon ng paghahanda ng lupa at pagtatatag o pagtatanim; Partikular, unang 10 araw pagkatapos ng transplanting, at unang 21 araw pagkatapos ng direktang wet seeding.\n" +
                        "\n" +
                        "Pagkatapos nito, ang pananim ay karaniwang lumalaban sa pinsala sa snail at ang mga snails ay talagang kapaki pakinabang sa pamamagitan ng pagpapakain sa mga damo.\n" +
                        "\n" +
                        "Pamamahala ng snail na nakabatay sa komunidad\n" +
                        "\n" +
                        "Upang pinakamahusay na kontrolin ang snail, ang mga komunidad ay dapat magtulungan upang mabawasan ang mga numero ng snail sa kanilang lugar.\n" +
                        "\n" +
                        "Magsagawa ng mass snail at egg collection campaigns, na kinasasangkutan ng buong komunidad, sa panahon ng paghahanda ng lupa at pagtatanim o crop establishment.\n" +
                        "Hangga't maaari ay pawiin ang mga bukid sa mahihinang yugto ng tanim na palay (sa ibaba ng 30 araw) o transplant ng 25-30 araw na mga punla mula sa mga low density nursery bed.\n" +
                        "Biological control\n" +
                        "\n" +
                        "Hikayatin ang mga likas na mandaragit.\n" +
                        "Ang mga pulang langgam ay kumakain ng mga itlog ng kuhol.\n" +
                        "Ang mga itik (at kung minsan ay daga) ay kumakain ng mga batang kuhol.\n" +
                        "Ilang wild bird species din ang kumakain ng golden snails.\n" +
                        "Ang mga kuhol ay maaari ring anihin, lutuin, at kainin o ibenta bilang feed ng hayop.\n" +
                        "Kontrol sa kultura\n" +
                        "\n" +
                        "Handpick snails at durog itlog masa.\n" +
                        "Panatilihin ang antas ng tubig sa ibaba 2 cm sa panahon ng mahina yugto ng halaman ng palay.\n" +
                        "Gumamit ng mga nakalalasong halaman tulad ng dahon ng tabako, heartleaf false pickerelweed, at dahon ng citrus sa mga strip sa buong bukid o sa mga canalette.\n" +
                        "Kung saan pumapasok ang tubig at iniiwan ang bukid, maglagay ng harang.\n" +
                        "\n" +
                        "Hangga't maaari, itanim ang palay sa bukid. Ang transplanted rice ay hindi gaanong mahina kaysa sa direct seeded rice.\n" +
                        "Kontrol ng kemikal\n" +
                        "\n" +
                        "Mag apply lamang ng mga produkto sa mga mababang spot at canalettes sa halip na sa buong patlang. Laging tiyakin ang ligtas na aplikasyon.\n" +
                        "Kung gagamitin, ang mga molluscicides ay dapat lamang gamitin kaagad pagkatapos ng transplanting o sa seedling establishment phase sa direct seeded rice; at para lang sa bigas na mas bata sa 30 days.\n" +
                        "Kasunod ng normal na rate ng aplikasyon ng pataba at iskedyul, mag aplay ng pataba sa 2 cm ng tubig upang i maximize ang mga negatibong epekto sa mga snails ng mansanas.\n" +
                        "Alamin ang higit pa\n" +
                        "Tingnan ang buong fact sheet:\n" +
                        "Golden apple snail sa IRRI Rice Knowledge Bank\n" +
                        "\n" +
                        "Ano ang ginagawa nito\n" +
                        "Ang mga golden apple snails ay kumakain ng mga batang at umuusbong na mga halaman ng bigas. Pinutol nila ang tangkay ng palay sa paanan, sinisira ang buong halaman.\n");

            } else if (pest.equals("Burit")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText(
                        "Bakit at saan ito nangyayari\n" +
                                "Ang staggered planting ay naghihikayat ng paglaki ng populasyon ng GLH.\n" +
                                "\n" +
                                "Ang mga berdeng leafhoppers ay karaniwan sa mga rainfed at irrigated wetland environment. Hindi sila laganap sa upland rice. Parehong ang mga nymph at matatanda ay kumakain sa dorsal surface ng mga blades ng dahon sa halip na ang ventral surface. Mas gusto nilang pakainin ang mga lateral leaves kaysa sa dahon ng dahon at sa gitnang dahon. Mas gusto rin nila ang mga tanim na palay na na fertilize ng malaking halaga ng nitrogen.\n" +
                                "\n" +
                                "Paano tukuyin ang\n" +
                                "Ang mga palayan na infested ng GLH ay maaaring magkaroon ng tungro, dilaw na dwarf, dahon ng dilaw na orage, at transitory yellowing diseases.\n" +
                                "\n" +
                                "Kabilang sa mga sintomas ang:\n" +
                                "\n" +
                                "stunted halaman at nabawasan ang sigla\n" +
                                "nabawasan ang bilang ng mga produktibong tagabukid\n" +
                                "natutuyo o kumpletong pagpapatayo ng halaman\n" +
                                "Ang mga pananim na nahawaan ng Tungro ay maaaring minsan ay malito sa nitrogen deficiency o iron toxicity o acid soils. Upang kumpirmahin ang sanhi ng problema, suriin para sa mga virus nahawaang halaman sa mga patlang, at ang pagkakaroon ng insekto:\n" +
                                "\n" +
                                "puti o maputla dilaw na itlog sa loob ng dahon sheaths o midribs\n" +
                                "dilaw o maputlang berdeng nymphs na may o walang itim na marka\n" +
                                "maputlang berdeng matatanda na may o walang itim na marka na kumakain sa itaas na bahagi ng pananim\n" +
                                "Pangalan ng siyentipiko\n" +
                                "Naranga aenescens (Moore)\n" +
                                "Paano pangasiwaan ang\n" +
                                "Gumamit ng mga varieties na lumalaban sa GLH at lumalaban sa tungro.\n" +
                                "Bawasan ang bilang ng mga pananim na palay sa dalawa kada taon at ang synchronized crop establishment sa buong mga sakahan ay binabawasan ang mga leafhopper at iba pang insect vectors.\n" +
                                "Itanim ang mas lumang mga seedlings (>3 linggo) upang mabawasan ang viral disease susceptibility na ipinadala ng mga leafhoppers.\n" +
                                "Plant maaga sa loob ng isang naibigay na panahon ng pagtatanim, lalo na sa dry season upang mabawasan ang panganib ng insekto vector sakit.\n" +
                                "Iwasan ang pagtatanim sa panahon ng rurok ng aktibidad ng GLH (ipinapakita ng mga talaan ng kasaysayan) upang maiwasan ang infestation. Ang mga light trap ay maaaring gamitin upang ipakita ang mga numero ng GLH.\n" +
                                "Mag apply ng nitrogen kung kinakailangan (hal., gamit ang LCC) upang maiwasan ang pag ambag sa pagsiklab ng populasyon sa pamamagitan ng paglalapat ng masyadong maraming nitrogen, o hadlang sa pagbawi ng halaman mula sa pinsala ng planthopper sa pamamagitan ng paglalapat ng hindi sapat na nitrogen.\n" +
                                "Kontrolin ang mga damo sa bukid at sa mga bunds upang alisin ang ginustong damo host ng GLH at nagtataguyod ng lakas ng pananim.\n" +
                                "Magsagawa ng crop rotation na may isang di palay crop sa panahon ng dry season upang mabawasan ang mga kahaliling host para sa mga sakit.\n" +
                                "\n" +
                                "Intercrop upland rice sa toyo upang mabawasan ang insidente ng leafhoppers sa bigas.\n" +
                                "Sa mga lugar na walang tungro source, hindi kailangan ng insecticides, iwasan ang pag spray ng insecticide (madalas ay hindi ito maiwasan o mabawasan ang mga impeksyon sa tungro)\n" +
                                "Hikayatin ang mga ahente ng biological control.\n" +
                                "Alamin ang higit pa\n" +
                                "Tingnan ang buong fact sheet:\n" +
                                "Green leafhopper sa IRRI Rice Knowledge Bank\n" +
                                "\n" +
                                "Ano ang ginagawa nito\n" +
                                "Ang mga green leafhoppers ang pinaka karaniwang leafhoppers sa mga palayan at pangunahing mahalaga dahil ipinapalaganap nito ang viral disease na tungro. Parehong nymphs at matatanda feed sa pamamagitan ng pagkuha ng halaman katas sa kanilang mga karayom hugis mouthparts.\n");


            } else if (pest.equals("Daga")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText("Bakit at saan ito nangyayari\n" +
                        "Ang daga ay nangyayari sa mababang lupain na irigasyon ng mga pananim na palay. Parehong ang wet at dry season ay paborable para sa daga pagpaparami at crop pinsala. Sa rainfed rice crops rodents ang kanilang pinakamalaking epekto sa wet season. Ang pagkakaroon ng pagkain, tubig, at tirahan ay mga kadahilanan, na nagbibigay ng pinakamainam na kondisyon ng breeding. Ang pagkakaroon ng mga damong damo ay nag trigger din ng kanilang pag unlad.\n" +
                        "\n" +
                        "Ang mga daga sa palayan ay kumakain sa gabi na may mataas na aktibidad sa takipsilim at bukang liwayway. Sa araw, matatagpuan ang mga ito sa gitna ng mga halaman, damo, o mga bukid ng pagtanda. Sa panahon ng fallow period, ginagamit nila ang mga pangunahing daluyan at hardin ng nayon bilang mga pangunahing tirahan. Sa pagbubukid, 75% ng oras sila ay nasa mga burrow sa kahabaan ng mga bangko at pagkatapos ng maximum na pagbubukid, 65% ng oras na sila ay nasa mga palayan.\n" +
                        "\n" +
                        "Paano tukuyin ang\n" +
                        "Ang pagpapakain ng daga ay maaaring maging sanhi ng mga sumusunod na pinsala:\n" +
                        "\n" +
                        "Nawawalang mga buto ng germinating\n" +
                        "Mga nawawalang burol\n" +
                        "Tinadtad na mga batang seedlings\n" +
                        "Mga nawawalang halaman\n" +
                        "Irregular cuttings ng stem\n" +
                        "Chewed pagbuo buds o hinog butil\n" +
                        "Tillers cut malapit sa base sa 45° anggulo\n" +
                        "Pagbubungkal ng mga tangkay\n" +
                        "Naantala ang maturity ng butil\n" +
                        "Nawawalang mga butil\n" +
                        "Nawawalang mga panicles\n" +
                        "Ang pinsala sa pagpapakain sa tangkay na dulot ng mga daga sa palayan ay maaaring kahawig ng pinsala ng insekto bagaman ang pinsala sa daga ay karaniwang nakikilala sa pamamagitan ng malinis na hiwa sa 45° ng tagapag-alaga. Ang pinsala sa mga butil ay katulad ng pagkasira ng ibon.\n" +
                        "\n" +
                        "Suriin ang mga maputik na lugar para sa mga runway, aktibong burrows, at footprints ng mga daga sa palayan. Ang mga ito ay karaniwang malapit sa pinsala na kanilang nilikha.\n" +
                        "Suriin kung may mga daga sa palayan: gupitin ang mga tiller at aktibong butas sa mga bunds na nakapalibot sa mga bukid.\n" +
                        "\n" +
                        "Hangga't maaari, mahuli ang mga daga upang matukoy ang mga species. Maglagay ng mga bitag sa kahabaan ng mga runway, o hukayin ang mga daga mula sa kanilang mga burrows.\n" +
                        "Pangalan ng siyentipiko\n" +
                        "Rattus argentiventer Robinson at Kloss, R. exulans Peale, R. rattus spp., R. tanezumi\n" +
                        "Paano pangasiwaan ang\n" +
                        "Epektibong kontrol ng komunidad\n" +
                        "\n" +
                        "Pagbaha, paghuhukay, o pag fumagate sa mga burrow ng daga\n" +
                        "Matakot ang mga daga sa labas ng mga lugar na may mataas na vegetation cover o sa paligid ng mga nayon (gamit ang netting, aso, club, at iba pa upang mahuli ang mga daga)\n" +
                        "Gumamit ng mga aso upang mahanap ang mga aktibong burrows ng daga, pagkatapos ay gawin ang Hakbang 1\n" +
                        "Hunt daga sa gabi gamit ang flashlights, clubs, bow and arrows, at netting\n" +
                        "Magtakda ng mga lokal na kill-traps sa kahabaan ng runways ng daga\n" +
                        "Gumamit ng mga rehistradong lason sa daga na inilalagay sa mga covered bait station (ngunit hindi kung saan madaling ma access ang mga bata, alagang hayop, o hayop).\n" +
                        "Mga aksyon sa pamamahala\n" +
                        "\n" +
                        "Panatilihin ang mga bunds ng palay (mga bangko) sa mga pananim na mas mababa sa 30 cm ang lapad upang maiwasan ang mga daga mula sa paghuhukay.\n" +
                        "Panatilihing malinis at walang matataas na damo at taguan para sa daga ang mga gilid ng bukid, bunds, at mga karatig lugar.\n" +
                        "Magtanim kasabay ng inyong mga kapitbahay—sa loob ng 2 linggo mula sa isa't isa.\n" +
                        "Estratehikong paggamit ng Trap Barrier System (TBS)—sa panahon ng bigas na may pinakamaraming pinsala sa rodent.\n" +
                        "Panatilihing malinis ang paligid ng mga bukid, bahay, at nayon — walang tambak na kahoy o brush, walang tambak ng basura, walang mga lugar na may damo.\n" +
                        "Panatilihing malinis ang mga tindahan ng butil at karatig lugar.\n" +
                        "Alamin ang higit pa\n" +
                        "Tingnan ang buong fact sheet:\n" +
                        "Daga sa IRRI Rice Knowledge Bank\n" +
                        "\n" +
                        "Ano ang ginagawa nito\n" +
                        "Palayan daga cut o pull up transplanted halaman. Nagpuputol din sila ng mga batang punla. Sa yugto ng pagkahinog, kumakain sila sa pagbuo ng mga usbong ng bigas.\n");

            } else if (pest.equals("Atangya")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText(
                        "Bakit at saan ito nangyayari\n" +
                                "Ang mataas na populasyon ng bug ng bigas ay dala ng mga kadahilanan tulad ng kalapit na kagubatan, malawak na mga lugar ng damo na malapit sa mga palayan, mga ligaw na damo na malapit sa mga kanal, at staggered rice planting. Nagiging aktibo rin ang insekto kapag nagsimula na ang pag ulan sa buwan. Ang mainit na panahon, maulap na kalangitan, at madalas na pagtulo ay pabor sa pag iipon ng populasyon nito.\n" +
                                "\n" +
                                "Ang populasyon ng bug ng bigas ay tumataas sa pagtatapos ng tag ulan.\n" +
                                "\n" +
                                "Ang mga bugs ng bigas ay matatagpuan sa lahat ng mga kapaligiran ng bigas. Mas karaniwan ang mga ito sa rainfed at upland rice at mas gusto ang pamumulaklak sa milky stage ng ani ng palay. Ang mga matatanda ay aktibo sa panahon ng huling bahagi ng hapon at madaling araw. Sa ilalim ng maliwanag na sikat ng araw, nagtatago sila sa mga lugar na damo. Ang mga ito ay hindi gaanong aktibo sa panahon ng tagtuyot. Sa mas malamig na lugar, ang mga matatanda ay sumasailalim sa aestivation o diapause sa mga damo. Kumakain sila ng mga ligaw na host sa loob ng isa hanggang dalawang henerasyon bago lumipat sa palayan sa mga yugto ng pamumulaklak. Ang mga nymph ay matatagpuan sa halaman ng palay kung saan sila ay naghahalo sa mga dahon. Doon, madalas na hindi sila napapansin. Kapag nabalisa, ang mga nymph ay bumaba sa mas mababang bahagi ng mga halaman at ang mga matatanda ay lumilipad sa loob ng maikling distansya.\n" +
                                "\n" +
                                "Paano tukuyin ang\n" +
                                "Suriin kung may pinsala sa pagpapakain:\n" +
                                "\n" +
                                "Maliit o nakunot na butil\n" +
                                "Deformed o spotty butil\n" +
                                "Walang laman na butil\n" +
                                "Magtayo ng mga panicles\n" +
                                "Ang mga sintomas ay maaaring malito sa pinsala na dulot ng kakulangan sa sustansya o thrip ng bulaklak. Upang kumpirmahin ang rice bug infestation, suriin ang pagkakaroon ng insekto:\n" +
                                "\n" +
                                "oval, makintab, at mapula kayumanggi itlog sa kahabaan ng midrib ng dahon\n" +
                                "payat at kayumanggi-berde nymphs at matatanda pagpapakain sa endosperm ng bigas butil\n" +
                                "nakakasakit na amoy\n" +
                                "Pangalan ng siyentipiko\n" +
                                "Ang pinaka karaniwang species ng rice bug ay Leptocorisa oratorius F. at Leptocorisa acuta Thunberg.\n" +
                                "\n" +
                                "Paano pangasiwaan ang\n" +
                                "Alisin ang mga damo sa mga bukid at karatig lugar upang maiwasan ang pagpaparami ng mga bugs ng palay sa panahon ng fallow period.\n" +
                                "Ang antas ng mga patlang na may kahit na mga aplikasyon ng pataba at tubig hikayatin ang palay na lumago at umunlad ay sa parehong rate. Ang pagtatanim ng mga bukid, sa loob ng isang barangay, kasabay nito (synchronous planting) ay nakakatulong din sa pagbabawas ng problema sa rice bug.\n" +
                                "Ang pagkuha ng mga bug ng bigas, sa madaling araw o huli na hapon, sa pamamagitan ng net ay maaaring maging epektibo sa mababang densities ng bug ng bigas, bagaman ang labor intensive.\n" +
                                "Hikayatin ang mga biological control agent: Ang ilang mga wasps, grasshoppers at spiders ay umaatake sa mga bugs ng bigas o itlog ng rice bug. Ang walang pili pili na paggamit ng insecticide ay nakakagambala sa biological control, na nagreresulta sa muling pagbangon ng peste.\n" +
                                "Para sa chemical control\n" +
                                "\n" +
                                "Bago gumamit ng isang pestisidyo makipag ugnay sa isang espesyalista sa proteksyon ng crop para sa mga mungkahi, gabay, at babala na partikular sa iyong sitwasyon.\n" +
                                "\n" +
                                "Simulan ang pag-scout sa bukid bago mamulaklak at magpatuloy araw-araw hanggang sa mahirap na yugto ng masa. Bilangin ang mga bugs ng bigas sa madaling araw o huli ng hapon mula sa 20 burol habang naglalakad nang dayagonal sa isang transplanted field. Ang mga matatanda ay madalas na lumilipad sa labas ng paraan bago mo maabot ang halaman ng palay, kaya ang mga bilang ay maaaring magbunyag lamang ng mga immature form. Maaaring kailanganin ang direktang kontrol kung mayroong higit sa 10 rice bugs/20 burol.\n" +
                                "Ang pagpili ng insecticide ay depende sa maraming mga kadahilanan tulad ng mga kagamitan sa application na magagamit, gastos ng insecticide, karanasan ng applicator, o pagkakaroon ng isda. Ang mga benepisyo ng paggamit ng isang insecticide ay dapat timbangin laban sa mga panganib sa kalusugan at kapaligiran.\n" +
                                "Alamin ang higit pa\n" +
                                "Tingnan ang buong fact sheet:\n" +
                                "Palay bug sa IRRI Rice Knowledge Bank\n" +
                                "\n" +
                                "Ano ang ginagawa nito\n" +
                                "Ang mga bug ng bigas ay nakakasira sa bigas sa pamamagitan ng pagsipsip ng mga nilalaman ng pagbuo ng mga butil, mula sa mga spikelet bago namumulaklak hanggang sa malambot na yugto ng masa. Ang mga immature at adult rice bugs ay parehong kumakain sa mga butil ng bigas.\n");


            } else if (pest.equals("Ulalo sa ugat")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText(
                        "Bakit at saan ito nangyayari\n" +
                                "Ang dry spells at ang pagkakaroon ng mga damong damo na nagtataglay ng pesteng insekto na ito ay pabor sa pag iipon ng populasyon ng rice mealybug. Gayundin, ang mahusay na pinatuyo na mga lupa ay angkop din para sa mga pesteng insekto.\n" +
                                "\n" +
                                "Ang rice mealybug ay matatagpuan sa upland at rainfed na kapaligiran. Hindi ito karaniwan sa mga irrigated rice. Ito ay nangyayari sa malaking bilang sa panahon ng tag ulan.\n" +
                                "\n" +
                                "Ang mga nymph ay aktibo hanggang sa mag molt sila. Nananatili muna sila sa ilalim ng katawan ng babaeng nasa hustong gulang at kalaunan ay gumagapang mula sa halaman patungo sa halaman. Sila ay din dispersed sa pamamagitan ng hangin. Pagkatapos ng dispersal, nananatili sila sa pagitan ng dahon ng sheath at stem upang pakainin at makumpleto ang kanilang buong pag unlad ng larval. Pagkatapos ng molting, ang babae attaches mismo sa halaman para sa buhay at lumalaki sa laki.\n" +
                                "\n" +
                                "Ang mga adult females ay nananatiling nakatayo at nagpapakain habang ang may pakpak na adult male ay lumilipad.\n" +
                                "\n" +
                                "Ang insekto ay masagana sa Abril hanggang unang bahagi ng Hulyo kung saan dalawang henerasyon ang nakumpleto sa panahong ito.\n" +
                                "\n" +
                                "\n" +
                                "Paano tukuyin ang\n" +
                                "Ang pinsala sa Mealybug ay nagiging sanhi ng:\n" +
                                "\n" +
                                "Wilting\n" +
                                "Plant stunting\n" +
                                "Dilaw na kulot na dahon\n" +
                                "Nasira spot o chakdhora o soorai sakit\n" +
                                "Wala itong pare pareho na pattern ng pinsala.\n" +
                                "\n" +
                                "\n" +
                                "Ang stunting ay isa ring damage symptom na dulot ng ibang insect pests tulad ng root grubs at rice root aphids. Upang kumpirmahin ang sanhi ng pinsala, tingnan kung may insekto:\n" +
                                "\n" +
                                "hyaline sa yellowish sa pinkish eggs\n" +
                                "crawlers o nymphs, walang pakpak pink na babaeng matatanda at may pakpak maputla dilaw na lalaki pag aalis ng halaman katas\n" +
                                "hitsura ng waks na sumasaklaw sa mga itlog, nymphs at matatanda na dumikit sa stem o dahon\n" +
                                "Pangalan ng siyentipiko\n" +
                                "Brevennia rehi (Lindinger)\n" +
                                "Paano pangasiwaan ang\n" +
                                "Kung maaari, ang mga pangkalahatang pagpipilian sa pamamahala para sa toxicity ng Mn ay:\n" +
                                "\n" +
                                "Sa isang katamtamang klima, coat buto na may oxidants (hal., Ca peroxide) upang mapabuti ang germination at paglitaw ng seedling sa pamamagitan ng pagtaas ng supply ng oxygen.\n" +
                                "Pamahalaan ang tubig nang mahusay. \n" +
                                "Balansehin ang paggamit ng mga pataba (NPK o NPK + apog) upang maiwasan ang nutrient stress bilang pinagmumulan ng toxicity ng Mn.\n" +
                                "Mag recycle ng dayami o abo para mapunan ang Si at K na tinanggal sa bukid\n" +
                                "Alamin ang higit pa\n" +
                                "Tingnan ang buong fact sheet:\n" +
                                "Mealy bug sa IRRI Rice Knowledge Bank\n" +
                                "\n" +
                                "Ano ang ginagawa nito\n" +
                                "Parehong matanda at nymph mealybugs alisin ang halaman ng katas sa pamamagitan ng pagsipsip. Nagreresulta ito sa pagkukulot ng mga dahon at paglamlam ng mga halaman.\n");

            } else if (pest.equals("Aksip")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText("Bakit at saan ito nangyayari\n" +
                        "Ang yellow stem borer ay isang peste ng deepwater rice. Matatagpuan ito sa mga aquatic environment kung saan patuloy ang pagbaha. Ikalawang instar larvae enclose ang kanilang sarili sa katawan dahon wrappings upang gumawa ng mga tubo at ihiwalay ang kanilang sarili mula sa dahon at bumaba sa ibabaw ng tubig. Ikinakabit nila ang kanilang sarili sa tagapag-alaga ng lupa at nagdadala sa tangkay.\n" +
                        "\n" +
                        "Ang striped stem borer ay pinaka sagana sa mga bansang temperate at sa mga lugar na hindi binabaha. Ang kanilang mga huling instar ay nananatiling dormant sa mga lugar na may katamtamang panahon ng taglamig.\n" +
                        "\n" +
                        "Ang pink stem borer ay matatagpuan sa upland rice, na kung saan ay lumago malapit sa sugarcane o kaugnay na grasses. Ang pagkakaroon ng mga kahaliling host ay naghihikayat sa pink stem borer na bumuo, dumami at mabuhay sa panahon ng taglamig o tuyong panahon. Hindi tulad ng iba pang mga species ng stemborers, ang pink Stem borer ay may mga hubad na itlog na inilatag sa pagitan ng dahon sheath at ang tangkay.\n" +
                        "\n" +
                        "Mataas na nitrogenous field pinapaboran populasyon buildup ng stem borers. Ang mga bukid na nakatanim ay kalaunan ay pabor sa mas maraming pinsala ng pesteng insekto na nagtayo sa mga bukid na nauna nang nakatanim. Stubble na nananatili sa patlang ay maaaring harbor stem borer larvae at o pupae.\n" +
                        "\n" +
                        "Paano tukuyin ang\n" +
                        "Suriin ang patlang para sa mga sumusunod na sintomas ng pinsala:\n" +
                        "\n" +
                        "Deadhearts o patay na tagabukid na madaling mahila mula sa base sa panahon ng vegetative stages\n" +
                        "Whiteheads sa panahon ng reproductive stage kung saan ang mga umuusbong na panicles ay whitish at unfilled o walang laman\n" +
                        "Maliliit na butas sa mga tangkay at mga nagbubukid\n" +
                        "Frass o fecal bagay sa loob ng nasira stems\n" +
                        "Ang mga sintomas ng deadhearts at whiteheads ay maaaring minsan ay malito sa mga pinsala na dulot ng daga, pagsabog ng leeg, at mga sakit sa itim na bug.\n" +
                        "\n" +
                        "Upang kumpirmahin stem borer pinsala, biswal inspeksyon rice crop para sa deadhearts sa vegetative yugto at whiteheads sa reproductive yugto. Stems ay maaaring pulled at dissected para sa larvae at pupae para sa kumpirmasyon ng stem borer pinsala.\n" +
                        "\n" +
                        "Pangalan ng siyentipiko\n" +
                        "Ang sumusunod na stemborer species ay nagdudulot ng bigas: dilaw na stem borer (YSB), Scirpophaga incertulas; white stem borer (WSB), S. innotata; guhitan stem borer (SSB), Chilo suppressalis; Gold-fringed stem borer, C. auricilius; Dark headed stem borer, C. polychrysus; at, Pink stem borer, Sesamia inferens\n" +
                        "\n" +
                        "Karaniwang pangalan\n" +
                        " \n" +
                        "Paano pangasiwaan ang\n" +
                        "Gumamit ng mga lumalaban na varieties\n" +
                        "Sa seedbed at transplanting, handpick at sirain ang mga masa ng itlog\n" +
                        "Itaas ang antas ng tubig sa patubig pana-panahon upang lumubog ang mga itlog na naideposito sa mas mababang bahagi ng halaman\n" +
                        "Bago mag transplant, gupitin ang dahon upang mabawasan ang pagdadala ng mga itlog mula sa seedbed hanggang sa bukid\n" +
                        "Tiyakin ang tamang tiyempo ng pagtatanim at synchronous planting, ani ng mga pananim sa ground level upang matanggal ang larvae sa stubble, alisin ang mga stubble at magboluntaryo ng bigas, araro at bahain ang bukid\n" +
                        "Hikayatin ang mga biological control agent: braconid, eulophid, mymarid, scelionid, chalcid, pteromalid at trichogrammatid wasps, ants, lady beetles, staphylinid beetles, gryllid, green meadow grasshopper, at mirid, phorid at platystomatid flylies, bethylid, braconid, elasmid, eulophid, eurytomid at ichneumonid wasps, carabid at lady bird beetles, chloropid fly, gerrid at pentatomid bugs, ants, at mga mite, earwigs, ibon, asilid fly, vespid wasp, dragonflies, damselflies, at spiders\n" +
                        "Ang mga bakterya at fungi ay nakakahawa rin sa larvae: mermithid nematode, chalcid, elasmid at eulophid\n" +
                        "Mag apply ng nitrogen fertilizer sa split kasunod ng inirerekumendang rate at oras ng application.\n" +
                        "Alamin ang higit pa\n" +
                        "Tingnan ang buong fact sheet:\n" +
                        "Stem borer sa IRRI Rice Knowledge Bank\n" +
                        "Ano ang ginagawa nito\n" +
                        "Ang stem borers ay maaaring sirain ang palay sa anumang yugto ng halaman mula sa seedling hanggang sa maturity.\n" +
                        "\n" +
                        "Kumakain sila sa mga nagbubukid at nagiging sanhi ng deadheart o pagkatuyo ng central tiller, sa panahon ng vegetative stage; at nagiging sanhi ng whiteheads sa reproductive stage.\n");


            } else if (pest.equals("Bukbok")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText(
                        "Bakit at saan ito nangyayari\n" +
                                "Ang mga weevil ay naaakit sa mainit at mamasa masang kapaligiran. Sila ay lumalabas sa huling bahagi ng tagsibol at naghahanap ng kanlungan sa mainit, tuyong buwan ng Hunyo at Hulyo, naghahanap ng mga lugar upang magparami at mangitlog. Kung pumasok sila sa inyong tahanan, naaakit sila sa mga butil at iba pang pagkain at infest ang mga ito. Kung makakakuha ka ng pagkain na puno ng weevil, ang pag init nito sa temperatura ng kuwarto ay maaaring magsulong ng mabilis na paglago ng weevils, na nagiging sanhi ng infestation.\n" +
                                "\n" +
                                " Paano tukuyin ang\n" +
                                " -Ang mga weevil ay maliliit na beetle na may kapansin pansin na mga ilong.\n" +
                                " -Ang mga ito ay kadalasang bombilya- o peras-hugis.\n" +
                                " -Ang mga immature, legless, grub-like larvae feed sa mga halaman.\n" +
                                " -Ang mga weevil ng matatanda ay naghahanap ng kanlungan sa hindi magandang kondisyon ng panahon,lalo na kapag mainit at tuyo.\n" +
                                "-Ang mga weevil ay pumapasok sa mga gusali sa pamamagitan ng pag-crawl sa mga bitak o butas sa paligid ng mga pundasyon, pinto at bintana.\n" +
                                " -Ang mga ito ay isang pansamantalang kaguluhan.\n" +
                                " \n" +
                                "Paano pangasiwaan ang\n" +
                                " -Limang itim na beetles na may pahaba snouts, dalawang antennae at anim na binti bawat isa.\n" +
                                " -Strawberry ugat weevils\n" +
                                " -Ang pagpipigil sa mga weevil ay ang pinakamainam na paraan ng pagkontrol.\n" +
                                " -Caulk bitak at matiyak snug-fitting screen at pinto upang mabawasan ang bilang ng mga weevils na maaaring pumasok sa isang gusali.\n" +
                                " -Ang mga weevil, lalo na ang strawberry root weevils, ay naaakit sa kahalumigmigan. Maaari mong bitag ang mga ito sa mababaw na kawali ng tubig na inilagay sa paligid ng mga pundasyon o pader ng bahay.\n" +
                                "-Ang mga kawaling ito ay hindi nakakakuha ng sapat na mga weevil para mabawasan ang bilang ng mga weevil na pumapasok sa mga tahanan.                \n" +
                                "\t\t\t          Matuto nang higit pa\n" +
                                "Tingnan ang buong fact sheet:\n" +
                                "Tubig weevil sa IRRI Rice Knowledge Bank\n" +
                                "Ano ang ginagawa nito\n" +
                                "Ang weevil ay isang uri ng beetle mula sa Curculionoidea superfamily123. Karaniwang maliliit ang mga ito, mas mababa sa 6 milimetro ang haba, at herbivorous12. Ang mga weevil ay kilala sa kanilang pahaba na ilong at kadalasang tinatawag na snout beetle123. Ang mga ito ay may iba't ibang kulay at may libu libong uri ng weevil34. Ang mga immature larvae ay kumakain sa mga halaman, habang ang mga adult weevil ay naghahanap ng kanlungan sa hindi kanais nais na kondisyon ng panahon5.\n");

            } else if (pest.equals("Puting nguso")) {
                tView.setMovementMethod(new ScrollingMovementMethod());
                tView.setText(
                        "\n" +
                                "Bakit at saan ito nangyayari\n" +
                                "Ang mga puting planthoppers ay karaniwang napansin dahil sa puti, malunggay secretions ng mga nymph, na maaaring ganap na maitago ang insekto. Ang malunggay na materyal na ito ay naiwan sa mga dahon at tangkay kapag ang matanda ay lumabas o kapag ang nymph ay nabalisa at tumalon palayo. Ang mga matatanda ay din snowy puti. Ang malunggay secretion ng nymphs kahawig na ng mealybugs, lana aphids, at ilang mga soft scale insekto itlog masa. Gayunpaman, kung ang snowy planthopper nymph ay nabalisa, madalas itong tumalon para sa ilang pulgada samantalang ang mealybugs, aphids, at malambot na kaliskis ay nakaupo at gumapang nang dahan dahan kung sa lahat kapag nabalisa.\n" +
                                "                            \n" +
                                "Paano tukuyin ang\n" +
                                "Maghanap ng isang puting planthopper na may natatanging puting linya sa gitna ng tatsulok na kalasag na sumasaklaw sa bahagi ng ulo at thorax. Maghanap ng mga halaman na may sooty moulds sa paanan ng halaman, at iba pa na nalalanta, natuyo at gumuho dahil sa hopperburn\n" +
                                "Paano pangasiwaan ang\n" +
                                "NATURAL NA MGA KAAWAY\n" +
                                "Ang white-backed planthopper ay karaniwang kinokontrol ang mirid bug, Cyrtorhinus lividipennis (tingnan ang Fact Sheet blg. 419). Gayunpaman, ang balanse ay maaaring mabalisa kung ang malawak na spectrum insecticides ay ginagamit upang kontrolin ang planthopper o iba pang mga peste.\n" +
                                "\n" +
                                "KONTROL SA KULTURA\n" +
                                "Bago magtanim:\n" +
                                "                       \n" +
                                "Layunin na magtanim ng mga kalapit na bukid sa loob ng 3 linggo ng bawat isa, upang maiwasan ang mga magkakapatong na pananim, at paggalaw ng mga planthoppers sa pagitan ng mga patlang.\n" +
                                "Sa panahon ng paglago:\n" +
                                "Subaybayan na may ilaw bombilya sa ibabaw ng kawali ng tubig ang layo mula sa nursery at sa labas ng patlang.\n" +
                                "Ilapat ang nitrogen sa split doses, pagiging maingat na hindi lumampas sa mga lokal na rekomendasyon.\n" +
                                "Magtanim lamang ng dalawang pananim bawat taon, at gumamit ng mga varieties na maagang maturing.\n" +
                                "Alisan ng tubig ang mga patlang sa loob ng 3 o 4 na araw kung ang mga mabibigat na infestation ay nangyayari.\n" +
                                "Pagkatapos ng anihan:\n" +
                                "Huwag ratoon ang crop, ibig sabihin, hindi ito ay maaaring regrowand patuloy na lumalaki pagkatapos ng ani.\n" +
                                "Araruhin ang bukid pagkatapos ng anihan, alisin ang mga dawag na kung hindi man ay magpapahintulot sa mga planthopper na magpatuloy sa breed.\n" +
                                "MGA LUMALABAN NA VARIETIES\n" +
                                "Ang mga mapagparaya na varieties ay umiiral, at ang mga ito ay bahagi ng isang programa ng IPM para sa planthopper na ito na kinabibilangan ng mga panukalang kontrol sa kultura at maingat na paggamit ng mga insecticides upang mapanatili ang mga likas na kaaway, mahalaga ang bug ng bigas, Cyrtorhinus lividipennis.\n" +
                                "KONTROL NG KEMIKAL\n" +
                                "Ang rekomendasyon ng IRRI ay gumamit lamang ng mga pestisidyo sa nursery (seedbed) kung: i) higit sa isang planthopper bawat stem, o ii) mas maraming planthoppers kaysa sa mga natural na kaaway.\n" +
                                "                \n" +
                                "Kung gumagamit ng insecticide, iwasan ang magkakasunod na paggamit ng parehong produkto. Kung may ibang insekto, huwag gumamit ng mga produktong malawak ang spectrum lalo na sa unang bahagi ng panahon. Subukan mong gamitin ang mga mas tiyak para sa mga peste na sinusubukan mong pamahalaan. Isaalang alang ang epekto ng insecticides sa parasitoids at predators, lalo na maaga sa dahilan. Ang muling pagbangon ay isang karaniwang problema pagkatapos ng paglalapat ng malawak na spectrum na mga insectides habang sinisira nila ang mga likas na kaaway.\n" +
                                "                          \n" +
                                "Kapag gumagamit ng pestisidyo, laging magsuot ng proteksiyon na damit at sundin ang mga tagubilin sa label ng produkto, tulad ng dosis, tiyempo ng aplikasyon, at agwat ng pre harvest.\n" +
                                "                           \n" +
                                "Matuto nang higit pa\n" +
                                "\n" +
                                "Tingnan ang buong fact sheet:\n" +
                                "White Planthopper sa IRRI Rice Knowledge Bank\n" +
                                "                          \n" +
                                "Ano ang ginagawa nito\n" +
                                "Ang mga White Planthopper ay laterally flattened at hawak ang kanilang malawak na pakpak nang patayo, sa isang fashion na parang tent, na nagkukubli sa mga gilid ng katawan at bahagi ng mga binti. [3] Ang White Planthopper ng maraming fulgoroids ay gumagawa ng waks mula sa mga espesyal na glandula sa terga ng tiyan at iba pang bahagi ng katawan. Ang mga ito ay hydrophobic at tumutulong sa pagtatago ng mga insekto. Ang mga adult females ng maraming pamilya ay gumagawa rin ng wax na maaaring gamitin upang maprotektahan ang mga itlog. [4]  \n");


            }}
        return super.onOptionsItemSelected(item1);

    }

}