package com.muratcakin.parma

import android.os.Parcelable
import com.google.gson.Gson
import kotlinx.parcelize.Parcelize

@Parcelize
data class Book(
    val cover: Int,
    val id: String,
    val title: String,
    val author: String,
    val description: String
) : Parcelable {
    fun toJson(): String {
        return Gson().toJson(this)
    }

    companion object {
        fun fromJson(jsonValue: String): Book {
            return Gson().fromJson(jsonValue, Book::class.java)
        }
    }
}

val mockBookData = mutableListOf<Book>(
    Book(
        R.drawable.book_2022_1,
        "1",
        "IT ENDS WITH US",
        "Colleen Hoover",
        "Lily hasn’t always had it easy, but that’s never stopped her from working hard for the life she wants. She’s come a long way from the small town where she grew up—she graduated from college, moved to Boston, and started her own business. And when she feels a spark with a gorgeous neurosurgeon named Ryle Kincaid, everything in Lily’s life seems too good to be true.\n" +
                "\n" +
                "Ryle is assertive, stubborn, maybe even a little arrogant. He’s also sensitive, brilliant, and has a total soft spot for Lily. And the way he looks in scrubs certainly doesn’t hurt. Lily can’t get him out of her head. But Ryle’s complete aversion to relationships is disturbing. Even as Lily finds herself becoming the exception to his “no dating” rule, she can’t help but wonder what made him that way in the first place.\n" +
                "\n" +
                "As questions about her new relationship overwhelm her, so do thoughts of Atlas Corrigan—her first love and a link to the past she left behind. He was her kindred spirit, her protector. When Atlas suddenly reappears, everything Lily has built with Ryle is threatened."
    ),
    Book(
        R.drawable.book_2022_2,
        "2",
        "WHERE THE CRAWDADS SING",
        "Delia Owens",
        "For years, rumors of the “Marsh Girl” have haunted Barkley Cove, a quiet town on the North Carolina coast. So in late 1969, when handsome Chase Andrews is found dead, the locals immediately suspect Kya Clark, the so-called Marsh Girl. But Kya is not what they say. Sensitive and intelligent, she has survived for years alone in the marsh that she calls home, finding friends in the gulls and lessons in the sand. Then the time comes when she yearns to be touched and loved. When two young men from town become intrigued by her wild beauty, Kya opens herself to a new life—until the unthinkable happens.\n" +
                "\n" +
                "Where the Crawdads Sing is at once an exquisite ode to the natural world, a heartbreaking coming-of-age story, and a surprising tale of possible murder. Owens reminds us that we are forever shaped by the children we once were, and that we are all subject to the beautiful and violent secrets that nature keeps."
    ),
    Book(
        R.drawable.book_2022_3,
        "3",
        "VERITY",
        "Colleen Hoover",
        "Lowen Ashleigh is a struggling writer on the brink of financial ruin when she accepts the job offer of a lifetime. Jeremy Crawford, husband of bestselling author Verity Crawford, has hired Lowen to complete the remaining books in a successful series his injured wife is unable to finish.\n" +
                " \n" +
                "Lowen arrives at the Crawford home, ready to sort through years of Verity’s notes and outlines, hoping to find enough material to get her started. What Lowen doesn’t expect to uncover in the chaotic office is an unfinished autobiography Verity never intended for anyone to read. Page after page of bone-chilling admissions, including Verity's recollection of the night her family was forever altered.\n" +
                " \n" +
                "Lowen decides to keep the manuscript hidden from Jeremy, knowing its contents could devastate the already grieving father. But as Lowen’s feelings for Jeremy begin to intensify, she recognizes all the ways she could benefit if he were to read his wife’s words. After all, no matter how devoted Jeremy is to his injured wife, a truth this horrifying would make it impossible for him to continue loving her."
    ),
    Book(
        R.drawable.book_2022_4,
        "4",
        "ATOMIC HABITS",
        "James Clear",
        "No matter your goals, Atomic Habits offers a proven framework for improving--every day. James Clear, one of the world's leading experts on habit formation, reveals practical strategies that will teach you exactly how to form good habits, break bad ones, and master the tiny behaviors that lead to remarkable results.\n" +
                "\n" +
                "If you're having trouble changing your habits, the problem isn't you. The problem is your system. Bad habits repeat themselves again and again not because you don't want to change, but because you have the wrong system for change. You do not rise to the level of your goals. You fall to the level of your systems. Here, you'll get a proven system that can take you to new heights.\n" +
                "\n" +
                "Clear is known for his ability to distill complex topics into simple behaviors that can be easily applied to daily life and work. Here, he draws on the most proven ideas from biology, psychology, and neuroscience to create an easy-to-understand guide for making good habits inevitable and bad habits impossible. Along the way, readers will be inspired and entertained with true stories from Olympic gold medalists, award-winning artists, business leaders, life-saving physicians, and star comedians who have used the science of small habits to master their craft and vault to the top of their field.\n" +
                "\n" +
                "Learn how to:\n" +
                "-make time for new habits (even when life gets crazy);\n" +
                "-overcome a lack of motivation and willpower;\n" +
                "-design your environment to make success easier;\n" +
                "-get back on track when you fall off course;\n" +
                "...and much more.\n" +
                "\n" +
                "Atomic Habits will reshape the way you think about progress and success, and give you the tools and strategies you need to transform your habits--whether you are a team looking to win a championship, an organization hoping to redefine an industry, or simply an individual who wishes to quit smoking, lose weight, reduce stress, or achieve any other goal."
    ),
    Book(
        R.drawable.book_2022_5,
        "5",
        "REMINDERS OF HIM",
        "Colleen Hoover",
        "After serving five years in prison for a tragic mistake, Kenna Rowan returns to the town where it all went wrong, hoping to reunite with her four-year-old daughter. But the bridges Kenna burned are proving impossible to rebuild. Everyone in her daughter’s life is determined to shut Kenna out, no matter how hard she works to prove herself.\n" +
                "\n" +
                "The only person who hasn’t closed the door on her completely is Ledger Ward, a local bar owner and one of the few remaining links to Kenna’s daughter. But if anyone were to discover how Ledger is slowly becoming an important part of Kenna’s life, both would risk losing the trust of everyone important to them.\n" +
                "\n" +
                "The two form a connection despite the pressure surrounding them, but as their romance grows, so does the risk. Kenna must find a way to absolve the mistakes of her past in order to build a future out of hope and healing."
    ),
    Book(
        R.drawable.book_2022_6,
        "6",
        "UGLY LOVE",
        "Colleen Hoover",
        "When Tate Collins meets airline pilot Miles Archer, she doesn't think it's love at first sight. They wouldn’t even go so far as to consider themselves friends. The only thing Tate and Miles have in common is an undeniable mutual attraction. Once their desires are out in the open, they realize they have the perfect set-up. He doesn’t want love, she doesn’t have time for love, so that just leaves the sex. Their arrangement could be surprisingly seamless, as long as Tate can stick to the only two rules Miles has for her.\n" +
                "\n" +
                "Never ask about the past.\n" +
                "Don’t expect a future.\n" +
                "\n" +
                "They think they can handle it, but realize almost immediately they can’t handle it at all.\n" +
                "\n" +
                "Hearts get infiltrated.\n" +
                "Promises get broken.\n" +
                "Rules get shattered.\n" +
                "Love gets ugly."
    ),
    Book(
        R.drawable.book_2022_7,
        "7",
        "THE SEVEN HUSBANDS OF EVELYN HUGO",
        "Taylor Jenkins Reid",
        "Aging and reclusive Hollywood movie icon Evelyn Hugo is finally ready to tell the truth about her glamorous and scandalous life. But when she chooses unknown magazine reporter Monique Grant for the job, no one is more astounded than Monique herself. Why her? Why now?\n" +
                "\n" +
                "Monique is not exactly on top of the world. Her husband has left her, and her professional life is going nowhere. Regardless of why Evelyn has selected her to write her biography, Monique is determined to use this opportunity to jumpstart her career.\n" +
                "\n" +
                "Summoned to Evelyn’s luxurious apartment, Monique listens in fascination as the actress tells her story. From making her way to Los Angeles in the 1950s to her decision to leave show business in the ‘80s, and, of course, the seven husbands along the way, Evelyn unspools a tale of ruthless ambition, unexpected friendship, and a great forbidden love. Monique begins to feel a very real connection to the legendary star, but as Evelyn’s story near its conclusion, it becomes clear that her life intersects with Monique’s own in tragic and irreversible ways."
    ),
    Book(
        R.drawable.book_2022_8,
        "8",
        "IT STARTS WITH US",
        "Colleen Hoover",
        "Lily and her ex-husband, Ryle, have just settled into a civil coparenting rhythm when she suddenly bumps into her first love, Atlas, again. After nearly two years separated, she is elated that for once, time is on their side, and she immediately says yes when Atlas asks her on a date.\n" +
                "\n" +
                "But her excitement is quickly hampered by the knowledge that, though they are no longer married, Ryle is still very much a part of her life—and Atlas Corrigan is the one man he will hate being in his ex-wife and daughter’s life.\n" +
                "\n" +
                "Switching between the perspectives of Lily and Atlas, It Starts with Us picks up right where the epilogue for the “gripping, pulse-pounding” (Sarah Pekkanen, author of Perfect Neighbors) bestselling phenomenon It Ends with Us left off. Revealing more about Atlas’s past and following Lily as she embraces a second chance at true love while navigating a jealous ex-husband, it proves that “no one delivers an emotional read like Colleen Hoover” (Anna Todd, New York Times bestselling author)."
    ),
    Book(
        R.drawable.book_2022_9,
        "9",
        "THE BODY KEEPS THE SCORE",
        "Bessel Van Der Kolk M.D.",
        "Trauma is a fact of life. Veterans and their families deal with the painful aftermath of combat; one in five Americans has been molested; one in four grew up with alcoholics; one in three couples have engaged in physical violence. Dr. Bessel van der Kolk, one of the world’s foremost experts on trauma, has spent over three decades working with survivors. In The Body Keeps the Score, he uses recent scientific advances to show how trauma literally reshapes both body and brain, compromising sufferers’ capacities for pleasure, engagement, self-control, and trust. He explores innovative treatments—from neurofeedback and meditation to sports, drama, and yoga—that offer new paths to recovery by activating the brain’s natural neuroplasticity. Based on Dr. van der Kolk’s own research and that of other leading specialists, The Body Keeps the Score exposes the tremendous power of our relationships both to hurt and to heal—and offers new hope for reclaiming lives."
    ),
    Book(
        R.drawable.book_2022_10,
        "10",
        "THE 48 LAWS OF POWER",
        "Robert Greene",
        "In the book that People magazine proclaimed “beguiling” and “fascinating,” Robert Greene and Joost Elffers have distilled three thousand years of the history of power into 48 essential laws by drawing from the philosophies of Machiavelli, Sun Tzu, and Carl Von Clausewitz and also from the lives of figures ranging from Henry Kissinger to P.T. Barnum.\n" +
                " \n" +
                "Some laws teach the need for prudence (“Law 1: Never Outshine the Master”), others teach the value of confidence (“Law 28: Enter Action with Boldness”), and many recommend absolute self-preservation (“Law 15: Crush Your Enemy Totally”). Every law, though, has one thing in common: an interest in total domination. In a bold and arresting two-color package, The 48 Laws of Power is ideal whether your aim is conquest, self-defense, or simply to understand the rules of the game."
    ),
    Book(
        R.drawable.book_2022_11,
        "11",
        "THE FOUR AGREEMENTS",
        "Don Miguel Ruiz",
        "In The Four Agreements, bestselling author don Miguel Ruiz reveals the source of self-limiting beliefs that rob us of joy and create needless suffering. Based on ancient Toltec wisdom, The Four Agreements offer a powerful code of conduct that can rapidly transform our lives to a new experience of freedom, true happiness, and love.\n" +
                "\n" +
                "•  A New York Times bestseller for over a decade\n" +
                "•  Translated into 46 languages worldwide\n" +
                " \n" +
                "“This book by don Miguel Ruiz, simple yet so powerful, has made a tremendous difference in how I think and act in every encounter.” — Oprah Winfrey\n" +
                "\n" +
                "“Don Miguel Ruiz’s book is a roadmap to enlightenment and freedom.” — Deepak Chopra, Author, The Seven Spiritual Laws of Success\n" +
                "\n" +
                "“An inspiring book with many great lessons.” — Wayne Dyer, Author, Real Magic\n" +
                "\n" +
                "“In the tradition of Castaneda, Ruiz distills essential Toltec wisdom, expressing with clarity and impeccability what it means for men and women to live as peaceful warriors in the modern world.” — Dan Millman, Author, Way of the Peaceful Warrior"
    ),
    Book(
        R.drawable.book_2022_12,
        "12",
        "THE VERY HUNGRY CATERPILLAR",
        "Eric Carle",
        "THE all-time classic picture book, from generation to generation, sold somewhere in the world every 30 seconds! A sturdy and beautiful book to give as a gift for new babies, baby showers, birthdays, and other new beginnings!\n" +
                "\n" +
                "Featuring interactive die-cut pages, this board book edition is the perfect size for little hands and great for teaching counting and days of the week.\n" +
                "\n" +
                "\"The very hungry caterpillar literally eats his way through the pages of the book—and right into your child's heart...\"\n" +
                "—Mother's Manual\n" +
                "\n" +
                "\"Gorgeously illustrated, brilliantly innovative...\"\n" +
                "—The New York Times Book Review"
    ),
    Book(
        R.drawable.book_2022_13,
        "13",
        "NOVEMBER 9",
        "Colleen Hoover",
        "Fallon meets Ben, an aspiring novelist, the day before her scheduled cross-country move. Their untimely attraction leads them to spend Fallon’s last day in Los Angeles together, and her eventful life becomes the creative inspiration Ben has always sought for his novel. Over time and amidst the various relationships and tribulations of their own separate lives, they continue to meet on the same date every year. Until one day Fallon becomes unsure if Ben has been telling her the truth or fabricating a perfect reality for the sake of the ultimate plot twist.\n" +
                "\n" +
                "Can Ben’s relationship with Fallon—and simultaneously his novel—be considered a love story if it ends in heartbreak?"
    ),
    Book(
        R.drawable.book_2022_14,
        "14",
        "I LOVE YOU TO THE MOON AND BACK",
        "Amelia Hepworth",
        "The sun rises, and a bear and cub begin their day together. They splash in the water, climb mountains, watch the colorful lights in the shimmering sky, and play with friends. They show their love for each other by touching noses, chasing each other, and, of course, hugging and snuggling before bed. A sweet, gentle rhyme, perfect for sharing with a special little one that also includes a “To” and \"From” personalization page in the front of the book, making this heartwarming book an ideal gift."
    ),
    Book(
        R.drawable.book_2022_15,
        "15",
        "ATLAS OF THE HEART",
        "Brene Brown",
        "In Atlas of the Heart, Brown takes us on a journey through eighty-seven of the emotions and experiences that define what it means to be human. As she maps the necessary skills and an actionable framework for meaningful connection, she gives us the language and tools to access a universe of new choices and second chances—a universe where we can share and steward the stories of our bravest and most heartbreaking moments with one another in a way that builds connection.\n" +
                " \n" +
                "Over the past two decades, Brown’s extensive research into the experiences that make us who we are has shaped the cultural conversation and helped define what it means to be courageous with our lives. Atlas of the Heart draws on this research, as well as on Brown’s singular skills as a storyteller, to show us how accurately naming an experience doesn’t give the experience more power—it gives us the power of understanding, meaning, and choice.\n" +
                " \n" +
                "Brown shares, “I want this book to be an atlas for all of us, because I believe that, with an adventurous heart and the right maps, we can travel anywhere and never fear losing ourselves.”"
    )
)

