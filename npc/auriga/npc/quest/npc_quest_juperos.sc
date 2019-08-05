//= Athena Script ==============================================================
// Ragnarok Online Juperos Script     by Blaze
//==============================================================================

//============================================================
// Warp
//------------------------------------------------------------
yuno_fild07,208,175,0	script	juperoswarp0401		139,2,2,{ warp "jupe_cave",143,52; end; }
jupe_cave,147,52,0		script	juperoswarp0501		139,2,2,{ warp "yuno_fild07",212,175; end; }
//jupe_cave,29,52,0		warp	juperoswarp4001		3,3,juperos_01,54,246
jupe_cave,29,52,0		warp	juperoswarp4001		3,3,juperos_01,55,246
juperos_01,51,249,0		warp	juperoswarp4002		3,3,jupe_cave,36,51
juperos_01,100,91,0		script	juperoswarp4003		139,2,2,{
	initnpctimer;
	mes "^797979["+strcharinfo(0)+"]^000000";
	mes "�g�������ɕ�܂�Ă���B";
	mes "�܂�ŁA�̂�����";
	mes "������ł��邩�̂悤���c�c�B";
	mes "�����c�c�B";
	next;
	if(select("���������̊ԁA���̌��ɕ�܂�Ă������c�c","�����I�@����Ȃ��ƍl���Ă�ꍇ����Ȃ��I")==1) {
		misceffect 348,"";
		mes "^797979["+strcharinfo(0)+"]^000000";
		mes "�����c�c�B";
		mes "�̂��y���Ȃ��Ă����C������c�c�B";
		next;
		warp "juperos_02",128,278;
		end;
	}
	mes "^797979["+strcharinfo(0)+"]^000000";
	mes "���̌��͂ǂ����痈�Ă����?!";
	mes "�����ɁA�������痣��Ȃ���c�c�B";
	next;
	warp "juperos_01",96,91;
	end;
OnTimer10000:
	areawarp "juperos_01",98,89,102,93,"juperos_02",128,278;
	stopnpctimer;
	end;
}
juperos_02,33,59,0		script	juperoswarp4004		45,2,2,{
	switch(rand(4)) {
	case 0: warp "juperos_01",79,72; end;
	case 1: warp "juperos_01",79,112; end;
	case 2: warp "juperos_01",120,72; end;
	case 3: warp "juperos_01",120,112; end;
	}
}
juperos_02,130,149,0	script	juperoswarp4005		139,2,2,{ warp "jupe_gate",50,167; end; }
jupe_gate,50,171,0		script	juperoswarp4006		139,4,0,{
	initnpctimer;
	mes "^797979["+strcharinfo(0)+"]^000000";
	mes "��̑w�ɖ߂邱�Ƃ��ł���";
	mes "���[�v�̂悤���B";
	next;
	if(select("���[�v�ɐg��C����","���[�v���痣���")==1) {
		misceffect 348,"";
		mes "^797979["+strcharinfo(0)+"]^000000";
		mes "�̂��y���Ȃ����悤�Ȋ���������c�c�B";
		next;
		warp "juperos_02",130,142;
		end;
	}
	mes "^797979["+strcharinfo(0)+"]^000000";
	mes "�܂���̑w�ɂ͖߂�Ȃ��I";
	next;
	warp "jupe_gate",50,168;
	end;
OnTimer10000:
	areawarp "jupe_gate",46,171,53,171,"juperos_02",130,142;
	stopnpctimer;
	end;
}
jupe_gate,28,145,0		warp	juperoswarp4007		1,1,jupe_area1,101,222
jupe_area1,103,222,0	warp	juperoswarp4008		1,1,jupe_gate,30,145
jupe_gate,71,145,0		warp	juperoswarp4009		1,1,jupe_area2,63,222
jupe_area2,60,222,0		warp	juperoswarp4010		1,1,jupe_gate,69,145
jupe_gate,49,55,0		warp	juperoswarp4011		1,1,jupe_ele_r,49,29
jupe_ele_r,49,27,0		warp	juperoswarp4012		1,1,jupe_gate,49,53
jupe_ele,41,33,0		warp	juperoswarp4013		4,4,jupe_core,150,286

