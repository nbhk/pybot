//= Auriga Script ==============================================================
// Ragnarok Online GvG Script	by Blaze
//==============================================================================

//============================================================
// �U���̐���
//------------------------------------------------------------
-	script	#AgitConfig	-1,{
OnAgitInit:
//---------------�U�����J�Â���j���̐ݒ�-------------------
// �U���̊J�×j��
// ���� = 0, �� = +1, �� = +2, �� = +4, �� = +8, �� = +16, �� = +32, �y = +64
// �U�����s���j�������Z�i�U��햳���Ȃ�0�j
// �����s�Ȃ��ꍇ��.weekday��127�ɂ���
	set .weekday,1;

//---------------�U���̊J�Î��Ԃ̐ݒ�i�S�́j---------------
// �U���̊J�Î��ԂƏI�����ԁi���P�ʁj
// 24���̏ꍇ�́u24�v�ƋL�ځi0�ł̓_���j
// �J�n���ԂƏI�����Ԃ𓯂��ɂ���Ƃ��̓��͍U�����I�������Ȃ�
	set .st_time,20;
	set .ed_time,22;

//---------------�U���̊J�Î��Ԃ̐ݒ�i�ʁj---------------
// �j�����ɍU���̊J�Î��ԂƏI�����Ԃ�ݒ肷��
// �L���ɂ���ɂ̓R�����g�A�E�g���O��
// �������A�S�̂̊J�Î��Ԑݒ肪�D�悳���
	// ���j
	//set .st_time[1],20;
	//set .ed_time[1],22;

	// ���j
	//set .st_time[2],20;
	//set .ed_time[2],22;

	// �Ηj
	//set .st_time[3],20;
	//set .ed_time[3],22;

	// ���j
	//set .st_time[4],20;
	//set .ed_time[4],22;

	// �ؗj
	//set .st_time[5],20;
	//set .ed_time[5],22;

	// ���j
	//set .st_time[6],20;
	//set .ed_time[6],22;

	// �y�j
	//set .st_time[7],20;
	//set .ed_time[7],22;

//---------------�T�[�o�[�ċN�����A�U���̍ĊJ����-----------
// �T�[�o�[�N�����ɍU���̊J�Î��ԓ��������ꍇ�A
// �U�����ĊJ����܂ł̗P�\���ԁi�P��:msec�A60000 = 60�b�j
	sleep 1000;

//---------------�U���̐ݒ肱���܂�-------------------------
OnMinute00:
	set .@day,gettime(4);
	set .@hour,gettime(3);
	if(.weekday & (1<<.@day)) {
		if(.st_time[.@day+1] == 0 && .ed_time[.@day+1] == 0) {
			set .@st_time,.st_time;
			set .@ed_time,.ed_time;
		}
		else {
			set .@st_time,.st_time[.@day+1];
			set .@ed_time,.ed_time[.@day+1];
		}
		if(.@st_time == .@ed_time || (.@hour >= .@st_time  && .@hour < .@ed_time)) {
			if(!agitcheck()) {
				debugmes "�U���J�n [ " +gettimestr("%H:%M",6)+ " ]";
				agitstart;
			}
		}
		else if(agitcheck()) {
			debugmes "�U���I�� [ " +gettimestr("%H:%M",6)+ " ]";
			agitend;
		}
	}
	else if(agitcheck()) {
		debugmes "�U���I�� [ " +gettimestr("%H:%M",6)+ " ]";
		agitend;
	}
	end;
}

//============================================================
// �G���y���E������
//	callfunc "AgitEmperium",EmperiumX,EmperiumY,StartFlag;
//------------------------------------------------------------
function	script	AgitEmperium	{
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);
	maprespawnguildid .@map$,getcastledata(.@map$,1),2;
	callguardian .@map$,getarg(0),getarg(1),"--ja--",1288,1,strnpcinfo(0)+"::OnAgitBreak";
	if(getarg(2)) {		// �U���J�n�������H
		gvgon .@map$;
		if(getcastledata(.@map$,1))
			announce "�� [" +getcastlename(.@map$,0)+ "] �� " +getcastlename(.@map$,1)+ " �� [" +getguildname(getcastledata(.@map$,1))+ "] �M���h����̂��܂���",0x20;
		else
			donpcevent strnpcinfo(0)+"::OnAgitSummon";	//�����X�^�[����
	}
	return;
}

//============================================================
// �A�W�g���
//	callfunc "AgitBreak","AgitCode";
//------------------------------------------------------------
function	script	AgitBreak	{
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);
	killmonsterall .@map$;
	set .@gid,getcharid(2);		//�G���y���E���j��҂�GID���擾
	if(.@gid <= 0)
		return;

	// �ԏ��̏�������
	setcastledata .@map$,1,.@gid;
	for(set .@i,2; .@i<=17; set .@i,.@i+1) {
		if(.@i==2 || .@i==3) {	// ���ƒl�E�h�q�l
			set .@val,getcastledata(.@map$,.@i)-5;
			setcastledata .@map$,.@i,(.@val<1)? 1: .@val;
		}
		else
			setcastledata .@map$,.@i,0;
	}
	announce "�G���y���E�����j�󂳂�܂���",0x9,0x00ff00,0x2bc,10,0,40;
	sleep 7000;
	announce "�� [" +getcastlename(.@map$,0)+ "] �� " +getcastlename(.@map$,1)+ " �� [" +getguildname(getcastledata(.@map$,1))+ "] �M���h����̂��܂���",0x20;
	donpcevent "::OnFlagEmb_"+getarg(0);	//�t���b�O�G���u�����̕ύX
	return;
}

//============================================================
// �U���I��
//	callfunc "AgitEnd";
//------------------------------------------------------------
function	script	AgitEnd	{
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);
	maprespawnguildid .@map$,getcastledata(.@map$,1),4;
	killmonster .@map$,strnpcinfo(0)+"::OnAgitBreak";	//�G���y�̂ݖ��E
	gvgoff .@map$;
	if(getcastledata(.@map$,1))
		announce "�� [" +getcastlename(.@map$,0)+ "] �� " +getcastlename(.@map$,1)+ " �� [" +getguildname(getcastledata(.@map$,1))+ "] �M���h����̂��܂���",0x20;
	return;
}

//============================================================
// �A�W�g����
//	callfunc "AgitGiveUp","AgitCode";
//------------------------------------------------------------
function	script	AgitGiveUp	{
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);		//.@map$�ȊO�̓_�~�[
	killmonsterall .@map$;
	hideonnpc "AgitKafra_"+getarg(0);
	setcastledata .@map$,1,0;
	for(set .@i,4; .@i<=17; set .@i,.@i+1) {
		setcastledata .@map$,.@i,0;
	}
	donpcevent "::OnFlagEmb_"+getarg(0);		//�t���b�O�G���u�����̕ύX
	maprespawnguildid .@map$,0,7;
	if(agitcheck()) {
		donpcevent strnpcinfo(0)+"::OnAgitEliminate";	//�G���y���E������
		donpcevent strnpcinfo(0)+"::OnAgitSummon";	//�����X�^�[����
	}
	return;
}

//============================================================
// ��
//	callfunc "AgitTreasure",TBoxIDArray,TBoxXArray,TBoxYArray;
//------------------------------------------------------------
function	script	AgitTreasure	{
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);		//.@map$�ȊO�̓_�~�[

	// ���ƒl
	set .@economy,getcastledata(.@map$,2) + getcastledata(.@map$,4);
	if(getcastledata(.@map$,4)) {
		if(getgdskilllv(getcastledata(.@map$,1),10014)) // �i�v�I�Ȕ��W
			set .@economy,.@economy + rand(2);
	}
	set .@economy,(.@economy > 100)? 100: .@economy;

	// �h�q�l
	set .@defense,getcastledata(.@map$,3) + getcastledata(.@map$,5);
	set .@defense,(.@defense > 100)? 100: .@defense;

	// �ԏ��X�V
	setcastledata .@map$,2,.@economy;
	setcastledata .@map$,3,.@defense;
	setcastledata .@map$,4,0;	// ���Ɠ����񐔃��Z�b�g
	setcastledata .@map$,5,0;	// �h�q�����񐔃��Z�b�g

	// ��
	killmonster .@map$,strnpcinfo(0)+"::OnKilled";
	set .@count,(.@economy / 5) + 4;
	set .@max,getarraysize(getarg(0));
	copyarray .@id,getarg(0),.@max;
	copyarray .@x,getarg(1),.@count;
	copyarray .@y,getarg(2),.@count;
	for(set .@i,0; .@i < .@count; set .@i,.@i+1) {
		if(.@x[.@i] && .@y[.@i])	// x���W,y���W�����������`�F�b�N
			monster .@map$,.@x[.@i],.@y[.@i],"--ja--",.@id[.@i % .@max],1,strnpcinfo(0)+"::OnKilled";
	}
	return;
}

