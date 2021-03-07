package com.example.srhr_client.model;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.srhr_client.R;
import com.example.srhr_client.adapter.QuesAnsAdapter;

import java.util.ArrayList;
import java.util.List;

public class AppFaq extends Fragment {
    View rootView;
    //PDFView pdfView;
    RecyclerView recyclerView;
    QuesAnsAdapter quesAnsAdapter;
    List<QuesAns> quesAnsList;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_app_faq, container, false);
        recyclerView = rootView.findViewById(R.id.rv_app_faq);
        quesAnsList = new ArrayList<>();

        quesAnsList.add(new QuesAns("Is it true that men also go through Menopause?\n", "Yes, men too have Menopause. Some doctors refer to this as androgen (testosterone) deficiency in the aging male (ADAM) due to which men typically experience a decline in testosterone production due to aging."
                , "Q1."));
        quesAnsList.add(new QuesAns(" Is vaginal discharge normal?\n","Yes, vaginal discharge is absolutely normal. Our vagina has a self-cleansing property. It cleans all the gunk out through vaginal fluid. We call it a discharge. It’s a sign of a normal functioning vagina.\n"+
                "If the discharge is more than usual, has an unusual odour or colour, then you should speak to a doctor.\n","Q2"));
        quesAnsList.add(new QuesAns("Can a woman get pregnant while breastfeeding?\n","Even though there is a common belief that a woman cannot get pregnant while she is breastfeeding, she can still get pregnant. Breastfeeding may suppress or delay menstruation. Ovulation will occur before you start having menstrual periods again, so follow your doctor's recommendation on the appropriate birth control method to use.\n","Q3"));
        quesAnsList.add(new QuesAns(" Is it OK to use Vaseline as a lubricant with a latex condom?\n","No. Use only water-based lubricants, such as K-Y Jelly, with condoms. Oil-based lubricants, like Vaseline, can weaken the condom and cause it to break.\n","Q4"));
        quesAnsList.add(new QuesAns(" Can a woman get pregnant using the withdrawal method of birth control?\n","The withdrawal method is not completely full proof method of birth control. You can get pregnant, if the man ejaculates before he actually climaxes (fluid that contains sperm) may be released into the vagina.\n","Q5"));
        quesAnsList.add(new QuesAns("What is sexual health?\n","Good health is considered to be a state of “complete physical, mental and social well being” and not merely the absence of diseases or infirmity. The principles of sexual health are the same: “Physical well being” means good health and hygiene for your genitals and related systems. “Mental well being” means feeling okay about your sexual desires and needs and not guilty or depressed about them. “Social well being” means not facing social discrimination because of your sexual desires and needs, or because of any problem that may result from unsafe sex. A combination of all these factors makes for a (sexually) healthy YOU!\n","Q6"));
        quesAnsList.add(new QuesAns("What are HIV and AIDS? Are they the same?\n","HIV stands for “human immunodeficiency virus” and AIDS stands for “acquired immune deficiency syndrome”. In simple terms: HIV is a “virus” that makes the human body’s immune system weak or deficient, while AIDS is an “outcome of HIV infection”.\n","Q7"));
        quesAnsList.add(new QuesAns("What is the meaning of the full form of AIDS: Acquired immune deficiency syndrome?\n","The term “acquired” implies that AIDS is not hereditary or present in your body from birth. It comes from an external source through certain behaviours or situations. “Immune deficiency” means AIDS is something that makes your immunity deficient. “Syndrome” implies that AIDS is a collection of diseases that attack your body when its immunity becomes weak.\n","Q8"));
        quesAnsList.add(new QuesAns("How can you get infected with HIV?\n","HIV spreads when an infected person’s blood, semen, or rectal or vaginal fluids get into your bloodstream. The most common ways for this to happen are through unprotected anal or vaginal sex or sharing needles or syringes with an HIV-positive person.\n" +
                "Pregnant women who are HIV-positive can pass the virus to their baby before or during birth. HIV can also pass to a baby through breastfeeding. But the risk is very low for women who take HIV medicine.\n","Q8"));
        quesAnsList.add(new QuesAns(" How can you get infected with HIV?\n","HIV spreads when an infected person’s blood, semen, or rectal or vaginal fluids get into your bloodstream. The most common ways for this to happen are through unprotected anal or vaginal sex or sharing needles or syringes with an HIV-positive person.\n" +
                "Pregnant women who are HIV-positive can pass the virus to their baby before or during birth. HIV can also pass to a baby through breastfeeding. But the risk is very low for women who take HIV medicine.\n","Q9"));
        quesAnsList.add(new QuesAns("  How can you avoid being infected with HIV through sex?\n","By having a mutually faithful and monogamous sexual relationship with an uninfected partner.\n" +
                "Or practising safer sex with every sexual partner, which involves using condoms or other latex barriers (like dental dams and femmedoms) properly and every time you practice certain penetrative sexual acts.\n","Q10"));
        quesAnsList.add(new QuesAns("What is male responsibility in the context of sexual health?\n","What is male responsibility in the context of sexual health?\n","Q11"));
        quesAnsList.add(new QuesAns("Is Abortion legal in India?\n","Yes, Abortion is legal in India. Anyone who is the age of 18 or more with a pregnancy of less than 20 weeks, can go to a nearest licensed clinic to get an abortion.\n","Q12"));
        quesAnsList.add(new QuesAns("Do I need anybody’s permission to get an abortion?","If you are an adult, you do not need anybody’s permission to get an abortion. It’s your body, so it’s your choice.","Q13"));
        quesAnsList.add(new QuesAns("Can I just get an abortion pill from the pharmacy instead of going to a doctor?\n","No, it is very important to speak to a doctor because taking the pills without supervision can cause life-threatening complications. Speak to your doctor, who will guide you and give you the best possible care. Also, it is illegal for the pharmacist to sell you the pills without prescription.\n","Q14"));
        quesAnsList.add(new QuesAns(" Is it true that taking painkillers for period pain/cramps will make me infertile?\n"," Is it true that taking painkillers for period pain/cramps will make me infertile?\n","Q15"));
        quesAnsList.add(new QuesAns(" What is Sexual Rights?\n","Having sex is not a sexual right. The most important factor in a sexual act is the willingness and consent of both partners. This could be true of a same sex partners or male and female partners. Our society looks upon marriage as a license to have sex and disapproves of sexual relationships which may be mutual and long standing or random choice of partners. What you need to understand and have a view on the nature of the relationship which may be casual or for a price. There is no compromise on the question of “ consent”. Moral and ethical values are your own and generally influenced by your religion and culture. The woman/girl needs to be aware that conception (male sperm attaches itself to the female egg) can take place in the very first act of sex which is most frequent in young women who have healthy and regular release of eggs every month which will stop the minute conception takes place. The question of responsibility should be of both partners who willingly want a child remember the man has no responsibility if a woman gets pregnant in a casual relationship.\n" +
                " \n" +
                "Freedom as Right  to have sex :\n" +
                "The women’s movement in the 20th century brought about a huge change in the understanding of freedom as a right to have sex which has/ has not been the best way to assert a woman’s independence at the cost of irresponsible sex which may result in pregnancy and sexually transmitted diseases.\n" +
                "The concept of personal right of a man or a  woman, to have sex for pleasure is distinct from  sex for reproduction as stipulated by religion which is reflected in practicing abstinence. Sex is a biological necessity and therefore we can say it is natural and sexual desire is not something to be ashamed of. However, it can become wholly consuming and if not met with satisfaction could become a distraction from all other needs in life.\n" +
                "Men and women experience sexual desire differently. We have to understand the needs of adolescents and youth when the hormones are most prolific and demanding release. Sexual desire and attraction are often confused with love. So, the need for falling in love is beyond biological when emotions are involved and we say “Love is Blind”.\n" +
                "Each individual experience is unique and we do not look for reasons to justify love.\n","Q16"));

        quesAnsList.add(new QuesAns("What should a woman do if she forgets to take her birth control pills?\n","If you forget to take a birth control pill, take it as soon as you remember. If you don't remember until the next day, go ahead and take two pills that day. If you forget to take your pills for two days, take two pills the day you remember and two pills the next day. You will then be back on schedule. If you miss more than two pills, call your health care provider for instructions. Those instructions may be to take one pill daily until Sunday and then start a new pack or to discard the rest of the pill pack and start over with a new pack that same day.\n" +
                "Any time you forget to take a pill, you must use another form of birth control until you finish the pill pack. When you forget to take a birth control pill, you increase the chance of releasing an egg from your ovary. However, if you forget to take any of the last seven out of the 28-day pills, you will not raise your chance of pregnancy, because these pills contain only inactive ingredients. If you miss your period and have forgotten to take one or more pills, get a pregnancy test. If you miss two periods even though you have taken all your pills on schedule, you should get a pregnancy test.\n","Q17"));


        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        quesAnsAdapter = new QuesAnsAdapter(quesAnsList);
        recyclerView.setAdapter(quesAnsAdapter);
        return rootView;
    }
}