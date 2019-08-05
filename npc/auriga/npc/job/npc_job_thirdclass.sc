//====================================================================
//Ragnarok Online - 3rd Class Jobchange Script	by refis
//====================================================================

//==========================================
// �]�ENPC
//------------------------------------------

function	script	jobchenge3rd_func	{
	function	job_name	{
		switch(getarg(0)) {
		case Job_Knight:		return "���[�h�i�C�g";
		case Job_Priest:		return "�n�C�v���[�X�g";
		case Job_Wizard:		return "�n�C�E�B�U�[�h";
		case Job_Blacksmith:	return "�z���C�g�X�~�X";
		case Job_Hunter:		return "�X�i�C�p�[";
		case Job_Assassin:		return "�A�T�V���N���X";
		case Job_Crusader:		return "�p���f�B��";
		case Job_Monk:			return "�`�����s�I��";
		case Job_Sage:			return "�v���t�F�b�T�[";
		case Job_Rogue:			return "�`�F�C�T�[";
		case Job_Alchemist:		return "�N���G�C�^�[";
		case Job_Bard:			return "�N���E��";
		case Job_Dancer:		return "�W�v�V�[";
		case Job_RuneKnight:	return "���[���i�C�g";
		case Job_Warlock:		return "�E�H�[���b�N";
		case Job_Ranger:		return "�����W���[";
		case Job_ArchBishop:	return "�A�[�N�r�V���b�v";
		case Job_Mechanic:		return "���J�j�b�N";
		case Job_Guillotine:	return "�M���`���N���X";
		case Job_RoyalGuard:	return "���C�����K�[�h";
		case Job_Sorcerer:		return "�\�[�T���[";
		case Job_Minstrel:		return "�~���X�g����";
		case Job_Wanderer:		return "�����_���[";
		case Job_Shura:			return "�C��";
		case Job_Genetic:		return "�W�F�l�e�B�b�N";
		case Job_ShadowChaser:	return "�V���h�E�`�F�C�T�[";
		}
	}

	set .@job,getarg(0);
	set .@3rdName$, job_name(.@job);
	if(Job == .@job) {
		mes "[�]�E��s�W]";
		mes "�����A�M����";
		mes .@3rdName$ +"�ł��ˁB";
		mes "�����]�E�͊������Ă��܂���B";
		close;
	}
	if(Job != getarg(1) || Upper == UPPER_NORMAL ||
	  (Upper == UPPER_HIGH && BaseLevel < 90) ||
	  (Upper == UPPER_BABY && (BaseLevel < 99 || JobLevel < 50)) ) {
		mes "[�]�E��s�W]";
		mes "����ɂ��́B";
		mes "�M���̎���ɁA";
		mes .@3rdName$ +"�ւ�";
		mes "�]�E��]�ގ҂͂��܂��񂩁H";
		next;
		mes "[�]�E��s�W]";
		mes "�������܂�����A";
		mes "���̂Ƃ���֗���悤��";
		mes "�`���Ă��������B";
		mes "���Ȃ���������������Ă����";
		mes "�����]�E�ł��܂���B";
		close;
	}
	if(SkillPoint) {
		mes "�]�X�L���|�C���g���]���Ă��邽��";
		mes "�@�i�s�ł��܂���]";
		close;
	}
	mes "[�]�E��s�W]";
	mes "����ɂ��́B";
	if(Upper == UPPER_HIGH)
		mes "�M����"+ job_name(Job) +"�ł��ˁB";
	mes .@3rdName$ +"�ւ̓]�E��";
	mes "�]�݂܂����H";
	next;
	mes "[�]�E��s�W]";
	mes "�Ȃ��A"+ .@3rdName$ +"�֓]�E�����";
	mes "�X�e�[�^�X�ƃX�L�����S��";
	mes "���Z�b�g����܂��B";
	next;
	if(select("�]�E���Ȃ�","^0000FF�]�E����^000000")==1) {
		mes "[�]�E��s�W]";
		mes "�킩��܂����B";
		mes "������ЂƂ̓��ł��傤�B";
		close;
	}
	if(Weight || checkriding() || checkcart() || checkfalcon() || sc_ison(SC_ALL_RIDING)) {
		mes "[�]�E��s�W]";
		mes "���Ȃ��͏������Ȃ����";
		mes "�Ȃ�Ȃ����Ƃ�����܂��ˁB";
		mes "�܂��́A�g�𐴂߂�ׂ�";
		mes "�g�̂܂��̂��̂�";
		mes "���ɂ��Ă��������B";
		next;
		mes "[�]�E��s�W]";
		mes "�A�C�e�����̉ו��������Ȃ�";
		mes "��̏�ԂłȂ���΂Ȃ�܂���B";
		mes "�������ɂ��������B��J�[�g�A";
		mes "�R�搶���Ȃǂ�";
		mes "�����čs�����Ƃ͂ł��܂���B";
		next;
		mes "[�]�E��s�W]";
		mes "����ł́c�c�p�ӂ��ł��܂�����";
		mes "���z�����������B";
		close;
	}
	if(.@job == Job_RuneKnight) {
		mes "[�]�E��s�W]";
		mes "�]�E����ׂ̏����͖��S�̂悤�ł��ˁB";
		mes "����ł́A�]�E����O�ɁA";
		mes "���ꂩ�炲�Љ�܂������̂���";
		mes "�����ꂩ1�����I�т��������B";
		mes "���I�тɂȂ����������A";
		mes "�]�E�̍ۂɓn����܂��B";
		next;
		mes "[�]�E��s�W]";
		mes "�܂��A�����̏ڍׂɂ���";
		mes "���������܂��̂ŁA";
		mes "�ڍׂ��m�肽��������";
		mes "���I�щ������B";
		while(1) {
			next;
			switch(select("�G�i�W�[���[���K�[�h[1]","���͐΂̎w��[1]","���[���v���[�g[1]","�����͑��v�ł�")) {
			case 1:
				mes "[�]�E��s�W]";
				mes "�G�i�W�[���[���K�[�h[1]�ɂ���";
				mes "���������Ă��������܂��B";
				next;
				mes "[�����ڍ�]";
				mes "���؂ȐF�̌���";
				mes "�G�i�W�[���[����";
				mes "����΂߂��Ă���";
				mes "�H�͗l�̏��B";
				mes "���������ȋC������";
				mes "���g�Ɛ��_���h������B";
				next;
				mes "[�����ڍ�]";
				mes "�n�� : ��";
				mes "�h�� : 70";
				mes "�d�� : 0";
				mes "�v�����x�� : 99";
				mes "���� : ���[���i�C�g��p";
				mes "������ʁF MaxSP + 2%";
				next;
				mes "[�]�E��s�W]";
				mes "���ɏڍׂ̒m�肽��";
				mes "�����͂������܂����H";
				continue;
			case 2:
				mes "[�]�E��s�W]";
				mes "���͐΂̎w��[1]�ɂ���";
				mes "���������Ă��������܂��B";
				next;
				mes "[�����ڍ�]";
				mes "�s�v�c�ȃ��[����";
				mes "���܂�Ă���";
				mes "�F�̃����O�B";
				mes "�P�����[������";
				mes "�_��Ȋ��͂���������B";
				next;
				mes "[�����ڍ�]";
				mes "�n�� : �A�N�Z�T���[";
				mes "�h�� : 0";
				mes "�d�� : 0";
				mes "�v�����x�� : 90";
				mes "���� : ���[���i�C�g��p";
				mes "������ʁF Str + 2";
				next;
				mes "[�]�E��s�W]";
				mes "���ɏڍׂ̒m�肽��";
				mes "�����͂������܂����H";
				continue;
			case 3:
				mes "[�]�E��s�W]";
				mes "���[���v���[�g[1]�ɂ���";
				mes "���������Ă��������܂��B";
				next;
				mes "[�����ڍ�]";
				mes "���[���ƕ�΂ŏ���ꂽ";
				mes "�v���[�g�A�[�}�[�B";
				mes "�����ڂ��y�����A";
				mes "���͂ɂ��h��͂�";
				mes "��������Ă���B";
				next;
				mes "[�����ڍ�]";
				mes "�n�� : �Z";
				mes "�h�� : 95";
				mes "�d�� : 0";
				mes "�v�����x�� : 99";
				mes "���� : ���[���i�C�g��p";
				mes "������ʁF���B�s�A�j��s�B";
				next;
				mes "[�]�E��s�W]";
				mes "���ɏڍׂ̒m�肽��";
				mes "�����͂������܂����H";
				continue;
			case 4:
				mes "[�]�E��s�W]";
				mes "����ł́A�M�����~����";
				mes "���������I�щ������B";
				while(1) {
					next;
					switch(select("�G�i�W�[���[���K�[�h[1]","���͐΂̎w��[1]","���[���v���[�g[1]")) {
					case 1:
						set .@gain,2140;
						break;
					case 2:
						set .@gain,2794;
						break;
					case 3:
						set .@gain,15002;
						break;
					}
					next;
					mes "[�]�E��s�W]";
					mes getitemname(.@gain) +"[1]�ł��ˁB";
					mes "�{���ɂ�����ł�낵���ł����H";
					next;
					if(select("�͂�","������")==2) {
						mes "[�]�E��s�W]";
						mes "����ł͍ēx�A";
						mes "�~����������";
						mes "���I�щ������B";
						continue;
					}
					break;
				}
			}
			break;
		}
	}
	resetstatus;
	resetskill;
	setoption 0;
	jobchange .@job;
	switch(Job) {
	case Job_RuneKnight:
		setquest 201180;
		getitem 5746,1;	//���[���T�[�N���b�g
		getitem .@gain,1;	//�I�𑕔�
		break;
	case Job_ArchBishop:
		setquest 201195;
		getitem 5747,1;	//�~�g��
		break;
	case Job_Warlock:
		setquest 201185;
		getitem 5753,1;	//���͐΂̖X�q
		break;
	case Job_Mechanic:
		setquest 201205;
		if(Sex)
			getitem 5749,1;	//�h���C�o�[�o���h(male)
		else
			getitem 5760,1;	//�h���C�o�[�o���h(female)
		break;
	case Job_Ranger:
		setquest 201190;
		getitem 6124,1;	//�T�̓J
		getitem 5748,1;	//�X�i�C�p�[�S�[�O��
		break;
	case Job_Guillotine:
		setquest 201200;
		getitem 5755,1;	//���ق̎��s��
		getitem 12106,1;	//��Δ�
		break;
	case Job_RoyalGuard:
		setquest 201210;
		getitem 5757,1;	//�V���~�b�c�̃w����
		break;
	case Job_Shura:
		setquest 201230;
		getitem 5754,1;	//�u���C�W���O�\�E��
		break;
	case Job_Sorcerer:
		setquest 201215;
		getitem 5756,1;	//���̂����₫
		break;
	case Job_ShadowChaser:
		setquest 201235;
		getitem 6121,1;	//�t�F�C�X�y�C���g�u���V
		getitem 6122,1;	//�y�C���g�u���V
		getitem 5750,1;	//�V���h�E�N���E��
		break;
	case Job_Genetic:
		setquest 201240;
		getitem 5752,1;	//�~�_�X�̂����₫
		break;
	case Job_Minstrel:
		setquest 201220;
		getitem 5751,1;	//�~���X�g�����\���O�̖X�q
		break;
	case Job_Wanderer:
		setquest 201225;
		getitem 5758,1;	//�o�����[�i�̔�����
		break;
	}
	getitem 2795,1;	//�n���Ă��Ȃ������S�̎w��
	mes "[�]�E��s�W]";
	mes "�����A����ŋM����";
	mes .@3rdName$ +"�ƂȂ�܂����B";
	mes "�����ڂ��C��������V�ł��ˁI";
	close;
}

