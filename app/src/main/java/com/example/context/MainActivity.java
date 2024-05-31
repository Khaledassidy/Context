package com.example.context;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //wa2t kona nesta3mel toast kona 2awl parameter byetlob mene she esmo context 2am kona noktoub getBaseContext() w2olna bas ne7faza
        //hala2 badna neshra7a
        Toast.makeText(getBaseContext(), "Hello from activity", Toast.LENGTH_SHORT).show();



        //context ma3neta seyak

        //sho ya3ne context:
        //context ya3ne heed l commponent b2alb hay l activity bte2dar ta3mel 3lee acces wala la2
        
        //ne7na 3ana application aye application fe b2albo majmou3a mn l commponents Activiy,servive...etc
        //hawde l Activiy,servive...etc fe tawasoul de5ele baynetoun ya3ne feek tente2l mn activity la activity feek tsha8el mn 2alb activity mo3ayane serve mo3ayene....etc

        //ya3ne kel application fe majmo3a mn l commponents
        //a7yenan l commponent nafso bekoun fe b2albo commponent da5ele keef ya3ne:
        //ya3ne wa2t kouna net3mela ma3 listener aye nou3 listner kouna net3mal ma3 class de5ele kouna nsame announmous class 2aw inner annoumes class heed l commponent de5ele howe heed l announymous class
        //ya3ne l compponent de5ele howe class de5el class l activity 2aw class de5el class de5el class l commponent taba3 l android nafso
        //kel class metl anoneymous class l class de5ele 2aw class l application 2aw class l activity be3aber 3an context mo3ayan 3an seyak mo3ayan
        //la ma ne7ke context 2aw seyak mne7ke 3an majel mo3yan 3n fatra zamneye mo3ayane ya3ne kel ma l commponent heed 3eyesh kel ma l 3anaser l b2alba fene 2esta3mela ya3ne fena ne7ke eno 3anaser fe seyak (context) l class heda
        //kel ma l commponnet heda l esmo activity 3eysh sha8l kel ma fene esta3mel l 3naser l b2albo so be2dar e7ke eno l 3anser l jowa l activity  honefe seyak fe context  l acitivy
        //lama ne7ke eno she fe sheyak (context) she tene fa howe ma7dod be2tar heed she
        //l button le kona nzeda 3al sheshe howe fe seyak fe context shshe le ndaf 3lyha
        //shshe l activity le mnzeda 3al application hede fe seyak fe context l application le zednha 3lyha

        //fa ne7na 3ana inner commponent context,activitycontext,applicationcontext

        /*

       Application context
       _________________________________________
       |     Activity context                   |
       |     ________________________________   |
       |    |    inner commponent context    |  |
       |    |    _________________________   |  |
       |    |   |                          | |  |
       |    |   |                          | |  |
       |    |   |                          | |  |
       |    |   |                          | |  |
       |    |   |                          | |  |
       |    |   |                          | |  |
       |    |   |__________________________| |  |
       |    |________________________________|  |
       |________________________________________|


        meen hay rasme le 2edemna mne2dar ne7ke eno l inner commponent context howe fe seyak fe context l activity context
        wl activity heye fe seyak context l application context fe seyak l application kela

        sho l ma8za meen heed l mawdo3?

        3ashen enta tet3mela ma3 aye 3onsour mn shofo 3al shshe 2aw bem3na 2a5ar ta3mel 3amlyet mo7adade b2alb aye commponent mn hawde le 2edemna mtl l application,activity,inner commponent lezm ykoun 3andak mo2asher 3ala seyak(context) le enta btet3emal ma3o
        bem3na tene 3ashen ana deef activity  w deef 3lyha button lezm koun m3ref eno l button jowa seyak(context) l activity ana telk2eyan bas zedo 3al xml keen ykoun mawjoud jowa seyak(context) l activity

        lakan aye 3onsour badak tet3emal ma3o coding lezm ykoun mawjoud demn seyak(context) ma7dod bede5lo

        wa7ad mn haw l 3anaser le kena 3am net3meal ma3o w tbayan elna eno byelzamna l seyak(context) fe howe Toast
        kona lama nesta3ml toast kena nje ne7ke eno 2awl parameter lezm t7oto howe seyak le ana bade 2o3roud toast fe fa kona n2ol getbasecontext()



         Application context
       _________________________________________
       |     Activity context                   |
       |     ________________________________   |
       |    |    inner commponent context    |  |
       |    |    _________________________   |  |
       |    |   |                          | |  |
       |    |   |                          | |  |
       |    |   |                          | |  |
       |    |   |                          | |  |
       |    |   |                          | |  |
       |    |   |                          | |  |
       |    |   |__________________________| |  |
       |    |________________________________|  |
       |________________________________________|


        nerja3 la hay rasme

        t5ayal ma3e eno enta mawjoud de5el l activity context le mnyne 3al rasme w badak to3oroud toast fa l mante2 tkoun eno enta to3oroud toast 3ala hay l activity fa l mnate2 ta3te l context seyak l activity hayde lal toast

        l context howe 3ebara 3an class mawjoud bel android l activity 3mele extend mena bas enta manak e5ed belak fa class l asese la kel activity,kel commponent tet3mel ma3o esmo context ma3na l kalem class l context be2dar et3mela ma3o b2aye maken bade yeh

        la tet3mela ma3 l context 3ande 3 toro2:this,getBaseContext(),getApplicationContext()



             Application context
       _________________________________________
       |     Activity context                   |
       |                                        |
       |                                        |
       |         -this                          |
       |         - getBaseContext()             |
       |         - getApplicationContext()      |
       |     ________________________________   |
       |    |    inner commponent context    |  |
       |    |    _________________________   |  |
       |    |   |                          | |  |
       |    |   |   -getBaseContext()      | |  |
       |    |   |  -getApplicationContext()| |  |
       |    |   |                          | |  |
       |    |   |                          | |  |
       |    |   |                          | |  |
       |    |   |__________________________| |  |
       |    |________________________________|  |
       |________________________________________|


            -this:be3ber 3an l object le enta mawjoud b de5lo b3mlna eza katbt this b2alb toast w enta mawjoud b class l activity fa enta btkoun 3am t3ber 3an class le enta mawjoud fe la n2ol 3ana activity esma tringle w 7atet toast b2alb w 2awl parameter 7atyto this so enta 3am t3ber 3an l triangle law katabt this w enta mawjoud b class tene fa enta 3am t3ber 3an object tene
                w fene e7ke eno this mb2no bet3mel 3an class l enta fe w heed l class extend l appcomabat w heed l appcomat extend l context so this 3am t3aber 3an l context ya3ne enta la to3roud toast kol le be7je t2asher 3al context le badak yen3ered toast 3lee fa kel le badak t2asher 3lee l object taba3 l class

            -getBaseContext():ana iza 3ande button b2lb l sheshe 3mlo inflate ba3den jeet la 2a3mlo clicklistenr:


              ba3d ma 3mlt click listner badak bas l user yokbous 3al button yen3ered toast 3al activity
              bas enta 2oltele eno kelmet this bte8ne fa ktob this b 2awal paremeter bas3atane eno error lesh
              l2no abl shway ne7na 2olna eno kelmet this bet3ber 3an l object le enta mawjoud feh houn toast kelo mawjoud kelo b2alb class heed l class esmo OnClickListener() bas l on click listner mano context enta badel ma teb3tlo l context ba3telo l object l enta mawjoud fe l howe  OnClickListener() fa k2no 3am 2ole 3redle toast b2alb heed l class ma be2dar 2o3roud 3lee toast 3ashn heek 3atane error
              bas 3atane 7al tene 2alak bas tkoun b class de5ele mtl l click listner w badak tet3eml ma3 l context taba3 l activity fa sa3eta btest3ml getBaseContext() 7a yejble l context taba3 l 3onour le enta mawjoud feh fa ana mawjoud bl click listner wl click listener mawjoud b2alb l class l activity l2asese so 7a yejble l l activity l 2asese
              l getbasecontext heye nafsa zeta this bas this bte2dar tet3mela ma3a mobshrtan iza kont bl activity ama iza kenet b class tene w badak tosal la context so btesta3ml getbasecontext()

             button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(this, "Hello from activity", Toast.LENGTH_SHORT).show(); its not correct


               Toast.makeText(getBaseContext(), "Hello from activity", Toast.LENGTH_SHORT).show();
            }
        });


        -getApplicationContext():heed b5lek tjeeb l context taba3 l application kelo fa b7let l click listener feek t7et getbasecontext(),2aw getapplicationcontext()

        l far2 baynetoun l getbasecontext() mawjoud b2alb l activity kela 2ama
        l applicationcontext() howe l context taba3 l application kela bkel l activity le fee 2aw bem3na tene getapplicationcontext() bedalo sha8al 7ata law l activity le enta feha damaret 2ama l getbasecontext byedamar lama l activity yedmar






        so summry:
        iza enta b alb l class l activity mobsharatan w badak context sta3mel l this btjeblak l object le enta fe
        iza enta b2alb inner class w badak tosal lal context btesta3mel getbasecontext() fa 7ayjble l object taba3 l 3onsour le enta mawjoud fe le howe l activity ra2seye
        kamen bnafs hay k 7ale ta3et l inner class feek testa3mel applicationcontext() 7a tjeble l context taba3 kel l application fa 7ata law damaret l activity 7adala l sha8ale


        this:inside activity
        getbasecontext(),getapplicationcontext():inside inner class


        inside ativity:fene esta3mel aye wa7de mn l 3 3ade keloun byezbato:this,getbasecontext(),getapplicationcontext()
        innerclass: getbasecontext(),getapplicationcontext() bas hawde fene est3mleoun





        fa hay rasme bte5tesrle kel she:



                Application context
       _________________________________________
       |     Activity context                   |
       |                                        |
       |                                        |
       |         -this                          |
       |         - getBaseContext()             |
       |         - getApplicationContext()      |
       |     ________________________________   |
       |    |    inner commponent context    |  |
       |    |    _________________________   |  |
       |    |   |                          | |  |
       |    |   |   -getBaseContext()      | |  |
       |    |   |  -getApplicationContext()| |  |
       |    |   |                          | |  |
       |    |   |                          | |  |
       |    |   |                          | |  |
       |    |   |__________________________| |  |
       |    |________________________________|  |
       |________________________________________|







        fe tare2a tab3a esma getcontext()hay lama bade jeeb context activity mn activity tenye 2aw mn 3onsour tene ya3ne ana mawjoud b activity B  bade jeeb context taba3 activity A so besta3mel getContext() bas 2osala best3mela

        lama 2osala mne7ke 3an tafaselaaa.....






         */






    }
}