//============================================================
// �Q�[�g���䑕�u
//------------------------------------------------------------
juperos_02,0,0,0	script	�Q�[�g���䑕�u#juperos	-1,{
OnInit:
	hideonnpc "juperoswarp4005";
	set .jupe_gate,3;
	monster "juperos_02",24,275,"��1�Q�[�g���䑕�u",1674,1,"�Q�[�g���䑕�u#juperos::OnKilled";
	monster "juperos_02",240,29,"��2�Q�[�g���䑕�u",1674,1,"�Q�[�g���䑕�u#juperos::OnKilled";
	monster "juperos_02",282,183,"��3�Q�[�g���䑕�u",1674,1,"�Q�[�g���䑕�u#juperos::OnKilled";
	end;
OnKilled:
	set .jupe_gate,.jupe_gate-1;
	switch(.jupe_gate) {
	case 2: announce "�N���ˁH�@�����֗����̂́c�c�B",9,0xFF0000; break;
	case 1: announce "�c�O�����A�����͂��ẴW���s���X�ł͂Ȃ����ȁc�c�B",9,0xFF0000; break;
	default:
		announce "���Ԃ�^���悤�I�@��ɉ������΁A�T���o�����悢�I",9,0xFF0000;
		areamisceffect "juperos_02",0,0,300,300,563;
		areasoundeffect "juperos_02",0,0,300,300,"earth_quake.wav",0;
		sleep 5000;
		announce "�E�B�C�C�[�[���b�I�@�E�B�C�C�[�[���b�I",9,0xE55AA4;
		areasoundeffect "juperos_02",0,0,300,300,"jupe_warning.wav",0;
		sleep 2000;
		announce "�K��҂ɍ����܂��B",9,0xE55AA4;
		sleep 2000;
		announce "�����̊ԁA���̋��ւ̗�������������܂��B�Q�[�g�ւ����肭�������B",9,0xE55AA4;
		hideoffnpc "juperoswarp4005";
		misceffect 561,"juperoswarp4005";
		set .t,26;
		initnpctimer;
	}
	end;
OnTimer23000:
	set .t,.t-1;
	misceffect 561,"juperoswarp4005";
	if(.t == 2) {
		sleep 4000;
		announce "�K��҂ɍ����܂��B�܂��Ȃ��A���̋��֒ʂ���Q�[�g�����܂��B",9,0xE55AA4;
		sleep 5000;
		announce "�Q�[�g������܂ŁA���Ɩ�1���ł��B",9,0xE55AA4;
	}
	if(.t == 0) {
		sleep 2000;
		hideonnpc "juperoswarp4005";
		announce "�Q�[�g�����܂����B",9,0xE55AA4;
		sleep 3000;
		announce "���䑕�u�͍ĉғ������ɓ���܂��B",9,0xE55AA4;
		end;
	}
	initnpctimer;
	end;
OnTimer602000:
	stopnpctimer;
	donpcevent "�Q�[�g���䑕�u#juperos::OnInit";
	end;
}

