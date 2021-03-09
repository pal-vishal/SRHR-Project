package com.example.srhr_client;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.srhr_client.adapter.QuesAnsAdapter;
import com.example.srhr_client.model.QuesAns;

import java.util.ArrayList;
import java.util.List;


public class Menstruation extends Fragment {
    View rootView;
    //PDFView pdfView;
    RecyclerView recyclerView;
    QuesAnsAdapter quesAnsAdapter;
    List<QuesAns> quesAnsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_menstruation, container, false);
        recyclerView = rootView.findViewById(R.id.rv_mens);
        quesAnsList = new ArrayList<>();

        quesAnsList.add(new QuesAns("What is menstruation","Menstruation, or period, is normal vaginal bleeding that occurs as part of a woman's monthly cycle. Every month, your body prepares for pregnancy. If no pregnancy occurs, the uterus, or womb, sheds its lining. The menstrual blood is partly blood and partly tissue from inside the uterus. It passes out of the body through the vagina.\n" +
                "Periods usually start between age 11 and 14 and continue until menopause at about age 51. They usually last from three to five days. Besides bleeding from the vagina, you may have\n " +
                "\uF0B7Abdominal or pelvic pain \n" +
                "\uF0B7Lower back pain\n" +
                "\uF0B7Bloating and sore breasts\n" +
                "\uF0B7Food cravings\n" +
                "\uF0B7Mood swings and irritability\n" +
                "\uF0B7Headache and fatigue\n"+
                "Premenstrual Syndrome or PMS, is a group of symptoms that start before the period. It can include emotional and physical symptoms","Q1"));

        quesAnsList.add(new QuesAns("When Do Most Girls Get Their Period?","Most girls get their first period when they're around 12. But getting it any time between age 10 and 15. Every girl's body has its own schedule.\n" +
                "There isn't one right age for a girl to get her period. But there are some clues that it will start soon:\n" +
                "\uF0B7Most of the time, a girl gets her period about 2 years after her breasts start to develop.\n" +
                "\uF0B7Another sign is vaginal discharge fluid (sort of like mucus) that a girl might see or feel on her underwear. This discharge usually begins about 6 months to a year before a girl gets her first period.","Q2"));

        quesAnsList.add(new QuesAns("What Causes a Period?","A period happens because of changes in hormones in the body. Hormones are chemical messengers. The ovaries release the female hormones estrogen and progesterone \n" +
                "These hormones cause the lining of the uterus (or womb) to build up. The built-up lining is ready for a fertilized egg to attach to and start developing. If there is no fertilized egg, the lining breaks down and bleeds. Then the same process happens all over again.It usually takes about a month for the lining to build up, then break down. That is why most girls and women get their periods around once a month.","Q3"));

        quesAnsList.add(new QuesAns("How Does Ovulation Relate to Periods?","Ovulation- is the release of an egg from the ovaries. The same hormones that cause the uterus lining to build up also cause an egg to leave one of the ovaries. The egg travels through a thin tube called a fallopian tube to the uterus.\n" +
                "If the egg is fertilized by a sperm cell, it attaches to the wall of the uterus, where over time it develops into a baby. If the egg is not fertilized, the uterus lining breaks down and bleeds, causing a period.","Q4"));

        quesAnsList.add(new QuesAns("Do Periods Happen Regularly When Menstruation Starts?","For the first few years after a girl starts her period, it may not come regularly. This is normal at first. By about 2–3 years after her first period, a girl's periods should be coming around once every 4–5 weeks.","Q5"));
        quesAnsList.add(new QuesAns("Can  you get Pregnant as Soon as your Period Starts?","Yes, a girl can get pregnant as soon as her period starts. A girl can even get pregnant right before her very first period. This is because a girl's hormones might already be active. The hormones may have led to ovulation and the building of the uterine wall. If a girl has sex, she can get pregnant, even though she has never had a period.","Q6"));
        quesAnsList.add(new QuesAns("How Long Do Periods Last?","Periods usually last about 5 days. But a period can be shorter or last longer.","Q7"));
        quesAnsList.add(new QuesAns("Should I Use a Pad, Tampon, or Menstrual Cup?","You have many choices about how to deal with period blood. You may need to experiment a bit to find which works best for you. Some girls use only one method and others switch between different methods.\n" +
                "\uF0B7Most girls use pads when they first get their period. Pads are made of cotton and come in lots of different sizes and shapes. They have sticky strips that attach to the underwear.\n" +
                "\uF0B7Many girls find tampons more convenient than pads, especially when playing sports or swimming. A tampon is a cotton plug that a girl puts into her vagina. Most tampons come with an applicator that guides the tampon into place. The tampon absorbs the blood. Don't leave a tampon in for more than 8 hours because this can increase your risk of a serious infection called Toxic shock syndrome. \n" +
                "\uF0B7Some girls prefer a menstrual cup. Most menstrual cups are made of silicone. To use a menstrual cup, a girl inserts it into her vagina. It holds the blood until she empties it.","Q8"));
        quesAnsList.add(new QuesAns("How Much Blood Comes Out?","It may look like a lot of blood, but a girl usually only loses a few tablespoons of blood during the whole period. Most girls need to change their pad, tampon, or menstrual cup about 3‒6 times a day.","Q9"));
        quesAnsList.add(new QuesAns("Will I Have Periods for the Rest of My Life?","When women reach menopause (around age 45‒55), their periods will permanently stop. Women also won't have a period while they are Pregnant","Q10"));
        quesAnsList.add(new QuesAns("What Is PMS?","PMS (premenstrual syndrome) is when a girl has emotional and physical symptoms that happen before or during her period. These symptoms can include moodiness, sadness, anxiety, bloating, and acne. The symptoms go away after the first few days of a period.","Q11"));
        quesAnsList.add(new QuesAns("What Can I Do About Cramps?","Many girls have cramps with their period, especially in the first few days. If cramps bother you, you can try:\n" +
                "\uF0B7a warm heating pad on your belly\n" +
                "\uF0B7taking ibuprofen (Advil, Motrin, or store brand) or naproxen (Aleve or store brand)\n" +
                "\n" +
                "Most girls don't have any problems with their periods. But call your doctor if you:\n" +
                "\uF0B7are 15 and haven't started your period\n" +
                "\uF0B7have had your period for more than 2 years and it still doesn't come regularly (about every 4–5 weeks)\n" +
                "\uF0B7have bleeding between periods\n" +
                "\uF0B7have severe cramps that don't get better with ibuprofen or naproxen \n" +
                "\uF0B7have very heavy bleeding (bleeding that goes through a pad or tampon faster than every 1 hour)\n" +
                "\uF0B7have periods that last more than about a week\n" +
                "\uF0B7have severe PMS that gets in the way of your everyday activities","Q12"));
        quesAnsList.add(new QuesAns("Can having sex during periods leads to pregnancy?","\uF0B7A common fertility myth is that a woman can’t get pregnant when she’s on her period. While the odds for pregnancy are lower on the days, you’re on your period, they aren’t zero.","Q13"));
        quesAnsList.add(new QuesAns("How does conception occur?","\uF0B7The ability to conceive requires the meeting of a male’s sperm with a female’s egg. Once a woman’s ovary releases an egg, the egg lives for only between 12 and 24 hours. The male sperm can live for about three days.\n" +
                "\uF0B7The typical female cycle is 28 days. Day 1 is when she starts her period. A woman typically ovulates around day 14 (but it could be around days 12, 13, or 14) ovulation is when a woman’s ovary releases an egg for fertilization. If a sperm is available in the uterus, pregnancy can occur.\n" +
                "\uF0B7Ovulation can vary based on a woman’s cycle. Some women have a longer cycle of around 35 days between periods. Ovulation would then happen around day 21. Women with a shorter cycle of 21 days ovulate around the seventh day","Q15"));

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        quesAnsAdapter = new QuesAnsAdapter(quesAnsList);
        recyclerView.setAdapter(quesAnsAdapter);


        return rootView;
    }
}