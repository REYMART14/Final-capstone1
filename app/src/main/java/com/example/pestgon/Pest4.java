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

public class Pest4 extends AppCompatActivity {

    private ImageButton camera1;
    private ImageButton home1;
    TextView tView;
    TextView tView1;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pest4);

        tView = findViewById(R.id.textview1);
        tView1 = findViewById(R.id.textview2);
        image = findViewById(R.id.view23) ;


        Intent intent = getIntent();
        tView.setText(intent.getStringExtra("select"));
        tView1.setText(intent.getStringExtra("select"));
        image.setImageResource(intent.getIntExtra("image", 0));
        String pest = tView.getText().toString();

        if(pest.equals("Langgam")){
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText(
                    "Scientific name\n" +
                            "Solenopsis geminata (Fabricius)\n" +
                            "Ano ang nagagawa nito\n" +
                            "Kinakain ng mga langgam ang mga binhi at mga punla kaya nawawala ang mga ito sa taniman.\n" +
                            "\n" +
                            "Naapektuhan nito ang tindig ng halaman at pinapataas ang posibilidad ng pagkakaroon ng sakit na dulot ng Homoptera insects tulad ng mga ngusong kabayo, dapulak, at mga aphids.\n" +
                            "\n" +
                            "Bakit at saan ito nangyayari\n" +
                            "Maraming mga langgam sa mga palayang katihan o upland kung saan naninirahan o namumugad sila sa ilalim ng lupa. Sa mga sahod-ulang palayan naman, namumugad sila sa mga pilapil.\n" +
                            "\n" +
                            "Ang pinsala ng mga langgam ay patse-patse. Madalas silang manginain habang ang mga pananim ay punla pa lamang.\n" +
                            "\n" +
                            "Paano ito matutukoy\n" +
                            "Tingnan kung may nawawalang pananim at kung nababawasan ang tindig ng pananim.\n" +
                            "\n" +
                            "Ang pinsalang ito ay kahalintulad sa sintomas ng panginginain ng suhong (mole cricket). Para malaman ang pagkakaiba, suriin kung mayroong mga langgam sa palayan.\n" +
                            "\n" +
                            "Ang mga langgam ay kalimitang makikita sa mga bahaging may pinsala. May mga binhi naman na makikita sa mga pugad ng mga langgam.\n" +
                            "\n" +
                            "Bakit ito mahalaga\n" +
                            "Ang mga langgam ay hindi masyadong nakapipinsala sa palay. Kapag hindi malala ang pinsala, ang palay ay maaari pang makabawi mula sa pamiminsala nito.\n" +
                            "\n" +
                            "Paano ito pangangasiwaan\n" +
                            "Para mabawasan ang pagkasira dahil sa mga langgam, dagdagan ang bilang ng mga binhing tinatanim.\n" +
                            "\n" +
                            "Ang mga langgam ay maaring mapinsala ng mga nematode, fungus, langaw, mga strepsipteran at eucharitine wasps. Sila din ay kinakain ng mga ibon, ahas, palaka at butiking lupa.\n");

        }else if(pest.equals("Harabas")){
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText("Ang mga harabas o armyworm ay mga uod na umaatake sa palayan. May tatlong uri ng armyworm na umaatake ng palayan sa Asya. Ito ay ang rice swarming caterpillar, common cutworm, at ang rice ear-cutting caterpillar.\n" +
                    "\n" +
                    "Ang isang pangingitlog ng armyworm ay naglalaman ng daan-daang mga itlog. Ang bawat babaeng armyworm ay nangingitlog ng 800-1000 na itlog sa buong buhay nito na nagtatagal lamang ng humigit-kumulang isang linggo.\n" +
                    "\n" +
                    "Scientific name\n" +
                    " \n" +
                    "\n" +
                    "Ano ang nagagawa nito\n" +
                    "Kumakain ang armyworm ng palay sa pamamagitan ng pagputol ng dahon at batang punla sa punong bahagi ng pananim. Napuputol rin ng mga armyworm ang mga uhay.\n" +
                    " \n" +
                    "\n" +
                    "Bakit at saan ito nangyayari\n" +
                    "Ang mga armyworm ay mas nabubuhay at nakapangingitlog sa mga temperaturang hindi lalagpas sa 15°C, at kapag natural ang ginamit na abono. Ang panahon ng tagtuyot na nasundan ng malakas na pag-ulan at ang presensya ng ibang pananim na pwedeng tirahan ng armyworm ay nakatutulong din sa paglaki ng mga ito.\n" +
                    "\n" +
                    "Ang armyworms ay aktibo sa gabi.\n" +
                    "\n" +
                    "Ang uod ng armyworm ay karaniwang kumakain sa itaas na bahagi ng palay tuwing maulap o kung gabi; ang mga armyworm naman ay nanginginain, nagpaparami, at lumilipat sa ibang lugar kung gabi. Sa araw naman, ang mga armyworm ay nagpapahinga sa ibabang bahagi ng pananim.\n" +
                    "\n" +
                    "Sa mga tuyong palayan, ang pyupa ng armyworm ay matatagpuan sa lupa o sa ibabang bahagi ng palay. Sa mga basang palayan naman, ang mga pyupa ay nasa mismong pananim o sa madadamong bahagi sa tabihan ng bukid.\n" +
                    "\n" +
                    "Paano ito matutukoy\n" +
                    "Tingnan kung may pinsalang dulot ng panginginain.\n" +
                    "\n" +
                    "Ang mga armyworm ay kumakain ng mga dulo at gilid ng dahon. Maaari nilang maubos ang buong dahon at iwanan lamang ang gitnang ugat (midrib).\n" +
                    "\n" +
                    "Ang pinsalang dulot ng armyworm ay maaaring pagkamalang pinsala ng mampuputol (cutworm). Ang pinsalang dulot ng armyworm ay ang pagkatanggal ng mga dahon. Upang matiyak ang dahilan ng pinsala, tingnan kung mayroong mga armyworm at mga itlog nito.\n" +
                    "\n" +
                    "Bakit ito mahalaga\n" +
                    "Ang harabas ay maaaring maging suliranin sa lahat ng yugto ng paglaki ng palay.\n" +
                    "\n" +
                    "Ang pagkawala ng ani ay maaaring mangyari kung mataas ang populasyon ng armyworm. Nagiging mapaminsala ito at maaaring magdulot ng malaking pagkasira sa pananim.\n" +
                    "\n" +
                    "Sa mga panahong lubhang mataas ang bilang ng armyworm, nagpapalipat-lipat ang mga ito sa mga bukid upang manginain at maminsala sa mga pananim.\n" +
                    "\n" +
                    "Paano ito pangangasiwaan\n" +
                    "Ang pagpapataas ng tubig sa punlaan ay ang pinakamabisang paraan ng paglaban sa mga armyworm.\n" +
                    "\n" +
                    "Upang maiwasan ang pamiminsala ng armyworm:\n" +
                    "\n" +
                    "Ilagay ang mga punlaan malayo sa mga damuhan.\n" +
                    "Araruhin ang bukid na walang tanim.\n" +
                    "Linisin ang bukid at alisin ang mga damo.\n" +
                    "Upang makontrol:\n" +
                    "\n" +
                    "Maglagay ng abo sa mga kanal upang mahirapang makatakas ang mga uod.\n" +
                    "Maglagay ng mga sanga sa palibot ng bukid upang dito mamugad ang mga armyworm at mas madaling malikom ng magsasaka.\n" +
                    "Iwasang patayin ang mga natural na kaaway ng armyworms tulad ng mga putakti at gagamba. Ang insecticide ay ang dapat na maging huling solusyon para makontrol ang armyworm.\n" +
                    "\n");


        }else if(pest.equals("Ibon")) {
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText(
                    "Mula sa mahigit na 70 uri ng ibong makikita sa mga palayan, lima lamang sa Pilipinas (at labing-apat sa Timog-Silangan) ang kumakain ng palay.\n" +
                            "\n" +
                            "Ilan sa mga ibong nangingingain ng palay ay:\n" +
                            "\n" +
                            "Eurasian Tree Sparrow (Passer montanus),\n" +
                            "Chestnut Munia (Lonchura malacca),\n" +
                            "Scaly-Breasted Munia (Lonchura punctulata) at\n" +
                            "White-Bellied Munia (Lonchura leucogastra).\n" +
                            "Ano ang nagagawa nito\n" +
                            "Ang mga ibong nanginginain ng butil sa palayan ay maaaring magdulot ng puting uhay o uban (whiteheads) o mga uhay na walang laman.\n" +
                            "\n" +
                            "Pinipisa ng mga ito ang mga butil habang ito ay nagmamala-gatas, o kinakain ang mga butil kapag ito ay hinog o papahinog na. Ang panginginain nila ay nag-iiwan ng mala-gatas na mantsa sa butil.\n" +
                            "\n" +
                            "Bakit at saan ito nangyayari\n" +
                            "Ang mga ibon ay nagiging problema simula sa yugto ng pagmamala-gatas ng pananim–kapag ang palay ay nagpupuno ng mga butil–hanggang sa paghinog at pag-ani.\n" +
                            "\n" +
                            "Ang ibang mga  ibon ay nangingingain ng mga butil sa pamamagitan ng pagdapo sa mga ito o sa mga kalapit na bagay nito (tulad ng bakod o haligi), o sa pagkain ng mga nalaglag na butil sa lupa sa panahon ng anihan. Dumarami ang bilang ng mga ibon sa palayan tuwing panahon ng pag-aani.\n" +
                            "\n" +
                            "Paano ito matutukoy\n" +
                            "Suriin kung may mala-gatas na likido sa mga tinukang butil at kung may mga puting uhay o uban (whiteheads) na nawawalan ng mga butil.\n" +
                            "\n" +
                            "Ang mga puting uhay o uban ay maaaring gawa ng mga aksip (stem borer). Upang matiyak ang sanhi ng pinsala:\n" +
                            "\n" +
                            "Hindi lahat ng pinsalang dulot ng mga ibon ay nag-iiwan ng ipa.\n" +
                            "Sa pinsalang dulot ng mga aksip, lahat ng mga butil ay walang laman at ang uhay ay madaling mabunot.\n" +
                            "Bakit ito mahalaga\n" +
                            "Ang pinsalang dulot ng pagdapo ng mga ibon sa uhay upang kainin ang mga butil ay nagiging sanhi ng kabawasan sa ani.\n" +
                            "\n" +
                            "Paano ito pangangasiwaan\n" +
                            "Mahalagang isaalang-alang ang iba’t ibang paraan ng pangangalaga sa palayan. May mga iba’t-ibang pakinabang at kahihinatnan ang mga paraan ng pangangalaga. Maraming paraang mapagpipilian na maaaring gawin nang pana-panahon o sa buong taon:\n" +
                            "\n" +
                            "Taga-bugaw (bird boys)\n" +
                            "Ito ay mga manggagawa sa palayan na nambubugaw o nagpapalayas ng mga ibon. Ito ay mabisa kung ang mga pamamaraan sa panghuhuli o pananakot ay pabago-bago at kung alam nila kung anong klaseng ibon (granivorous birds) ang kumakain ng butil lamang ang dapat bugawin o hulihin.\n" +
                            "Pagpapalayas gamit ang lambat (exclusion netting)\n" +
                            "Ang paggamit ng lambat sa palayan ay mabisa ngunit magastos. Posibleng din na mapalayas o mapatay nito ang mga ibong nakatutulong sa mga pananim. Hangga't maaari, iwasan ang pagkamatay ng mga ito.\n" +
                            "“Bird-tape”\n" +
                            "Ang mga bird tape ay inilalagay sa ibabaw ng palayan. Ito ay isa sa mga pinakamabisang paraan ng pananakot sa mga ibon lalo pa kung nasasabayan ng ihip ng hangin.\n" +
                            "Taga-kalampag (Noisemakers)\n" +
                            "Ang mga pang-kalampag (noisemakers) ay magagamit upang lumikha ng iba’t-ibang ingay at tunog o recordings na maaaring ipanakot sa mga ibon. Gayunman, madali nitong maaalala ng mga ibon kaya panandalian lamang ang gamit nito. Ang iba’t ibang ingay ay nakakapanakot sa lahat ng ibon samantalang ang mga recordings ay nakaaapekto sa mga partikular na uri ng ibon. May mga ultrasonic noisemakers din, ngunit hindi lahat ng ibon ay nakaririnig nito.\n" +
                            "“Chemical repellents”\n" +
                            "Ito ay kadalasang mula sa katas ng sili. Maraming nabibiling chemical repellents na pwedeng gamitin. Ang isang litro nito ay magagamit sa isang ektarya. Dapat tuloy-tuloy na maglagay ng repellant sa taniman kada dalawang linggo. Dapat ding ulitin ang paglalagay nito matapos ang ulan.\n" +
                            "“Decoy birds”\n" +
                            "Ang paggamit ng decoy birds ay madaling paraan ng paglaban sa mga ibon; ito rin ay mura. Ang mga ito ay maaaring magamit upang maakit o kaya’y mataboy ang mga ibon sa palayan, depende sa uri ng decoy bird na gagamitin.\n" +
                            "Paggamit ng bandera, taong-dayami (scarecrow), o bird kites\n" +
                            "Ang mga resulta ng paraang ito ay katulad din ng paggamit ng bird tape at hindi kamahalan ang gagastusin para rito. Ang bandera, scarecrows, at bird kites ay gumagalaw dahil sa hangin kung kaya’t  ito ay nakapagtataboy ng mga ibon.\n" +
                            "Gayunman, ang mga ibon ay nasasanay din sa mga paraang ito at ang gamit nito ay panandalian lamang.\n" +
                            "“Eco-engineering”\n" +
                            "Ang eco-engineering ay ibang paraan ng pagkokontrol sa mga ibon kung saan ay pinababayaang mahuli ng mga malalaking ibon ang mga maliliit. Ito ay isang natural na paraan ng pangangasiwa at pagbabalanse ng likas na sistema sa mga palayan.\n" +
                            "Ito ang isa sa pinakamurang paraan ngunit maaaring magkakaiba ang resulta nito.\n" +
                            "\n" +
                            "Ang paggamit ng malalaking ibon upang takutin o itaboy ang mas maliliit na ibon ay ang paggamit ng natural food web na nakatutulong sa mga magsasaka. Ang mga peste ay nakaayon sa maraming bagay na pabagu-bago ngunit madaling malabanan ito kapag may presensiya ng natural biodiversity sa palayan.\n" +
                            "\n" +
                            "Ang eco-engineering ay natural na paraan na kinakailangang pag-aralan ng mga tao sa palayan. Ang pagbawas ng bird hunting o trapping (panghuhuli ng mga ibon) para sa pangangalakal ay makapagbabalik ng natural balance sa mga palayan.\n");

        }else if(pest.equals("Itim na atangya")){
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText(
                    "Tatlong uri ng black bug o itim na atangya ang umaatake sa palay, ito ay ang: common black bug, Malayan black bug, and Japanese rice black bug.\n" +
                            "\n" +
                            "Ano ang nagagawa nito\n" +
                            "Tinatanggal ng itim na atangya ang katas ng pananim. Dahil dito, maaari silang magdulot ng pagiging kayumanggi ng mga dahon, pagkasira ng mga uhay (deadheart), at tuluyang pangingitim at pagkamatay ng palay (bugburn). Ang kanilang pamiminsala ay nakababansot ng mga palay, nakabababa ng bilang ng suwi, at nagiging dahilan ng pamumuti ng uhay o uban (whitehead).\n" +
                            "\n" +
                            "Sa mga malalang sitwasyon, pinahihina at pinipigilan rin ng mga itim na atangya ang pagkakaroon ng binhi ng palay.\n" +
                            "\n" +
                            "Bakit at saan ito nangyayari\n" +
                            "Karaniwang namiminsala ang itim na atangya sa mga palayang may patubig (irrigated wetland areas) at sa mga palayang sahod-ulan (rainfed).\n" +
                            "\n" +
                            "Nabubuhay ito sa mga palayang may tuluy-tuloy na natatamnan at sa mga palayang hindi maayos ang daluyan ng tubig. Mas madalas namiminsala ang mga pesteng ito kapag tag-araw at sa mga palayang may masinsing tanim.\n" +
                            "\n" +
                            "Naapektuhan ng pagbabago ng buwan ang paglipad at pagdami ng mga atangya. Kapag kabilugan ng buwan, mas marami sa mga matatandang black bug ang namiminsala.\n" +
                            "\n" +
                            "Ang hindi sabay-sabay na pagtatanim at sobrang nitrogen ay nagiging sanhi ng pagdami ng mga atangya. Kapag naman walang palay na nakatanim, ang mga itim na atangya ay humahanap ng ibang lugar na pag-iitlugan (alternate breeding sites), katulad ng mga damo sa paligid.\n" +
                            "\n" +
                            "Paano ito matutukoy\n" +
                            "Suriin ang mga dahon kung mayroong pag-iiba ng kulay. Ang pamiminsala ng mga itim na atangya ay nagdudulot ng pamumula (reddish brown) o paninilaw ng mga palay. Maaaring magkaroon ng mga hiwa ang mga dahon.\n" +
                            "\n" +
                            "Obserbahan din kung nababawasan ang pagsusuwi ng palay. Ang sintomas ng bugburn ay nagpapakita ng pagkatuyo ng mga suwi ngunit walang makikitang mga honeydew at amag.\n" +
                            "\n" +
                            "Ang mga pananim din ay bansot at maaaring maapektuhan ang pagbubuntis ng palay. Ito ay maaring mag resulta sa pagkakaroon ng mga uhay na walang laman o namumuti o mga uhay na hindi tuluyang nakalalabas.\n" +
                            "\n" +
                            "Suriin din kung mayroong patay na suwi o deadheart. Ang deadheart ay maaaring mapagkamalang epekto ng panginginain ng stem borer. Para makasiguro, bunutin ang mga patay na suwi. Kapag ang pagkasira ay dulot ng itim na atangya, ang patay na suwi ay hindi mahuhugot sa pinakapuno nito.\n" +
                            "\n" +
                            "Makikita ang malalang paninira ng peste at bugburn matapos ang panahon ng pagsasapaw o paggulang ng palay.\n" +
                            "\n" +
                            "Bakit ito mahalaga\n" +
                            "Ang mga itim na atangya ay nanginginain sa palay, mula punla hanggang sa paglaki nito. Bawat sampung atangya sa isang tundos ay maaaring magdulot ng hanggang 35% na kawalan sa ani ng palay.\n" +
                            "\n" +
                            "Paano ito pangangasiwaan\n" +
                            "Para maiwasan ang pag-atake ng itim na atangya:\n" +
                            "\n" +
                            "Gumamit ng variety na may resistensiya sa itim na atangya. Alamin sa pinakamalapit na tanggapan ng agrikutura ang pinakabago at kumpletong listahan ng mga variety ng palay.\n" +
                            "Matapos ang pag-aani, araruhin ang palayan upang matanggal o mamatay ang mga natitirang insekto.\n" +
                            "Panatilihing tuyo ang palayan habang nag-aararo.\n" +
                            "Panatilihing malinis ang palayan. Ugaliing tanggalin ang mga damo na maaring pamugaran nito.Magtanim ng variety na pare-pareho ang panahon ng paggulang upang maputol ang life cycle o pagdami ng peste.\n" +
                            "Gumamit ng light traps gamit ang mercury bulbs o ilaw na maliwanag limang araw bago o matapos ang kabilugan ng buwan.\n" +
                            "Gamitin ang mga likas na kaaway ng mga itim na atangya tulad ng putakti na sumisira sa itlog ng peste, ground beetles, gagamba, kuliglig, pulang langgam na sumisira sa itlog, nimpa at mga matatandang atangya, bibe, palakang bukid na kumakain sa mga itlog at nimpa, at ilang mga fungi.\n" +
                            "Para makontrol:\n" +
                            "\n" +
                            "Sa umpisa ng pamiminsala ng mga itim na atangya, itaas ang lebel ng tubig sa palayan at panatilihin ito sa loob ng 2-3 araw para mapilitang umakyat ang mga peste at mamatay ang mga itlog nito.\n");

        } else if(pest.equals("Ngusong Kabayo")) {
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText("May dalawang uri ng ngusong-kabayo o planthopper na namiminsala ng palay. Ito ay ang kayumangging ngusong-kabayo o Brown Planthopper o Nilaparvata lugens (Stal) at ang puting ngusong-kabayo o whitebacked planthopper o Sogatella furcifera (Horvath).\n" +
                    "\n" +
                    "Ano ang nagagawa nito\n" +
                    "Ang mataas na populasyon ng ngusong-kabayo ay nagdudulot ng pagkakahel-dilaw (orange-yellow) ng dahon bago maging kayumanggi (brown) at tuluyang matuyo. Ang kalagayang ito ay tinatawag na hopperburn na pumapatay sa pananim.\n" +
                    "\n" +
                    "Maaari ring magdala ng sakit ang mga kayumangging ngusong-kabayo. Ang mga sakit na ito ay ang pagkakulot ng dahon (rice ragged stunt) at ang burit (rice grassy stunt) na parehong hindi nagagamot.\n" +
                    "\n" +
                    "Bakit at saan ito nangyayari\n" +
                    "Nagiging suliranin ang ngusong-kabayo sa mga sahod-ulan at may irigasyong mga palayan. Namiminsala rin ang mga ito sa mga palayang parating nakalubog sa tubig, may malilim na lugar, at may mahalumigmig na kondisyon.\n" +
                    "\n" +
                    "Ang pagkakadikit-dikit ng palay, masinsin na pagkakatanim, labis na paggamit ng nitrogen (N), at maagang paggamit ng insecticide ay nakatutulong sa paglaki ng mga insekto.\n" +
                    "\n" +
                    "Paano ito matutukoy\n" +
                    "Tingnan kung mayroong insekto:\n" +
                    "\n" +
                    "Mala-hugis cresent na buwan na puting itlog sa loob ng gitnang ugat o talukap ng dahon\n" +
                    "Puti o kayumangging mga nimpa\n" +
                    "Husto sa gulang na ngusong-kabayong kulay puti o kayumanggi na kumakain sa punong bahagi ng mga suwi\n" +
                    "Suriin ang bukid para sa:\n" +
                    "\n" +
                    "Hopperburn o paninilaw, pagiging kayumanggi at panunuyot ng halaman\n" +
                    "Marka ng pangingitlog na nagiging daan upang maimpeksyon ito ng fungus at mikrobyo\n" +
                    "Honeydew at amag sa ibabang parte ng apektadong bahagi\n" +
                    "Mga pananim na may pagkakulot ng dahon o may burit\n" +
                    "Ang hopperburn ay kahalintulad ng pinsalang bugburn na naidudulot ng itim na atangya. Upang makasiguro na ang hopperburn ay dulot ng ngusong-kabayo, tingnan kung mayroong amag sa ibabang bahagi ng pananim.\n" +
                    "\n" +
                    "Bakit ito mahalaga\n" +
                    "Ang pinsalang naidudulot ng ngusong-kabayo ay nagreresulta sa paninilaw ng pananim. Sa matataas na populasyon, maoobserbahan ang hopperburn o lubusang panunuyo ng mga pananim. Sa sitwasyong ito, ang pagkamatay ng mga pananim ay maaaring umabot sa 100%.\n" +
                    "\n" +
                    "Sa palayan, ang mga pananim na malapit na sa hustong gulang ay maaaring magkaroon ng hopperburn kung napinsala ng 400-500 nimpa ng kayumangging ngusong-kabayo. Noong 1970s at 1980s, ang kayumangging ngusong-kabayo ay isa sa mga banta sa produksyon ng palay sa Asya. Dinadala rin ng kayumangging ngusong kabayo ang pagkakulot ng dahon at burit na virus.\n" +
                    "\n" +
                    "Maaaring magdulot ang puting ngusong kabayo ng lubos na pagkabawas ng mga pananim. Ito ay nangyayari sa mga palayang may populasyon na 400-500 na mga nimpa o 200 na mga husto sa gulang na ngusong-kabayo sa bawat pananim. Ang paglaganap ng puting ngusong-kabayo ay naitala sa Pakistan noong 1978, sa Malaysia noong 1979, at sa India noong 1982, 1984, at 1985.\n" +
                    "\n" +
                    "Paano ito pangangasiwaan\n" +
                    "Ang paggamit ng pesticide ay nagdudulot ng paglaganap ng peste dahil napapatay din nito ang mga natural na kaaway ng kayumangging ngusong-kabayo. Napipisa ang mga itlog ng kayumangging ngusong-kabayo nang hindi napapansin, at ang mga ngusong-kabayong nabubuhay ay mabilis na nakapagpaparami dahil sa lebel ng pinsalang kayang idulot nito. Lumalaganap din ito kapag nadadala ng hangin ang mga may mahahabang pakpak na ngusong-kabayo (longwinged planthopper).\n" +
                    "\n" +
                    "Upang maiwasan ang malawakang paglaganap ng peste:\n" +
                    "\n" +
                    "Tanggalin ang mga damo sa bukid at sa paligid nito.\n" +
                    "Iwasan ang maling paggamit ng insecticide dahil nadadamay at napupuksa rin ang mga natural na kaaway ng ngusong-kabayo.\n" +
                    "Kritikal na bilang: Maaari pang mapigilan ang pagdami ng mga ngusong-kabayo kung ang bilang nito ay umaabot lamang ng isang ngusong-kabayo bawat tangkay o mas kaunti pa rito.\n" +
                    "Maghanap ng kayumangging ngusong-kabayo araw-araw sa kamang punlaan, linggu-linggo sa bukid, sa mga tangkay, at sa tubig. Tingnan ang bawat gilid ng punlaan. Para sa mas matatandang palay, hawakan ang halaman, ibaluktot ito nang bahagya, at tapikin ito nang kaunti sa may ibabang bahagi upang makita kung may mahuhulog na mga ngusong-kabayo sa tubig. Para sa mga inilipat-tanim na palay, tingnan ang ibabang bahagi ng 10-20 na tundos habang naglalakad sa bukid nang pahilis. Hindi kinakailangang maghanap ng kayumangging ngusong-kabayo at puting ngusong-kabayo matapos ang yugto ng pagmamalagatas ng palay.\n" +
                    "Gumamit ng mga  light traps tulad ng de-kuryenteng bumbilya o lamparang de-gasul malapit sa pader na kulay puti o sa ibabaw ng lalagyang may tubig sa gabi kung kailan madaling atakihin ng ngusong-kabayo ang palay. Huwag ilagay ang mga ilaw malapit sa kamang punlaan o palayan. Kung napuno ng kayumangging ngusong-kabayo ang mga ilaw-patibong, isa itong senyales upang tingnan agad ang kamang punlaan o palayan; at maghanap ng iba pang ngusong-kabayo. Kung araw-araw din namang natitingnan ito ng magsasaka, hindi na kinakailangan ng ilaw-patibong.\n" +
                    "Upang sugpuin ang ngusong-kabayo:\n" +
                    "\n" +
                    "Mekanikal at pisikal na pamamaraan\n" +
                    "\n" +
                    "Pataasin ang tubig sa kamang punlaan sa loob ng isang araw, upang ang dulo lamang ng mga punla ang nakalantad. Ito ay makatutulong upang makontrol ang kayumangging ngusong-kabayo.\n" +
                    "Padaanan ng kulambo o net ang punlaan upang maalis ang ilang kayumangging ngusong-kabayo ngunit hindi ang mga itlog, lalo na ang mga nasa tuyong punlaan. Sa mga palayang may matataas na populasyon ng kayumangging ngusong kabayo, ang pagpapadaan ng kulambo ay hindi makapupuksa ng sapat na bilang nito na naninirahan sa ibabang bahagi ng pananim.\n" +
                    "Biological na pamamaraan\n" +
                    "\n" +
                    "Kung mas marami ang mga likas na kaaway kaysa sa kayumangging ngusong-kabayo, maaaring mababa rin ang posibilidad ng hopperburn. Hindi pa rin dapat ginagamitan ng insecticide ang palay na napinsala na ng hopperburn. Ang mga natural na kaaway ng kayumangging ngusong-kabayo ay manghahakbang-tubig, mirid bugs, mga gagamba, at iba pang egg parasitoids.\n" +
                    "Kemikal na pamamaraan\n" +
                    "\n" +
                    "Gumamit lamang ng insecticide sa punlaan para sa kayumangging ngusong-kabayo o puting ngusong-kabayo kung ang lahat ng mga kundisyong ito ay napapansin:\n" +
                    "\n" +
                    "Higit sa isang ngusong-kabayo sa bawat tangkay ng mga pananim,\n" +
                    "Mas maraming ngusong-kabayo kaysa sa natural na kaaway,\n" +
                    "Hindi maaring pataasin ang tubig sa punlaan.\n");

        }else if(pest.equals("Kuhol")){
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText("Mahigit sa 100 uri ng kuhol o apple snail ang makikita sa mundo.\n" +
                    "\n" +
                    "Ang dalawang uri nito, Pomacea canaliculata at Pomacea maculata, na mas kilala sa tawag na Golden Apple Snails (GAS) o kuhol, ay lubhang mapaminsala sa palay. Mabilis din silang dumami.\n" +
                    "\n" +
                    "Ito ay nagmula sa Timog Amerika at dinala sa Asya noong 1980s bilang isang potensyal na pagkain para sa mga tao. Ngunit kinalaunan, ito ay naging isang pangunahing peste ng palay.\n" +
                    "\n" +
                    "Ano ang nagagawa nito\n" +
                    "Kinakain ng mga kuhol ang mga bata at sumisibol pa lamang na palay. Pinuputol at kinakain nila ang tangkay ng palay sa puno nito na siyang nagdudulot ng pagkasira ng buong pananim.\n" +
                    "\n" +
                    "Bakit at saan ito nangyayari\n" +
                    "Ang mga kuhol ay kumakalat sa pamamagitan ng tubig sa mga kanal, irigasyon, at insidente ng pagbaha.\n" +
                    "\n" +
                    "Sa mga panahong walang tubig, ang mga kuhol ay nagtatago sa ilalim ng natuyong putik, at natutulog (hibernate) sa loob ng anim na buwan. Maglalabasang muli ang mga nagtagong kuhol kapag ang patubig ay bumalik.\n" +
                    "\n" +
                    "Sinisira nila ang mga palay na isinabog-tanim sa tanimang may patubig. Sinisira rin nila ang mga punlang inilipat-tanim na may gulang na hanggang 30 araw. Kapag ang palay ay umabot na sa ika-30 hanggang 40 na araw, nagiging sapat ang kapal nito upang malabanan ang pamiminsala ng mga kuhol.\n" +
                    "\n" +
                    "Paano ito matutukoy\n" +
                    "Suriin ang kulay at laki ng mga kuhol upang makita ang pagkakaiba ng golden apple snails at native snails .\n" +
                    "\n" +
                    "Ang mga golden apple snails ay may kulay putik (muddy brown) na shell. Ang laman naman ng mga ito ay malagintong kulay-rosas o madilaw na kahel (golden pinkish o orange-yellow). Mas malaki sila at mas mapusyaw ang kanilang kulay kaysa mga native snails. Ang mga itlog naman nila ay matingkad na kulay-rosas (bright pink).\n" +
                    "\n" +
                    "Upang matiyak na kuhol ang nagdulot ng pinsala sa pananim, tingnan kung may nababawas o nawawalang tundos, at naputol na dahon at tangkay.\n" +
                    "\n" +
                    "Bakit ito mahalaga\n" +
                    "Ang golden apple snail ay itinuturing na isa sa pinakamalaking suliranin sa palayan.\n" +
                    "\n" +
                    "Kapag hindi ito naagapan, maaari nitong tuluyang mapinsala ang isang metro kuwadrado (m2 ) ng palayan sa loob lamang ng isang magdamag. Ang pinsalang ito ay maaaring magdulot ng pagbaba ng ani na aabot sa 50%.\n" +
                    "\n" +
                    "Paano ito pangangasiwaan\n" +
                    "Ang tamang panahon upang labanan ang mga kuhol ay habang inihahanda pa lamang ang lupang pagtatamnan, at nagpapatubo pa lamang ng pananim. Ito ay pumapatak sa unang 10 araw pagkatapos ng paglilipat-tanim, at sa unang 21 araw matapos ang sabog-tanim sa basang lupa.\n" +
                    "\n" +
                    "Pagkatapos nito, ang pananim ay hindi na mapipinsala pa ng mga kuhol. Sa yugtong ito, ang kuhol ay nakatutulong na sa pananim sa pamamagitan ng pagkain ng mga damo sa loob ng palayan.\n" +
                    "\n" +
                    "Pagsugpo ng kuhol sa komunidad\n" +
                    "\n" +
                    "Ang pinakamabisang paraan upang mabawasan ang bilang ng mga kuhol ay ang pagkakaisa ng mga tao sa komunidad.\n" +
                    "\n" +
                    "Magkaroon ng malawakang kampanya sa buong komunidad tungkol sa pangongolekta ng mga kuhol at ng mga itlog nito habang inihahanda pa lamang ang lupa at habang nagtatanim.\n" +
                    "Hangga’t maaari, panatilihing tuyo ang palayan sa mga panahong madaling mapinsala ang mga pananim na palay (wala pang 30 araw) o ilipat mula sa kamang punalaan ang mga binhing nasa 25-30 araw na gulang pa lamang.\n" +
                    "Gamitin ang mga likas na kaaway ng kuhol.\n" +
                    "Natural na pamamaraan ng pagpuksa\n" +
                    "\n" +
                    "Kinakain ng mga pulang langgam ang mga itlog ng kuhol, habang ang mga pato naman o minsan pati mga daga ay kumakain ng mga batang kuhol. Ilan sa mga ligaw na uri ng ibon ay kumakain na rin ng mga golden apple snails. Maaari ring ilagay ang mga alagang pato sa palayan tuwing inihahanda ang lupa o matapos ang pagpapatubo ng pananim kapag ang mga halaman ay sapat na ang laki (hal. 30-35 araw matapos ang paglilipat-tanim).\n" +
                    "Ang mga kuhol ay maaari ring anihin, iluto at kainin o ibenta bilang pagkain ng mga hayop. Gayunpaman, mahalagang maging mas maingat at lutuin nang mas matagal ang kuhol sapagkat kilala itong nagdadala ng rat lungworm na isang uri ng parasitikong uod.\n" +
                    "Tradisyonal na pagsugpo\n" +
                    "\n" +
                    "Kolektahin ang mga kuhol at durugin ang tumpok ng itlog nito. Pinakaepektibo itong gawin sa umaga at hapon kapag ang mga kuhol ay aktibo. Maglagay ng tulos ng kawayan upang pangitlugan ng kuhol at mapadali ang pangongolekta ng mga tumpok ng itlog nito.\n" +
                    "Maaari ring gumamit ng attractants gaya ng dahon ng papaya at dahon ng kamoteng kahoy para mas mapadali ang pangunguha ng kuhol.\n" +
                    "Paggamit ng tubig\n" +
                    "\n" +
                    "Ang mga apple snails ay nahihirapang gumalaw sa tubig na mas mababaw sa 2 cm. Panatilihin sa ganoong taas ang tubig sa mga yugto na pinakamadaling mapinsala ang mga pananim na palay.\n" +
                    "Gumawa ng maliliit na kanal (hal. 15-25 cm ang luwang at 5 cm ang lalim) pagkatapos ihanda ang lupa. Batakin ang isang sakong puno ng mabibigat na bagay sa bawat dulo ng palayan o sa bawat 10-15 metrong pagitan. Ang maliliit na kanal ay tumutulong sa pag-agos ng tubig, at nagsisilbing tipunan ng mga kuhol. Ito ay nagpapadali sa pangongolekta o pagpatay sa mga kuhol.\n" +
                    "Paggamit ng nakalalasong halaman\n" +
                    "\n" +
                    "Ilagay ang mga nakalalasong uri ng halaman gaya ng dahon ng tabako, heartleaf false pickerelweed, at mahahaba’t makikitid na sitrus sa paligid ng palayan o sa mga maliliit na kanal.\n" +
                    "Isara ang mga lagusan sa tinatamnang bukid\n" +
                    "\n" +
                    "Alamin ang mga daluyan ng tubig. Maaaring makapasok ang mga kuhol sa mga kanal, ilog, at imbakan ng tubig.\n" +
                    "Maglagay ng harang sa mga lugar na maaaring pasukan at labasan ng tubig sa tinatamnang bukid. Maglagay din ng kawad, hinabing kawayan sa tabing, o mesh bag sa pinakalagusan ng patubig upang mapigilan ang pagpasok ng mga kuhol sa taniman.\n" +
                    "Ilipat ang mga pananim\n" +
                    "\n" +
                    "Ang inilipat-tanim na palay ay mas ligtas mula sa pamiminsala ng kuhol kaysa mga isinabog-tanim\n" +
                    "Magtanim ng malulusog at matitibay na punla. Siguraduhing ang mga punlang ito ay lumaki sa mababa at masinsing punlaan. Dapat ito ay mas mababa sa 100 gramo (g) ng binhi kada metro kuwadrado (m2 ). Ipagpaliban din ang paglilipat-tanim (hal. Ilipat lamang ang punla kapag ito ay nasa 25-30 days old).\n" +
                    "Upang mabawasan ang pagkawala ng mga tundos dulot ng pamiminsala ng mga kuhol, maaaring magtanim ng karagdagang punla kada tundos.\n" +
                    "Kemikal na pagsugpo\n" +
                    "\n" +
                    "Kung minsan, ang kemikal na pagsugpo ay kinakailangan lamang sa mga sitwasyong hindi naging mabisa ang ibang pamamaraan. Gumamit ng mga produktong kemikal na hindi nakalalason sa kapaligiran at sa mga tao.\n" +
                    "\n" +
                    "Ang patubig na may 2 cm ang taas at pagsunod sa tamang paggamit ng pataba ay nakapagpapataas ng negatibong epekto sa mga kuhol.\n" +
                    "\n" +
                    "Ilagay ang mga produktong ito sa mabababang lugar o maliliit na kanal lamang, sa halip na sa buong palayan. Panatilihing laging ligtas at tama ang paggamit ng mga produktong ito.\n" +
                    "Tandaan na dapat agarang gamitin ang pamatay-kuhol (molluscicides) matapos ang palilipat-tanim, o sa yugto ng pagpupunla sa mga sabog-tanim na palay. Tandaan din na para lamang ito sa palay na hindi hihigit sa 30 days old.\n");

        }else if(pest.equals("Burit")){
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText(
                    "Ano ang nagagawa nito\n" +
                            "Nababawasan ng burit o rice grassy stunt virus (GSV) ang dami ng ani dahil pinipigilan nito ang pag-uuhay ng palay.\n" +
                            "\n" +
                            "Bakit at saan ito nangyayari\n" +
                            "Ang burit ay nakaapekto sa mga palayang tuluy-tuloy ang pagtatanim sa loob ng isang taon (continuous cropping).\n" +
                            "\n" +
                            "Ang GSV ay kumakalat sa pamamagitan ng mga insekto tulad ng mga nimpa at mga magulang na ngusong-kabayo na kadalasang nagkakalat ng virus na ito. Ang mga ngusong-kabayo ay kinakailangang manginain sa isang apektadong pananim sa loob ng 30 minuto o higit bago ito mahawaan ng virus.\n" +
                            "\n" +
                            "Ang mga pananim ay maaaring maapektuhan sa anumang yugto ng paglaki. Pinakamadaling mahawa ang pananim sa panahon ng pagsusuwi. Ang sintomas ng GSV ay makikita 10-12  araw matapos mahawa. Ang mga apektadong pinaggapasan at mga kusang tumutubong palay ay pinagmumulan din ng burit. Hindi ito naikakalat sa pamamagitan ng mga itlog ng kayumangging ngusong-kabayo.\n" +
                            "\n" +
                            "Paano ito matutukoy\n" +
                            "Upang malaman kung ang pananim ay may burit, hanapin ang mga sintomas na ito:\n" +
                            "\n" +
                            "Malalang pagkabansot ng pananim\n" +
                            "Labis na pagsusuwi\n" +
                            "Masyadong tuwid o tirik na pagtubo ng pananim\n" +
                            "Mala-damo at mala-rosas na anyo ng mga pananim\n" +
                            "Naninilaw-berde (yellowish green), mas maikli at mas makitid kaysa sa karaniwan ang mga dahon\n" +
                            "Mga dahong nanatiling dilaw kahit nalagyan na ng sapat na patabang nitrogen (N)\n" +
                            "Maraming maliliit na kulay-kalawang na batik o patse sa mga dahon, na nagkukumpol-kumpol upang makabuo ng mas malaking batik\n" +
                            "Ang mga dahon ay batik-batik\n" +
                            "Ang mga palay ay hindi nakakapag-uhay\n" +
                            "Ang mga sintomas ng burit ay maaaring mapagkamalang sintomas din ng rice yellow dwarf at rice dwarf disease. Upang matiyak kung burit ang sakit ng pananim, suriin kung mala-rosas ang anyo ng pananim at kung may kulay kalawang na batik sa mga dahon.\n" +
                            "\n" +
                            "Bakit ito mahalaga\n" +
                            "Kadalasan, hindi malawakan ang pinsalang dulot ng burit. Ang sakit na ito ay nagiging malalang problema lamang sa mga palayang may biglaang pagkalat ng mga kayumangging ngusong-kabayo (brown planthopper).\n" +
                            "\n" +
                            "Paano ito pangangasiwaan\n" +
                            "Upang makontrol ang burit, kinakailangang mabawasan ang mga kayumangging ngusong-kabayo (brown planthopper) na nagsisilbing tagapagkalat nito.\n" +
                            "\n" +
                            "Maaaring gumamit ng insecticide, magtanim ng mga variety na may resistensya laban sa kayumangging ngusong-kabayo, o gawin ang sabay-sabay na pagtatanim. Ang mga nahawang pinaggapasan ay kinakailangang araruhin matapos ang pag-aani upang mabawasan ang pinagmumulan ng virus.\n");


        }else if(pest.equals("Daga")){
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText("Scientific name\n" +
                    "Rattus argentiventer (Robinson and Kloss, R. exulans Peale, R. rattus spp., R. tanezumi)\n" +
                    "Ano ang nagagawa nito\n" +
                    "Pinuputol o binubunot ng mga dagang bukid ang mga nailipat-tanim. Nginangatngat din nila ang mga batang punla. Sa yugto ng paghihinog, ang mga daga ay kumakain ng mga rice buds at mga butil na malapit nang mahinog.\n" +
                    "\n" +
                    "Bakit at saan ito nangyayari\n" +
                    "Ang mga daga ay nakikita sa mga tubigang palayan na nasa kababaan. Ang tagtuyo at tag-ulan ay parehong mainam sa pagpaparami at pamiminsala ng mga daga. Sa mga sahod-ulang palayan, ang mga daga ay pinakamapinsala tuwing tag-ulan. Ang pagkakaroon ng pagkain, tubig, at tirahan ang nagiging dahilan upang mas mapadali at mapabilis ang kanilang pagdami. Ang mga damo ay nakatutulong din sa pagdami ng mga ito dahil may mapagtataguan sila.\n" +
                    "\n" +
                    "Ang mga daga ay nanginginain tuwing gabi. Sila ay aktibo tuwing magdadapit-hapon at magmamadaling araw. Tuwing umaga naman, sila ay makikita sa mga halaman, damo at sa mga pahinog nang mga palayan. Sa panahong walang nakatanim sa bukid, sila ay naglalagi sa mga kanal at hardin bilang pangunahing tirahan. Ang mga daga ay nagtatago habang nagsusuwi ang palay. Matapos makumpleto ang pagsusuwi, lumalabas naman sila patungo sa mga palayan.\n" +
                    "\n" +
                    "Paano ito matutukoy\n" +
                    "Ang panginginain ng mga dagang bukid ay maaaring magdulot ng mga sumusunod na pinsala:\n" +
                    "\n" +
                    "Nawawalang sumisibol na mga binhi\n" +
                    "Nawawalang mga tundos\n" +
                    "Napuputol ang mga punla\n" +
                    "Nababawasan ang mga pananim o usbong\n" +
                    "Hindi normal na pagkaputol sa puno ng pananim\n" +
                    "Nangatngat na mga papausbong na pananim o nahihinog na mga butil\n" +
                    "Mga suwing may pahilis (45°) na pagkakaputol\n" +
                    "Muling pagsusuwi ng mga naputol na tangkay ng pananim\n" +
                    "Naantalang pagkahinog ng mga butil\n" +
                    "Nawawalang mga butil\n" +
                    "Nawawalang mga uhay\n" +
                    "Ang pinsalang dulot ng panginginain ng mga daga sa tangkay ng mga pananim ay maaaring mapagkamalang pinsalang dulot ng mga insekto. Ngunit, ang pinsala ay makikitang gawa ng mga dagang bukid dahil sa pahilis na pagkakaputol ng suwi nang halos 45°.\n" +
                    "\n" +
                    "Ang pinsala sa mga binhi ay maaari ring mapagkamalang pinsalang gawa ng mga ibon.\n" +
                    "\n" +
                    "Tingnan ang mga maputik na lugar kung may mga daanan, aktibong kanal, at mga bakas ng mga paa ng dagang bukid. Ang mga ito ay madalas na malapit sa kanilang mga pinipinsalang lugar.\n" +
                    "Tingnan kung may mga daga, mga putol na suwi, at aktibong mga lungga sa pilapil na pumapaligid sa palayan.\n" +
                    "Kung maaari, hulihin ang mga dagang bukid upang malaman kung ano ang uri nito. Maglagay ng bitag sa dinadaanan nila, o hukayin ang mga dagang bukid mula sa lungga.\n" +
                    "Bakit ito mahalaga\n" +
                    "Ang Rattus argentiventer ay ang pangunahing pesteng daga sa mga bukirin ng maraming lugar sa Timog-Silangang Asya. Ang kabawasan sa ani sa mga palayan na dulot ng pesteng ito ay madalas 10-20%. Ang kabawasan ay karaniwang mas mataas sa ikalawang pagtatanim sa mga palayang dalawang beses tinatamnan kada taon (double cropping).\n" +
                    "\n" +
                    "Sa mga bukid na malapit sa mga lungga ng daga tulad ng mga kanal o malalawak na katihan, may mga naiulat nang malalang pagkawala ng ani na umaabot sa 30-50%. Malala rin ang pinsalang naiulat sa mga lugar na tatlong beses tinatamnan kada taon (triple cropping)  dahilan ng mataas na bilang ng dagang bukid.\n" +
                    "\n" +
                    "Sa Malaysia, ang dagang bukid (Rattus argentiventer) ay nagdulot ng kawalan ng aning umabot sa 6-11%. Sa Indonesia naman, tinatayang 17% ng natamnang lupa ang napipinsala ng daga kada taon.\n" +
                    "\n" +
                    "Paano ito pangangasiwaan\n" +
                    "Mabisang pagpuksa sa pulutong ng mga daga:\n" +
                    "\n" +
                    "Pagbabaha, paghuhukay, at pagpapausok sa mga lungga ng mga dagang bukid\n" +
                    "Pananakot at pagpapaalis sa mga dagang nasa matataas na damo o sa mga kalapit na lugar (sa pamamagitan ng lambat, mga aso, mga pamalo, at iba pang paraan upang mahuli ang mga daga)\n" +
                    "Kakailanganin ang mga aso sa paghahanap ng mga aktibong lungga ng mga dagang bukid, at saka gamitin ang naunang hakbang\n" +
                    "Hanapin ang mga dagang bukid tuwing gabi gamit ang mga lente o flashlight, pamalo, pana, at paglalambat\n" +
                    "Maglagay ng bitag sa dinadaanan ng mga dagang bukid\n" +
                    "Gumamit ng mga nakarehistrong lasong pandaga na nakalagay sa mga bitag na may takip (ngunit siguraduhing malayo ito sa mga bata at mga alagang hayop para maiwasan ang pagkalason).\n" +
                    "Pamamahala upang maiwasan ang pagdami ng daga:\n" +
                    "\n" +
                    "Panatilihing hindi hihigit sa 30 cm ang lapad ng mga pilapil sa taniman upang hindi makagawa ng kanal ang mga dagang bukid.\n" +
                    "Panatilihing malinis at walang matataas na damo ang paligid ng palayan, pilapil, at iba pang kalapit na lugar upang walang mapagtaguan ang mga dagang bukid\n" +
                    "Magtanim kasabay ng katabing bukid o kaya ay siguraduhing makatanim 15 araw bago o pagkatapos magtanim ng mga katabing bukid\n" +
                    "Maglagay at gumamit ng tamang Trap Barrier System (TBS) — sa panahon ng pagtatanim ng palay  kung kailan talamak ang pamiminsala ng mga dagang bukid.\n" +
                    "Panatilihing malinis (walang tambak ng mga kahoy, basura, o madadamong lugar) ang mga paligid ng palayan, tirahan, at mga barangay.\n" +
                    "Panatilihing malinis ang kamalig at paligid nito.\n");

        }else if(pest.equals("Atangya")){
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText(
                    "Ang mga pinakakaraniwang uri ng atangya o rice bug ay ang Leptocorisa oratorius F. at Leptocorisa acuta (Thunberg).\n" +
                            "\n" +
                            "Ano ang nagagawa nito\n" +
                            "Ang atangya ay namiminsala sa pamamagitan ng pagsipsip ng laman ng butil sa yugto mula pamumulaklak hanggang sa paglalaman ng mga butil. Nagreresulta ito sa mga butil na kaunti o walang laman, at gayun din ng pag-iiba ng kulay nito. Ang mga bata at mga husto sa gulang na atangya ay parehong nanginginain sa butil ng palay.\n" +
                            "Bakit at saan ito nangyayari\n" +
                            "Maraming bagay ang maaaring maging sanhi ng mataas na bilang ng mga atangya. Ang ilan sa mga ito ay:\n" +
                            "\n" +
                            "Malapit na kakahuyan\n" +
                            "Malalawak na damuhang malapit sa palayan\n" +
                            "Mga damong ligaw malapit sa mga kanal\n" +
                            "Hindi sabay-sabay na pagtatanim ng palay\n" +
                            "Ang mga atangya ay nagiging aktibo tuwing tag-ulan. Ang mainit na panahon, maulap na kalangitan, at madalas na pag-ambon ay nakapagpapalala sa pagdami nito.\n" +
                            "\n" +
                            "Ang mga atangya ay dumadami pagkatapos ng tag-ulan.\n" +
                            "\n" +
                            "Ang mga atangya ay nakikita sa lahat ng uri palayan. Ito ay kalimitang nakikita sa mga sahod-ulan at katihang palayan. Ang insekto ay higit na namiminsala habang ang palay ay namumulaklak hanggang sa ito ay magmalagatas.\n" +
                            "\n" +
                            "Ang mga husto sa gulang na atangya ay aktibo tuwing dapithapon at madaling-araw. Tuwing mataas ang sikat ng araw, sila ay nagtatago sa mga madamong lugar. Samantala, hindi sila kasing aktibo tuwing tagtuyot. Ang mga husto sa gulang na atangyang nasa mas malalamig na lugar ay sumasailalim sa mas mabagal na paglaki sa mga damuhan. Sila ay nanginginain sa mga damo isa o dalawang henerasyon bago ito lumipat sa nahihinog na palayan. Ang mga nimpa ay makikitang nakahalo at kakulay ng mga dahon ng palay. Dito, ang mga atangya ay madalas na hindi napapansin. Kung mabulahaw, ang mga nimpa ay lumilipat sa ibabang bahagi ng pananim samantalang ang mga husto sa gulang naman ay lumilipad sa mga katabing lugar.\n" +
                            "\n" +
                            "Paano ito matutukoy\n" +
                            "Suriin ang pananim para sa pinsalang dulot ng panginginain, tulad ng:\n" +
                            "\n" +
                            "Maliit o kulubot na mga butil\n" +
                            "Butil na may batik-batik o nasirang hugis\n" +
                            "Walang laman ang mga butil\n" +
                            "Nakatayong mga uhay\n" +
                            "Ang mga sintomas ay maaaring mapagkamalang pinsalang dulot ng kakulangan sa sustansya o dahil sa mga flower thrips. Upang matiyak ang malawakang pamiminsala ng atangya, hanapin ang insekto:\n" +
                            "\n" +
                            "Bilohaba, makintab at mamula-mulang kayumangging (reddish-brown) mga itlog sa gitnang-ugat ng dahon.\n" +
                            "Payat at kayumangging berdeng (brown-green) mga nimpa at mga husto sa gulang na atangyang kumakain sa endosperm ng binhi na kailangan sa pagsibol ng pananim .\n" +
                            "Mabahong amoy.\n" +
                            "Bakit ito mahalaga\n" +
                            "Ang mga husto sa gulang na atangya at ang mga nimpa ay parehong nanginginain sa mga butil sa yugto ng pagmamalagatas. Maaari silang maging matinding peste ng palay na kung minsan ay nakababawas sa ani ng halos 30%.\n" +
                            "\n" +
                            "Paano ito pangangasiwaan\n" +
                            "Tanggalin ang mga damo sa bukid at sa mga kalapit na lugar upang maiwasan ang pagdami ng mga atangya. Gawin ito habang walang nakatanim sa palayan.\n" +
                            "Patagin ang taniman at lagyan ng pare-parehong dami ng pataba at tubig, upang masiguro ang sabay-sabay na paglaki ng palay.\n" +
                            "Maaaring hulihin ang mga atangya gamit ang kulambo tuwing madaling araw o tuwing dapithapon. Ito ay mabisa sa mga lugar na kakaunti pa ang mga atangya ngunit ito ay matrabaho.\n" +
                            "Nakatutulong ang mga likas na kaaway o biological controls ng mga atangya, tulad ng mga putakti, tipaklong at gagamba na umaatake sa mga atangya at sa mga itlog nito. Ang hindi tamang paggamit ng insecticide ay hindi makabubuti dahil pinapatay din nito ang mga likas na kaaway ng mga atangya. Nagreresulta ito sa muling pagdami ng mga peste.\n" +
                            "Para sa pagkontrol gamit ang mga kemikal:\n" +
                            "\n" +
                            "Bago gumamit ng pesticide, sumangguni muna sa isang espesyalista para sa payo, patnubay at babala sa sitwasyon ng iyong mga pananim.\n" +
                            "\n" +
                            "Magmasid araw-araw sa palayan bago pa man ang pamumunga hanggang sa yugtong malapit nang mahinog ang palay. Sa loob ng palayang lipat-tanim, maaaring bilangin ang mga atangya tuwing madaling araw o dapithapon mula sa 20 tundos habang naglalakad nang pahilis. Ang mga magulang na atangya ay madalas na nakalilipad palayo bago mo pa ito maabutan kaya maaaring mga batang atangya lamang ang makuha. Ang direktang pagkontrol ay kinakailangang gawin kapag mayroon nang 10 atangya kada 20 tundos.\n" +
                            "Ang pagpili ng insecticide ay nakabatay sa instrumentong maaaring gamitin, presyo ng insecticide, karanasan ng gagamit, o presensya ng isda. Dapat isaalang-alang ang mga panganib na maidudulot nito sa kalusugan at kapaligiran.\n");


        }else if(pest.equals("Ulalo sa ugat")){
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText(
                    "Leucopholis irrorata (Chevrolat)\n" +
                            "Ano ang nagagawa nito\n" +
                            "Ang mga ulalo o root grub ay nanginginain sa mga ugat na maaaring magresulta sa hindi normal na taas ng pananim, pag-iiba ng kulay ng pananim, at pagkalanta.\n" +
                            "\n" +
                            "Bakit at saan ito nangyayari\n" +
                            "Pinipili ng ulalo ang mga pananim na may mahihiblang mga ugat.\n" +
                            "\n" +
                            "Laganap ang mga ito sa katihan at sahod-ulang mga palayan. Ang mga husto sa gulang na ulalo ay aktibo sa gabi at naaakit sa mga light traps. Samantalang ang mga itlog naman nito ay napipisa at lumalaki sa mamasa-masang lupa at sa lunggang gawa ng babaeng ulalo.\n" +
                            "\n" +
                            "Kinakain ng ulalo ang palay habang ito ay punla pa lamang. Mataas ang pinsalang naidudulot ng pesteng ito tuwing taguyot.\n" +
                            "\n" +
                            "Paano ito matutukoy\n" +
                            "Suriin ang palayan kung mayroong mga bansot at nalalantang pananim. Gayundin, tingnan kung may pagkawala ng ugat. Maaari ring maging kahel-dilaw (orange-yellow) ang dahon.\n" +
                            "\n" +
                            "Ang ibang pesteng gaya ng dapulak o mealy bug at hanip sa ugat o root aphids ay maaaring magdulot ng pagkabansot ng pananim. Ang pagiging kahel na dilaw (orange yellow) ay sintomas din ng kakulangan sa sustansya.\n" +
                            "\n" +
                            "Upang matiyak kung ang pinsala ay dulot ng ulalo, tingnan kung mayroong insekto:\n" +
                            "\n" +
                            "Itlog na kulay mala-gatas\n" +
                            "Mga husto sa gulang na ulalo na nanginginain sa mga dahon\n" +
                            "Ulalo o uod na nanginginain sa ugat\n" +
                            "Bakit ito mahalaga\n" +
                            "Ang mga puting ulalo ay hindi gaanong nakapipinsala ng palay at kalimitang makikita lamang sa palayan sa katihan. Ang mga husto sa gulang na ulalo ay kumakain ng dahon, samantalang ang mga uod naman ay kumakain ng ugat.\n" +
                            "\n" +
                            "Paano ito pangangasiwaan\n" +
                            "Ang populasyon ng ulalo ay napupuksa ng mga likas nitong kaaway at ng iba pang natural na paraan. Ilan sa mga likas na kaaway ng ulalo ay mga carabid beetles, ibon, palaka, paniki, tagak na kumakain ng uod at mga husto sa gulang na ulalo, scoliid wasps na parasito ng ulalo at  fungus na kumakain ng uod ng ulalo.\n\n");

        }else if(pest.equals("Aksip")){
            tView.setMovementMethod(new ScrollingMovementMethod());
            tView.setText("May anim na uri ng aksip na umaatake sa palay. Ito ang yellow stem borer, white stem borer, striped stem borer, gold-fringed stem borer, dark-headed striped stem borer, at ang pink stem borer.\n" +
                    "Sa mga aksip na ito, ang pink stem borer ang pinakamahinang maminsala sa palay, dahil mas kinakain ng mga ito ang tubo (sugarcane) kaysa palay.\n" +
                    "\n" +
                    "Ano ang nagagawa nito\n" +
                    "Maaaring makapaminsala ng palay ang aksip sa kahit anong yugto ng paglago ng palay mula pagkapunla hanggang sa paggulang.\n" +
                    "\n" +
                    "Kinakain nito ang mga suwi. Nagdudulot din ito ng pagkamatay o pagkatuyo ng gitnang suwi. Ito ay maaring mangyari mula sa yugto ng pagsibol hanggang sa paglago ng palay bago mamulaklak (vegetative phase). Nagdudulot ito ng puting uhay o uban (whiteheads) mula sa yugto ng paglilihi hanggang sa pamumulaklak ng palay (reproductive phase).\n" +
                    "\n" +
                    "Bakit at saan ito nangyayari\n" +
                    "Ang blast ay maaring makita sa mga bahaging mayroong blast spores.\n" +
                    "\n" +
                    "Nangyayari ito sa mga lugar na hindi gaanong mahalumigmig, nakararanas ng matagal at madalas na pag-ulan, at may malamig na temperatura sa umaga. Sa mga palayang katihan, ang malaking pagkakaiba ng temperatura sa araw at sa gabi na nagdudulot ng hamog sa mga dahon ay nakapagpapalala sa paglaganap ng sakit.\n" +
                    "\n" +
                    "Maaaring magkaroon ng blast ang palay sa anumang yugto ng paglaki nito. Ngunit, nababawasan din ang paglaganap nito habang tumatanda ang pananim.\n" +
                    "\n" +
                    "Paano ito matutukoy\n" +
                    "Suriin ang palayan kung may sintomas ng mga sumusunod na pinsala:\n" +
                    "\n" +
                    "Mga patay na suwi na madaling matanggal mula sa puno sa panahon ng pagtubo hanggang sa paglago ng palay bago mamulaklak (vegetative phase)\n" +
                    "Puting uhay o ban (whiteheads) sa panahon mula paglilihi hanggang sa pamumulaklak (reproductive phase) ng palay kung saan ang mga tumutubong uhay ay kulay puti at hindi puno o walang laman\n" +
                    "Maliliit na butas sa tangkay at suwi\n" +
                    "Dumi ng insekto sa loob ng nasirang tangkay\n" +
                    "Ang mga patay na suwi at mga puting uhay o uban ay maaaring mapagkamalang pinsalang dulot ng mga daga, pamumutok-batok (neck blast), at mga sakit na dinadala ng itim na atangya.\n" +
                    "\n" +
                    "Upang matiyak ang pinsalang naidulot ng aksip, suriin ang palay para sa mga patay na suwi sa panahon mula sa pagtubo hanggang sa paglago ng palay bago mamulaklak (vegetative phase), at para sa puting uhay o uban (whiteheads) sa panahon mula paglilihi hanggang sa pamumulaklak ng palay (reproductive phase). Ang mga tangkay ay maaaring tanggalin, hiwain at suriin upang makita kung may pinsalang naidulot ang mga uod o pyupa.\n" +
                    "\n" +
                    "Bakit ito mahalaga\n" +
                    "Ang labis na pagbubutas sa talukap ay maaaring makasira ng pananim. Ang pinsalang dulot nito ay maaaring magpababa ng suwing kayang magparami (reproductive tillers). Kung ang impeksyon ay nangyari sa mga huling yugto ng paglaki ng palay, makapagdudulot ito ng mga puting uhay o uban.\n" +
                    "\n" +
                    "Ang pinsala ng aksip (yellow stem borer) ay maaring magdulot ng 20% na pagbawas ng ani sa mga palayang maagang tinamnan, at 80% naman sa mga palayang huli nang natamnan\n" +
                    "Ang white stem borer ay isang mapaminsalang peste sa mga palayang sahod-ulan. Maaari itong lubhang dumami at makasira ng buong palayan.\n" +
                    "Ang striped stem borer ay isa sa mga pinakamapaminsalang peste sa Asya. Sa mga malubhang kaso, ang pinsala nito ay maaaring umabot ng 100%.\n" +
                    "Ang goldfringe stem borer, isang uri ng aksip, ay maaring magdulot ng 30% na pagkabawas ng ani.\n" +
                    "Paano ito pangangasiwaan\n" +
                    "Gumamit ng mga variety na may resistensiya sa mga aksip\n" +
                    "Kunin at patayin ang kumpol ng itlog sa punlaan at tuwing maglilipat-tanim\n" +
                    "Pana-panahong itaas ang lebel ng patubig upang lumubog ang mga itlog na napunta sa ibabang parte ng palay\n" +
                    "Bago mag lipat-tanim, putulin ang taas na bahagi ng dahon upang mabawasan ang pagdadala ng itlog mula punlaan papunta sa palayan\n" +
                    "Iakma ang panahon ng pagtatanim na hindi sasabay ang pag-aani ng palay sa pagdami ng aksip. Halimabawa, mataas ang populasyon ng aksip mula Abril hanggang Mayo at Oktubre hanggang Disyembre. Ang pagtatanim ay dapat gawin mula Hunyo hanggang Hulyo o Disyembre hanggang Enero para maiwasan na matapat ang pag-aani sa panahon ng pagdami ng aksip.\n" +
                    "Sabayang pagtatanim sa loob ng dalawang linggo\n" +
                    "Tanggalin ang pinaggapasan at ang palay na kusang tumubo. Araruhin at ilubog sa tubig ang lupa bago ihanda sa pagtatanim.\n" +
                    "Gumamit ng mga likas na kaaway ng aksip gaya ng: braconid, eulophid, mymarid, scelionid, chalcid, ptermalid at trichogrammatid wasps, mga langgam, lady beetles, staphylinid beetles, gryllid, green meadow grasshopper, mirid, phorid at platystomatid flies, bethylid, elasmid, eurytomid at ichneumonid wasps, carabid at ladybird beetles, chloropid fly, gerrid and pentatomid bugs, tungaw, earwigs, ibon, asilid fly, vespid wasp, dragonflies, damselflies, gagamba, mermithid nematode, chalcid, elasmid at eulophid\n" +
                    "Hatiin ang paggamit ng patabang nitrogen (N) sa akmang dami at panahon.\n" +
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

        }else{

        }

        camera1 = findViewById(R.id.camera);
        camera1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Pest4.this,Camera1.class);
                startActivity(intent1);

            }});

        home1= findViewById(R.id.home);
        home1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pest4.this,HomeMainActivity3.class);
                startActivity(intent);
            }});
        Toolbar mtoolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);


    }@Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item_file1, menu);


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

    if (id == R.id.W) {

        TextView tView2 = findViewById(R.id.textview1);
        TextView tView3 = findViewById(R.id.textview2);
        ImageView imag4 = findViewById(R.id.view23);

        Intent intent = getIntent();
        tView2.setText(intent.getStringExtra("select"));
        tView3.setText(intent.getStringExtra("select"));
        imag4.setImageResource(intent.getIntExtra("image", 0));
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