prt_in,162,24,3	script	�]�E��s�W#runeknight	888,{ callfunc "jobchenge3rd_func",Job_RuneKnight,Job_Knight; }
morocc,103,144,3	script	�]�E��s�W#warlock	888,{ callfunc "jobchenge3rd_func",Job_Warlock,Job_Wizard; }
alberta,223,111,5	script	�]�E��s�W#ranger	888,{ callfunc "jobchenge3rd_func",Job_Ranger,Job_Hunter; }
prt_church,103,88,3	script	�]�E��s�W#arch	888,{ callfunc "jobchenge3rd_func",Job_ArchBishop,Job_Priest; }
yuno,129,156,3	script	�]�E��s�W#mechanic	888,{ callfunc "jobchenge3rd_func",Job_Mechanic,Job_Blacksmith; }
que_job01,75,96,3	script	�]�E��s�W#guillotine	888,{ callfunc "jobchenge3rd_func",Job_Guillotine,Job_Assassin; }
prt_castle,48,161,3	script	�]�E��s�W#roya	888,{ callfunc "jobchenge3rd_func",Job_RoyalGuard,Job_Crusader; }
gef_tower,102,34,3	script	�]�E��s�W#sorc	888,{ callfunc "jobchenge3rd_func",Job_Sorcerer,Job_Sage; }
alberta,196,133,3	script	�]�E��s�W#mins	888,{ callfunc "jobchenge3rd_func",Job_Minstrel,Job_Bard; }
xmas,162,209,3	script	�]�E��s�W#wand	888,{ callfunc "jobchenge3rd_func",Job_Wanderer,Job_Dancer; }
ve_in,237,125,3	script	�]�E��s�W#sura	888,{ callfunc "jobchenge3rd_func",Job_Shura,Job_Monk; }
alde_alche,35,186,3	script	�]�E��s�W#gene	888,{ callfunc "jobchenge3rd_func",Job_Genetic,Job_Alchemist; }
morocc,156,70,3	script	�]�E��s�W#shad	888,{ callfunc "jobchenge3rd_func",Job_ShadowChaser,Job_Rogue; }


