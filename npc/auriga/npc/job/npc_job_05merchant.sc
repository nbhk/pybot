//====================================================================
//Ragnarok Online Merchant jobchange script
//
//　■ CHANGE_MC -> 0〜1
//====================================================================

//==========================================
// 試験申請および転職
//------------------------------------------

alberta_in,53,43,6	script	商人組合員#MC	86,{
	if(Upper == UPPER_HIGH && (OLD_CLASS == Job_Blacksmith || OLD_CLASS == Job_Alchemist)) {
//		if(Job == Job_Novice) {
		if(Job == Job_Novice_High) {
			mes "[組合員マンス]";
			mes "やあ、何か用かい？";
			mes "今は商人じゃないみたいだな。";
			next;
			if(getskilllv(1) < 9) {
				mes "[組合員マンス]";
				mes "人には天職があるとはいえ";
				mes "基本的なことは共通している。";
				mes "まずは、JobLvを10にまで成長させ、";
				mes "^0000FF「基本スキル」のレベルを9　^000000に";
				mes "してから来てくれ。";
				next;
				mes "[組合員マンス]";
				mes "^0000FF「基本スキル」^000000のレベルは";
				mes "^0000FF「スキルリスト」^000000ウィンドウで";
				mes "上げることができる。";
				mes "^0000FF「スキルリスト」^000000ウィンドウは";
				mes "^0000FF「基本情報」^000000ウィンドウ内の";
				mes "^0000FF「Skill」^000000ボタンで表示されるぞ。";
				next;
				mes "[組合員マンス]";
				mes "スキルのレベルを上げるには、";
				mes "スキルポイントを割り振った後、";
				mes "^FF0000「確定」^000000ボタンが必要となる。";
				mes "注意するんだぞ。";
				next;
				mes "[組合員マンス]";
				mes "俺はいつでも組合に居るから";
				mes "準備ができたらまた来い。";
				close;
			}
			mes "[組合員マンス]";
			mes "しかし、君の天職は商人だ。";
			mes "これからも頑張って活動してくれ！";
			next;
			nude;
			jobchange Job_Merchant,UPPER_HIGH;
			//setquest 51220;
			//setquest 51280;
			//setquest 51335;
			skill 153,1,0;
			skill 154,1,0;
			skill 155,1,0;
			mes "[組合員マンス]";
			mes "よし、やっぱりその格好が似合うな。";
			close;
		}
	}
	if(Upper == UPPER_HIGH) {
		mes "[組合員マンス]";
		mes "ああ〜暇だ。";
		mes "暇すぎてぼけそう……";
		mes "カプラのおねえさんからの";
		mes "返事もまだ来ないし……";
		close;
	}
	mes "[組合員マンス]";
	mes "俺に何か用でも？";
	next;
	switch (select("商人になりたいんです","商人って何？","商人転職条件は？","何でもない")) {
	case 1:
		if(Job == Job_Merchant) {
			mes "[組合員マンス]";
			mes "うん？　何を言ってる？";
			mes "君はもう商人じゃないか、まったく。";
			mes "ここって笑う所だったの？";
//			next;
//			mes "[組合員マンス]";
//			mes "まぁ、君のような人が";
//			mes "商人になったんなら、";
//			mes "冒険者アカデミーに";
//			mes "行ってみるといいかもね。";
//			next;
//			mes "[組合員マンス]";
//			mes "この建物を出ると";
//			mes "冒険者アカデミーのサポートを";
//			mes "行っている人がいるから、";
//			mes "送ってもらうといいよ。";
			close;
		}
		if(Job != Job_Novice) {
			mes "[組合員マンス]";
			mes "我ら商人ギルドの人間は、";
			mes "コウモリみたいな奴が一番嫌いだ。";
			mes "昼は商売して、夜はエッチな服を着て";
			mes "怪しい酒場に通ってるそういう奴。";
			mes "うう……ムカムカ！";
			next;
			mes "[組合員マンス]";
			mes "まあ、話が長くなったけど、";
			mes "他の職業に就いてる君みたいな奴は";
			mes "商人ギルドには要らない。";
		   	close;
		}
		break;
	case 2:
		mes "[組合員マンス]";
		mes "商人？簡単に言うと、物を売って";
		mes "お金を稼ぐ。それが商人だ。";
		mes "戦闘が得意なわけでないし、";
		mes "大した攻撃・回復スキルもない。";
		mes "でも、安い値段でアイテムが手に入る。";
		next;
		mes "[組合員マンス]";
		mes "「メマーナイト」という究極の技が";
		mes "あるけど、まあ、それは別として……";
		mes "弓、杖、両手剣以外の武器も";
		mes "大体使えるし……";
		mes "と、とにかく、商人はお金稼ぎの";
		mes "ための職業だ。それで充分だろう？";
		close;
	case 3:
		mes "[組合員マンス]";
		mes "商人になるためには";
		mes "条件が必要だが、";
		mes "そんなに難しい話じゃない。";
		mes "まずは、JobLvを10にまで成長させ、";
		mes "^0000FF「基本スキル」のレベルを9^000000 に";
		mes "してから来てくれ。";
		next;
		mes "[組合員マンス]";
		mes "^0000FF「基本スキル」^000000のレベルは";
		mes "^0000FF「スキルリスト」^000000ウィンドウで";
		mes "上げることができる。";
		mes "^0000FF「スキルリスト」^000000ウィンドウは";
		mes "^0000FF「基本情報」^000000ウィンドウ内の";
		mes "^0000FF「Skill」^000000ボタンで表示されるぞ。";
		next;
		mes "[組合員マンス]";
		mes "スキルのレベルを上げるには、";
		mes "スキルポイントを割り振った後、";
		mes "^FF0000「確定」^000000ボタンが必要となる。";
		mes "注意するんだぞ。";
		next;
		mes "[組合員マンス]";
		mes "いくら商売主体の商人でも、";
		mes "^0000FF「基本スキル」がレベル9^000000 に達して";
		mes "いないと駄目だ。";
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	case 4:
		mes "[組合員マンス]";
		mes "そうか〜";
		mes "まぁ、気が変わったら";
		mes "またここに来ればいいさ。";
		close;
	}
	if(CHANGE_MC == 0) {
		mes "[組合員マンス]";
		mes "商人になりたいって？";
		mes "ふ……";
		next;
		mes "[組合員マンス]";
		mes "よしそれじゃこの申請書に";
		mes "サインしてくれ！";
		next;
		if(select("申請書にサインする","やめる")==2) {
			mes "[組合員マンス]";
			mes "そうか〜";
			mes "まぁ、気が変わったら";
			mes "またここに来ればいいさ。";
			close;
		}
		mes "[組合員マンス]";
		mes "申請書にサインをして……";
		mes "そうそう、サインは";
		mes "綺麗に書いてくれよ。";
		mes "字が汚いあまりに商談が";
		mes "失敗することだってあるんだからな。";
		next;
		mes "[組合員マンス]";
		mes "さってと、これからマーチャントに";
		mes "なるための条件を全て満たしているか";
		mes "確認するが、問題ないか？";
		next;
		if(select("はい","いいえ")==2) {
			mes "[組合員マンス]";
			mes "そうか〜";
			mes "まぁ、気が変わったら";
			mes "またここに来ればいいさ。";
			close;
		}
		set CHANGE_MC,1;
		mes "[組合員マンス]";
		mes "それじゃ、さっそく確認するぜ。";
		next;
	}
	mes "[組合員マンス]";
	mes "名前は……";
	mes " "+ strcharinfo(0) +" だな？";
	mes " "+ strcharinfo(0) +" の";
	mes "資料はっと……";
	next;
	mes "[組合員マンス]";
	mes "…";
	next;
	mes "[組合員マンス]";
	mes "……";
	next;
	if(getskilllv(1) < 9 || SkillPoint) {
		mes "[組合員マンス]";
		mes "おいおい！商人になるんだったら、";
		mes "^0000FF「基本スキル」のレベルが9^000000 に";
		mes "なってないと！";
		mes "まずは、JobLvを10にまで成長させ、";
		mes "^0000FF「基本スキル」のレベルを9^000000 に";
		mes "してから来てくれ。";
		next;
		mes "[組合員マンス]";
		mes "^0000FF「基本スキル」^000000のレベルは";
		mes "^0000FF「スキルリスト」^000000ウィンドウで";
		mes "上げることができる。";
		mes "^0000FF「スキルリスト」^000000ウィンドウは";
		mes "^0000FF「基本情報」^000000ウィンドウ内の";
		mes "^0000FF「Skill」^000000ボタンで表示されるぞ。";
		next;
		mes "[組合員マンス]";
		mes "スキルのレベルを上げるには、";
		mes "スキルポイントを割り振った後、";
		mes "^FF0000「確定」^000000ボタンが必要となる。";
		mes "注意するんだぞ。";
		next;
		mes "[組合員マンス]";
		mes "いくら金稼ぎの商人でも、";
		mes "最低限、基本がなってないとね。";
		close2;
		cutin "start_020_jp.bmp",1;
		end;
	}
	mes "[組合員マンス]";
	mes "^0000FF「基本スキル」^000000も問題ないみたいだな。";
	mes "よし、合格だ！";
	mes "すぐにマーチャントへの手続きを";
	mes "はじめるぞ！";
	next;
	getitem 11040,1;
	nude;
	jobchange Job_Merchant;
	set CHANGE_MC,0;
	setquest 50465;
	mes "[組合員マンス]";
	mes "おめでとう！";
	mes "組合一同、君が商人ギルドの一員に";
	mes "なった事を心からお祝いする。";
	mes "これからも頑張って活動してくれ。";
	next;
	mes "[組合員マンス]";
	mes "全世界通貨量の20％確保という";
	mes "我らの壮大な目標を達成するため、";
	mes "情熱溢れる青年の力が必要不可欠だ！";
	mes "判ったか？　俺の言う事が!?";
	mes "まあ、今のは話のたとえだ。";
	mes "結論的にはお金を稼ごうって話。";
	next;
	mes "[組合員マンス]";
	mes "あと、今、君に渡したのは";
	mes "商人ギルド作成の";
	mes "マーチャントの書だよ。";
	mes "役に立つはずだから";
	mes "一度読んでおくといい";
	close;