//============================================================
// �M���h�t���b�O
//	callfunc "AgitEmblemFlag",Type,"WarpMap",WarpX,WarpY;
//------------------------------------------------------------
function	script	AgitEmblemFlag	{
	set .@gid,getcastledata(getarg(1),1);
	if(getcharid(2) > 0 && getcharid(2) == .@gid) {
		mes "[ �� ]";
		mes "�E�҂�c";
		mes "�N�̒n�ɋA�邩�H";
		next;
		if(select("�ԂɋA��","��߂�") == 1) {
			// �ړ��O�ɍă`�F�b�N
			set .@gid,getcastledata(getarg(1),1);
			if(getcharid(2) > 0 && getcharid(2) == .@gid)
				warp getarg(1),getarg(2),getarg(3);
		}
		return;
	}
	if(getarg(0) == 1) {
		mes "[ ���[���~�b�h�K�b�c������ ]";
		mes " ";
		mes "1.";
		mes "������̓��[���~�b�h�K�b�c������";
		mes "�V���o���c�o���h���a���̋���ɂ��A";
	}
	else if(getarg(0) == 2) {
		mes "[�V���o���c�o���h���a���z��]";
		mes " ";
		mes "1.";
		mes "�������";
		mes "�V���o���c�o���h���a���߂ɂ��A";
	}
	else if(getarg(0) == 3) {
		mes "[�A���i�x���c�����z��]";
		mes " ";
		mes "1.";
		mes "������̓A���i�x���c�����߂ɂ��A";
	}
	else {
		mes "[ ���[���~�b�h�K�b�c������ ]";
		mes " ";
		mes "1.";
		mes "������̓��[���~�b�h�K�b�c������";
		mes "�����";
	}
	if(.@gid <= 0) {
		mes "�������L�҂��Ȃ��A�W�g�ł��邱�Ƃ�";
		mes "���\����B";
		next;
		mes " ";
		mes "2.";
		mes "�����������Ă��鐦����";
		mes "�����ɏ����āA�G���y���E����";
		mes "�j�󂷂�E�҂ɂ͍�����";
		mes "�F�肷��A�W�g���L�������^�����";
		return;
	}
	mes "�M���h ^ff0000 " +getguildname(.@gid)+ " ^000000��";
	mes "���L�ł��邱�Ƃ�F�߂��Ă���B";
	next;
	mes " ";
	mes "2.";
	mes "^ff0000 " +getguildname(.@gid)+ " ^000000 �̃}�X�^�[��";
	mes "^ff0000 " +getguildmaster(.@gid)+ " ^000000�ł���B";
	mes "����Ɉًc�̂���҂́A�������";
	mes "�͂��Ȃ��Ė��_���������Ȃ����B";
	return;
}

//============================================================
// �J�v���E��
//	callfunc "AgitKafra",MapCode;
//------------------------------------------------------------
function	script	AgitKafra	{
	cutin "kafra_01",2;
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);		//.@map$�ȊO�̓_�~�[
	set .@gid,getcastledata(.@map$,1);
	if(.@gid <= 0 || getcharid(2) != .@gid) {
		mes "[�J�v���E��]";
		mes "���́A�M���h";
		mes "^ff0000" + getguildname(.@gid) + "^000000";
		mes "�̊F�l�ɂ������d������悤��";
		mes "�_�񂳂�Ă���܂��B";
		mes "���̃J�v���T�[�r�X��";
		mes "�����p���������܂��B";
		close2;
		cutin "kafra_01",255;
		return;
	}
	mes "[�J�v���E��]";
	mes "��������Ⴂ�܂�^ff0000" +getguildname(.@gid)+ "^000000�̊F����";
	mes "�J�v���T�[�r�X��";
	mes "�����F�l�̂��΂ɂ��܂��B";
	next;
	set .@code,getarg(0);
	set .@price,200;
	callfunc "KafraMain",3,0x4e,0,0,0,0,0,0,40,800,.@code,.@price;
	return;
}