//==========================================
// �h���S�������^��
//------------------------------------------

prontera,129,212,5	script	�h���S���Ǘ���	105,{
	if(Job != Job_RuneKnight) {
		mes "[�h���S���Ǘ���]";
		mes "���̌�p�ł����H";
		mes "�h���S���́A���[���i�C�g�l��p";
		mes "�ƂȂ��Ă���܂��B";
		close;
	}
//	mes "[�h���S���Ǘ�]";		//�E���B�{�Ǝd�l
	mes "[�h���S���Ǘ���]";
	mes "��������Ⴂ�܂��B";
	mes "�h���S���������p�ł����H";
	next;
	if(select("���p����","��߂�")==2) {
		mes "[�h���S���Ǘ���]";
		mes "�����ł����B�ł́c�c";
		close;
	}
	if(checkdragon()) {
		close;
	}
//	if(getskilllv(2007) < 1) {	//���C���ł��R���
//		close;
//	}
	setdragon;
	close;
}


//==========================================
// �O���t�H�������^��
//------------------------------------------

prontera,125,208,5	script	�O���t�H���Ǘ���	105,{
	if(Job != Job_RoyalGuard) {
		mes "[�O���t�H���Ǘ���]";
		mes "���̌�p�ł����H";
		mes "�O���t�H���́A���C�����K�[�h�l��p";
		mes "�ƂȂ��Ă���܂��B";
		close;
	}
	//������
	mes "[�O���t�H���Ǘ���]";
	mes "��������Ⴂ�܂��B";
	mes "�O���t�H���������p�ł����H";
	next;
	if(select("���p����","��߂�")==2) {
		mes "[�O���t�H���Ǘ���]";
		mes "�����ł����B�ł́c�c";
		close;
	}
	if(checkriding()) {
		close;
	}
	if(getskilllv(63) < 1) {
		mes "[�O���t�H���Ǘ���]";
		mes "�c�c�܂��O���t�H���ɂ�";
		mes "���Ȃ��悤�ł��ˁB";
		mes "�X�L���u���C�f�B���O�v��";
		mes "�o���Ă��炨�z�����������B";
		close;
	}
	setriding;
	close;
}