//============================================================
// �ۈ����
//------------------------------------------------------------
jupe_area1,0,0,0	script	jupe_area1	-1,{
OnSummon1:
	set .flag,1;
	initnpctimer;
	sleep 1000;
	announce "�����܂ŒH�蒅�����҂��c�c�B",9,0xFF0000;
	sleep 2000;
	announce "��͂��O���j�����ƍl���Ă͂���ʁB",9,0xFF0000;
	areasoundeffect "this",0,0,164,300,"jupe_warning.wav",0;
	sleep 2000;
	announce "�������A���̕����ꂽ�n�Ɋ����ė�������ɂ�",9,0xFF0000;
	set .mob,8;
	monster "jupe_area1",30,263,"�ۈ��v��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",30,262,"�ۈ��v��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",30,261,"�ۈ��v��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",30,260,"�ۈ��v��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",30,259,"�ۈ��v��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",30,258,"�ۈ��v��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",30,257,"�ۈ��v��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",30,256,"�ۈ��v��",1669,1,"jupe_area1::OnKilled";
	sleep 2000;
	announce "�o��͂ł��Ă��邾�낤�ȁH",9,0xFF0000;
	sleep 1000;
	areasoundeffect "this",0,0,164,300,"jupe_warning.wav",0;
	end;
OnSummon2:
	announce "���āA���x�͂ǂ����ȁH",9,0xFF0000;
	areasoundeffect "this",0,0,164,300,"jupe_warning.wav",0;
	sleep 2000;
	announce "������x�c�c",9,0xFF0000;
	sleep 2000;
	announce "���͂������邪�悢�I",9,0xFF0000;
	areasoundeffect "this",0,0,164,300,"jupe_warning.wav",0;
	set .mob,8;
	monster "jupe_area1",30,238,"�ۈ��v��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",31,238,"�ۈ��v��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",32,238,"�ۈ��v��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",33,238,"�ۈ��v��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",34,238,"�ۈ��v��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",35,238,"�ۈ��v��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",36,238,"�ۈ��v��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",37,238,"�ۈ��v��",1669,1,"jupe_area1::OnKilled";
	end;
OnSummon3:
	set .flag,4;
	initnpctimer;
	sleep 2000;
	announce "�܂��܂��܂��c�c�B",9,0xFF0000;
	sleep 2000;
	announce "�����A���邪�悢�A��̏��܂ŁI",9,0xFF0000;
	set .mob,8;
	monster "jupe_area1",30,176,"�㋉�x����",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",31,176,"�㋉�x����",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",32,176,"�㋉�x����",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",33,176,"�㋉�x����",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",34,176,"�㋉�x����",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",35,176,"�㋉�x����",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",36,176,"�㋉�x����",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",37,176,"�㋉�x����",1675,1,"jupe_area1::OnKilled";
	sleep 2000;
	announce "�䂪�N�Ȃ̂��A�m�肽�����ˁH",9,0xFF0000;
	sleep 2000;
	announce "�ł́A������ɏ������狳���Ă�낤�I",9,0xFF0000;
	end;
OnSummon4:
	announce "��́A���̒n���������̏����A",9,0xFF0000;
	sleep 2000;
	announce "����A�����������c�c",9,0xFF0000;
	sleep 2000;
	announce "���F�X�p�[�E�j���g�[���B�l�́A���������F�X�p�[�ƌĂ񂾂��ȁB",9,0xFF0000;
	set .mob,13;
	monster "jupe_area1",30,152,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",31,152,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",32,152,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",33,152,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",34,152,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",35,152,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",36,152,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",37,152,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",30,150,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",31,150,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",32,150,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",33,150,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",34,150,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	end;
OnSummon5:
	set .flag,7;
	initnpctimer;
	sleep 2000;
	announce "��́A�����ւ̗��������j�ނ��߂�",9,0xFF0000;
	sleep 2000;
	announce "�x���V�X�e����������̂ł͂Ȃ��B",9,0xFF0000;
	set .mob,8;
	monster "jupe_area1",30,89,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",31,89,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",32,89,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",33,89,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",34,89,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",35,89,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",36,89,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",37,89,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	sleep 2000;
	announce "�ł́A���̂��߂ɂ��Ɓc�c�H�@�t�b�A�]������B",9,0xFF0000;
	sleep 2000;
	announce "�i���Ɏ��ʂ��Ƃ��ł��ʁA��̂��߂ɂ�!!",9,0xFF0000;
	end;
OnSummon6:
	announce "�����܂ŉ����ɗ����񂾁H",9,0xFF0000;
	sleep 2000;
	announce "���̉��ɉ�������Ǝv���Ă���̂��ˁH",9,0xFF0000;
	sleep 2000;
	announce "�����Ă������A���̉��͒n�������I",9,0xFF0000;
	set .mob,15;
	monster "jupe_area1",42,64,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",43,64,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",44,64,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",45,64,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",46,64,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",47,64,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",48,64,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",49,64,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",42,62,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",43,62,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",44,62,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",45,62,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",46,62,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",47,62,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",48,62,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",49,62,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	end;
OnSummon7:
	set .flag,10;
	initnpctimer;
	sleep 2000;
	announce "��ɏ��҂�T���Ă����B",9,0xFF0000;
	sleep 2000;
	announce "���̌��t�𕷂��Ă���҂��A���̎҂Ȃ̂��낤���H",9,0xFF0000;
	set .mob,8;
	monster "jupe_area1",92,154,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",96,154,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",100,154,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",104,154,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",92,161,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",96,161,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",100,161,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",104,161,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	sleep 2000;
	announce "�c�c�ς��ʂĂ��䂪���̂́A",9,0xFF0000;
	sleep 2000;
	announce "���̉��̂ǂ����ɂ���ł��낤�B",9,0xFF0000;
	end;
OnSummon8:
	announce "��͎��ʂ��Ƃ��ł��ʁI",9,0xFF0000;
	sleep 2000;
	announce "�Ȃ�Ή�́A�����ŋ����҂�҂Ƃ��B",9,0xFF0000;
	sleep 2000;
	announce "�i���ɁA�����i���ɂȁI",9,0xFF0000;
	set .mob,10;
	monster "jupe_area1",104,161,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",108,161,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",111,161,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",112,161,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",115,161,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",104,154,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",108,154,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",111,154,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	monster "jupe_area1",112,154,"�K�[�h�}��",1675,1,"jupe_area1::OnKilled";
	monster "jupe_area1",115,154,"�K�[�h�}��",1669,1,"jupe_area1::OnKilled";
	end;
OnKilled:
	set .mob,.mob-1;
	if(.mob == 0) {
		sleep 2000;
		switch(.flag) {
		case 1: donpcevent "jupe_area1::OnSummon2"; break;
		case 2: announce "�`�b�N�A�`�b�N�A�`�b�N�c�c�B",9,0xFF0000; break;
		case 4: donpcevent "jupe_area1::OnSummon4"; break;
		case 5: announce "�c�c�܂��܂����B",9,0xFF0000; break;
		case 7: donpcevent "jupe_area1::OnSummon6"; break;
		case 8: announce "����ł��Ƃ����̂Ȃ�A�s�����悢�I",9,0xFF0000; break;
		case 10: donpcevent "jupe_area1::OnSummon8"; break;
		case 11: announce "�y���߂����ˁH",9,0xFF0000; break;
		}
		set .flag,.flag+1;
	}
	end;
OnTimer600000:
	if(rand(2))
		announce "�������̂��c�c�B",9,0xFF0000;
	else
		announce "�P�b�c�c�������߁c�c�B",9,0xFF0000;
	sleep 2000;
	stopnpctimer;
	areawarp "this",0,0,70,300,"jupe_gate",49,138;
	areawarp "this",70,0,164,200,"jupe_gate",49,138;
	killmonster "this","All";
	set .mob,0;
	set .flag,0;
	end;
}