//============================================================
// ����
//	callfunc "AgitSteward","AgitCode",GuardianIDArray,GuardianXArray,GuardianYArray,MasterRoomX,MasterRoomY;
//------------------------------------------------------------
function	script	AgitSteward	{
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);		//.@map$�ȊO�̓_�~�[
	set .@gid,getcastledata(.@map$,1);
	set .@name$,"����" +(getarg(1)? strnpcinfo(0): "");	//SE�łȂ��Ȃ�ŗL��
	if(.@gid <= 0) {
		mes "[" +.@name$+ "]";
		mes "���͉^���ɓ������܂܁A";
		mes "���̎�l�ɂȂ����҂��Ă���܂��B";
		mes "�E�C������́A��x�������̉^����";
		mes "�������ɂȂ��Ă͂������ł��傤�B";
		return;
	}
	if(getcharid(0) != getguildmasterid(.@gid)) {
		mes "[" +.@name$+ "]";
		mes "���Ȃ����������狺�����Ƃ��A";
		mes "���͎��̃}�X�^�[�ł���";
		mes "^ff0000" +getguildmaster(.@gid)+ "^000000�l�ɂ̂�";
		mes "���d������g�ł���B";
		mes "�K�[�f�B�A�������͂ǂ����I";
		mes "�������̖���Ȏғ���Ǖ����Ȃ����I";
		return;
	}
	mes "[" +.@name$+ "]";
	mes "���A��Ȃ����܂��A^ff0000" +strcharinfo(0)+ "^000000 �l�B";
	mes "���Ȃ�Ƃ��\���t�����������܂��B";
	next;
	set .@tmp$,getarg(1)? "�K�[�f�B�A���ݒu": "";	//SE�̓K�[�f�B�A���ݒu���j���[��\�����Ȃ�
	switch(select("�Ԃ̏�Ԃ�\��","���Ɣ��W�ɓ���","�Ԃ̖h�q�ɓ���",.@tmp$,"�J�v���Ƃ̌_�� / ����","�}�X�^�[�̕����ɓ���")) {
	case 1:		// �Ԃ̏�Ԃ�\��
		mes "[" +.@name$+ "]";
		mes "�Ԃ̏�Ԃ����񍐂��܂��B";
		mes " ";
		mes "^0000ff���݂̏��Ɣ��W�l��" +getcastledata(.@map$,2)+ " �ł��B";
		if(getcastledata(.@map$,4) != 0)
			mes "- 1���ȓ��� " +getcastledata(.@map$,4)+ "�̓��������܂����B";
		mes "���݂̖h��l��" +getcastledata(.@map$,3)+ " �ł��B^000000";
		if(getcastledata(.@map$,5) != 0)
			mes "^0000ff- 1���ȓ��� " +getcastledata(.@map$,5)+ "�̓��������܂����B^000000";
		mes " ";
		mes "�ȏ�ł��B";
		break;
	case 2:		// ���Ɣ��W�ɓ���
		mes "[" +.@name$+ "]";
		mes "���Ɣ��W�l�����߂�΁A";
		mes "�M���h�Ő��Y����镨���i�̐���";
		mes "�����܂��̂ŁA��X�̂��߂�";
		mes "�����������̂���낵���ł��傤�B";
		next;
		mes "[" +.@name$+ "]";
		mes "�ʏ����Ɉ��̂ݓ����\�ł����A";
		mes "�ǉ����z�𕥂����Ƃɂ��";
		mes "2��ڂ̓������\�ƂȂ�܂��B";
		next;
		set .@count,getcastledata(.@map$,4);
		if(.@count == 2) {
			mes "[" +.@name$+ "]";
			mes "^ff0000�������A�����͂��ł�2���";
			mes "�����������̂ŁA����ȏ�̓�����";
			mes "�ł��܂���B";
			mes "^000000�܂��܂��̂����W��";
			mes "���҂��Ă���܂��B";
			break;
		}
		set .@val,getcastledata(.@map$,2);
		if(.@val >= 100) {	//������
			mes "[" +.@name$+ "]";
			mes "^ff0000���Ɣ��W�l��";
			mes "���ݍő�l�ƂȂ��Ă���܂��B";
			mes "���͓�������K�v������܂���B^000000";
		 	break;
		}
		set .@tmp,(.@val-.@count)/5;
		set .@price,5000*(1+(1+.@tmp)*.@tmp/2)*(1+3*.@count);
		switch(.@count) {
		case 0:
			mes "[" +.@name$+ "]";
			mes "���ݕK�v�ȓ�������";
			mes "^ff0000" +.@price+ "^000000 Zeny�ł��B";
			mes "�����v���܂����H";
			break;
		case 1:
			mes "[" +.@name$+ "]";
			mes "����1�񓊎��Ȃ����Ă܂����A";
			mes "�ǉ������Ȃ����܂����H";
			mes "���̏ꍇ�� ^ff0000" +.@price+ "^000000 Zeny��";
			mes "�K�v�ƂȂ�܂��B";
			break;
		}
		next;
		if(select("���Ɣ��W�ɓ�������","������") == 2) {
			mes "[" +.@name$+ "]";
			mes "�������܂�܂����B";
			mes "�ł�K�v�͂������܂���B";
			mes "�܂����ł������������Ă��������B";
			break;
		}
		if(Zeny < .@price) {	//������
			mes "[" +.@name$+ "]";
			mes "�}�X�^�[�I";
			mes "�����ɕK�v�Ȃ���������܂���B";
			mes "�������������܂����B";
			break;
		}
		set Zeny,Zeny-.@price;
		setcastledata .@map$,4,.@count+1;
		mes "[" +.@name$+ "]";
		mes "�����ɓ����ł��܂����I";
		mes "���オ�܂��܂��y���݂ł��ˁB";
		mes "�������甭�W�l���オ��ł��傤�B";
		break;
	case 3:		// �Ԃ̖h�q�ɓ���
		mes "[" +.@name$+ "]";
		mes "�h�q�l�����߂�΁A";
		mes "�K�[�f�B�A���ƃG���y���E����";
		mes "�ϋv�x�����サ�܂��B";
		mes "��X�̐퓬�ɔ����A";
		mes "�������Ă����̂��������Ǝv���܂��B";
		next;
		mes "[" +.@name$+ "]";
		mes "�ʏ����Ɉ��̂ݓ����\�ł����A";
		mes "�ǉ����z�𕥂����Ƃɂ��";
		mes "2��ڂ̓������\�ƂȂ�܂��B";
		next;
		set .@count,getcastledata(.@map$,5);
		if(.@count == 2) {
			mes "[" +.@name$+ "]";
			mes "^ff0000�������A�����͂��ł�2���";
			mes "�����������̂ŁA����ȏ�̓�����";
			mes "�ł��܂���B";
			mes "^000000�܂��܂��̂����W��";
			mes "���҂��Ă���܂��B";
			break;
		}
		set .@val,getcastledata(.@map$,3);
		if(.@val >= 100) {	//������
			mes "[" +.@name$+ "]";
			mes "^ff0000�h�q�����l�͌���100%�ł��B";
			mes "���͓�������K�v������܂���B^000000";
			break;
		}
		set .@tmp,(.@val-.@count)/5;
		set .@price,10000*(1+(1+.@tmp)*.@tmp/2)*(1+3*.@count);
		if(.@count) {
			mes "[" +.@name$+ "]";
			mes "����1�񓊎��Ȃ����Ă܂����A";
			mes "�ǉ������Ȃ����܂����H";
			mes "���̏ꍇ�� ^ff0000" +.@price+ "^000000 Zeny��";
			mes "�K�v�ƂȂ�܂��B";
		}
		else {
			mes "[" +.@name$+ "]";
			mes "���ݕK�v�ȓ�������";
			mes "^ff0000" +.@price+ "^000000 Zeny�ł��B";
			mes "�����v���܂����H";
		}
		next;
		if(select("�h�q�ɓ�������","������") == 2) {
			mes "[" +.@name$+ "]";
			mes "�������܂�܂����B";
			mes "�ł�K�v�͂������܂���B";
			mes "�܂����ł������������Ă��������B";
			break;
		}
		if(Zeny < .@price) {	//������
			mes "[" +.@name$+ "]";
			mes "�}�X�^�[�I";
			mes "�����ɕK�v�Ȃ���������܂���B";
			mes "�������������܂����B";
			break;
		}
		set Zeny,Zeny-.@price;
		setcastledata .@map$,5,.@count+1;
		mes "[" +.@name$+ "]";
		mes "�����ɓ����ł��܂����I";
		mes "���オ�܂��܂��y���݂ł��ˁB";
		mes "��������h�q�l���オ��ł��傤�B";
		break;
	case 4:		// �K�[�f�B�A���ݒu
		set .@max,getarraysize(getarg(1));
		copyarray .@id,getarg(1),.@max;
		mes "[" +.@name$+ "]";
		mes "�K�[�f�B�A����ݒu���܂����H";
		mes "�K�[�f�B�A���͎������̍Ԃ����";
		mes "���҂ƂȂ�܂��B";
		mes "�ݒu����K�[�f�B�A����";
		mes "�I�����Ă��������B";
		next;
		for(set .@i,0; .@i < .@max; set .@i,.@i+1) {
			set .@name$,getmobname(.@id[.@i]);
			if(getcastledata(.@map$,.@i+10) == 0)
				set .@stat$,"�ݒu�ł��܂�";
			else
				//�\���͈͂���͂ݏo��̂ŕ\�����A�����W
				//set .@stat$,"�ݒu�ł��܂��� (" +getguardianinfo(.@map$,.@i+1,3)+ " / " +getguardianinfo(.@map$,.@i+1,4)+ ")";
				set .@stat$,"(" +getguardianinfo(.@map$,.@i+1,3)+ " / " +getguardianinfo(.@map$,.@i+1,4)+ ")";
			set .@tmp$[.@i],.@name$ + " - " + .@stat$;
		}
		set .@ret,select(printarray(.@tmp$))+9;
		mes "[" +.@name$+ "]";
		mes "�I�������K�[�f�B�A����";
		mes "�{���ɐݒu���܂����H�ݒu�ɂ�";
		mes "^ff000010000^000000Zeny���K�v�ł��B";
		next;
		if(select("�ݒu����","��߂�") == 2) {
			mes "[" +.@name$+ "]";
			mes "�������܂�܂����B";
			mes "�����ɗ]�T���ł������́A";
			mes "���Аݒu����邱�Ƃ�";
			mes "�����ߒv���܂��B";
			break;
		}
		if(getgdskilllv(getcharid(2),10002) == 0) {
			mes "[" +.@name$+ "]";
			mes "�}�X�^�[�c�K�[�f�B�A���ݒu��";
			mes "�K�v�Ȍ����m�����s�����Ă��܂��B";
			mes "�K�[�f�B�A���ݒu�Ɋւ���m����";
			mes "���邽�߂ɂ́A�M���h�X�L����";
			mes "^ff0000�K�[�f�B�A�����쌤��^000000��";
			mes "�K�����Ȃ���΂Ȃ�܂���B";
			break;
		}
		if(getcastledata(.@map$,.@ret)) {
			mes "[" +.@name$+ "]";	//������
			mes "�}�X�^�[�I";
			mes "���ɃK�[�f�B�A�����ݒu����Ă��܂��B";
			mes " ";
			mes "�K�[�f�B�A���ݒu����������܂����B";
			break;
		}
		if(Zeny < 10000) {	//������
			mes "[" +.@name$+ "]";
			mes "�}�X�^�[�I";
			mes "�����ɕK�v�Ȃ���������܂���B";
			mes "�������������܂����B";
			break;
		}
		set Zeny,Zeny-10000;
		copyarray .@x,getarg(2),.@max;
		copyarray .@y,getarg(3),.@max;
		set .@ret,.@ret-10;
		callguardian .@map$,.@x[.@ret],.@y[.@ret],"--ja--",.@id[.@ret],1,"",.@ret+1;
		mes "[" +.@name$+ "]";
		mes "�K�[�f�B�A�����ݒu����܂����B";
		mes "�K�[�f�B�A���͎��B�̏��";
		mes "�G�������Ă����ł��傤�B";
		break;
	case 5:		// �J�v���Ƃ̌_�� / ����
		if(getcastledata(.@map$,9) == 0) {
			mes "[" +.@name$+ "]";
			mes "�J�v���{�ЂƂ̌_������āA";
			mes "�ԓ��ɃJ�v���E�����ق��܂����H";
			mes "�ٗp�ɂ�^ff000010000^000000Zeny���K�v�ł����c";
			next;
			if(select("�ق�","������") == 2) {
				mes "[" +.@name$+ "]";
				mes "�������܂�܂����B";
				mes "�������A�M���h���̂��߂ɂ�";
				mes "���֐��̌����Y��Ă�";
				mes "�Ȃ�܂���B";
				break;
			}
			if(getgdskilllv(getcharid(2),10001) == 0) {
				mes "[" +.@name$+ "]";
				mes "�}�X�^�[�c�܂��J�v���{�ЂƂ�";
				mes "�_�񂪌��΂�Ă��܂���B";
				mes "�_���������Ȃ���΁A";
				mes "�J�v���E�����ق����Ƃ��ł��܂���B";
				next;
				mes "[" +.@name$+ "]";
				mes "�J�v���{�ЂƂ̌_������]�݂Ȃ�A";
				mes "�M���h�X�L����";
				mes " ^ff0000�J�v���_��^000000 �X�L����";
				mes "�K�����Ȃ���΂Ȃ�܂���B";
				break;
			}
			if(Zeny < 10000) {	//������
				mes "[" +.@name$+ "]";
				mes "�}�X�^�[�I����������܂����I";
				break;
			}
			set Zeny,Zeny-10000;
			hideoffnpc "AgitKafra_"+getarg(0);	//"AgitCode"���g���ČĂяo��NPC��������
			setcastledata .@map$,9,1;
			mes "[" +.@name$+ "]";
			mes "�J�v���Ƃ̌_�񂪊������܂���";
			next;
			cutin "kafra_01",2;
			mes "[�J�v���E��]";
			mes "���߂܂��āA";
			mes "�J�v���f�B�t�H���e�Ɛ\���܂��B";
			mes "�őP��s�����܂��̂ŋX�������˂������܂��I";
			close2;
			cutin "kafra_01",255;
			//mes "[" +.@name$+ "]";
			//mes "�M���h�x�[�X�ŃJ�v���Ƃ̌_����ێ����邽�߂�";
			//mes "����Zeny�𕥂�Ȃ���΂Ȃ�܂���B";
			//mes "(������)";
			break;
		}
		mes "[" +.@name$+ "]";
		mes "�J�v���E���Ƃ̌_���j�����܂����H";
		next;
		if(select("���ق���","�L�����Z��") == 2) {
			mes "[" +.@name$+ "]";
			mes "�킩��܂����B";
			break;
		}
		cutin "kafra_01",2;
		mes "[�J�v���E��]";
		mes "���c�����Ԉ���Ă��܂������H";
		mes "���ꂩ��͋C�����܂�����c";
		mes "�����Ă͂��炦�܂��񂩁c";
		next;
		if(select("���ق���","�L�����Z��")==2) {
			mes "[�J�v���E��]";
			mes "���肪�Ƃ��������܂��B";
			mes "�S�͂�s�����Ď����ɂ��܂��I";
			close2;
			cutin "kafra_01",255;
			break;
		}
		mes "[�J�v���E��]";
		mes "�����A���قȂ����ł��ˁc";
		next;
		hideonnpc "AgitKafra_"+getarg(0);
		setcastledata .@map$,9,0;
		cutin "kafra_01",255;
		mes "[" +.@name$+ "]";
		mes "�c";
		mes "�J�v���Ƃ̌_�񂪔j������܂����B";
		break;
	case 6:		// �}�X�^�[�̕����ɓ���
		mes "[" +.@name$+ "]";
		mes "�������̋M�d�Ȑ��Y�i�̐��X��";
		mes "�~�����Ă��镔����";
		mes "������̂ł��ˁH";
		mes "�����́A�}�X�^�[�ɂ̂�";
		mes "�����������ꂽ�����ł������܂��B";
		next;
		if(select("�}�X�^�[�̕����ɓ���","������") == 2) {
			mes "[" +.@name$+ "]";
			mes "���Y�i�͈���Ɉ�񐶎Y�\�ł����A";
			mes "������x�܂Œ��~�����Ƃ���ȏ�";
			mes "���Y����Ȃ��Ȃ�܂��B�ł�����A";
			mes "���B�̃M���h�̔��W�̂��߂ɂ�";
			mes "�K�x�Ɏ��o���Ȃ���΂Ȃ�܂���B";
			break;
		}
		mes "[" +.@name$+ "]";
		mes "����ł͂��ē��v���܂��B";
		mes "���ɂ��Ă��炵�Ă��������B";
		mes "�A���ė��鎞�͉B���X�C�b�`��";
		mes "���삷��΋A��܂��B";
		close2;
		warp .@map$,getarg(4),getarg(5);
		break;
	}
	return;
}