//==========================================
// �����M�A�����^��
//------------------------------------------

-	script	3rdRentalGear	-1,{
	if(Job != Job_Mechanic) {
		mes "[�����M�A�Ǘ���]";
		mes "���̓��J�j�b�N�̕��ւ��݂�����";
		mes "�����M�A�̊Ǘ����s���Ă��܂��B";
		close;
	}
	mes "[�����M�A�Ǘ���]";
	mes "���J�j�b�N�̕��ł��ˁB";
	mes "�J�[�g�𗘗p���܂����H";
	mes "����Ƃ������M�A�ɓ��悵�܂����H";
	mes "�����ł��݂����܂���B";
	next;
	switch(select("�J�[�g���؂��","�����M�A�ɏ��","���Ȃ�")) {
	case 1:
		if(checkcart()) {
			mes "[�����M�A�Ǘ���]";
			mes "���ɃJ�[�g��";
			mes "���p����Ă��܂��ˁB";
			close;
		}
		setcart;
		close;
	case 2:
		if(checkgear()) {
			mes "[�����M�A�Ǘ���]";
			mes "���łɖ����M�A�ɏ����";
			mes "��������Ⴂ�܂��ˁB";
			close;
		}
		if(getskilllv(2255) < 1) {
			mes "[�����M�A�Ǘ���]";
			mes "���݂܂��񂪁A";
			mes "�����M�A���C�Z���X��";
			mes "�K�����Ă��Ȃ����ւ�";
			mes "�݂��o���͍s���Ă��܂���B";
			mes "�K�����Ă��炨�z�����������B";
			close;
		}
		setgear;
		close;
	case 3:
		mes "[�����M�A�Ǘ���]";
		mes "�����ł����c�c";
		mes "�����M�A�𗘗p�����ۂ�";
		mes "���ɐ��������������B";
		close;
	}
}