jupe_area1,88,224,0	script	#jupe_area1-1	844,{
	set .@id,substr2(strnpcinfo(2),11,1);
	cutin .@id,2;
	if(getvariableofnpc(.flag,"jupe_area1") != (.@id-1)*3) {
		mes "-����͗l���`���ꂽ��������B";
		mes "���������邱�Ƃ��ł�������-";
		mes "-���������֓n�邽�߂̑��u�̂悤��-";
		close2;
		cutin .@id,255;
		end;
	}
	mes "-�ǂ����Ō����悤�Ȍ�������B";
	mes "���������邱�Ƃ��ł�������-";
	mes "-���������֓n�邽�߂�";
	mes "���u��������Ȃ��c�c-";
	next;
	if(select("��͂̌��Ђ��͂߂Ă݂�","�������Ȃ�")==1) {
		if(countitem(7355+.@id)) {
			cutin .@id+"-1",2;
			misceffect 159;
			mes "-�����Ă�����͂̌��Ђ�";
			mes "�҂�����͂܂���-";
			next;
			mes "-��͂̌��Ђ��͂߂����������A";
			mes "�n�ʂ��珬���Ȑk����������-";
			mes "-���������֍s�����߂�";
			mes "���[�v���쓮�����悤��-";
			mes "-��͂̌��Ђ��������-";
			hideonnpc;
			hideoffnpc "juperoswarp" + .@id + "#jupe_area1";
			misceffect 561,"juperoswarp" + .@id + "#jupe_area1";
			soundeffect "jupe_warp.wav",0;
			initnpctimer;
		}
		else {
			mes "-���ɓ���悤�ȕ���";
			mes "�����Ă��Ȃ�-";
		}
	}
	else {
		mes "[" +strcharinfo(0)+ "]";
		mes "����Ȃ��̂ɍ\���Ă���ɂ͂Ȃ��c�c�B";
	}
	close2;
	cutin .@id,255;
	end;