//============================================================
// �}�X�^�[���[���̃X�C�b�`
//	callfunc "AgitMaster",WarpX,WarpY;
//------------------------------------------------------------
function	script	AgitMaster	{
	mes "�����ȃ��o�[������܂��B";
	mes "�����܂����H";
	next;
	if(select("����","�����Ȃ�") == 1) {
		set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);		//.@map$�ȊO�̓_�~�[
		warp .@map$,getarg(0),getarg(1);
	}
	return;
}

//============================================================
// �M���h�_���W�����ւ̃X�C�b�`
//	callfunc "AgitDungeon","WarpMap",WarpX,WarpY;
//------------------------------------------------------------
function	script	AgitDungeon	{
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);		//.@map$�ȊO�̓_�~�[
	set .@gid,getcastledata(.@map$,1);
	if(.@gid <= 0) {
		mes "[��]";	//������
		mes "�����̍�������z��";
		mes "�����ɑł��������ҁA";
		mes "���̎҂ɍX�Ȃ鎎����^����";
		return;
	}
	mes "[��]";
	mes "�����ɒ��ނȂ�ΐ�֐i�ނ��悢";
	next;
	mes " ";
	mes "�����ȃ��o�[������܂��B";
	mes "�����܂����H";
	next;
	if(select("����","�����Ȃ�") == 2)
		return;
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);		//.@map$�ȊO�̓_�~�[
	set .@gid,getcastledata(.@map$,1);
	if(.@gid && .@gid == getcharid(2)) {
		warp getarg(0),getarg(1),getarg(2);
		return;
	}
	mes " ";
	mes "�����������N����Ȃ������B";
	return;
}

//============================================================
// �}�X�^�[���[������
//	callfunc "AgitBanWarp","WarpMap",WarpX,WarpY;
//------------------------------------------------------------
function	script	AgitBanWarp	{
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);		//.@map$�ȊO�̓_�~�[
	set .@gid,getcastledata(.@map$,1);
	if(.@gid <= 0 || getcharid(0) != getguildmasterid(.@gid))	//�}�X�^�[���H
		warp getarg(0),getarg(1),getarg(2);
	return;
}

//============================================================
// SE�A�W�g���
//	callfunc "AgitBreakSE","AgitCode";
//------------------------------------------------------------
function	script	AgitBreakSE	{
	donpcevent "Barricade#"+getarg(0)+"::OnReset";
	donpcevent "���䑕�u01#"+getarg(0)+"::OnReset";
	donpcevent "���䑕�u02#"+getarg(0)+"::OnReset";
	donpcevent "���䑕�u03#"+getarg(0)+"::OnReset";
	sleep 10000;
	set getvariableofnpc(.guardian1,"Guardian#"+getarg(0)),0;
	set getvariableofnpc(.guardian2,"Guardian#"+getarg(0)),0;
	set getvariableofnpc(.status,"���䑕�u01#"+getarg(0)),1;
	set getvariableofnpc(.status,"���䑕�u02#"+getarg(0)),1;
	set getvariableofnpc(.status,"���䑕�u03#"+getarg(0)),2;
	donpcevent "GuardianStone1#"+getarg(0)+"::OnSet";
	donpcevent "GuardianStone2#"+getarg(0)+"::OnSet";
	announce "�e���΂̏C���|�C���g�Ƒ�3�o���P�[�h�̐��䑕�u���쓮���܂���",0x9,0x00FF00;
	return;
}