prontera,163,178,3		duplicate(3rdRentalGear)	�����M�A�Ǘ���#pro		105
dicastes01,187,203,3	duplicate(3rdRentalGear)	�����M�A�Ǘ���#dicas	105
mora,91,112,3			duplicate(3rdRentalGear)	�����M�A�Ǘ���#mora		105
ecl_in01,41,25,5		duplicate(3rdRentalGear)	�����M�A�Ǘ���#ecl		105

//==========================================
// ���[�����Δ̔��� - ���[���i�C�g
//------------------------------------------

prontera,168,228,3	script	���[�����Δ̔���#pro	853,{
	mes "[���[�����Δ̔���]";
	mes "���Ȃ��͂��������āA";
	mes "���[�����΂������߂ł�����!?";
	mes "�@";
	mes "���Ȃ�A�������΂������肵�܂���B";
	next;
	switch(select("�����ȃ��[�����΂𔃂�","��ʓI�ȃ��[�����΂𔃂�")) {
	case 1:
		mes "[���[�����Δ̔���]";
		mes "�قف`�A����͂��ڂ������I";
		mes "�����ȃ��[�����΂ł��ȁB";
		set .@price,2500;
		set .@gain,12734;
		break;
	case 2:
		mes "[���[�����Δ̔���]";
		mes "���`�A���Ɍ����ȕ��ł��ȁI";
		mes "��ʓI�ȃ��[�����΂������߂Ƃ́B";
		set .@price,1000;
		set .@gain,12737;
		break;
	}
	mes "���̌��΂�1�� "+ .@price +"Zeny��";
	mes "�����肵�܂��傤�I";
	mes "2000�܂łȂ�A1�x�œn���܂��傤�B";
	mes "���������܂����ȁH";
	next;
	input .@num;
	if(.@num == 0) {
		mes "[���[�����Δ̔���]";
		mes "����A�����ł����B";
		mes "�c�O�ł��ȁB";
		mes "���������Ȃ�����A";
		mes "�܂����z�����������B";
		close;
	}
	if(.@num < 1 || .@num > 2000) {
		mes "[���[�����Δ̔���]";
		mes "���q����A��k�ł��傤�B";
		mes "�����Ɛ��������Ă����Ȃ���";
		mes "�p�ӂł��܂����B";
		mes "1�x�ł�����ł���̂�";
		mes "1�`2000�ł�����ȁB";
		close;
	}
	if(Zeny < .@price*.@num) {
		mes "[���[�����Δ̔���]";
		mes "���₨��H";
		mes "���q����A����܂��ȁ`";
		mes "Zeny������܂����B";
		mes "�������蕥���Ă����Ȃ���";
		mes "��������������ł�����ȁB";
		mes "������p�ӂ��āA�܂����Ă��������B";
		close;
	}
	if(checkitemblank()==0) {
		mes "[���[�����Δ̔���]";
		mes "������!?";
		mes "���q����A������Ɖו���";
		mes "��������悤�ł��ȁB";
		mes "����ł́A�w������";
		mes getitemname(.@gain) +"��n�������ɂȂ��B";
		mes "�g�y�ɂ��Ă���A�܂����Ă��������B";
		close;
	}
	if(checkweight(.@gain,.@num)==0) {
		mes "[���[�����Δ̔���]";
		mes "������!?";
		mes "���q����A������Ɖו���";
		mes "�d�߂���悤�ł��ȁB";
		mes "����ł́A�w������";
		mes getitemname(.@gain)+ "��n�������ɂȂ��B";
		mes "�g�y�ɂ��Ă���A�܂����Ă��������B";
		close;
	}
	set Zeny,Zeny - .@price * .@num;
	getitem .@gain,.@num;
	mes "[���[�����Δ̔���]";
	mes "���x���肪�����ł��ȁB";
	mes "�܂��̂����p�A";
	mes "���҂����Ă���܂���B";
	close;
}


//==========================================
// �g���b�v���� - �����W���[
//------------------------------------------

-	shop	AlloyTrapShopper	-1,7940,12341