OnTimer22000:
	stopnpctimer;
	hideonnpc "juperoswarp" +substr2(strnpcinfo(2),11,1)+ "#jupe_area1";
	hideoffnpc;
	end;
}
jupe_area1,25,238,0	duplicate(#jupe_area1-1)	#jupe_area1-2	844
jupe_area1,36,146,0	duplicate(#jupe_area1-1)	#jupe_area1-3	844
jupe_area1,50,49,0	duplicate(#jupe_area1-1)	#jupe_area1-4	844

jupe_area1,112,162,0	script	���o�[#jupe_area1	844,{
	mes "[�킩��Ȃ����u]";
	mes "���o�[������B";
	if(getvariableofnpc(.flag,"jupe_area1") != 12)
		close;
	mes "�������Ƃ��ł��������B";
	next;
	if(select("���o�[������","��߂�")==1) {
		hideonnpc;
		hideoffnpc "juperoswarp5#jupe_area1";
		misceffect 561,"juperoswarp5#jupe_area1";
		soundeffect "jupe_warp.wav",0;
		initnpctimer;
		close;
	}
	mes "[" +strcharinfo(0)+ "]";
	mes "����Ȃ��̂ɍ\���Ă���ɂ͂Ȃ��c�c�B";
	close;
OnTimer22000:
	stopnpctimer;
	hideonnpc "juperoswarp5#jupe_area1";
	hideoffnpc;
	end;
}

jupe_area1,83,221,0	script	juperoswarp1#jupe_area1	139,2,2,{
	set .@n,substr2(strnpcinfo(1),11,1);
	switch(.@n) {
	case 1: warp "jupe_area1",47,259; break;
	case 2: warp "jupe_area1",21,191; break;
	case 3: warp "jupe_area1",33,105; break;
	case 4: warp "jupe_area1",83,157; break;
	}
	if(getvariableofnpc(.flag,"jupe_area1") == (.@n-1)*3)
		donpcevent "jupe_area1::OnSummon"+(.@n*2-1)+"";
	end;
OnInit:
	hideonnpc;
	end;
}
jupe_area1,21,225,0	duplicate(juperoswarp1#jupe_area1)	juperoswarp2#jupe_area1	139,2,2
jupe_area1,33,137,0	duplicate(juperoswarp1#jupe_area1)	juperoswarp3#jupe_area1	139,2,2
jupe_area1,57,53,0	duplicate(juperoswarp1#jupe_area1)	juperoswarp4#jupe_area1	139,2,2
jupe_area1,117,157,0	script	juperoswarp5#jupe_area1	139,2,2,{
	warp "jupe_gate",28,29;
	end;
OnInit:
	hideonnpc;
	end;
}

//============================================================
// �G���x�[�^�[
//------------------------------------------------------------
jupe_ele_r,51,98,0	script	�X�C�b�`�i�s��#jupe_ele	844,{
	mes "-���̋@�B�́A";
	mes "�N�����g�p���Ă���悤��-";
	close;
OnInit:
	hideonnpc;
	end;
OnKilled:
	set .mob,.mob-1;
	if(.mob == 0) {
		stopnpctimer "�X�C�b�`#jupe_ele";
		sleep 5000;
		announce "���e��j�肵�҂��A�X�ɉ��֐i��ł݂Ȃ����H",9,0x66FF00;
		areasoundeffect "jupe_ele_r",0,0,100,160,"earth_quake.wav",0;
		sleep 4000;
		disablenpc "juperoswarp4013";
		areawarp "jupe_ele_r",0,0,100,160,"jupe_ele",42,47;
		donpcevent "jupe_ele::OnSummon1";
		initnpctimer "jupe_ele";
		end;
	}
	end;
}

jupe_ele_r,51,98,0	script	�X�C�b�`#jupe_ele	844,{
	cutin "5",2;
	mes "-�������쓮�����邱�Ƃ�";
	mes "�ł������ȃ��o�[�ƁA";
	mes "�p�r�s����4�̌�������-";
	next;
	if(select("���o�[�������Ă݂�","�G��Ȃ�")==2) {
		mes "-���̂̒m��Ȃ����ɂ�";
		mes "�G��Ȃ����������c�c-";
		close2;
		cutin "5",255;
		end;
	}
	mes "-^797979�J�`���A�J�`��^000000-";
	next;
	mes "-^797979���o�[�������Ă݂����A";
	mes "�����������Ȃ�^000000-";
	mes "-���o�[�̉��ɂ��錊��";
	mes "����������ƍ쓮����悤��-";
	if(countitem(7356) < 1 && countitem(7357) < 1 && countitem(7358) < 1 && countitem(7359) < 1) {
		close2;
		cutin "5",255;
		end;
	}
	next;
	menu "��͂̌��Ђ��͂߂Ă݂�",-;
	if(countitem(7356) < 1 || countitem(7357) < 1 || countitem(7358) < 1 || countitem(7359) < 1) {
		mes "-��͂̌��Ђ�����Ȃ��悤��-";
		mes "-�ǂ����A�S�Ă̖�͂̌��Ђ�";
		mes "�ꏏ�ɂ͂߂Ȃ���΂Ȃ�Ȃ��悤��-";
		close2;
		cutin "5",255;
		end;
	}
	initnpctimer;
	hideonnpc;
	hideoffnpc "�X�C�b�`�i�s��#jupe_ele";
	misceffect 72;
	areamisceffect "jupe_ele_r",0,0,100,160,563;
	delitem 7356,1;
	delitem 7357,1;
	delitem 7358,1;
	delitem 7359,1;
	cutin "5-1",2;
	mes "-���̕����𕢂��Ă������������";
	mes "��͂̌��Ђ��~���Ă���-";
	mes "-����ł́A����������邱�Ƃ�";
	mes "�ł��Ȃ�-";
	close2;
	cutin "5",255;
	end;
OnTimer2000:
	announce "�c�c�㐢�̎q��������c�c�B",9,0x66FF00;
	sleep 3000;
	announce "���́A���̓s�s���n�ɖ����ꂽ���A�m�肽�����c�c�H",9,0x66FF00;
	sleep 4000;
	announce "�Ȃ�΁A�i�ނ��悢�B",9,0x66FF00;
	sleep 3000;
	announce "���O�炪�]�ނ��̂������Ă����悤�B",9,0x66FF00;
	sleep 7000;
	announce "�A���A�S�Ă̌��e�Ɓc�c",9,0xFF9900;
	sleep 3000;
	announce "�S�Ă̋U������z����΂ȁc�c�B",9,0xFF0000;
	sleep 3000;
	announce "20���̎���^���悤",9,0xFF0000;
	sleep 1000;
	set getvariableofnpc(.mob,"�X�C�b�`�i�s��#jupe_ele"),9;
	monster "jupe_ele_r",44,99,"�x����",1669,1,"�X�C�b�`�i�s��#jupe_ele::OnKilled";
	sleep 200;
	monster "jupe_ele_r",55,99,"�x����",1675,1,"�X�C�b�`�i�s��#jupe_ele::OnKilled";
	sleep 200;
	monster "jupe_ele_r",45,84,"�x����",1683,1,"�X�C�b�`�i�s��#jupe_ele::OnKilled";
	sleep 200;
	monster "jupe_ele_r",54,84,"�x����",1675,1,"�X�C�b�`�i�s��#jupe_ele::OnKilled";
	sleep 200;
	monster "jupe_ele_r",45,99,"�x����",1669,1,"�X�C�b�`�i�s��#jupe_ele::OnKilled";
	sleep 200;
	monster "jupe_ele_r",54,99,"�x����",1683,1,"�X�C�b�`�i�s��#jupe_ele::OnKilled";
	sleep 200;
	monster "jupe_ele_r",48,84,"�x����",1669,1,"�X�C�b�`�i�s��#jupe_ele::OnKilled";
	sleep 200;
	monster "jupe_ele_r",52,84,"�x����",1683,1,"�X�C�b�`�i�s��#jupe_ele::OnKilled";
	sleep 200;
	monster "jupe_ele_r",50,84,"�x������",1684,1,"�X�C�b�`�i�s��#jupe_ele::OnKilled";
	announce "��͂��΂��̊ԁA���e�Ƌ��ɂ��悤�B",9,0xFF0000;
	end;
OnTimer144000:
	stopnpctimer;
	announce "���ҊO�ꂾ�������c�c�B",9,0x66FF00;
	sleep 2000;
	areawarp "jupe_ele_r",0,0,100,160,"jupe_gate",49,138;
	killmonster "this","All";
	hideonnpc "�X�C�b�`�i�s��#jupe_ele";
	hideoffnpc "�X�C�b�`#jupe_ele";
	end;
}

jupe_ele,0,0,0	script	jupe_ele	-1,{
OnSummon1:
	sleep 2000;
	announce "�����܂ŒH�蒅�������O��̍����ɁA�h�ӂ�\����B",9,0xFF0000;
	sleep 3000;
	announce "���āc�c���̂�������̂͗��Ƃ����Ȃ̂��A�������͐N���҂����Ԃ�o�����߂̂܂₩���Ȃ̂��A",9,0xFF0000;
	sleep 3000;
	announce "�����Ă݂邩�ˁc�c�B",9,0xFF0000;
	sleep 4000;
	set .mob,8;
	monster "jupe_ele",48,44,"�x����",1675,1,"jupe_ele::OnKilled";
	monster "jupe_ele",45,42,"�x����",1669,1,"jupe_ele::OnKilled";
	monster "jupe_ele",38,42,"�x����",1675,1,"jupe_ele::OnKilled";
	monster "jupe_ele",35,44,"�x����",1669,1,"jupe_ele::OnKilled";
	monster "jupe_ele",35,51,"�x����",1675,1,"jupe_ele::OnKilled";
	monster "jupe_ele",38,53,"�x����",1669,1,"jupe_ele::OnKilled";
	monster "jupe_ele",45,53,"�x����",1675,1,"jupe_ele::OnKilled";
	monster "jupe_ele",48,51,"�x����",1669,1,"jupe_ele::OnKilled";
	end;
OnSummon2:
	sleep 2000;
	announce "�����͌��X�A���O�炪�v���悤��",9,0xFF0000;
	sleep 3000;
	announce "���n���ɉh���ɂ߂������s�s�ł͂Ȃ������B",9,0xFF0000;
	sleep 3000;
	announce "�l�Ԃ̐^�̋��낵����S�ėZ�������c�c",9,0xFF0000;
	sleep 3000;
	announce "�y���ɐl�Ԃ̑z���𒴂����ꏊ�B",9,0xFF0000;
	sleep 1000;
	set .mob,8;
	monster "jupe_ele",48,44,"�x����",1683,1,"jupe_ele::OnKilled";
	monster "jupe_ele",45,42,"�x����",1669,1,"jupe_ele::OnKilled";
	monster "jupe_ele",38,42,"�x����",1683,1,"jupe_ele::OnKilled";
	monster "jupe_ele",35,44,"�x����",1669,1,"jupe_ele::OnKilled";
	monster "jupe_ele",35,51,"�x����",1683,1,"jupe_ele::OnKilled";
	monster "jupe_ele",38,53,"�x����",1669,1,"jupe_ele::OnKilled";
	monster "jupe_ele",45,53,"�x����",1683,1,"jupe_ele::OnKilled";
	monster "jupe_ele",48,51,"�x����",1669,1,"jupe_ele::OnKilled";
	end;
OnSummon3:
	sleep 2000;
	announce "���O��̖ڂɁA�����ɂ�����̂͂ǂ������Ă���H",9,0xFF0000;
	sleep 3000;
	announce "����́A�{���Ɍ����Ă���̂��H",9,0xFF0000;
	sleep 3000;
	announce "����Ƃ��c�c����������ƐM���Ă��邾���ł͂Ȃ��̂��H",9,0xFF0000;
	sleep 4000;
	set .mob,8;
	monster "jupe_ele",48,44,"�x����",1675,1,"jupe_ele::OnKilled";
	monster "jupe_ele",45,42,"�x����",1669,1,"jupe_ele::OnKilled";
	monster "jupe_ele",38,42,"�x����",1683,1,"jupe_ele::OnKilled";
	monster "jupe_ele",35,44,"�x����",1675,1,"jupe_ele::OnKilled";
	monster "jupe_ele",35,51,"�x����",1669,1,"jupe_ele::OnKilled";
	monster "jupe_ele",38,53,"�x����",1683,1,"jupe_ele::OnKilled";
	monster "jupe_ele",45,53,"�x����",1675,1,"jupe_ele::OnKilled";
	monster "jupe_ele",48,51,"�x����",1669,1,"jupe_ele::OnKilled";
	end;
OnSummon4:
	sleep 2000;
	announce "�Y���łȂ����c�c�������O��̎�����߂�̂́c�c",9,0xFF0000;
	sleep 3000;
	announce "������Ȃ��A���O�玩�g�����B",9,0xFF0000;
	sleep 3000;
	set .mob,8;
	monster "jupe_ele",48,44,"�x����",1684,1,"jupe_ele::OnKilled";
	monster "jupe_ele",45,42,"�x����",1669,1,"jupe_ele::OnKilled";
	monster "jupe_ele",38,42,"�x����",1684,1,"jupe_ele::OnKilled";
	monster "jupe_ele",35,44,"�x����",1669,1,"jupe_ele::OnKilled";
	monster "jupe_ele",35,51,"�x����",1675,1,"jupe_ele::OnKilled";
	monster "jupe_ele",38,53,"�x����",1669,1,"jupe_ele::OnKilled";
	monster "jupe_ele",45,53,"�x����",1683,1,"jupe_ele::OnKilled";
	monster "jupe_ele",48,51,"�x����",1675,1,"jupe_ele::OnKilled";
	end;
OnClear:
	sleep 2000;
	announce "��͉��������Ă͂���ʁB",9,0x66FF00;
	sleep 3000;
	announce "��������O�炪�������ɂ́A���炭�c�c���̓s�s�͂��̐���������Ă���ł��낤�B",9,0x66FF00;
	sleep 3000;
	announce "�S�Ă̂��Ƃ��ԈႢ�ł������B���́A�����ɂ��Ă͂Ȃ�ʑ��݂ł������B",9,0x66FF00;
	sleep 3000;
	announce "�l�Ԃ́A�����ɂ��Ă��悢�̂��낤���H",9,0x66FF00;
	sleep 1000;
	announce "�c�c�肤�Ȃ�΁A�X�ɉ��֐i�ނ��悢�B",9,0x66FF00;
	enablenpc "juperoswarp4013";
	end;
OnKilled:
	set .mob,.mob-1;
	if(.mob == 0) {
		sleep 2000;
		switch(.flag) {
		case 0: donpcevent "jupe_ele::OnSummon2"; break;
		case 1: donpcevent "jupe_ele::OnSummon3"; break;
		case 2: donpcevent "jupe_ele::OnSummon4"; break;
		case 3: donpcevent "jupe_ele::OnClear"; break;
		}
		set .flag,.flag+1;
	}
	end;
OnTimer144000:
	stopnpctimer;
	announce "���ҊO�ꂾ�������c�c�B",9,0x66FF00;
	sleep 2000;
	areawarp "jupe_ele",0,0,100,124,"jupe_gate",49,138;
	killmonster "this","All";
	set .flag,0;
	hideonnpc "�X�C�b�`�i�s��#jupe_ele";
	hideoffnpc "�X�C�b�`#jupe_ele";
	end;
}