//============================================================
// SE����S��
//	callfunc "AgitGuard";
//------------------------------------------------------------
function	script	AgitGuard	{
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);		//.@map$�ȊO�̓_�~�[
	set .@gid,getcastledata(.@map$,1);
	if(.@gid <= 0 || getcharid(2) != .@gid) {
		mes "[" +strnpcinfo(1)+ "]";
		mes "�N�ł����H";
		mes "���������̍Ԃ���o�Ă����Ă��������I";
		return;
	}
	if(getcharid(0) != getguildmasterid(.@gid)) {
		mes "[" +strnpcinfo(1)+ "]";
		mes "���͍Ԃ̎����S�����Ă���҂ł��B";
		mes "�ڂ����b�̓}�X�^�[�Ƃ��܂��B";
		return;
	}
	if(agitcheck()) {
		mes "[" +strnpcinfo(1)+ "]";
		mes "�}�X�^�[�I";
		mes "�Ȃ�Ȃ�Ƃ����߂��������I";
		next;
		switch(select("�Ԃ̎������","���ݏ󋵕�","������")) {
		case 1:
			if(getgdskilllv(getcharid(2),10002) == 0) {
				// ������
				mes "[" +strnpcinfo(1)+ "]";
				mes "�K�[�f�B�A���ݒu��";
				mes "�K�v�Ȍ����m�����s�����Ă��܂��B";
				mes "�K�[�f�B�A���ݒu�Ɋւ���m����";
				mes "���邽�߂ɂ́A�M���h�X�L����";
				mes "^FF0000�K�[�f�B�A�����쌤��^000000��";
				mes "�K�����Ȃ���΂Ȃ�܂���B";
				return;
			}
			mes "[" +strnpcinfo(1)+ "]";
			mes "�O��^FF0000����^000000��ʂ���^4D4DFF�K�[�f�B�A��^000000��";
			mes "��������悤�ɖ��߂��܂��B";
			mes "�������A^FF0000����^000000���j�󂳂�Ă�����";
			mes "^4D4DFF�K�[�f�B�A��^000000�̏����͂ł��܂���B";
			mes "���̍ۂ�^FF0000����^000000���č\�z�����";
			mes "^4D4DFF�K�[�f�B�A��^000000����������܂��B";
			set .@def,getcastledata(.@map$,3);
			set .@count,getvariableofnpc(.guardian1,"Guardian#"+strnpcinfo(2));
			if(getvariableofnpc(.status,"GuardianStone1#"+strnpcinfo(2)) == 0 && .@count == 0) {
				copyarray .@x,getarg(0),getarraysize(getarg(0));
				copyarray .@y,getarg(1),getarraysize(getarg(1));
				callguardian .@map$,.@x[0],.@y[0],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
				if(.@def > 10 && .@def < 31) {
					callguardian .@map$,.@x[1],.@y[1],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					set .@count,.@count+2;
				}
				else if(.@def > 30 && .@def < 51) {
					callguardian .@map$,.@x[2],.@y[2],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					callguardian .@map$,.@x[3],.@y[3],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					set .@count,.@count+3;
				}
				else if(.@def > 50 && .@def < 71) {
					callguardian .@map$,.@x[4],.@y[4],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					callguardian .@map$,.@x[5],.@y[5],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					callguardian .@map$,.@x[6],.@y[6],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					set .@count,.@count+4;
				}
				else if(.@def > 70) {
					callguardian .@map$,.@x[7],.@y[7],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					callguardian .@map$,.@x[8],.@y[8],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					callguardian .@map$,.@x[9],.@y[9],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					callguardian .@map$,.@x[10],.@y[10],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					set .@count,.@count+5;
				}
				else {
					callguardian .@map$,.@x[11],.@y[11],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled1";
					set .@count,.@count+2;
				}
				set getvariableofnpc(.guardian1,"Guardian#"+strnpcinfo(2)),.@count;
				initnpctimer "Guardian#"+strnpcinfo(2);
			}
			set .@count,getvariableofnpc(.guardian2,"Guardian#"+strnpcinfo(2));
			if(getvariableofnpc(.status,"GuardianStone2#"+strnpcinfo(2)) == 0 && .@count == 0) {
				copyarray .@x,getarg(2),getarraysize(getarg(2));
				copyarray .@y,getarg(3),getarraysize(getarg(3));
				callguardian .@map$,.@x[0],.@y[0],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
				if(.@def > 10 && .@def < 31) {
					callguardian .@map$,.@x[1],.@y[1],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					set .@count,.@count+2;
				}
				else if(.@def > 30 && .@def < 51) {
					callguardian .@map$,.@x[2],.@y[2],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					callguardian .@map$,.@x[3],.@y[3],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					set .@count,.@count+3;
				}
				else if(.@def > 50 && .@def < 71) {
					callguardian .@map$,.@x[4],.@y[4],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					callguardian .@map$,.@x[5],.@y[5],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					callguardian .@map$,.@x[6],.@y[6],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					set .@count,.@count+4;
				}
				else if(.@def > 70) {
					callguardian .@map$,.@x[7],.@y[7],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					callguardian .@map$,.@x[8],.@y[8],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					callguardian .@map$,.@x[9],.@y[9],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					callguardian .@map$,.@x[10],.@y[10],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					set .@count,.@count+5;
				}
				else {
					callguardian .@map$,.@x[11],.@y[11],"--ja--",1899,1,"Guardian#"+strnpcinfo(2)+"::OnKilled2";
					set .@count,.@count+2;
				}
				set getvariableofnpc(.guardian2,"Guardian#"+strnpcinfo(2)),.@count;
				initnpctimer "Guardian#"+strnpcinfo(2);
			}
			return;
		case 2:
			mes "[" +strnpcinfo(1)+ "]";
			mes "���݂̏󋵂����񍐂��܂��B";
			set .@status,getvariableofnpc(.status,"GuardianStone1#"+strnpcinfo(2));
			mes "��1���� : " +(.@status == 1? "^FF0000�j��^000000": .@status == 2? "^008000�����\^000000": "^4D4DFF����^000000");
			set .@status,getvariableofnpc(.status,"GuardianStone2#"+strnpcinfo(2));
			mes "��2���� : " +(.@status == 1? "^FF0000�j��^000000": .@status == 2? "^008000�����\^000000": "^4D4DFF����^000000");
			set .@status,getvariableofnpc(.status,"���䑕�u01#"+strnpcinfo(2));
			mes "��1�o���P�[�h : " +(.@status == 1? "^FF0000�j��^000000": .@status == 2? "^008000�����\^000000": "^4D4DFF����^000000");
			set .@status,getvariableofnpc(.status,"���䑕�u02#"+strnpcinfo(2));
			mes "��2�o���P�[�h : " +(.@status == 1? "^FF0000�j��^000000": .@status == 2? "^008000�����\^000000": "^4D4DFF����^000000");
			set .@status,getvariableofnpc(.status,"���䑕�u03#"+strnpcinfo(2));
			mes "��3�o���P�[�h : " +(.@status == 1? "^FF0000�j��^000000": .@status == 2? "^008000�����\^000000": "^4D4DFF����^000000");
			return;
		case 3:
			mes "[" +strnpcinfo(1)+ "]";
			mes "���͂��ł������ɋ��܂�����A";
			mes "�K�v�Ȏ��͂��ł����p�����������B";
			return;
		}
	}
	mes "[" +strnpcinfo(1)+ "]";
	mes "���͍Ԃ̎����S�����Ă���";
	mes strnpcinfo(1)+ "�Ɛ\���܂��B";
	mes "�����A�ُ�͂���܂���B";
	next;
	if(select("��b�𑱂���","��߂�") == 2) {
		mes "[" +strnpcinfo(1)+ "]";
		mes "���͂��ł������ɋ��܂�����A";
		mes "�K�v�Ȏ��͂��ł����p�����������B";
		return;
	}
	mes "[" +strnpcinfo(1)+ "]";
	mes "�Ԃɂ���";
	mes "��������͂������܂����H";
	next;
	switch(select("^FF0000����^000000�Ƃ́H","^4D4DFF�o���P�[�h^000000�Ƃ́H","^008000�t���b�O^000000�̗p�r�Ƃ́H","�ǂ�Ȑ헪���ǂ��H","�Ȃ�")) {
	case 1:
		mes "[" +strnpcinfo(1)+ "]";
		mes "�Ԃɂ�^9C009C��̃G���y���E��^000000��";
		mes "^FF0000��̎���^000000�����݂��܂��B";
		mes "����^FF0000����^000000�͍Ԃ���邽�߂�";
		mes "�ŏ��̖h���i�ł���A";
		mes "^FF0000���΂��S�Ĕj�󂳂�Ȃ�����";
		mes "�G�͍ԂɐN�����鎖���ł��܂���^000000�B";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "�Ԃ̓����ɂ�^4D4DFF���o���P�[�h^000000������";
		mes "^FF0000��̎���^000000��";
		mes "^4D4DFF���o���P�[�h^000000�ƘA�����Ă��܂��B";
		mes "���o���P�[�h�͎��΂��S��";
		mes "�j�󂳂�Ȃ�����A��؍U���o����";
		mes "�ʉ߂��邱�Ƃ��ł��܂���B";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "����^FF0000����^000000������ꏊ��";
		mes "�w^FF0000���_^000000�x�ƌĂт܂��B";
		mes "�w^FF0000���_^000000�x��^FF0000����^000000��";
		mes "�����ɖh�䂷�鎖���ł���΁A";
		mes "�G�̓G���y���E���ɋ߂Â��Ȃ��̂ł��B";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "�܂��A����^FF0000����^000000��";
		mes "�Ԃ���삷��^9C009C�K�[�f�B�A����";
		mes "����������^000000������܂��̂ŁA";
		mes "�F�X�Əd�v�ȕ����ł��B";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "������^FF0000����^000000����������";
		mes "^9C009C�K�[�f�B�A��^000000�̌ő̐���";
		mes "^4D4DFF�Ԃ̖h�q�l^000000�Ɗ֌W������܂��B";
		mes "^4D4DFF�h�q�l^000000�������ق�^FF0000����^000000����������";
		mes "�K�[�f�B�A���̐��������Ȃ�܂��̂ŁA";
		mes "�h����������撣���Ă��������B";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "�j�󂳂ꂽ^FF0000����^000000�͈�莞�Ԃ��o��";
		mes "�č\�z�ł��܂����A�����";
		mes "�M���h�����o�[�̊F�l�̖�ڂł��B";
		mes "^FF0000����^000000�̏�Ԃ͎���ʂ���";
		mes "�m�F�ł��܂��̂ŁA";
		mes "���ł������߂��������B";
		return;
	case 2:
		mes "[" +strnpcinfo(1)+ "]";
		mes "^4D4DFF�o���P�[�h^000000��^FF0000����^000000�̎���";
		mes "�h�q��i�Ƃ��āA�Ԃō\�z���Ă���";
		mes "�񎟖h��@�\�ł��B";
		mes "^FF0000����^000000���S�Ĕj�󂳂���";
		mes "^4D4DFF���o���P�[�h^000000�����ł�";
		mes "�Ԃւ̐i�����\�ɂȂ��Ă��܂��܂��B";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "�G������Ŗh���̂������";
		mes "^4D4DFF��1�`��3�o���P�[�h^000000�ł��B";
		mes "����^4D4DFF3�̃o���P�[�h^000000���A";
		mes "�Ԃ̗v���v���œG�̐N����";
		mes "�h���ł��܂��B";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "^4D4DFF�o���P�[�h^000000���ς��Ă��邤����";
		mes "������x���Ԃ��҂���ł��傤�B������";
		mes "^FF0000��x�j�󂳂ꂽ�o���P�[�h��";
		mes "�C���s�\^000000�ł��̂ŁA�����ӂ��������B";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "^4D4DFF�o���P�[�h^000000�́A�U���J�n����";
		mes "�����I�ɍ\�z����܂����A";
		mes "�퓬���n�܂�j�󂳂���";
		mes "�����C�����邱�Ƃ͏o���܂���B";
		mes "�\�z�ł���^�C�~���O�́A�Ԃ̎����傪";
		mes "�ς�����Ƃ������ł��B";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "�Ȃ��A^4D4DFF�o���P�[�h^000000�̍\�z��Ƃ�";
		mes "^FF0000�M���h�}�X�^�[�̂݉\^000000��";
		mes "�Ȃ��Ă���܂��B";
		mes "�܂��A��3�o���P�[�h���珇��";
		mes "�\�z���\�ƂȂ�܂��B";
		mes "���̓_�����Y��Ȃ��悤���肢���܂��B";
		return;
	case 3:
		mes "[" +strnpcinfo(1)+ "]";
		mes "�Ԃ̒��ɂ�^008000�t���b�O^000000����������܂��B";
		mes "^4D4DFF�o���P�[�h^000000�ɂ���Ĉړ��̐�����";
		mes "�������܂��̂ŁA������z���邽�߂ɂ�";
		mes "�ݒu�����̂�����^008000�t���b�O^000000�ł��B";
		mes "�ʏ́w^008000�����N�t���b�O^000000�x��";
		mes "�Ă�ł��܂��B";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "�ǂ�^008000�t���b�O^000000���ǂ̏ꏊ��";
		mes "�q�����Ă���̂��c�c";
		mes "����́c�c�S���o���鎖��";
		mes "�ł��Ă��܂��񂪁A";
		mes "���^FF0000��Ԃ̃t���b�O^000000��";
		mes "�e^FF0000���_^000000�֌q�����Ă��܂����B";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "�Ԃ�^008000�t���b�O^000000�͊�{�I��";
		mes "�w^9C009C�G���y���E��^000000�x�����鏊��";
		mes "�q�����Ă��܂����A";
		mes "�M���h�����o�[�̊F����̂��߂�";
		mes "�֗��@�\�Ƃ��Ă�^008000�t���b�O^000000�́A";
		mes "���������Ō�̔ԍ��̂��̂ł��傤�B";
		return;
	case 4:
		mes "[" +strnpcinfo(1)+ "]";
		mes "�헪�ł����c�c";
		mes "����́A���ł͂Ȃ��}�X�^�[������";
		mes "�l����ׂ����Ǝv���܂����c�c";
		mes "�܂��A^FF0000���_^000000��^4D4DFF�o���P�[�h^000000���ő��";
		mes "���p���āA�����̃^�C�~���O��";
		mes "�C�����邱�ƁA�ł��傤�ˁB";
		return;
	case 5:
		mes "[" +strnpcinfo(1)+ "]";
		mes "���͂��ł������ɋ��܂�����A";
		mes "�K�v�Ȏ��͂��ł����p�����������B";
		return;
	}
}

