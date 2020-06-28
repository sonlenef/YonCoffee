package me.lesonnnn.yoncoffee.screen.main.model;

/**
 * Created by leson on 6/28/20
 */
public class ItemMenuHome {
    private int mId;
    private String mTitle;
    private int mImage;

    public ItemMenuHome(int id, String title, int image) {
        mId = id;
        mTitle = title;
        mImage = image;
    }

    public int getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public int getImage() {
        return mImage;
    }

    public static class ItemMenuHomeBuilder {
        private int mId;
        private String mTitle;
        private int mImage;

        public ItemMenuHomeBuilder menuId(int id) {
            this.mId = id;
            return this;
        }

        public ItemMenuHomeBuilder menuTitle(String title) {
            this.mTitle = title;
            return this;
        }

        public ItemMenuHomeBuilder menuImage(int image) {
            this.mImage = image;
            return this;
        }

        public ItemMenuHome build() {
            return new ItemMenuHome(mId, mTitle, mImage);
        }
    }
}
