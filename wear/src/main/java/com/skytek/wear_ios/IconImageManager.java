package com.skytek.wear_ios;

/**
 * Created by kusabuka on 15/03/15.
 */
public class IconImageManager {
    private static final int app_icon = R.drawable.ic_launcher;
    private static final int line = R.drawable.line;
    private static final int phone = R.drawable.call;
    private static final int facebook = R.drawable.facebook;
    private static final int messanger = R.drawable.messenger;
    private static final int twitter = R.drawable.twitter;
    private static final int gmail = R.drawable.gmail;
    private static final int whatsapp = R.drawable.whatsapp;
    private static final int mail = R.drawable.mail;
    private static final int calendar = R.drawable.calendar;
    private static final int hangouts = R.drawable.hangouts;
    private static final int wallet = R.drawable.wallet;
    private static final int snapchat = R.drawable.snapchat;
    private static final int skype = R.drawable.skype;
    private static final int paypal = R.drawable.paypal;
    private static final int messengerfb = R.drawable.messengerfb;
    private static final int delivered = R.drawable.delivered;
    private static final int ebay = R.drawable.ebay;
    private static final int kik = R.drawable.kik;
    private static final int bible = R.drawable.bible;
    private static final int slotomania = R.drawable.slotomania;


    private static final int app_iconbg = R.drawable.ic_launcher;
    private static final int linebg = R.drawable.line;
    private static final int phonebg = R.drawable.call;
    private static final int facebookbg = R.drawable.facebook;
    private static final int messangerbg = R.drawable.bg_message;
    private static final int twitterbg = R.drawable.twitter;
    private static final int gmailbg = R.drawable.bg_email;
    private static final int whatsappbg = R.drawable.whatsapp;
    private static final int mailbg = R.drawable.mail;
    private static final int calendarbg = R.drawable.calendar;
    private static final int hangoutsbg = R.drawable.hangouts;
    private static final int walletbg = R.drawable.walletbg;
    private static final int snapchatbg = R.drawable.snapchatbg;
    private static final int skypebg = R.drawable.skypebg;
    private static final int paypalbg = R.drawable.paypalbg;
    private static final int messengerfbbg = R.drawable.messengerfbbg;
    private static final int deliveredbg = R.drawable.delivered;
    private static final int ebaybg = R.drawable.ebaybg;
    private static final int kikbg = R.drawable.kikbg;
    private static final int biblebg = R.drawable.biblebg;
    private static final int slotomaniabg = R.drawable.slotomaniabg;

    IconImageManager(){

    }

    public int get_image_index(String _app_id){
        switch (_app_id) {
            case "com.apple.mobilephone":
                return phone;
            case "com.apple.MobileSMS":
                return messanger;
            case "com.google.Gmail":
                return gmail;
            case "jp.naver.line":
                return line;
            case "facebook":
                return facebook;
            case "com.tapbots.Tweetbot":
                return twitter;
            //case "com.atebits.Tweetie2":
            //  return twitter;
            case "com.tapbots.Tweetbot3":
                return twitter;
            case "net.whatsapp.WhatsApp":
                return whatsapp;
            case "com.apple.mobilemail":
                return mail;
            case "com.apple.mobilecal":
                return calendar;
            case "com.google.hangouts":
                return hangouts;
            case "com.google.Wallet":
                return wallet;
            case "com.toyopagroup.picaboo":
                return snapchat;
            case "com.skype.skype":
                return skype;
            case "com.yourcompany.PPClient":
                return paypal;
            case "com.facebook.Messenger":
                return messengerfb;
            case "com.madeatsampa.Delivered":
                return delivered;
            case "com.ebay.iphone":
                return ebay;
            case "com.kik.chatKik":
                return kik;
            case "tv.lifechurch.bible":
                return bible;
            case "com.playtika.slotomania":
                return slotomania;
            default:
                return app_icon;
        }
    }
    public int get_image_background(String _app_id){
        switch (_app_id) {
            case "com.apple.mobilephone":
                return phonebg;
            case "com.apple.MobileSMS":
                return messangerbg;
            case "com.google.Gmail":
                return gmailbg;
            case "jp.naver.line":
                return linebg;
            case "facebook":
                return facebookbg;
            case "com.tapbots.Tweetbot":
                return twitterbg;
            case "com.tapbots.Tweetbot3":
                return twitterbg;
            case "net.whatsapp.WhatsApp":
                return whatsappbg;
            case "com.apple.mobilemail":
                return mailbg;
            case "com.apple.mobilecal":
                return calendarbg;
            case "com.google.hangouts":
                return hangoutsbg;
            case "com.google.Wallet":
                return walletbg;
            case "com.toyopagroup.picaboo":
                return snapchatbg;
            case "com.skype.skype":
                return skypebg;
            case "com.yourcompany.PPClient":
                return paypalbg;
            case "com.facebook.Messenger":
                return messengerfbbg;
            case "com.madeatsampa.Delivered":
                return deliveredbg;
            case "com.ebay.iphone":
                return ebaybg;
            case "com.kik.chatKik":
                return kikbg;
            case "tv.lifechurch.bible":
                return biblebg;
            case "com.playtika.slotomania":
                return slotomaniabg;
            default:
                return app_iconbg;
        }

    }
}