//============================================================
// SE�K�[�f�B�A������
//	callfunc "AgitCallGuardian",GuardianNo,Announce,PosX,PosY;
//------------------------------------------------------------
function	script	AgitCallGuardian	{
	if(getvariableofnpc(.status,"GuardianStone"+getarg(0)+"#"+strnpcinfo(2)) != 0)
		return;
	switch(getarg(1)) {
		case 1: announce "���_�ɃK�[�f�B�A�����ꎟ�ǉ��������܂��B",0x9,0xFF4500; break;
		case 2: announce "���_�ɃK�[�f�B�A����񎟒ǉ��������܂��B",0x9,0xFF4500; break;
		case 3: announce "���_�ɃK�[�f�B�A�����O���ǉ��������܂��B",0x9,0xFF4500; break;
		case 4: announce "���_�ɃK�[�f�B�A�����l���ǉ��������܂��B",0x9,0xFF4500; break;
		case 5: announce "���_�ɃK�[�f�B�A�����܎��ǉ��������܂��B",0x9,0xFF4500; break;
		default: break;
	}
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);
	callguardian .@map$,getarg(2),getarg(3),"--ja--",1899,1,strnpcinfo(0)+"::OnKilled"+getarg(0);
	if(getarg(0) == 1)
		set getvariableofnpc(.guardian1,strnpcinfo(0)),getvariableofnpc(.guardian1,strnpcinfo(0))+1;
	else if(getarg(0) == 2)
		set getvariableofnpc(.guardian2,strnpcinfo(0)),getvariableofnpc(.guardian2,strnpcinfo(0))+1;
	return;
}