prt_in,109,68,4		substore(AlloyTrapShopper)	�g���b�v����	66
mid_camp,129,284,4	substore(AlloyTrapShopper)	�g���b�v����	66
payon,123,109,4		substore(AlloyTrapShopper)	�g���b�v����	66
ra_in,263,281,4		substore(AlloyTrapShopper)	�g���b�v����	66
lighthalzen,337,240,4	substore(AlloyTrapShopper)	�g���b�v����	66


//==========================================
// �Ő����L�b�g�̔��� - �M���`���N���X
//------------------------------------------

-	script	3rdPoisonShopper	-1,{
	mes "[�Ő����L�b�g�̔���]";
	mes "�Ő����L�b�g�͂���܂��񂩁`�H";
	mes "�@";
	mes "�Ő����L�b�g�͂P��";
	mes "5000zeny�ł���`";
	mes "�@";
	mes "�����܂����`�H";
	next;
	if(select("�͂�","������")==2) {
		mes "[�Ő����L�b�g�̔���]";
		mes "�����ł����`";
		mes "�킩��܂����`";
		mes "�܂����Ă��������ˁ`";
		close;
	}
	if(Zeny < 5000) {
		mes "[�Ő����L�b�g�̔���]";
		mes "���́`";
		mes "���q����A����������܂����`";
		mes "�����𑝂₵�āA�܂����ĉ����`���B";
		close;
	}
	if(checkitemblank()==0) {
		mes "[�Ő����L�b�g�̔���]";
		mes "���́`";
		mes "���q����A�������Ă���ו���";
		mes "�����ł��ˁ`";
		mes "����ł͓Ő����L�b�g��";
		mes "�n���܂����`";
		mes "�g���y�����Ă���܂����ĉ����`���B";
		close;
	}
	if(checkweight(7931,1)==0) {
		mes "[�Ő����L�b�g�̔���]";
		mes "���́`";
		mes "���q����A�������Ă���ו���";
		mes "�d�����ł���`";
		mes "����ł͓Ő����L�b�g��";
		mes "�n���܂����`";
		mes "�g���y�����Ă���܂����ĉ����`���B";
		close;
	}
	set Zeny,Zeny - 5000;
	getitem 7931,1;
	mes "[�Ő����L�b�g�̔���]";
	mes "�������グ�`";
	mes "���肪�Ƃ��������܁`���B";
	mes "�܂����z���������`���B";
	close;
}

morocc,190,96,4	duplicate(3rdPoisonShopper)	�Ő����L�b�g�̔���#moc	877
lhz_in02,16,205,4	duplicate(3rdPoisonShopper)	�Ő����L�b�g�̔���#lhz	877


//==========================================
// �Ŕ̔��� - ���J�j�b�N
//------------------------------------------

-	shop	MechanicShopper	-1,2139,2800,2801,2802,2803,2804,2805,2806,2807,18000,18001,18002,18003,18004,12392,12393,12394,6145,12383,6146,6147,6186,2808

prt_in,175,137,4	substore(MechanicShopper)	�Ŕ̔���	49
mid_camp,184,263,4	substore(MechanicShopper)	�Ŕ̔���	49
einbroch,122,250,4	substore(MechanicShopper)	�Ŕ̔���	49
ra_in,257,266,4		substore(MechanicShopper)	�Ŕ̔���	49
lhz_in03,181,17,4	substore(MechanicShopper)	�Ŕ̔���	49


//==========================================
// �}�̔̔� - �~���X�g�����A�����_���[
//------------------------------------------

comodo,196,162,3	shop	�J���u#comodo	479,11513,6144


//==========================================
// �|�C���g���l - �����W���[�A�\�[�T���[
//------------------------------------------