OnInit:
	waitingroom "転職",0;
	end;
}


//==========================================
// 荷物配達倉庫
//------------------------------------------

alberta_in,28,29,2	script	商人組合員	83,{
	mes "[組合員ケイ]";
	mes "やあー何の用？";
	next;
	switch (select("転職試験のことです","アルバイトの事です","何でもありません")) {
	case 1:
		if(Job == Job_Merchant) {
			mes "[組合員ケイ]";
			mes "何を言ってる？君はもう商人だろう？";
			close;
		}
		mes "[組合員ケイ]";
		mes "実は、マーチャントへの転職試験は";
		mes "撤廃されているんだ。";
		mes "よって、試験を受けてなくても";
		mes "マーチャントへの転職は可能だから";
		mes "中央の<組合員マンス>に話してみて。";
		close;
	case 2:
		mes "[組合員ケイ]";
		mes "アルバイト？まだ準備中だ。";
		mes "総会が予算をくれないんだ。";
		mes "まったく……";
		close;
	case 3:
		mes "[組合員ケイ]";
		mes "？　……うん、うん？";
		mes "何か？";
		close;
	}
}


//==========================================
// 配達
//------------------------------------------

prontera,248,42,0	script	カプラ職員::MC_DeliverPro	116,{
	cutin "kafra_02",2;
	mes "[カプラ職員]";
	mes "いらっしゃいませ、（株）カプラです。";
	mes "ご覧のとおり剣士ギルドは";
	mes "首都プロンテラから";
	mes "衛星都市「イズルード」に";
	mes "移転しました。";
	next;
	mes "[カプラ職員]";
	mes "我々（株）カプラでは";
	mes "ここプロンテラからイズルードまで";
	mes "利用料 600 Zenyで移動サービスを";
	mes "行っています。";
	next;
	switch (select("利用する","カプラポイント確認","終了")) {
		case 1:
			if(Zeny<600) {
				mes "[カプラ職員]";
				mes "お客様、お金が足りないようですが。";
				break;
			}
			set Zeny,Zeny-600;
			set KAFRA_PIT,KAFRA_PIT+60;
			warp "izlude",94,103;
			end;
		case 2:	//function内からコピー
			mes "[カプラ職員]";
			mes strcharinfo(0)+ "様の獲得ポイントは、";
			mes KAFRA_PIT+ "点です。";
			next;
			mes "[カプラ職員]";
			mes "カプラポイントは当カプラサービスの";
			mes "本社で賞品と引き換えが可能です。";
			mes "今後ともカプラサービスをよろしく";
			mes "お願い致します。";
			break;
		case 3:
			mes "[カプラ職員]";
			mes "ありがとうございました。";
			break;
	}
	close2;
	cutin "kafra_02",255;
	end;
OnInit:
	//これが読み込まれるときはnpc_town_kafra.txtの方を無効にする
	disablenpc "カプラ職員#ProSword";
	end;
}

//==============================================================
geffen_in,155,122,4	script	ギルド関係者	47,{
	mes "[魔法ギルド関係者]";
	mes "荷物が届く頃なのに……";
	mes "遅いな……ふん……";
	close;
}

//==============================================================
morocc_in,140,102,4	script	見習生	86,{
	mes "[染料製作の見習い]";
	mes "ザバドリハン先生の染色の腕は、";
	mes "ミッドガルド大陸の誰も真似できない！";
	mes "素晴らしい腕の持ち主ですよ。";
	mes "僕はあの方の弟子です！";
	close;
}

//==============================================================
izlu2dun,106,58,4	script	カプラ職員::MC_DeliverBya	116,{
	cutin "kafra_02",2;
//	callfunc "KafraMain",0,0x1da,0,0,0,0,0,0,40,800;
	callfunc "KafraMain",0,0xb6,0,0,0,0,0,0,40,80,800;
	end;
OnInit:
	//これが読み込まれるときはnpc_town_kafra.txtの方を無効にする
	disablenpc "カプラ職員#Byalan";
	end;
}