//============================================================
// SE����
//	callfunc "AgitStone",StoneNo;
//------------------------------------------------------------
function	script	AgitStone	{
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);		//.@map$�ȊO�̓_�~�[
	set .@gid,getcastledata(.@map$,1);
	if(.@gid <= 0 || getcharid(2) != .@gid)
		return;
	mes "[" +strnpcinfo(1)+ "]";
	mes "�j�󂳂ꂽ���΂��č\�z���܂��B";
	mes "�č\�z�ɂ͎��̍z�΂��K�v�ł��B";
	next;
	mes "[" +strnpcinfo(1)+ "]";
	mes "�I���f�I�R���@^4D4DFF1��^000000";
	mes "�G���j�E���@^4D4DFF1��^000000";
	mes "�΁@^4D4DFF30��^000000";
	mes "�u���[�W�F���X�g�[���@^4D4DFF5��^000000";
	mes "�C�G���[�W�F���X�g�[���@^4D4DFF5��^000000";
	mes "���b�h�W�F���X�g�[���@^4D4DFF5��^000000";
	next;
	mes "[" +strnpcinfo(1)+ "]";
	mes "��Ƃ𑱂��܂����H";
	next;
	if(select("��߂�","������") == 1) {
		mes "[" +strnpcinfo(1)+ "]";
		mes "�S�Ă̍�Ƃ���������܂����B";
		return;
	}
	if(countitem(984) < 1 || countitem(985) < 1 || countitem(7049) < 30 || countitem(715) < 5 || countitem(716) < 5 || countitem(717) < 5) {
		mes "[" +strnpcinfo(1)+ "]";
		mes "�ޗ�������܂���B";
		return;
	}
	mes "[" +strnpcinfo(1)+ "]";
	mes "��Phase�F1";
	mes "�ȉ��̏��ōz�΂�z�u���Ă��������B";
	mes " ";
	mes "^008000��^000000��^FF0000�G���j�E��^000000��^4D4DFF�I���f�I�R��^000000";
	next;
	set .@point,0;
	setarray .@tmp$,"^4D4DFF�I���f�I�R��^000000","^FF0000�G���j�E��^000000","^008000��^000000";
	for(set .@i,1; .@i <= 3; set .@i,.@i+1) {
		set @menu,select(printarray(.@tmp$));
		mes "[" +strnpcinfo(1)+ "]";
		mes "��Phase�F1-" +.@i;
		mes .@tmp$[@menu-1]+ "��z�u�B";
		mes " ";
		if(.@i < 3)
			mes "���ɔz�u����z�΂�I�����Ă��������B";
		else
			mes "���̃t�F�[�Y�Ɉڍs���܂��B";
		if(.@i == 1 && @menu == 3 || .@i == 2 && @menu == 2 || .@i == 3 && @menu == 1)
			set .@point,.@point+10;
		next;
	}
	mes "[" +strnpcinfo(1)+ "]";
	mes "��Phase�F2";
	mes "�������閂�͂ƈ�v���閂�͂�";
	mes "���߂�ꂽ�W�F���X�g�[����";
	mes "�z�u���Ă��������B";
	mes "���͂̐����͔������̌��ʂ�";
	mes "���f�ł��܂��B";
	next;
	mes "[" +strnpcinfo(1)+ "]";
	mes "��Phase�F2";
	mes "�܂��A";
	mes "��͔R����悤�ɐԂ��A";
	mes "�M���͌��̂悤�ɉ��F���A";
	mes "���H�͐�����ȗl��\���܂��B";
	next;
	setarray .@tmp$,"���b�h�W�F���X�g�[��","�C�G���[�W�F���X�g�[��","�u���[�W�F���X�g�[��";
	for(set .@i,1; .@i <= 8; set .@i,.@i+1) {
		set .@pattern,rand(1,3);
		switch(.@pattern) {
		case 1:
			misceffect 225;
			emotion 3;
			break;
		case 2:
			misceffect 57;
			emotion 5;
			break;
		case 3:
			misceffect 54;
			emotion 4;
			break;
		}
		mes "[" +strnpcinfo(1)+ "]";
		mes "��Phase�F2-" +.@i;
		mes "�����������͂ƈ�v���閂�͂�";
		mes "���߂�ꂽ�W�F���X�g�[����";
		mes "�z�u���Ă��������B";
		next;
		set @menu,select(printarray(.@tmp$));
		mes "[" +strnpcinfo(1)+ "]";
		mes "��Phase�F2-" +.@i;
		mes .@tmp$[@menu-1]+ "��z�u���܂��B";
		if(@menu != .@pattern) {
			next;
			mes "[" +strnpcinfo(1)+ "]";
			mes "��^FF0000MISS^000000";
			mes "���݂��̖��͂��Փ˂���";
			mes "^FF0000����^000000�̍č\�z�Ɏ��s���܂����B";
			return;
		}
		set .@point,.@point+10;
		misceffect 18;
		next;
	}
	if(.@point < 100) {
		// ������
		mes "[" +strnpcinfo(1)+ "]";
		mes "�c�c�c�c�c�c";
		mes "-�󋵂ɓK�؂ȑΏ����ł����A";
		mes "�@�C���Ɏ��s�����B";
		mes "�@�����̈ꕔ��������-";
		delitem 7049,10;
		delitem 715,2;
		delitem 716,2;
		delitem 717,2;
		return;
	}
	if(getvariableofnpc(.status,"GuardianStone"+getarg(0)+"#"+strnpcinfo(2)) == 0) {
		// ������
		mes "[" +strnpcinfo(1)+ "]";
		mes "�W�F���X�g�[���̔z�u���I���܂����B";
		return;
	}
	if(agitcheck() == 0) {
		// ������
		mes "[" +strnpcinfo(1)+ "]";
		mes "�G���y���E�������ł��A";
		mes "���΂̍č\�z�Ɏ��s���܂����B";
		return;
	}
	mes "[" +strnpcinfo(1)+ "]";
	mes "�W�F���X�g�[���̔z�u���I���܂����B";
	mes "^FF0000����^000000�̍č\�z��^4D4DFF����^000000���܂���!!";
	delitem 984,1;
	delitem 985,1;
	delitem 7049,30;
	delitem 715,5;
	delitem 716,5;
	delitem 717,5;
	misceffect 135;
	hideonnpc;
	donpcevent "GuardianStone"+getarg(0)+"#"+strnpcinfo(2)+"::OnRepair";
	if(getvariableofnpc(.status,"GuardianStone1#"+strnpcinfo(2))+getvariableofnpc(.status,"GuardianStone2#"+strnpcinfo(2)) == 0) {
		announce "���΂����S�������A���o���P�[�h���������܂����B",0x9,0x00FF00;
		donpcevent "Barricade#"+strnpcinfo(2)+"::OnSet";
	}
	else
		announce "��"+getarg(0)+"���΂̍č\�z�ɐ������܂����I",0x9,0x00FF00;
	return;
}

//============================================================
// SE���Δj��
//	callfunc "AgitStoneBreak",StoneNo;
//------------------------------------------------------------
function	script	AgitStoneBreak	{
	set getvariableofnpc(.status,strnpcinfo(0)),1;
	set .@status1,getvariableofnpc(.status,"GuardianStone1#"+strnpcinfo(2));
	set .@status2,getvariableofnpc(.status,"GuardianStone2#"+strnpcinfo(2));
	if((.@status1 == 1 || .@status1 == 2) && (.@status2 == 1 || .@status2 == 2)) {
		announce "�S�Ă̎��΂��j�󂳂�A���o���P�[�h�����ł��܂����I",0x9,0xFF0000;
		donpcevent "Barricade#"+strnpcinfo(2)+"::OnReset";
		stopnpctimer "Guardian#"+strnpcinfo(2);
	}
	else {
		announce "��"+getarg(0)+"���΂��j�󂳂�܂����I",0x9,0xFF4500;
	}
	killmonster "this","Guardian#"+strnpcinfo(2)+"::OnKilled"+getarg(0);
	initnpctimer;
	return;
}

//============================================================
// SE�o���P�[�h���䑕�u
//	callfunc "AgitBarricade";
//------------------------------------------------------------
function	script	AgitBarricade	{
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);		//.@map$�ȊO�̓_�~�[
	set .@gid,getcastledata(.@map$,1);
	if(getcharid(0) != getguildmasterid(.@gid) || getvariableofnpc(.status,strnpcinfo(0)) != 2)
		return;
	mes "[" +strnpcinfo(1)+ "]";
	mes "�j�������o���P�[�h�̏C�����\�ł��B";
	mes "���̎��ނ��K�v�ł��B";
	mes "�؋��@^4D4DFF30��^000000";
	mes "�|�S�@^4D4DFF10��^000000";
	mes "�G���x���^�R���@^4D4DFF10��^000000";
	mes "�I���f�I�R���@^4D4DFF5��^000000";
	next;
	if(select("��߂�","������") == 1) {
		mes "[" +strnpcinfo(1)+ "]";
		mes "�S�Ă̍�Ƃ���������܂����B";
		return;
	}
	if(countitem(1019) < 30 || countitem(999) < 10 || countitem(1011) < 10 || countitem(984) < 5) {
		mes "[" +strnpcinfo(1)+ "]";
		mes "�ޗ�������܂���B";
		return;
	}
	mes "[" +strnpcinfo(1)+ "]";
	mes "^4D4DFF�x���̕⋭^000000���K�v�ȏꍇ��";
	mes "^4D4DFF�؋�^000000���g���܂��B";
	mes "^FF0000�ϋv�͂̋���^000000�ɂ�^FF0000�I���f�I�R��^000000�A";
	mes "^008000�����ڒ�^000000�ɂ�^008000�|�S^000000���g���܂��B";
	mes "^9C009C�S�ʓI�ȕ�C^000000�ɂ�";
	mes "^9C009C�G���x���^�R��^000000�����g�����������B";
	next;
	set .@success,rand(5,10);
	set .@fail,0;
	set .@point,0;
	setarray .@tmp$,"�؋�","�|�S","�G���x���^�R��","�I���f�I�R��";
	while(.@point < .@success) {
		set .@pattern,rand(1,4);
		switch(.@pattern) {
		case 1:
			mes "-�j�󂳂ꂽ�n�_���[���@���Ă���B";
			mes "�@�x���̕⋭���K�v��-";
			break;
		case 2:
			mes "-������������Ă���̂��C�ɂȂ�B";
			mes "�@�����ڒ���n�ڂ�";
			mes "�@���Ȃ���΂Ȃ�Ȃ��悤��-";
			break;
		case 3:
			mes "-�S�ʓI�ȕ�C��Ƃ��K�v������-";
			break;
		case 4:
			mes "-�ȒP�ɔj�󂳂�Ȃ��悤��";
			mes "�@�ϋv�͂̋������K�v������-";
			break;
		}
		next;
		set @menu,select(printarray(.@tmp$));
		if(.@pattern == 2 && @menu == 1) {
			mes "�i�؋����g���ăE�h�D���A�[�}�[��";
			mes "�@����Ă݂��B";
			mes "�@����𒅂���΁c�c�j";
			set .@fail,1;
			next;
			continue;
		}
		if(@menu != .@pattern) {
			mes "�i" +.@tmp$[@menu-1]+ "�𗘗p���Ă݂悤��";
			mes "�@�������A���܂��ł��Ȃ��B";
			mes "�@�ŏ������蒼��������";
			mes "�@�ǂ��������B�j";
			return;
		}
		switch(.@pattern) {
		case 1:
			mes "�i�؋����g���Ďx����⋭�����B�j";
			break;
		case 2:
			mes "�i�|�S�𗘗p���ėn�ڂ����݂��B";
			mes "�@���h�ȃX�`�[���A�[�}�[��";
			mes "�@�������悤�ȋC������B�j";
			break;
		case 3:
			mes "�i�G���x���^�R���𗘗p����";
			mes "�@�S�ʓI�ȕ�C��Ƃ������B�j";
			break;
		case 4:
			mes "�i�z���O���������퐸�B��";
			mes "�@���鎞�̂悤�ɃI���f�I�R����";
			mes "�@�ł��Ă݂��B�����������B�j";
			break;
		}
		set .@point,.@point+1;
		misceffect 101,"";
		next;
	}
	mes "-��̏I������悤��-";
	next;
	if(agitcheck() == 0) {
		// ������
		mes "-�������A�G���y���E�������ł��A";
		mes "�@�o���P�[�h�̍\�z���ł��Ȃ�����-";
		return;
	}
	if(.@fail) {
		mes "[" +strnpcinfo(1)+ "]";
		mes "�c�c�c�c�c�c";
		mes "-�󋵂ɓK�؂ȑΏ����ł����A";
		mes "�@�C���Ɏ��s�����B";
		mes "�@�����̈ꕔ��������-";
		delitem 984,2;
		delitem 999,4;
		delitem 1019,14;
		delitem 1011,3;
		return;
	}
	mes "[" +strnpcinfo(1)+ "]";
	mes "^4D4DFF�o���P�[�h^000000���C�����܂����I";
	delitem 1019,30;
	delitem 999,10;
	delitem 1011,10;
	delitem 984,5;
	set getvariableofnpc(.status,strnpcinfo(0)),0;
	if(strnpcinfo(1) == "���䑕�u03") {
		mes "-^FF0000���䑕�u02���쓮^000000���܂����B";
		mes "�@��2�o���P�[�h�̏C�����\�ł�-";
		set getvariableofnpc(.status,"���䑕�u02#"+strnpcinfo(2)),2;
		announce "��3�o���P�[�h�̏C���ɐ������܂����I",0x9,0x00FF00;
	}
	else if(strnpcinfo(1) == "���䑕�u02") {
		mes "-^FF0000���䑕�u01���쓮^000000���܂����B";
		mes "�@��1�o���P�[�h�̏C�����\�ł�-";
		set getvariableofnpc(.status,"���䑕�u01#"+strnpcinfo(2)),2;
		announce "��2�o���P�[�h�̏C���ɐ������܂����I",0x9,0x00FF00;

	}
	else
		announce "��1�o���P�[�h�̏C���ɐ������܂����I",0x9,0x00FF00;
	donpcevent strnpcinfo(0)+"::OnSet";
	return;
}

