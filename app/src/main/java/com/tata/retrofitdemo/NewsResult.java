package com.tata.retrofitdemo;

import java.util.List;

/**
 * @Description:
 * @Author: Terry
 * @Date: 3/24/21 7:26 PM
 */
public class NewsResult {

    /**
     * stat : 1
     * data : [{"uniquekey":"655f0e91c87e2ea3c870f873c1ff9506","title":"视频｜1.5公里长！来看上海最美的樱花隧道","date":"2021-03-24 18:44:00","category":"头条","author_name":"看看新闻网","url":"https://mini.eastday.com/mobile/210324184449200347292.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210324/20210324184449_d1bd49ece33808c95bca84fce0a168fc_1_mwpm_03201609.png","is_content":"1"}]
     */

    private String stat;
    private List<DataBean> data;

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        @Override
        public String toString() {
            return "DataBean{" +
                    "uniquekey='" + uniquekey + '\'' +
                    ", title='" + title + '\'' +
                    ", date='" + date + '\'' +
                    ", category='" + category + '\'' +
                    ", author_name='" + author_name + '\'' +
                    ", url='" + url + '\'' +
                    ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                    ", is_content='" + is_content + '\'' +
                    '}';
        }

        /**
         * uniquekey : 655f0e91c87e2ea3c870f873c1ff9506
         * title : 视频｜1.5公里长！来看上海最美的樱花隧道
         * date : 2021-03-24 18:44:00
         * category : 头条
         * author_name : 看看新闻网
         * url : https://mini.eastday.com/mobile/210324184449200347292.html
         * thumbnail_pic_s : https://dfzximg02.dftoutiao.com/news/20210324/20210324184449_d1bd49ece33808c95bca84fce0a168fc_1_mwpm_03201609.png
         * is_content : 1
         */

        private String uniquekey;
        private String title;
        private String date;
        private String category;
        private String author_name;
        private String url;
        private String thumbnail_pic_s;
        private String is_content;

        public String getUniquekey() {
            return uniquekey;
        }

        public void setUniquekey(String uniquekey) {
            this.uniquekey = uniquekey;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getAuthor_name() {
            return author_name;
        }

        public void setAuthor_name(String author_name) {
            this.author_name = author_name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getThumbnail_pic_s() {
            return thumbnail_pic_s;
        }

        public void setThumbnail_pic_s(String thumbnail_pic_s) {
            this.thumbnail_pic_s = thumbnail_pic_s;
        }

        public String getIs_content() {
            return is_content;
        }

        public void setIs_content(String is_content) {
            this.is_content = is_content;
        }
    }

    @Override
    public String toString() {
        return "NewsResult{" +
                "stat='" + stat + '\'' +
                ", data=" + data +
                '}';
    }
}
