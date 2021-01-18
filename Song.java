package com.company;

import javax.print.attribute.standard.MediaSize;

public class Song {
    public void Born(){
        System.out.print("Так и родилась эта песенка.");
    }
    public static void Singing() {
        String wordsinsong = " Тара-тара-тара-ра ! Трам-пам-пам-тарарам-пам-па!";
        class Words {

            public void WordsWereSimply() {
                System.out.print("Слова в этой песенке были примерно такими:"+wordsinsong);

            }

        }
        Words words = new Words();
        words.WordsWereSimply();
    }
        public String toString() {
            return "Песенке ";
        }

        public boolean equals(Object obj) {
            return obj != null && this.getClass() == obj.getClass();
        }

        public int hashCode() {
            return super.hashCode();
        }
    }
