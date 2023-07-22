package com.example.pestgon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class TagalogP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagalog_p);

        TextView tView = findViewById(R.id.textview1);
        TextView tView1 = findViewById(R.id.textview2);
        ImageView image = findViewById(R.id.view23);

        Intent intent = getIntent();
        tView.setText(intent.getStringExtra("select"));
        tView1.setText(intent.getStringExtra("select"));
        image.setImageResource(intent.getIntExtra("image", 0));
        String pest = tView.getText().toString();

        int insect[] = {R.drawable.ant,
                R.drawable.armyworm,
                R.drawable.bird,
                R.drawable.blackbug,
                R.drawable.brownplanthopper,
                R.drawable.goldensnail,
                R.drawable.greenplant,
                R.drawable.rat,
                R.drawable.ricebug,
                R.drawable.ricemealybug,
                R.drawable.stemborer,
                R.drawable.waterweevil,
                R.drawable.whiteplanthopper,
        };

        if(pest.equals("Ant")){
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

        } else if(pest.equals("Ngusong kabayo")) {
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
    }}