gef_tower,105,172,5	script	�|�C���g���l	700,{
	mes "[�|�C���g���l]";
	mes "����ɂ��́B";
	mes "�����ł͍z�΂�����ɍӂ���";
	mes "�G�}�Ƃ��Ďg�p����";
	mes "^FF0000�e��|�C���g^000000��̔����Ă��܂��B";
	mes "�����K�v�ł����H";
	next;
	switch(select("�X�J�[���b�g�|�C���g(��) - 200z","���C���O���[���|�C���g(�n) - 200z","�C���f�B�S�|�C���g(��) - 200z","�C�G���[�E�B�b�V���|�C���g(��) - 200z","��b���I����")) {
	case 1:
		set .@itemid,6360;
		set .@element$,"�Α���";
		break;
	case 2:
		set .@itemid,6363;
		set .@element$,"�n����";
		break;
	case 3:
		set .@itemid,6361;
		set .@element$,"������";
		break;
	case 4:
		set .@itemid,6362;
		set .@element$,"������";
		break;
	case 5:
		mes "[�|�C���g���l]";
		mes "�܂��̂����p�����҂����Ă��܂��B";
		close;
	}
	mes "[�|�C���g���l]";
	mes "^ff0000" +getitemname(.@itemid)+ "^000000�ł��ˁB";
	mes "�������^0000ff" +.@element$+ "^000000�̃|�C���g�ł��B";
	mes "���w�����܂����H";
	mes "������1000�܂ōw���ł��܂��B";
	mes "�L�����Z������ɂ́A";
	mes "0����͂��Ă��������B";
	next;
	input .@num;
	if(.@num == 0) {
		mes "[�|�C���g���l]";
		mes "�L�����Z�����܂����B";
		mes "�܂��̂����p�����҂����Ă��܂��B";
		close;
	}
	if(.@num < 0 || .@num > 1000) {
		mes "[�|�C���g���l]";
		mes "������������͂��Ă��������B";
		mes "��x�ɍw���ł���̂�";
		mes "1000�܂łƂȂ�܂��B";
		close;
	}
	mes "[�|�C���g���l]";
	mes "^ff0000" +getitemname(.@itemid)+ "^000000��";
	mes "^0000ff" +.@num+ "��^000000��";
	mes "��낵���ł����H";
	next;
	if(select("�͂�","������") == 2) {
		mes "[�|�C���g���l]";
		mes "�L�����Z�����܂����B";
		mes "�܂��̂����p�����҂����Ă��܂��B";
		close;
	}
	if(200*.@num > Zeny) {
		mes "[�|�C���g���l]";
		mes "���q�l�A���݂܂��񂪁A";
		mes "���������s�����Ă��܂��B";
		close;
	}
	if(checkweight(.@itemid,.@num) == 0) {
		mes "[�|�C���g���l]";
		mes "����A�ו�����t�̂悤�ł��B";
		mes "�����������炵�Ă���A";
		mes "�����p���������B";
		close;
	}
	set Zeny,Zeny-200*.@num;
	getitem .@itemid,.@num;
	mes "[�|�C���g���l]";
	mes "�����p���肪�Ƃ��������܂��B";
	close;
}


//==========================================
// �����{�̔��� - �W�F�l�e�B�b�N
//------------------------------------------

comodo,106,213,5	shop	�썑�̉ʕ����l	724,6258