//============================================================
// SE�����N�t���b�OA�i�e�n��ւ̃��[�v�j
//	callfunc "AgitLinkFlagA",SelectMenuArray,WarpXArray,WarpYArray;
//------------------------------------------------------------
function	script	AgitLinkFlagA	{
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);		//.@map$�ȊO�̓_�~�[
	set .@gid,getcastledata(.@map$,1);
	if(.@gid <= 0 || getcharid(2) != .@gid)
		return;
	mes "[�����N�t���b�O]";
	mes "�ړ�����ꏊ��I��ł��������B";
	set .@max,getarraysize(getarg(0));
	copyarray .@code,getarg(0),.@max;
	for(set .@i,0; .@i < .@max; set .@i,.@i+1) {
		switch(.@code[.@i]) {
			case 1: set .@disp$[.@i],"��1���_"; break;
			case 2: set .@disp$[.@i],"��2���_"; break;
			case 11: set .@disp$[.@i],"�h�q�n��1-1"; break;
			case 12: set .@disp$[.@i],"�h�q�n��1-2"; break;
			case 13: set .@disp$[.@i],"�h�q�n��1-3"; break;
			case 14: set .@disp$[.@i],"�h�q�n��1-4"; break;
			case 21: set .@disp$[.@i],"�h�q�n��2-1"; break;
			case 22: set .@disp$[.@i],"�h�q�n��2-2"; break;
			case 23: set .@disp$[.@i],"�h�q�n��2-3"; break;
			case 24: set .@disp$[.@i],"�h�q�n��2-4"; break;
			case 31: set .@disp$[.@i],"�h�q�n��3-1"; break;
			case 32: set .@disp$[.@i],"�h�q�n��3-2"; break;
			case 33: set .@disp$[.@i],"�h�q�n��3-3"; break;
			case 34: set .@disp$[.@i],"�h�q�n��3-4"; break;
			case 111: set .@disp$[.@i],"���1-1"; break;
			case 112: set .@disp$[.@i],"���1-2"; break;
			case 113: set .@disp$[.@i],"���1-3"; break;
			case 114: set .@disp$[.@i],"���1-4"; break;
			case 121: set .@disp$[.@i],"���2-1"; break;
			case 122: set .@disp$[.@i],"���2-2"; break;
			case 123: set .@disp$[.@i],"���2-3"; break;
			case 124: set .@disp$[.@i],"���2-4"; break;
			case 131: set .@disp$[.@i],"���3-1"; break;
			case 132: set .@disp$[.@i],"���3-2"; break;
			case 133: set .@disp$[.@i],"���3-3"; break;
			case 134: set .@disp$[.@i],"���3-4"; break;
			case 100: set .@disp$[.@i],"���_�ւ̓�"; break;
			case 101: set .@disp$[.@i],"����1���"; break;
			case 102: set .@disp$[.@i],"����2���"; break;
			case 103: set .@disp$[.@i],"����3���"; break;
			default: set .@disp$[.@i],"�킩��Ȃ���"; break;
		}
	}
	set .@disp$[.@max],"������";
	set @menu,select(printarray(.@disp$))-1;
	if(@menu == .@max)	//������
		return;
	copyarray .@x,getarg(1),.@max;
	copyarray .@y,getarg(2),.@max;
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);		//.@map$�ȊO�̓_�~�[
	warp .@map$,.@x[@menu],.@y[@menu];
	return;
}

//============================================================
// SE�����N�t���b�OB�i�M���h���[���ւ̃��[�v�j
//	callfunc "AgitLinkFlagB",Type,WarpX,WarpY;
//------------------------------------------------------------
function	script	AgitLinkFlagB	{
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);		//.@map$�ȊO�̓_�~�[
	set .@gid,getcastledata(.@map$,1);
	if(.@gid <= 0 || getcharid(2) != .@gid)
		return;
	mes "[�����N�t���b�O]";
	if(getarg(0)) {		//Type��0�ȊO�̂Ƃ��̓M���h���[���̃��b�Z�[�W
		mes "�M���h�����o�[�̗��֐�����̂��߂�";
		mes "����ꂽ�n��ւ̈ړ����\�ł��B";
	}
	else {		//Type��0�̂Ƃ��͒������n��̃��b�Z�[�W
		mes "^9C009C�G���y���E��^000000������";
		mes "�������n��Ɉړ����܂��B";
	}
	mes "�ړ����܂����H";
	if(select("�ړ�","������") == 2)
		return;
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);		//.@map$�ȊO�̓_�~�[
	warp .@map$,getarg(1),getarg(2);
	return;
}

//============================================================
// SE�M���h�_���W�����ړ�
//	callfunc "AgitDungeonSE","WarpMap",WarpX,WarpY;
//------------------------------------------------------------
function	script	AgitDungeonSE	{
	if(!getcharid(2))
		return;
	mes "�]�����傫�ȁA";
	mes "�@�s�v�c�ȃq�}�������c�c";
	mes "�@�ق�̋͂��ł͂��邪";
	mes "�@���͂���������]";
	next;
	if(select("^0000FF�G��Ă݂�^000000","��߂�") == 2) {
		mes "�]���m�̐��E��";
		mes "�@�z�����܂�Ă��܂�������";
		mes "�@�C������c�c";
		mes "�@��߂Ă������]";
		return;
	}
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,1);		//.@map$�ȊO�̓_�~�[
	set .@gid,getcastledata(.@map$,1);
	if(.@gid && .@gid == getcharid(2)) {
		warp getarg(0),getarg(1),getarg(2);
		return;
	}
	mes "�]�����������N����Ȃ������]";
	return;
}