alde_alche,31,186,3	script	�����{�̔���#alde	883,{
	mes "[�����{�̔���]";
	mes "����ɂ��́I";
	mes "���̓W�F�l�e�B�b�N��";
	mes "^0000FF���ʂȐ����{^000000��̔����Ă��܂��I";
	next;
	mes "[�����{�̔���]";
	mes "�m���Ă܂����H";
	mes "�W�F�l�e�B�b�N�͐����{��";
	mes "�������Ă��Ȃ��ƁA";
	mes "�g���Ȃ������X�L����";
	mes "�����ł���B";
	next;
	mes "[�����{�̔���]";
	mes "�������Ă��鐻���{��";
	mes "^FF0000���^000000��������Α����قǁA";
	mes "�����ł���A�C�e���̎�ނ�";
	mes "�������ł���B";
	next;
	mes "[�����{�̔���]";
	mes "����`�A���̖{���e������̂ŁA";
	mes "����Ȃ��č����Ă���ł���B";
	mes "1������΁A�����̍ޗ��͂킩��̂ŁA";
	mes "�[���Ȃ�ł����ǁA";
	mes "�����ł�����܂���I";
	mes "�����{���w�����܂����H";
	next;
	if(select("�͂�","������")==2) {
		mes "[�����{�̔���]";
		mes "�ł́A�܂����Ă��������B";
		mes "���ł��A���҂����Ă܂���I";
		close;
	}
	if(checkitemblank()==0) {
		mes "[�����{�̔���]";
		mes "�����Ă���ו��̐���";
		mes "�������܂��ˁB";
		mes "����ł͖{��";
		mes "�n���܂����B";
		mes "�ו��𐮗����Ă���";
		mes "�܂����Ă��������B";
		close;
	}
	if(Weight*100/MaxWeight >= 90) {
		mes "[�����{�̔���]";
		mes "�����Ă���ו��̏d�ʂ�";
		mes "�d�����܂��ˁB";
		mes "����ł͖{��";
		mes "�n���܂����B";
		mes "�ו��𐮗����Ă���";
		mes "�܂����Ă��������B";
		close;
	}
	mes "[�����{�̔���]";
	mes "�فA�{���ł����`�I";
	mes "���肪�Ƃ��������܂��I";
	mes "����ł́A�����{�̃��X�g��";
	mes "���������܂��ˁI";
	mes "�ł���΁A�����ς�";
	mes "�����Ă����Ă��������I";
	while(1){
		next;
		switch(select(
			"[�����S���e�����{] 100,000 zeny",
			"[�p�C�i�b�v�����e�����{] 100,000 zeny",
			"[�R�R�i�b�c���e�����{] 100,000 zeny",
			"[���������e�����{] 100,000 zeny",
			"[�o�i�i���e�����{]100,000 zeny",
			"[��`�q�g�݊����A���͔|�@]100,000 zeny",
			"[�㋉�|�[�V���������}�j���A��] 100,000 zeny",
			"[�~�b�N�X�N�b�L���O�����{] 100,000 zeny",
			"[�X�^�~�i���i������] 100,000 zeny",
			"[���̓h�����N�����@]100,000 zeny",
			"�w�����I������B")) {
		case 1:		//�����S���e�����{
			set .@gain,6279;
			break;
		case 2:		//�p�C�i�b�v�����e�����{
			set .@gain,6280;
			break;
		case 3:		//�R�R�i�b�c���e�����{
			set .@gain,6281;
			break;
		case 4:		//���������e�����{
			set .@gain,6282;
			break;
		case 5:		//�o�i�i���e�����{
			set .@gain,6283;
			break;
		case 6:		//��`�q�g�݊����A���͔|�@
			set .@gain,6284;
			break;
		case 7:		//�㋉�|�[�V���������}�j���A��
			set .@gain,6285;
			break;
		case 8:		//�~�b�N�X�N�b�L���O�����{
			set .@gain,11022;
			break;
		case 9:		//�X�^�~�i���i������
			set .@gain,11023;
			break;
		case 10:	//���̓h�����N�����@
			set .@gain,11024;
			break;
		case 11:
			mes "[�����{�̔���]";
			mes "�����ł����B";
			mes "�܂����Ă��������ˁI";
			close;
		}
		mes "[�����{�̔���]";
		mes "^0000FF[" +getitemname(.@gain)+ "]^000000��";
		mes "100,000 zeny�ł��B";
		mes "�����w�����܂��H";
		mes "1���ł��[���ł����ǁA";
		mes "100���Ƃ������Ă�����Ă�";
		mes "�����ł���I";
		next;
		input .@num;
		if(.@num == 0) {
			mes "[�����{�̔���]";
			mes "���̖{�͂������ł����B";
			continue;
		}
		if(.@num < 1 || .@num > 100) {
			mes "[�����{�̔���]";
			mes "���`��A�c�O�I";
			mes "1�x�ɍw���ł���̂�";
			mes "100���܂łȂ�ł��B";
			continue;
		}
		mes "[�����{�̔���]";
		mes "^0000FF[" +getitemname(.@gain)+ "]^000000��";
		mes .@num+ " ���w���ł��ˁI";
		mes "�@";
		mes "��낵���ł����H";
		next;
		if(select("�͂�","������")==2) {
			mes "[�����{�̔���]";
			mes "���A�����ł����c�c";
			mes "�����{�͂����ς�����܂�����A";
			mes "�������邱�Ƃ͂Ȃ��ł���B";
			continue;
		}
		if(Zeny < 100000 * .@num){
			mes "[�����{�̔���]";
			mes "���`�A������Ƃ�����";
			mes "����Ȃ��݂����ł��ˁB";
			mes "������p�ӂ��ė��Ă��������B";
			close;
		}
		mes "[�����{�̔���]";
		mes "���肪�Ƃ��������܂��I";
		mes "���̖{�͂���܂��񂩁H";
		set Zeny,Zeny - 100000 * .@num;
		getitem .@gain,.@num;
		continue;
	}
}


//==========================================
// �e�H�[ - �V���h�E�`�F�C�T�[
//------------------------------------------

-	shop	PaintingShopper	-1,6123,6120

s_atelier,17,110,1	substore(PaintingShopper)	�̔���#sc_prt	67
s_atelier,137,60,3	substore(PaintingShopper)	�̔���#sc_ra	70
s_atelier,114,117,1	substore(PaintingShopper)	�̔���#sc_yuno	92
s_atelier,15,65,5	substore(PaintingShopper)	�̔���#sc_lgt	89