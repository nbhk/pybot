//==============================================================================
// Ragnarok Online Valentine2006 Script     by Blaze
//==============================================================================
//==============================================================
// �u���C�h
//	 2�` 4��	�v�����e����	�N�G�X�g��	�����胋�[�g
//	 4�` 7��	�v�����e����	�N�G�X�g��	�����胋�[�g
//	 8�`10��	�v�����e����	�N�G�X�g��	�[���s�[���[�g
//	12�`15��	�v�����e���쐼	�N�G�X�g��	�J�J�I�̔����[�g
//	15�`17��	�v�����e����	�N�G�X�g��	�����[�g
//	17�`19��	�v�����e����	�N�G�X�g�~	�����[�g
//	21�`23��	�v�����e����	�N�G�X�g��	�[���s�[���[�g
// Function
//	getarg(0)	�ŏ��̃C�x���g���e
//		0=���b�N�̎Q�Ɠn����p
//		1=��1	2=��2	3=�Љ�	4=�̔�
//	getarg(1)	����
//		1=��	2=��
//	getarg(2)	�r���̃C�x���g���e
//		1=�����胋�[�g
//		2=�[���s�[���[�g
//		3=�����[�g
//		4=�J�J�I�̔����[�g
//	getarg(3)	�N�G�X�g��
//		1=�\	2=�s��	3=�j���̂݉�
//--------------------------------------------------------------

function	script	ValentineBreid	{
	if(getarg(0)==0)
		return .flag;	//�l��n���ďI��
	if((Weight*100/MaxWeight) >= 90) {
		mes "�����A�C�e���̏d�ʂ���������";
		mes "�A�C�e�����󂯂Ƃ邱�Ƃ��ł��܂���-";
		mes "-�����A�C�e�������炵�Ă���A�ēx";
		mes "�b�������Ă�������-";
		close;
	}
	if(.flag) {	//�����l�����A�^�b�`�h�~
		mes "�����Z��������";
		mes "��ł܂������|���Ă݂悤";
		close;
	}
	set .flag,1;
	initnpctimer "V_BreidTimer";
	switch(QUEST_VALENTINE1) {
		case 0:
			function PatternA;
			PatternA getarg(0),getarg(1);
			break;
		case 1:
			function PatternB;
			PatternB;
			break;
		case 2:
		case 3:
		case 4:
			function PatternC;
			PatternC getarg(0);
			break;
		case 5:
			function PatternD;
			PatternD 0,0,0,getarg(3);
			break;
		case 6:
			function PatternE;
			PatternE 0,0,0,getarg(3);
			break;
		case 7:
			function PatternF;
			PatternF;
			break;
		case 8:
			function PatternG;
			PatternG;
			break;
		default:
			function PatternH;
			PatternH 0,0,getarg(2);
			break;
		case 17:
			function PatternI;
			PatternI;
			break;
		case 18:
			function PatternJ;
			PatternJ;
			break;
		case 19:
			function PatternK;
			PatternK;
			break;
		case 20:
			function PatternL;
			PatternL;
			break;
	}
	set .flag,0;
	close2;
	cutin "dummy",255;
	return;

	function PatternA {	//case0
		switch(getarg(0)) {
		case 1:
		case 2:
			cutin "v_breid05",2;
			if(getarg(1)==1) {
				mes "[�u���C�h]";
				mes "��c�c�Ă񂾂��H";
				next;
				mes "[�u���C�h]";
				mes "�ӂ����c�c";
				mes "�Ƃ肠�����A�񕜂��Ă�낤�B";
			}
			else {
				mes "[�u���C�h]";
				mes "����Ȏ��Ԃ܂ŁA����J���ȁB";
				next;
				mes "[�u���C�h]";
				mes "�������Ă���悤�����c�c";
				mes "�Ƃ肠�����A�񕜂��Ă�낤�B";
			}
			next;
			misceffect 207,"";
			percentheal 100,0;
			mes "["+strcharinfo(0)+"]";
			mes "���c�c�H";
			mes "����������āH";
			mes "�����!?";
			mes " ";
			mes "-���邢���ƂƂ��ɑ̗͂��񕜂���-";
			next;
			if(getarg(0)==1) {
				mes "[�u���C�h]";
				mes "�o����ςނ��Ƃ�A";
				mes "�x�▼���𓾂邱�Ƃ́A";
				mes "�`���҂Ƃ��ďd�v�Ȃ��Ƃ�������Ȃ��B";
				mes "�����A�����l�߂�������Ȃ����H";
				next;
				mes "[�u���C�h]";
				mes "�̂��󂵂Ă��܂��ẮA���܂ł̓w�͂�";
				mes "���ׂĖ��ʂɂȂ��Ă��܂����B";
			}
			else {
				mes "[�u���C�h]";
				mes "�����͌��C�ɂȂ������H";
			}
			next;
			if(select("���A�N�H�@�����Ȃ艽��!?","���A���肪�Ƃ�")==2) {
				mes "[�u���C�h]";
				mes "��͂������B";
				mes "�͂��`�N�����Ă���Ȏ��Ԃɂ܂ŁA";
				mes "�O�֏o�ē��������Ȃ���Ȃ��c�c";
				mes "�Ƃł������x�݂������񂾂��B";
				next;
				cutin "v_breid02",2;
				mes "[�u���C�h]";
				mes "�����c�c�������߁B";
				mes "���܂薳���͂���Ȃ�B";
				set QUEST_VALENTINE1,2;
				return;
			}
			cutin "v_breid03",2;
			if(getarg(0)==1) {
				mes "[�u���C�h]";
				mes "�I���́A�������x�����Ă���R�m���B";
				mes "�l���D�ӂŉ񕜂��Ă�����Ƃ����̂ɁA";
				mes "���̑ԓx�͂Ȃ�!?";
				mes "��̈�������Ȃ��̂�!?";
			}
			else {
				mes "[�u���C�h]";
				mes "��A�����H�@���Ă���悤������";
				mes "�񕜂��Ă�����񂾂��H";
			}
			next;
			if(select("�]�v�Ȃ����b�ł�","�Ȃ񂾁A�x���̂������񂩁c�c")==1) {
				mes "[�u���C�h]";
				mes "�]�v�Ȃ����b����!?";
				mes "�I�����̗͂��񕜂��Ă�������ƂŁA";
				mes "�I�}�G�ɉ������f���������H";
				mes "�I���͎����̔C�����ʂ������������B";
				next;
				mes "[�u���C�h]";
				mes "������Ƃ��߉���Ă��������ŁA";
				mes "�����{���Ă͓G���ȁB";
				mes "����I�}�G�̎菕���͈�؂��Ȃ��B";
				mes "��l�łȂ�Ƃ�����񂾂ȁB";
			}
			else {
				cutin "v_breid05",2;
				mes "[�u���C�h]";
				mes "���c�c��������!?";
				mes "�������񂾂Ƃ�������!?";
				mes "���́A�I�����c�c��������!?";
				next;
				mes "[�u���C�h]";
				mes "�u���C�h�ƌĂׁI";
				mes "��������Ƃ͉����A��������Ƃ́I";
				mes "�܂������c�c";
				mes "�I�}�G�݂����Ɏ���ȓz������ƁA";
				mes "�x���̎d�����C��ꂵ���܂����B";
				next;
				mes "[�u���C�h]";
				mes "�܂������B�x�ɂ��I�������A";
				mes "����ȊX�Ƃ͂�����΂����ȁI";
				mes "�����A�������Ə�����I";
			}
			set QUEST_VALENTINE1,1;
			return;
		case 3:
			cutin "v_breid05",2;
			mes "[�u���C�h]";
			mes "���������a���c�c�ُ�Ȃ��I";
			mes "���[���~�b�h�K�b�c�����I";
			mes "����!!";
			next;
			menu "�N�ł����c�c�H",-;
			mes "[�u���C�h]";
			mes "�悭�������Ă��ꂽ�I�@�I���͂ȁA";
			mes "�����炢�̖`���҂�!!";
			mes "�c�c";
			next;
			cutin "v_breid03",2;
			mes "[�u���C�h]";
			mes "�������A�����ɂނȂ�I";
			mes "�I�������ĂȂ��A��肽����";
			mes "����Ă�킯����Ȃ��񂾂��I";
			mes "�ł��ȁA�����̂��߂ɂ͎d����";
			mes "���Ȃ��Ⴂ���Ȃ��񂾁I�@�������A";
			mes "�Ȃ�ŃI��������Ȃ��Ƃ��c�c!!";
			next;
			misceffect 207,"";
			percentheal 100,0;
			cutin "v_breid01",2;
			mes "[�u���C�h]";
			mes "�͂��c�c�I�}�G�ɔ������肵�Ă�";
			mes "���傤���Ȃ����B";
			mes "���Ȃ݂ɁA���L�����y�[�����ŁA";
			mes "�����ŉ񕜂��Ă�񂾁B";
			mes "�P�K�ł�������A�C�y�ɗ���Ƃ����B";
			set QUEST_VALENTINE1,2;
			return;
		case 4:
			cutin "v_breid05",2;
			mes "[�u���C�h]";
			mes "�J�J�I�`�J�J�I�`��������I";
			mes "�J�J�I�͂���܂��񂩁`�H";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�J�J�I�c�c�H";
			next;
			cutin "v_breid06",2;
			mes "[�u���C�h]";
			mes "�w�C�A���q����!!�@�J�J�I���������H";
			next;
			if(select("���Ȃ��c�c�R�m����Ȃ���ł����H","������ł����H")==1) {
				cutin "v_breid01",2;
				mes "[�u���C�h]";
				mes "�c�c";
				mes "�A���o�C�g����B";
				mes "������Ƌ����K�v�łȁc�c";
				next;
				mes "["+strcharinfo(0)+"]";
				mes "�v�����e���R�m�c�́A����Ȃ�";
				mes "�n������ł����c�c�H";
				next;
				mes "[�u���C�h]";
				mes "����A���������킯����Ȃ����c�c";
				mes "������Ɛl�ɂ͌����Ȃ�";
				mes "��������ĂˁB";
				mes "�Ƃɂ��������K�v�Ȃ񂾁B";
				mes "���`���������B�I�����A���o�C�g��";
				mes "���Ă邱�ƁA�R�m�c�Ɍ����Ȃ�H";
				next;
				if(select("���R��m�肽���ł�","�R�m�c�ɕ񍐂��܂�")==1) {
					mes "[�u���C�h]";
					mes "�܂���@���������A���̎���";
					mes "�����Ă������B";
					mes "���̓A���o�C�g��������ȁB";
				}
				else {
					cutin "v_breid03",2;
					mes "[�u���C�h]";
					mes "�����c�c�I�}�G�ȁc�c";
					mes "�����A����ɂ���!!";
				}
				set QUEST_VALENTINE1,2;
				break;
			}
			cutin "v_breid01",2;
			mes "[�u���C�h]";
			mes "�J�J�I�́A���H�Ƃ��Ă��A�F�X��";
			mes "�H�ו��̌����Ƃ��Ă��g�p�����A";
			mes "�ƂĂ��M�d�Ȃ��̂��B";
			mes "�P��300Zeny�I";
			mes "5�Z�b�g��1500Zeny���B";
			next;
			mes "[�u���C�h]";
			mes "�������A�ȁA���ƁI�@���Ȃ���ʂɁA";
			mes "5�Z�b�g1499Zeny�Ŕ̔���!!";
			next;
			if(select("������ƍl����","�����܂�")==1) {
				mes "[�u���C�h]";
				mes "�������肷�����͂Ȃ�����A";
				mes "�����ɔ����K�v�͂Ȃ���B";
				mes "�I���������̃A���o�C�g�����ˁB";
			}
			else if(Zeny < 1499) {
				cutin "v_breid03",2;
				mes "[�u���C�h]";
				mes "��c�cZeny������Ȃ��݂������ˁB";
				mes "�������ǁA�l�������邱�Ƃ�";
				mes "�ł��Ȃ��񂾁B";
			}
			else {
				cutin "v_breid02",255;
				mes "[�u���C�h]";
				mes "�͂���A�J�J�I5�B";
				mes "���x�`�I�@����������s���D�����`�I";
				mes "�����āA���낻��x���̏������邩�ȁB";
				set Zeny,Zeny-1499;
				getitem 7182,5;
			}
			set QUEST_VALENTINE1,2;
			return;
		}
	}

	function PatternB {	//case1
		cutin "v_breid03",2;
		mes "[�u���C�h]";
		mes "�c�c";
		mes "���̑O�̎���ɂ܂�Ȃ��z���B";
		mes "���X�I���ɁA�����p���H";
		next;
		if(select("�����肵�����āc�c","����A���ł��Ȃ�")==2) {
			cutin "v_breid05",2;
			mes "[�u���C�h]";
			mes "�t���c�c���������B";
			mes "�Ȃ猋�\���B";
			return;
		}
		cutin "v_breid05",2;
		mes "[�u���C�h]";
		mes "���X�����肾��!?";
		mes "�L�~�ɂƂ��ăI���́A���F";
		mes "�l���ɂ���������̏o��̈���B";
		mes "������킴�킴�����肾��!?";
		mes "��₩���Ȃ�A�A��!!";
		next;
		mes "[�u���C�h]";
		mes "�c�c����Ƃ��A";
		mes "�{�C�Œ�������������ƌ����Ȃ�A";
		mes "�������ӂ������Ă��炨������Ȃ����B";
		next;
		if(select("�ǂ�����΁H","����Ȃ�����")==2) {
			mes "[�u���C�h]";
			mes "�t���c�c���������B";
			mes "�Ȃ猋�\���B";
			return;
		}
		mes "[�u���C�h]";
		mes "�������ȁc�c���߂�";
		mes "�[���s�[�̈�ł����ꂽ��A";
		mes "���ӂ�����ƔF�߂Ă�낤�B";
		mes "�����A�ǂ��Ȃ񂾁H";
		next;
		if(countitem(909)) {
			if(select("������","�����Ȃ�")==1) {
				mes "["+strcharinfo(0)+"]";
				mes "�[���s�[�Ȃ玝���Ă邯�ǁc�c";
				mes "�ł��A���̃[���s�[�Ȃ񂩂��H";
				next;
				mes "[�u���C�h]";
				mes "�����Ōx�����ĂĂ��A�ދ�������ȁB";
				mes "����܂�ɂł��������邩��A";
				mes "����Ƀ[���s�[�ł��H�������ȁ`�ƁB";
				next;
				menu "�H�ׂ�!?",-;
				cutin "v_breid06",2;
				mes "[�u���C�h]";
				mes "��������Ȃɋ����Ă���񂾁H";
				mes "�[���s�[��H�ׂ����ƂȂ��̂��H";
				mes "�I���͂悭�H�ׂĂ����B";
				mes "�Ȃ�ƂȂ��Â��Ăȁc�c";
				next;
				cutin "v_breid05",2;
				mes "[�u���C�h]";
				mes "�݂�Ȑ��N�O�́A";
				mes "�n�������Ȃǂ�������";
				mes "�[���s�[��H�ׂ����񂾁B";
				next;
				mes "[�u���C�h]";
				mes "�c�c�����ɂ��ӊO���Ċ炾�ȁB";
				mes "�ŋ߂̎�҂́A�n���������";
				mes "�m��Ȃ��񂾂ȁc�c";
				delitem 909,1;
				set QUEST_VALENTINE1,2;
				return;
			}
		}
		mes "["+strcharinfo(0)+"]";
		mes "�[���s�[�H�@�����ĂȂ����ǁc�c";
		mes "�ł��A���̃[���s�[�Ȃ񂩂��H";
		next;
		cutin "v_breid06",2;
		mes "[�u���C�h]";
		mes "�����Ōx�����ĂĂ��A�ދ�������ȁB";
		mes "����܂�ɂł��������邩��A";
		mes "����Ƀ[���s�[�ł��H�������ȁ`�ƁB";
		next;
		menu "���A�H�ׂ��ł���!?",-;
		mes "[�u���C�h]";
		mes "��������Ȃɋ����Ă���񂾁H";
		mes "�[���s�[��H�ׂ����ƂȂ��̂��H";
		mes "�I���͂悭�H�ׂĂ����B";
		mes "�Ȃ�ƂȂ��Â��Ăȁc�c";
		next;
		cutin "v_breid05",2;
		mes "[�u���C�h]";
		mes "�݂�Ȑ��N�O�́A";
		mes "�n�������Ȃǂ�������";
		mes "�[���s�[��H�ׂ����񂾁B";
		next;
		mes "[�u���C�h]";
		mes "�c�c�����ɂ��ӊO���Ċ炾�ȁB";
		mes "�t���c�c���F�ŋ߂̎�҂ɂ́A";
		mes "�n��������Ȃ�ė����ł��Ȃ��񂾂ȁB";
		mes "�p�͍ς񂾁c�c�A��B";
		return;
	}

	function PatternC {	//case2,3,4
		switch(getarg(0)) {
		case 1:
			if(rand(3)==0) {
				cutin "v_breid05",2;
				mes "[�u���C�h]";
				mes "���a���ȁc�c�����������B";
				mes "���̂���Ȏ��Ԃɂ܂ŁA";
				mes "�����Ȃ��Ⴂ����̂�!?";
				mes "���S�ɐQ�s�����c�c";
				next;
				mes "[�u���C�h]";
				mes "�A���^���悭�撣��ȁB";
				mes "���̂��߂ɁA�����撣���Ă�񂾁H";
				next;
				if(select("�����ƁA����́c�c","�ꝺ�����_����!!")==1) {
					cutin "v_breid06",2;
					mes "[�u���C�h]";
					mes "�E�K�@�@�@�@�`�`�`!!";
					next;
					mes "["+strcharinfo(0)+"]";
					mes "������A�ȁc�c��!?";
					next;
					cutin "v_breid05",2;
					mes "[�u���C�h]";
					mes "���A���܂񂷂܂�B";
					mes "���������肶��Ȃ������񂾂��c�c";
					mes "���₟�A����܂�ɂł��c�c";
					mes "�������A�������ł��N���Ȃ����˂��B";
					next;
					mes "[�u���C�h]";
					mes "����Ȏ��ԂɊO���o�����z�����Ȃ���A";
					mes "�I���͂���ȏ��Ŏ��ʂقǑދ����Ȃ���";
					mes "�x������K�v���Ȃ��񂾂��ȁB";
					next;
					mes "^4A4AFF-���Ȃ��ɑ΂���u���C�h�̍D���x��";
					mes "�����㏸���܂���-^000000";
					set QUEST_VALENTINE1,QUEST_VALENTINE1+1;
					return;
				}
				mes "[�u���C�h]";
				mes "�c�c�A���x���^�ɁA���鏤�l�����ĂȁB";
				mes "�[���s�[���W�߂āA�K���ɋ��𒙂߂��B";
				mes "�����āA�_�C�������h���@�蓖�Ă�";
				mes "�ꝺ����𖲌��āA�R���h�֗��������B";
				next;
				mes "[�u���C�h]";
				mes "�c�c���ʂ͔ߎS�Ȃ��̂������B";
				next;
				mes "["+strcharinfo(0)+"]";
				mes "�c�c���̂���Șb�������ł��H";
				next;
				mes "[�u���C�h]";
				mes "�ꝺ�����_���̂͂������A";
				mes "�댯�𔺂������Ă��Ƃ��B";
				mes "��x���s����ƁA��蒼���̂�";
				mes "��ς�����ȁB";
				next;
				cutin "v_breid02",2;
				mes "[�u���C�h]";
				mes "�܂��L�~�́A����Ȏ��Ԃ܂ňꐶ����";
				mes "�撣���Ă邵�A�S�z�Ȃ��Ƃ͎v�����ȁB";
				return;
			}
			break;	//�|�[�V�����N�x���[�g��
		case 2:
			if(rand(3)==0) {
				cutin "v_breid05",2;
				mes "[�u���C�h]";
				mes "�Ȃ��A�[���s�[�����ĂȂ����H";
				mes "��������A�����Ȃ����H";
				next;
				if(countitem(909)<1) {
					menu "�����A�����Ă܂���",-;
					cutin "v_breid06",2;
					mes "[�u���C�h]";
					mes "�Ȃ񂾁A�[���s�[���玝���ĂȂ��̂��H";
					mes "����̈Ⴂ�Ȃ̂��c�c";
					return;
				}
				if(select("�����Ȃ�","������")==1) {
					mes "["+strcharinfo(0)+"]";
					mes "�[���s�[�Ȃ�āA�����Ă܂����B";
					mes "����ɁA���Ɏg����ł����H";
					next;
					mes "[�u���C�h]";
					mes "�����āc�c�H�ׂ�񂾂��H";
					mes "���܂ɐH�ׂ�Ƃ��܂����B";
					mes "�Ȃ�ƂȂ��Â݂������Ăȁc�c";
					next;
					menu "�H�ׂ�!?�@����ۂǕn�R�Ȃ�ł���!?",-;
					cutin "v_breid03",2;
					mes "[�u���C�h]";
					mes "�c�c";
					mes "�n�R�ň��������ȁc�c";
					return;
				}
				mes "["+strcharinfo(0)+"]";
				mes "�[���s�[�Ȃ玝���Ă邯�ǁc�c";
				mes "�ł��A���̃[���s�[�Ȃ񂩂��H";
				next;
				mes "[�u���C�h]";
				mes "�����Ōx�����ĂĂ��A�ދ�������ȁB";
				mes "����܂�ɂł��������邩��A";
				mes "����Ƀ[���s�[�ł��H�������ȁ`�ƁB";
				next;
				menu "�H�ׂ�!?",-;
				cutin "v_breid06",2;
				mes "[�u���C�h]";
				mes "��������Ȃɋ����Ă���񂾁H";
				mes "�[���s�[��H�ׂ����ƂȂ��̂��H";
				mes "�I���͂悭�H�ׂĂ����B";
				mes "�Ȃ�ƂȂ��Â��Ăȁc�c";
				next;
				cutin "v_breid05",2;
				mes "[�u���C�h]";
				mes "�݂�Ȑ��N�O�́A";
				mes "�n�������Ȃǂ�������";
				mes "�[���s�[��H�ׂ����񂾁B";
				next;
				mes "[�u���C�h]";
				mes "�c�c�����ɂ��ӊO���Ċ炾�ȁB";
				mes "�ŋ߂̎�҂́A�n���������";
				mes "�m��Ȃ��񂾂ȁc�c";
				delitem 909,1;
				set QUEST_VALENTINE1,1;
				return;
			}
			break;	//�񕜃��[�g��
		case 3:
			if(rand(3)==0) {
				cutin "v_breid01",2;
				mes "[�u���C�h]";
				mes "�͂��`�ދ����c�c";
				mes "�������A�|�G���ł���邩�H";
				next;
				mes "[�u���C�h]";
				mes "���@�͊ȒP�I";
				mes "�e�X�����炩���ߕ��͂����A";
				mes "��������݂ɂȂ���񂾁B";
				next;
				mes "[�u���C�h]";
				mes "�߂��Ⴍ����Ȃ̂�";
				mes "�o���邩������Ȃ����A";
				mes "���\�ʔ������H";
				mes "�ǂ����A����Ă݂邩�H";
				next;
				if(select("�����A���Ђ��܂��傤","�n���n�������Ă��C���c�c")==2) {
					cutin "v_breid03",2;
					mes "[�u���C�h]";
					mes "����Ă��݂Ȃ��Ŕn���n�������Ƃ́A";
					mes "��������Ȃ����I";
					return;
				}
				mes "[�u���C�h]";
				mes "���ꂶ��A���2���͂�����Ă݂āB";
				mes "�܂���Ԗڂ́c�c";
				next;
				input .@poem1$;
				mes "["+strcharinfo(0)+"]";
				mes "��Ԗڂ́c�c";
				mes .@poem1$+ "�ŁB";
				next;
				input .@poem2$;
				mes "["+strcharinfo(0)+"]";
				mes "��Ԗڂ́c�c";
				mes .@poem1$+ "�ŁA";
				mes "��Ԗڂ́c�c";
				mes .@poem2$+ "�I";
				mes "�ǂ��ł����H";
				next;
				mes "[�u���C�h]";
				mes "����̕����ł������B";
				mes "��[���A�Ȃ��Ă݂邩�B";
				next;
				switch(rand(6)) {
				case 0:
					mes "^218C21�|�����|�����I�Ⴄ���|�|����!!^000000";
					mes "^4A4AFF" +.@poem1$+ "^000000";
					mes "^218C21�|�����|�����I�Ⴄ���T���^�|�����I^000000";
					mes "^4A4AFF" +.@poem2$+ "^000000";
					break;
				case 1:
					mes "^218C21�|�b�|�b�|�b�|�[�V�����s�b�`���[��^000000";
					mes "^4A4AFF" +.@poem1$+ "^000000";
					mes "^218C21�ɏ�񕜁I�@�|�[�V�����s�b�`���[��^000000";
					mes "^4A4AFF" +.@poem2$+ "^000000";
					break;
				case 2:
					mes "^218C21�I���̐S�ɔ����Ɏc��`��^000000";
					mes "^4A4AFF" +.@poem1$+ "^000000";
					mes "^218C21�v���C�h���̂ā`���Ȃ��ā`��^000000";
					mes "^4A4AFF" +.@poem2$+ "^000000";
					break;
				case 3:
					mes "^218C21�c���a�͋��ɂȂ�I�x���I�x���I^000000";
					mes "^4A4AFF" +.@poem1$+ "^000000";
					mes "^218C21����x���̂������Ł`���E�͕��a�`!!^000000";
					mes "^4A4AFF" +.@poem2$+ "^000000";
					break;
				case 4:
					mes "^218C21���y�R�I�@���y�R�I�@���y�R�y�R�I^000000";
					mes "^4A4AFF" +.@poem1$+ "^000000";
					mes "^218C21�����������I�@���y�R�y�R!!^000000";
					mes "^4A4AFF" +.@poem2$+ "^000000";
					break;
				case 5:
					mes "^218C21�����́`��ɉ߂��s���`��^000000";
					mes "^4A4AFF" +.@poem1$+ "^000000";
					mes "^218C21�A���f�o�����̐��Ԃ̂悤�Ɂ`!!^000000";
					mes "^4A4AFF" +.@poem2$+ "^000000";
					break;
				}
				next;
				cutin "v_breid05",2;
				mes "[�u���C�h]";
				mes "�c�c�����c�c";
				mes "�I����A�z���ȁc�c";
				next;
				mes "["+strcharinfo(0)+"]";
				mes "�c�c����c�c";
				mes "�A�z���ˁc�c";
				set QUEST_VALENTINE1,QUEST_VALENTINE1+1;
				return;
			}
			break;	//�|�[�V�����N�x���[�g��
		case 4:
			cutin "v_breid05",2;
			mes "[�u���C�h]";
			mes "��������Ⴂ�I�@�J�J�I���������H";
			next;
			if(select("�����܂�","���\�ł�")==2) {
				mes "[�u���C�h]";
				mes "�������肷�����͂Ȃ�����A";
				mes "�����ɔ����K�v�͂Ȃ���B";
				mes "�Ƃ���Łc�c�J�J�I���āA���̂܂�";
				mes "�H�ׂĂ����܂��̂��Ȃ��c�c";
				return;
			}
			mes "[�u���C�h]";
			mes "5�Z�b�g��1499Zeny����I";
			mes "�����ˁH";
			next;
			if(select("����5�Z�b�g�Ȃ�ł����H","�͂�")==1) {
				mes "[�u���C�h]";
				mes "�����A�o������͖ʓ|�����c�c";
				mes "�c�c";
				mes "�s��������Ȃ�A����Ȃ��Ă������B";
				return;
			}
			if(Zeny < 1499) {
				cutin "v_breid03",2;
				mes "[�u���C�h]";
				mes "��c�cZeny������Ȃ��݂������ˁB";
				mes "�������ǁA�l�������邱�Ƃ�";
				mes "�ł��Ȃ��񂾁B";
				return;
			}
			cutin "v_breid01",2;
			mes "[�u���C�h]";
			mes "�͂���A�J�J�I5�B";
			mes "���x�`�I�@����������s���D�����`�I";
			set Zeny,Zeny-1499;
			getitem 7182,5;
			set QUEST_VALENTINE1,QUEST_VALENTINE1+1;
			return;
		}
		//�񕜁E�|�[�V�����N�x���[�g��������
		if(getarg(0)==3) {
			cutin "v_breid01",2;
			mes "[�u���C�h]";
			mes "�������Ă���悤�����c�c";
			mes "�񕜂��Ă�낤���H";
			next;
			if(select("�����A���肢���܂�","�������A���v�ł�")==1) {
				mes "[�u���C�h]";
				mes "�ق����ƁB";
				mes "���܂薳��������Ȃ�B";
				misceffect 207,"";
				percentheal 100,0;
			}
			else {
				mes "[�u���C�h]";
				mes "���������牓�����邱�ƂȂ����H";
				mes "�K�v�Ȃ�A���ł������Ă���B";
			}
			return;
		}
		cutin "v_breid01",2;
		mes "[�u���C�h]";
		mes "�񕜂��Ăق������́A";
		mes "���ł������Ă���B";
		mes "�|�[�V�����ŉ񕜂��Ă�邩��ȁB";
		mes "�N�x��������O�Ɏg��Ȃ��ƁA";
		mes "���������Ȃ�����ȁB";
		next;
		set @menu,select("�N�x���āH","�񕜂��Ăق���");
		mes "[�u���C�h]";
		mes "�|�[�V�����ɑN�x������̂�";
		mes "�m��Ȃ����낤�H";
		mes "�Â��Ȃ��Ă��A�����ς������A";
		mes "����ŕ����󂷂��̂ł͂Ȃ����A";
		mes "���ʂ������ɗ�������񂾁B";
		next;
		if(@menu==1) {
			mes "[�u���C�h]";
			mes "�Ȃ�ׂ��N�x�������ŗǂ̏�Ԃ�";
			mes "���݂������񂾂ȁB";
			mes "�܂��A�Ⴂ�͔��X������̂����A";
			mes "������C�ɂ���K�v���Ȃ����낤���c�c";
			next;
			cutin "v_breid02",2;
			mes "[�u���C�h]";
			mes "�������A��̐▽�̏u��!!";
			mes "�Ō�̈�̃|�[�V���������񂾂�";
			mes "�Â��Č��ʂ����܂����������肷��ƁA";
			mes "���\��������񂾁B";
		}
		else {
			cutin "v_breid02",2;
			mes "[�u���C�h]";
			mes "���A�����͑N�x���߂��ፂ��";
			mes "�ŏ㋉�̃|�[�V�������B";
			mes "���ꂭ�炢�N�x�������Ǖi���ƁA";
			mes "�g�������l����!!�@���Ċ�����Ȃ��B";
			misceffect 207,"";
			percentheal 100,0;
		}
		return;
	}

	function PatternD {	//case5
		if(getarg(3)==3 && QUEST_VALENTINE1_FLAG==1) {
			cutin "v_breid04",2;
			mes "[�u���C�h]";
			mes "�c�c";
			mes "���̊�c�c";
			mes "���̑O�I�����Q�����ĉ��������ƁH";
			next;
			mes "[�u���C�h]";
			mes "���߂�ˁB�Q�Ă鎞�ɐG����ƁA";
			mes "���ӎ��ɑ̂����������Ⴄ�񂾁B";
			next;
			if(select("�C�ɂ��Ȃ��ł�������","�C�����Ă���������")==1) {
				mes "["+strcharinfo(0)+"]";
				mes "��ɂ������炵���͎̂�������B";
				mes "�ނ��뎄���ӂ�Ȃ��Ắc�c";
				next;
				cutin "v_breid05",2;
				mes "[�u���C�h]";
				mes "�������B����A�ӂ��Ă��炨���B";
				next;
				mes "["+strcharinfo(0)+"]";
				mes "�c�c";
				next;
				cutin "v_breid02",2;
				mes "[�u���C�h]";
				mes "��k�A��k�����āB";
				mes "�����A���b�Ƃ����!!";
				mes "���`�Ƃ���ŁA��ŊX�̓쐼�ɂ���";
				mes "�L��܂ŗ��Ă���Ȃ����H";
				mes "�x���`������ł鏊�ȁB";
				next;
				mes "^4A4A4A-���Ȃ��ɑ΂���u���C�h�̐e���x��";
				mes "�㏸���܂���-^000000";
				set QUEST_VALENTINE1,6;
				set QUEST_VALENTINE1_FLAG,2;
				return;
			}
			cutin "v_breid06",2;
			mes "["+strcharinfo(0)+"]";
			mes "���ӎ�������Ƃ����āA";
			mes "���������̂���Ȃ��ł���I";
			mes "�����Ǝ���ɋC�����Ă���������I";
			mes "����Ȗ��_�o���ƁA";
			mes "�F�B�����Ȃ��񂶂�Ȃ���!?";
			next;
			cutin "v_breid03",2;
			mes "[�u���C�h]";
			mes "�Ȃ��c�c������!?";
			mes "�l���킴�킴����������";
			mes "�ӂ��Ă���Ă�̂�!!";
			next;
			misceffect 2,"";
			percentheal -50,0;
			mes "[�u���C�h]";
			mes "������x�����Ă݂�!!";
			next;
			misceffect 2,"";
			percentheal -40,0;
			mes "[�u���C�h]";
			mes "�I�������_�o���Ƃ�!?";
			mes "������ƐQ���������炢�ŁA";
			mes "�����܂Ō����Ėق��Ă��邩!!";
			mes "�����A������x�����Ă݂�!!";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�������c�c���������c�c!!";
			mes "��߂āc�c��߂Ă�������!!";
			mes "�������������A�����߂��܂����I";
			mes "�ӂ邩��A��߂Ă��������I";
			next;
			cutin "v_breid05",2;
			mes "[�u���C�h]";
			mes "�����c�c";
			mes "�c�c";
			mes "�悤�₭�����������B";
			next;
			misceffect 207,"";
			percentheal 100,0;
			mes "[�u���C�h]";
			mes "�c�c���Â��Ă��c�c";
			mes "�����Ă������A����͍D�ӂ���Ȃ����B";
			mes "�d�������炵�傤���Ȃ��A�񕜂���";
			mes "���񂾁B���Ⴂ����Ȃ�B";
			return;
		}
		if(getarg(3)==3 && QUEST_VALENTINE1_FLAG==0 && rand(3)==0) {
			cutin "v_breid05",2;
			mes "[�u���C�h]";
			mes "�c�c�c�c�c";
			mes "�c�c�c�c�c";
			next;
			if(select("����������","�l�q���݂�")==2) {
				mes "^4A4AFF-�u���C�h�̖ڂ̑O�Ŏ��U���Ă݂���";
				mes "�������Ȃ�-";
				mes "-�ڂ��J�����܂�";
				mes "����������Ă���悤��-^000000";
				next;
				if(select("���̖т𔲂��Ă݂�","����������")==1) {
					mes "^4A4AFF-�u���C�h�̔��̖т̒��ŁA";
					mes "���߂̔��̖т���{��������܂݁c�c";
					mes "��C�ɔ����Ă݂�-^000000";
					next;
					cutin "v_breid03",2;
					mes "[�u���C�h]";
					mes "���Ă�!! �ȁA���������!?";
					mes "�\�͔��΁I";
					mes "���傪����Ȃ�A���Ō����I";
					if(Sex==0)
						return;
					next;
					misceffect 2,"";
					percentheal -50,0;
					mes "[�u���C�h]";
					mes "����Ȃӂ��ɂ�!!";
					next;
					mes "["+strcharinfo(0)+"]";
					mes "��A�������������ł��I";
					mes "�ځA�\�͔��΁I�@���̌���";
					mes "���낵�Ă��������I";
					next;
					cutin "v_breid06",2;
					mes "[�u���C�h]";
					mes "��c�c�����H";
					mes "���̊�A�ǂ��������̂��H";
					mes "�P�K���Ă邼�H";
					next;
					mes "["+strcharinfo(0)+"]";
					mes "���Ȃ�����������ł���!!";
					mes "���������I�@���̌��ŁI";
					mes "�\�͔��΂Ƃ������Ȃ���A";
					mes "���̊���������̂͂ǂ��̒N�ł���!?";
					next;
					misceffect 207,"";
					percentheal 100,0;
					cutin "v_breid04",2;
					mes "[�u���C�h]";
					mes "��A�Ȃ񂾃I�}�G�����c�c";
					mes "�Q�����Ă�����łȁc�c";
					mes "��܂��A�Q�Ă鏊��s�p�ӂ�";
					mes "�߂Â��z�������񂾂��H";
					mes "���Â��Ă�邩��C�ɂ���ȁB";
					next;
					mes "["+strcharinfo(0)+"]";
					mes "�c�c������Q�����Ă�������āA";
					mes "�����Ȃ艣��Ȃ�āc�c";
					next;
					cutin "v_breid03",2;
					mes "[�u���C�h]";
					mes "�������A���邳���I";
					mes "�񕜂�����A�������ƃ����X�^�[�ł�";
					mes "���ɍs���Ă����I";
					set QUEST_VALENTINE1_FLAG,1;
					return;
				}
			}
			mes "["+strcharinfo(0)+"]";
			mes "�������Ă����ł����H";
			next;
			cutin "v_breid01",2;
			mes "[�u���C�h]";
			mes "�����c�c�L�~���B";
			mes "�������܂������ُ�Ȃ����I";
			mes "�������a�ŕ��a�Łc�c";
			mes "�����Ȃ��Ă��Ă��B";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "���������Ōx�����Ă�΁A�O����";
			mes "�ł��傤�ˁc�c���܂ɂ͋x�񂾂�H";
			next;
			mes "[�u���C�h]";
			mes "�����ĂȂ��������H";
			mes "�̒������ĐQ���񂾒c�������Ă��B";
			mes "�x�ɒ������Ă̂ɁA�����̑����";
			mes "�����Ȃ��Ⴂ���Ȃ��񂾁B";
			mes "�܁A�x�ɂ��I�������A������";
			mes "������ɖ߂邱�ƂɂȂ邯�ǂˁB";
			next;
			cutin "v_breid04",2;
			mes "[�u���C�h]";
			mes "���Ɛ����̐h��������A���v���B";
			mes "�S�z���Ă���Ă��肪�Ƃ��B";
			return;
		}
		cutin "v_breid05",2;
		mes "[�u���C�h]";
		mes "�͂��`���a�ŁA�ދ��ŁA�����c�c";
		mes "�O�O�O�D�`";
		mes "�c�c��������c�c";
		next;
		if(select("�[���s�[����܂����H","���͌����Ă܂��񂪁c�c")==1) {
			mes "[�u���C�h]";
			mes "����Ȃ��B";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�l���D�ӂŌ����Ă�̂ɁI";
			next;
			mes "[�u���C�h]";
			mes "���������̂ŁA�Ζ����I��肵����";
			mes "�|���悤�ɐQ����肾�B";
			mes "����ł������Ă��炢�������Ă��I";
			mes "�����Ύ����낤���������낤���A";
			mes "��������΂ɋN���Ȃ�����ȁB";
			next;
			mes "[�u���C�h]";
			mes "������A�Ζ����Ԃ��I���܂ł��Ə���";
			mes "�����Ƃ��̂܂܉��������ɑς���!!";
		}
		else {
			cutin "v_breid03",2;
			mes "[�u���C�h]";
			mes "�c�c";
			mes "�I�}�G�́A���Ă��Ȃ��A";
			mes "�������Ȃ��A�����󂢂Ă����Ȃ��c�c";
			next;
			cutin "v_breid05",2;
			mes "[�u���C�h]";
			mes "����Ɂc�c���R�ɕ������Ă����ˁB";
			mes "�I�����R�m�����߂Ė`�����悤���Ȃ��B";
			next;
			mes "[�u���C�h]";
			mes "�܂��A���������ł��̋Ζ����I��肩�B";
			mes "���a�ȃv�����e���Ƃ͂�����΂��B";
			mes "���̎�����ɖ߂�Ȃ��Ă͂ȁB";
			mes "����ɁA�A���o�C�g���I��肩�c�c";
			next;
			menu "�A���o�C�g�H",-;
			mes "[�u���C�h]";
			mes "�����c�c";
			mes "���̌x���̋Ζ��͒��Ԃ̑�s�ł��Ă�";
			mes "����������A�蓖�Ă͏o�Ȃ��񂾁B";
			next;
			mes "[�u���C�h]";
			mes "�A���o�C�g�ł����Ȃ����A";
			mes "�������ꂵ���Ă��B";
			mes "�c�c���āA�I���A���ł���Șb��";
			mes "���Ă�񂾁c�c�H";
		}
		set QUEST_VALENTINE1,6;
		return;
	}

	function PatternE {	//case6
		switch(getarg(3)) {
		case 1:
			if(QUEST_VALENTINE1_FLAG==2) {
				set QUEST_VALENTINE1,7;
				set QUEST_VALENTINE1_FLAG,0;
				getitem 573,1;
				getitem 7182,5;
				cutin "v_breid01",2;
				mes "[�u���C�h]";
				mes "�����I�@�҂��Ă���!!";
				mes "�܂��܂��A�Ƃ肠����������߁I";
				mes "��ł����āA����������āI";
				next;
				mes "[�u���C�h]";
				mes "�悵�A���񂾂ȁB";
				mes "���ꂶ��A���ݕ���Ƃ��āA";
				mes "���̃J�J�I���A���x���^�܂�";
				mes "�z�B��낵���I";
				next;
				menu "�c�c���̂��߂ɌĂ񂾂́H",-;
				cutin "v_breid05",2;
				mes "[�u���C�h]";
				mes "�������B";
				mes "�������H�@���ɉ������҂��Ă��̂��H";
				mes "�����œ͂��悤�Ǝv�����񂾂��A";
				mes "�x��������c�c�H";
				mes "�c���̖ڂ𓐂�Ŕ����o�����Ƃ��A";
				mes "�Ȃ��Ȃ��ł��Ȃ����Ă��c�c";
				next;
				mes "[�u���C�h]";
				mes "^4A4AFF�A���x���^^000000��^4A4AFF�V���R��=�o�V�j�I^000000���B";
				mes "���ނ��B";
				return;
			}
			cutin "v_breid01",2;
			mes "[�u���C�h]";
			mes "���̂��c�c���܂Ȃ����A";
			mes "�e�n�ŏW�߂��i�����A";
			mes "�A���x���^�܂Ŕz�B��";
			mes "���݂����񂾁B";
			next;
			mes "[�u���C�h]";
			mes "�o�C�g�Ŕz�B�����Ă���񂾂��A";
			mes "�A���x���^�܂œ���s���Ȃ�����Ȃ��B";
			next;
			if(select("�����ł���","�Z�����ł�")==2) {
				cutin "v_breid05",2;
				mes "[�u���C�h]";
				mes "�������c�c";
				mes "�������ȁA�ǂ����悤�c�c";
				return;
			}
			mes "[�u���C�h]";
			mes "�z�B�i�́A�J�J�I5���B���l�́A";
			mes "�A���x���^�̃V���R��=�o�V�j�I���B";
			next;
			set QUEST_VALENTINE1,7;
			getitem 7182,5;
			mes "[�u���C�h]";
			mes "�i���̑���͂���������Ă��邩��A";
			mes "�����A�͂��Ă����΂����B";
			next;
			mes "[�u���C�h]";
			mes "^4A4AFF�A���x���^^000000��^4A4AFF�V���R��=�o�V�j�I^000000���B";
			mes "���ނ��B";
			return;
		case 2:
			cutin "v_breid01",2;
			mes "[�u���C�h]";
			mes "^4A4AFF" +.name$+ "^000000�Ƃ���";
			mes "���̎q��m��Ȃ����H";
			mes "���Ȃ����ދ����̂��ɐ���܂�";
			mes "�����Ă������q�Ȃ񂾂��B";
			mes "�c�c����A���܂�B����Șb��";
			mes "�������͂Ȃ������񂾂��ȁB";
			return;
		case 3:
			cutin "v_breid01",2;
			mes "[�u���C�h]";
			mes "����ł͂܂��A�v�����e���ŉ���B";
			close2;
			set .flag,0;
			cutin "v_breid01",255;
			return;
		}
	}

	function PatternF {	//case7
		cutin "v_breid05",2;
		mes "[�u���C�h]";
		mes "^4A4AFF�A���x���^^000000��^4A4AFF�V���R��=�o�V�j�I^000000���B";
		mes "�z�B���镨��^4A4AFF�J�J�I5��^000000�B";
		mes "���ނ��B";
		return;
	}

	function PatternG {	//case8
		cutin "v_breid01",2;
		mes "[�u���C�h]";
		mes "���A����J�������ȁB";
		mes "�����Ɠ͂��Ă��ꂽ���H";
		next;
		switch (select("�萔���Ƃ��Ă�������`���R��n��","��������`���R��H�ׂ��ƌ���")) {
		case 1:
			if(countitem(558)<1) {
				cutin "v_breid05",2;
				mes "["+strcharinfo(0)+"]";
				mes "���A����H�@���������ȁc�c";
				mes "�z�B�萔���Ƃ��Ă�������͂���";
				mes "�`���R���[�g���Ȃ��Ȃ��������!?!";
				mes "���`��A�ǂ��ɂ������񂾂낤�c�c";
				next;
				cutin "v_breid02",2;
				mes "[�u���C�h]";
				mes "�z�B�����̂̓L�~������A�萔���Ȃ�";
				mes "�L�~���H�ׂėǂ������񂾂��c�c";
				mes "�Ȃ�����������̂��B�c�O���ȁB";
				break;
			}
			mes "[�u���C�h]";
			mes "��c�c�����H�@�`���R���[�g�H";
			mes "�����̂��H";
			next;
			if(select("�萔���Ƃ��Ă�������ƌ���","���̋C�������ƌ���")==1) {
				mes "["+strcharinfo(0)+"]";
				mes "�z�B��́A�`���R���[�g�̂��X�ł����B";
				mes "�z�B�萔���ɂƂ�������̂ŁA";
				mes "�H�ׂĂ��������B";
				next;
				mes "[�u���C�h]";
				mes "�z�B�����̂̓L�~������A";
				mes "�z�B�萔���Ȃ�L�~���H�ׂĂ�����B";
				break;
			}
			if(Sex==0) {
				mes "[�u���C�h]";
				mes "���c�c�I�A�I���Ɂc�c�H";
				next;
				delitem 558,1;
				set QUEST_VALENTINE1,QUEST_VALENTINE1+3;
				cutin "v_breid04",2;
				mes "[�u���C�h]";
				mes "���A���肪�Ƃ��B";
				next;
				mes "^4A4A4A-���Ȃ��ɑ΂���u���C�h�̍D���x��";
				mes "�啝�ɏ㏸���܂���-^000000";
				if(.name$=="" || rand(3)==0)
					set .name$,strcharinfo(0);
			}
			else {
				cutin "v_breid04",2;
				mes "[�u���C�h]";
				mes "�Ȃ��c�c";
				mes "����A��k����!?";
				mes "�I���́c�c����������͂Ȃ���!!";
				set QUEST_VALENTINE1,9;
			}
			return;
		case 2:
			mes "["+strcharinfo(0)+"]";
			mes "�z�B��́A�`���R���[�g�̂��X�ł����B";
			mes "�z�B�萔���ɂƈ��������̂ŁA";
			mes "�H�ׂ����Ē����܂����B";
			next;
			cutin "v_breid06",2;
			mes "[�u���C�h]";
			break;
		}
		mes "�J�J�I�̓`���R���[�g�̌����Ȃ񂾁B";
		mes "�m��Ȃ������H";
		next;
		cutin "v_breid02",2;
		mes "[�u���C�h]";
		mes "��������A�`���R���[�g����D����";
		mes "�c����������ȁB�Ȃ񂩎v���o������A";
		mes "�v���Ԃ�ɉ�����Ȃ����ȁB";
		mes "�Ƃɂ����A�z�B���肪�Ƃ��B";
		next;
		mes "^4A4A4A-���Ȃ��ɑ΂���u���C�h�̐e���x��";
		mes "�㏸���܂���-^000000";
		set QUEST_VALENTINE1,9;
		return;
	}

	function PatternH {	//case9�`16
		switch(getarg(2)) {
		case 1:
			cutin "v_breid01",2;
			mes "[�u���C�h]";
			mes "^4A4AFF" +.name$+ "^000000�Ƃ���";
			mes "���̎q��m��Ȃ����H";
			mes "���Ȃ����ދ����̂��ɐ���܂�";
			mes "�����Ă������q�Ȃ񂾂��B";
			mes "�c�c����A���܂�B����Șb��";
			mes "�������͂Ȃ������񂾂��ȁB";
			return;
		case 2:
		case 3:
			cutin "v_breid01",2;
			if(rand(3)) {
				mes "[�u���C�h]";
				mes "�|�[�V�����s�b�`���[�I";
				misceffect 207,"";
				percentheal 100,0;
				next;
				mes "["+strcharinfo(0)+"]";
				mes "�c�c";
				next;
				mes "[�u���C�h]";
				mes "�c�c�c�c";
				mes "�c�c";
				next;
				mes "[�u���C�h]";
				mes "���`�ɂ��A�ɂ��I�@�ɂȂ񂾂�!!";
				mes "��������ȋΖ����񂴂�Ȃ񂾂�!!";
				return;
			}
			mes "[�u���C�h]";
			mes "���̑O�J�J�I��z�B���Ă�����������A";
			mes "�`���R���[�g�ŗL���ȓX�Ȃ񂾁B";
			mes "���傤�Ǌ��Ԍ���̔����Ă邩��A";
			mes "�L�~����������ǂ������H";
			mes "������Ȃ��Ǝ�ɓ���Ȃ���B";
			next;
			mes "[�u���C�h]";
			mes "�����Δ������J�J�I�̎��v�������A";
			mes "�I�����������!!�@�����ɐ�!!";
			mes "���v�{��!!�@���Ăȁ`�I";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�c�c";
			mes "�Ȃ�قǁA���ꂪ�ړI�ł����c�c";
			next;
			cutin "v_breid05",2;
			mes "[�u���C�h]";
			mes "�c�c�|�[�V�����s�b�`���[�I";
			misceffect 207,"";
			percentheal 100,0;
			next;
			mes "["+strcharinfo(0)+"]";
			mes "���܂����Ȃ�!!";
			set QUEST_VALENTINE1,QUEST_VALENTINE1+1;
			return;
		case 4:
			if(rand(3)) {
				cutin "v_breid05",2;
				mes "[�u���C�h]";
				mes "���낻��A���o�C�g���I��肩�B";
				mes "�ו��̐��������Ȃ��ƂȂ��B";
				next;
				menu "���A�ǂ��ɍs����ł����H",-;
				mes "[�u���C�h]";
				mes "�A���x���^�ɋA��̂��B";
				mes "���낻��{�Ƃɖ߂�Ȃ��ƂˁB";
				mes "�܂��A�v�����e���ɗ������ɂł�";
				mes "���Ƃ����ȁB";
				return;
			}
			cutin "v_breid01",2;
			mes "[�u���C�h]";
			mes "�J�J�I���邩���H";
			mes "�P��300Zeny�I";
			mes "5�Z�b�g�ő����1499Zeny!!";
			next;
			if(select("�΂��Ȃ���k���ˁc�c","���A���x�ق��������Ƃ��ł�")==1) {
				cutin "v_breid05",2;
				mes "[�u���C�h]";
				mes "�c�c�΂��Ȃ���k���āc�c";
				mes "�I���A�����ςȂ��ƌ��������H";
				next;
				mes "["+strcharinfo(0)+"]";
				mes "�l�i������������ł���I";
				mes "�l�i��!!";
				next;
				cutin "v_breid03",2;
				mes "[�u���C�h]";
				mes "�͂��`�A���ꂾ����f�l�́c�c";
				mes "���菤�i�̉��l�𔻂��ĂȂ��ȁH";
				mes "����͂��������ȒP�Ɏ�ɓ���i������";
				mes "�Ȃ��񂾂�!?";
				mes "�������Ȃ��Ɣ���؂�邼�H";
				mes "������Ȃ���A���̓z���������Ⴄ���H";
				next;
				if(select("�N�ɂł����������Ă��ł���c�c","����A�����������Ă�������")==1) {
					cutin "v_breid05",2;
					mes "[�u���C�h]";
					mes "�������A�݂�Ȃɂ����������c�c";
					mes "�c�c�c�c";
					next;
					mes "["+strcharinfo(0)+"]";
					mes "����A������āH";
					mes "�ǂ��Ɍ���̉��l�������ł�!?";
					next;
					cutin "v_breid02",2;
					mes "[�u���C�h]";
					mes "�c�c����႟�c�c";
					mes "�I�������邱�ƂɌ��܂��Ă邾�낤�H";
					return;
				}
			}
			if(Zeny < 1499) {
				cutin "v_breid03",2;
				mes "[�u���C�h]";
				mes "��c�cZeny������Ȃ��݂������ˁB";
				mes "�������ǁA�l�������邱�Ƃ�";
				mes "�ł��Ȃ��񂾁B";
				return;
			}
			cutin "v_breid02",2;
			mes "[�u���C�h]";
			mes "���x���I";
			mes "������Č��t�ɁA�݂�Ȏア��ȁI";
			set Zeny,Zeny-1499;
			getitem 7182,5;
			set QUEST_VALENTINE1,QUEST_VALENTINE1+1;
			return;
		}
	}

	function PatternI {	//case17
		if(rand(3)==0) {
			cutin "v_breid05",2;
			mes "[�u���C�h]";
			mes "�I�}�G�A�`���R���[�g�͍D�����H";
			next;
			if(select("�����A��D���ł�","�����A���܂�c�c")==1) {
				if(Sex==0) {
					//�������H
				}
				cutin "v_breid02",2;
				mes "[�u���C�h]";
				mes "�������c�c����Ȃ�A";
				mes "�v�����e���쐼�̎���ɂ���A";
				mes "�A����=�I�����A���ɉ�Ƃ����B";
				mes "�������A�`���R���[�g��";
				mes "�����Ă�����B";
				next;
				mes "[�u���C�h]";
				mes "���l������Ȃ�A";
				mes "��v���[���g���Ă�������ǂ����H";
			}
			else if(Sex==0) {
				cutin "v_breid05",2;
				mes "[�u���C�h]";
				mes "�������c�c�c�c";
				mes "���ꂾ������A����͗F�B�ɂł�";
				mes "�����Ă���B";
				next;
				mes "[�u���C�h]";
				mes "�ׁA�ʂɁA�����Ӗ���������";
				mes "�����悤�Ƃ����킯����Ȃ������!?";
				mes "�`���R���[�g�̓X������Ă�F�B����";
				mes "���܂��܈�����������A";
				mes "�����L�~���D���Ȃ炠���悤���ȁ`��";
				mes "�v�����������I";
				getitem 559,1;
			}
			else {
				cutin "v_breid05",2;
				mes "[�u���C�h]";
				mes "�������c�c���܂ɐH�ׂ��";
				mes "���\���܂����񂾂�B";
				mes "�n���Ă���Ǝ肪�ׂ����̂��A";
				mes "������ƋC�ɂȂ邪�ȁB";
				next;
				mes "[�u���C�h]";
				mes "����ɁA�l�ɑ���ɂ͍œK�̕i�����B";
				mes "�`���R���[�g�Ȃ�A���̐l��";
				mes "���ł���邩��ȁB";
				next;
				mes "[�u���C�h]";
				mes "�����v���[���g���鑊�肪����Ȃ�A";
				mes "�v�����e���쐼�̎���ɂ���";
				mes "�A����=�I�����A���ɉ�Ƃ����B";
				mes "�ނ��`���R���[�g�𔄂��Ă�����B";
				set QUEST_VALENTINE1_FLAG,1;
			}
			set QUEST_VALENTINE1,18;
			return;
		}
	}

	function PatternJ {	//case18
		cutin "v_breid01",2;
		mes "[�u���C�h]";
		mes "�v�����e���̓쐼�̎���ɂ���";
		mes "�A����=�I�����A�����ēz���A";
		mes "�`���R���[�g�𔄂��Ă���B";
		next;
		mes "[�u���C�h]";
		mes "�����������Ȃ�����A�L�~��";
		mes "�����Ă����Ƃ�����B";
		return;
	}

	function PatternK {	//case19
		cutin "v_breid01",2;
		mes "[�u���C�h]";
		mes "�ǂ����c�c�H";
		mes "���̃`���R���[�g�͔����������낤�H";
		if(Sex==0) {
			mes "�I�����L�~�ɂ��Ă������邱�Ƃ́A";
			mes "���ꂭ�炢�����Ȃ�����Ȃ��B";
		}
		else {
			mes "���ЁA�K�[���t�����h�ɂ�";
			mes "�v���[���g���Ă�����Ƃ����B";
		}
		next;
		if(QUEST_VALENTINE1_FLAG==1) {
			mes "[�u���C�h]";
			mes "�Z���Ԃ��������A�������F�X��";
			mes "�b������ɂȂ��Ă���Ă��肪�Ƃ��B";
			mes "�c�O�����A�����̋��ɖ߂�Ȃ�����ȁB";
			mes "�y����������B";
			mes "����́A�I������ʂ�̃v���[���g���B";
			mes "�e�����l�ɂ�����Ƃ����B";
			getitem 573,1;
			set QUEST_VALENTINE1_FLAG,0;
		}
		else {
			mes "[�u���C�h]";
			mes "�c�c";
			mes "�v�����e���ŃL�~�Əo������ƁA";
			mes "�Y��Ȃ���c�c";
		}
		set QUEST_VALENTINE1,20;
		return;
	}

	function PatternL {	//case20
		cutin "v_breid01",2;
		mes "[�u���C�h]";
		mes "���������a���c�c�ُ�Ȃ��I";
		mes "���[���~�b�h�K�b�c�����I";
		mes "����!!";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�C���������Ă܂��ˁB";
		next;
		cutin "v_breid02",2;
		mes "[�u���C�h]";
		mes "����c�c���̒��A�������N���邩";
		mes "�킩��Ȃ�����H";
		mes "������A�����ꐶ���������Ȃ���ȁA";
		mes "�Ǝv���ĂˁB";
		return;
	}
}

prontera,0,0,0	script	V_BreidTimer	-1,{
	end;
OnTimer180000:
	set callfunc("ValentineBreid",0),0;	//�����l�����A�^�b�`�h�~���b�N����
	end;
}

// �u���C�h 2�`4�� 15�`17��
prt_fild05,360,252,3	script	�u���C�h#Valentine1	733,{
	if(gettime(3)>= 2 && gettime(3)< 4) callfunc "ValentineBreid",1,2,1,3;
	if(gettime(3)>=15 && gettime(3)<17) callfunc "ValentineBreid",1,1,3,1;
	end;
OnInit:
	hideonnpc;
	if((gettime(3)>=2 && gettime(3)<4) || (gettime(3)>=15 && gettime(3)<17))
		hideoffnpc;
	end;
OnClock0205:
OnClock1505:
	hideoffnpc;
	end;
OnHour04:
OnHour17:
	hideonnpc;
	end;
}

// �u���C�h 4�`7�� 17�`19��
prt_fild08,162,367,5	script	�u���C�h#Valentine2	733,{
	if(gettime(3)>= 4 && gettime(3)< 7) callfunc "ValentineBreid",2,2,1,3;
	if(gettime(3)>=17 && gettime(3)<19) callfunc "ValentineBreid",2,1,3,2;
	end;
OnInit:
	hideonnpc;
	if((gettime(3)>=4 && gettime(3)<7) || (gettime(3)>=17 && gettime(3)<19))
		hideoffnpc;
	end;
OnClock0405:
OnClock1705:
	hideoffnpc;
	end;
OnHour07:
OnHour19:
	hideonnpc;
	end;
}

// �u���C�h 8�`10�� 21�`23��
prontera,116,69,3	script	�u���C�h#Valentine3	733,{
	if(gettime(3)>= 8 && gettime(3)<10) callfunc "ValentineBreid",3,1,2,1;
	if(gettime(3)>=21 && gettime(3)<23) callfunc "ValentineBreid",3,2,2,1;
	end;
OnInit:
	hideonnpc;
	if((gettime(3)>=8 && gettime(3)<10) || (gettime(3)>=21 && gettime(3)<23))
		hideoffnpc;
	end;
OnClock0805:
OnClock2105:
	hideoffnpc;
	end;
OnHour10:
OnHour23:
	hideonnpc;
	end;
}

// �u���C�h 12�`15��
prontera,58,70,3	script	�u���C�h#Valentine4	733,{
	callfunc "ValentineBreid",4,1,4,1;
	end;
OnInit:
	if(gettime(3)<12 || gettime(3)>=15)
		hideonnpc;
	end;
OnClock1205:
	hideoffnpc;
	end;
OnHour15:
	hideonnpc;
	end;
}


//==============================================================
// �X�v���L
//	 2�` 4��	����		�N�G�X�g��	���O���ꁛ
//	 4�` 6��	���M		�N�G�X�g��	���O���ꁛ
//	 7�` 9��	���		�N�G�X�g��	���O���ꁛ
//	 9�`11��	����		�N�G�X�g�~	���O����~
//	11�`13��	����		�N�G�X�g��	���O���ꁛ
//	13�`15��	��峁i�N���Z�j	�N�G�X�g�~	���O����~
//	15�`17��	���M		�N�G�X�g��	���O���ꁛ
//	17�`19��	�x�e		�N�G�X�g�~	���O���ꁛ
//	19�`21��	�S��		�N�G�X�g�~	���O����~
//	21�`23��	���		�N�G�X�g��	���O���ꁛ
// Function
//	getarg(0)	�ŏ��̉�b���e
//		0=���b�N�̎Q�Ɠn����p
//		1=��	2=��	3=�d��	4=�Œ�	5=�Ŗ�	6=����
//	getarg(1)	�r���̃C�x���g���e
//		1=����	2=���M	3=���	4=����	5=���2	6=�x�e	7=�S��
//	getarg(2)	�N�G�X�g��
//		1=�\	2=�s��	3=�r���܂ŉ�	4=���O����̂݉�
//--------------------------------------------------------------

function	script	ValentineSprakki	{
	if(getarg(0)==0)
		return .flag;	//�l��n���ďI��
	if((Weight*100/MaxWeight) >= 90) {
		mes "�����A�C�e���̏d�ʂ���������";
		mes "�A�C�e�����󂯂Ƃ邱�Ƃ��ł��܂���-";
		mes "-�����A�C�e�������炵�Ă���A�ēx";
		mes "�b�������Ă�������-";
		close;
	}
	if(.flag) {	//�����l�����A�^�b�`�h�~
		mes "-�Z��������-";
		mes "-�����҂��Ă���A�܂������|���悤-";
		close;
	}
	set .flag,1;
	initnpctimer "V_SprakkiTimer";
	switch(QUEST_VALENTINE2) {
		case 0:
			function PatternA;
			PatternA getarg(0);
			break;
		default:
			function PatternB;
			PatternB getarg(0),getarg(1);
			break;
		case 10:
			function PatternC;
			PatternC 0,0,getarg(2);
			break;
		case 11:
			function PatternD;
			PatternD;
			break;
		case 12:
			function PatternE;
			PatternE;
			break;
		case 13:
			function PatternF;
			PatternF 0,0,getarg(2);
			break;
		case 14:
			function PatternG;
			PatternG;
			break;
		case 15:
			function PatternH;
			PatternH;
			break;
		case 16:
			function PatternI;
			PatternI 0,0,getarg(2);
			break;
	}
	set .flag,0;
	close2;
	cutin "dummy",255;
	return;

	function PatternA {	//case0
		switch(getarg(0)) {
		default:
			cutin "v_sprakki01",2;
			mes "[�X�v���L]";
			mes "���̂��p�ł����H";
			mes "���Ȃ������̂悤��";
			mes "����œ����Ă�����ł��傤���H";
			next;
			if(select("�����ł�","����A�Ⴂ�܂�")==1) {
				mes "[�X�v���L]";
				mes "�킟�A�������I";
				mes "���͂�����ɗ��Ă���܂��Ԃ��Ȃ��āA";
				mes "�m�荇�������Ȃ������̂ł���";
				mes "�����ꏊ�œ����Ă���Ȃ�";
				mes "�悭����Ƃ�����܂���ˁH";
				next;
				mes "[�X�v���L]";
				mes "���Ȃ��͎��";
				mes "�ǂ��ł��d�����Ȃ����Ă��ł����H";
				mes "���͊Ō쏫�Z�l�̕⏕��";
				mes "�N���Z�C�_�[�E�����̒S����";
				mes "���Ă����ł��B";
				next;
				mes "[�X�v���L]";
				mes "���A�����吹���ɍs������";
				mes "�󂯂Ă����ł����A";
				mes "�ꏏ�ɂ�������Ⴂ�܂��񂩁H";
				next;
				if(select("�c�c�{���͓����Ă��܂���","�i���̂܂܂ł͎��E�����Ȃ������j")==2) {
					mes "["+strcharinfo(0)+"]";
					mes "�i�����l�����ɓ�������R�������̂�";
					mes "�@�΂�Ă��܂��c�c�B";
					mes "�@�����͑傰���Ɍ떂������";
					mes "�@���̏�𗣂�悤�B�j";
					next;
					cutin "v_sprakki05",2;
					mes "["+strcharinfo(0)+"]";
					mes "�������������Ƃ͑S�ĖY��Ă��������I";
					mes "���͂͂́c�c";
					mes "�ł́A�Z�����̂ł���Ŏ���I";
					return;
				}
			}
			mes "[�X�v���L]";
			mes "����A�ł͉����Ȃ����Ă�����ł����H";
			mes "�����̂��q�l�H�@�����̒ʂ肷����H";
			mes "��������Ȃ���΁c�c�h�q?!";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "����Ȃ킯�Ȃ��ł�!!!!";
			next;
			mes "[�X�v���L]";
			mes "���́A����Ȃ킯�Ȃ��̂������Ă�";
			mes "�����܂����B";
			mes "�{���Ɏh�q��������A";
			mes "�܂����̎��͂�ł�ł��傤�ˁB";
			break;
		case 4:
		case 5:
			cutin "v_sprakki05",2;
			mes "[�X�v���L]";
			mes "����A�O���̕��c�c";
			if(getarg(0)==4)
				mes "������Ō쎺�ɂ���������Ȃ�āA";
			else {
				mes "����Ȗ邨�����c�c�Ō쎺��";
				mes "����������Ȃ�āA";
			}
			mes "�������p�ł����H";
			next;
			if(select("���ł��Ȃ��ł�","�ɂ��Ă��܂�܂���")==1) {
				cutin "v_sprakki01",2;
				mes "[�X�v���L]";
				mes "�����ł����B";
				mes "�����C�Ȃ̂͗ǂ����Ƃł��B";
				if(getarg(0)==4) {
					mes "��ӂ͂悭�Q��܂������H";
					mes "������������܂������H";
				}
				else
					mes "���́A�������x�݂̎��ԂȂ̂ł���c�c";
				break;
			}
			mes "[�X�v���L]";
			mes "�ɂ��̂ł����H�@�������H";
			mes "�ǂ����ɂ���ł��H";
			mes "���A�����Ɓc�c�܂��͎��Í܂��c�c";
			next;
			misceffect 207,"";
			percentheal 100,0;
			mes "[�X�v���L]";
			mes "�����A����Ȃ�!?";
			mes "�Ђǂ����c�c";
			mes "����A�����Ɠ������Ă܂����H";
			next;
			mes "[�X�v���L]";
			mes "�ǂ��ł����H";
			mes "�܂��ɂ݂܂����c�c�H";
			mes "���߂�Ȃ����c�c";
			mes "���A�܂����n�҂ł�����";
			mes "�܂Ƃ��ɂ���������Ȃ���ł��c�c";
			next;
			if(select("���肪�Ƃ��I�@���C�ɂȂ�܂���","�ɂ��I�@�Ђǂ����Â��I")==1) {
				cutin "v_sprakki02",2;
				mes "[�X�v���L]";
				mes "�ǂ������c�c�I";
				mes "�s����Ȃ��̂ł�������";
				mes "�S�z��������ł��B";
				break;
			}
			mes "[�X�v���L]";
			mes "������I�@�т����肵���c�c";
			mes "����Ȃɋ��΂Ȃ��Ă�";
			mes "��������Ȃ��ł����B";
			mes "�ꐶ��������΂����̂Ɂc�c";
			mes "���߂�Ȃ����c�c���n�҂Łc�c";
			next;
			cutin "v_sprakki01",2;
			mes "[�X�v���L]";
			mes "���x�́A�����Ƃ���Ă݂��܂��B";
			mes "�ł��c�c����ȕ���";
			mes "�l�̐��ӂ𖳎����Ă����Ƌ��Ԃ̂�";
			mes "����ł���H";
			next;
			mes "[�X�v���L]";
			mes "����Ȃ�����Ƃ����ꌾ�ł�";
			mes "�����Ă��܂��l������";
			mes "�����ł�����c�c";
			mes "�܂��A���͕��C�ł����ǂˁB";
			break;
		case 6:
			mes "�����ƂĂ��^����";
			mes "���F������Ă���悤���B";
			next;
			if(select("�������F�肵�Ă����ł����H","�ז����Ȃ��ł�����")==2) {
				mes "-�b��������̂��~�߂�-";
				return;
			}
			cutin "v_sprakki05",2;
			mes "[�X�v���L]";
			mes "������c�c";
			next;
			mes "[�X�v���L]";
			mes "�c�c�����ł͐Â��ɂ��Ȃ���";
			mes "�ʖڂł���c�c�B";
			next;
			cutin "v_sprakki01",2;
			mes "[�X�v���L]";
			mes "�����H";
			mes "�����������F�肵�Ă�����";
			mes "�m�肽���̂ł����H";
			mes "���͐��E�̕��a�����F�肵�Ă��܂����B";
			mes "���Ȃ��͉������F������܂������H";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�c�c";
			mes "���́c�c";
			next;
			input .@mes$;
			mes "["+strcharinfo(0)+"]";
			mes "�c�c";
			mes "���́c�c";
			mes "^4A4AFF" +.@mes$+ "^000000��";
			mes "���F�肵�܂���!!";
			next;
			mes "[�X�v���L]";
			mes .@mes$+ "�ł����c�c";
			mes "�_�͂�������������ł��傤���H";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "���E���a���͎����������ł���H";
			next;
			cutin "v_sprakki02",2;
			mes "[�X�v���L]";
			mes "�ӂӂ��A����͏�k�ł���B";
			mes "���͐��E�̕��a�͋F���Ă܂���B";
			next;
			mes "^4A4AFF-�c�c�Ɣޏ��͏����ł���������";
			mes "����o���Ĕ��΂�-^000000";
			next;
			mes "[�X�v���L]";
			mes "���́c�c��낵�����";
			mes "����֗V�тɂ��Ă���܂��񂩁H";
			mes "����ł͎G������`���Ă��܂�����";
			mes "�܂����v�����e���ɗ���邩";
			mes "����܂��񂵁c�c";
			next;
			mes "[�X�v���L]";
			mes "����ł̒m�荇����";
			mes "�Ō쏫�Z�l�A�N���Z�C�_�[�̕��X�A";
			mes "�����̏C�����l�Ɛ_���l�����ł���";
			mes "�F����A�ƂĂ��Z�������ł��c�c�B";
			next;
			mes "[�X�v���L]";
			mes "����Ǝ��͒��̂��F�莞�Ԃɂ���";
			mes "�O�o���邱�Ƃ��ł��܂���B";
			next;
			if(select("���ł��V�тɍs���܂���I","����Ȃ���͂Ȃ�")==2) {
				cutin "v_sprakki03",2;
				mes "[�X�v���L]";
				mes "�����ł���ˁc�c";
				mes "����ς菉�ʂ̕���";
				mes "����Ȃ��肢������̂�";
				mes "����ł���ˁc�c�B";
				return;
			}
			mes "[�X�v���L]";
			mes "�{���ł���!? �������I";
			mes strcharinfo(0)+ "����A�ł��ˁH";
			mes "�����Ɖ����Ă����܂��B";
			mes "���ƗF�B�ɂȂ��Ă��������I";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�Ƃ���Ŗ{���̂��F��͉��������́H";
			next;
			mes "[�X�v���L]";
			mes "���`��c�c�閧�ł��B";
			mes "�ł��A�_�͂������̊肢��";
			mes "��������Ă��ꂽ�悤�ł��B";
			next;
			mes "^4A4AFF-���Ȃ��ɑ΂���X�v���L�̍D���x��";
			mes "�㏸���܂���-^000000";
			if(.name$=="" || rand(3)==0)
				set .name$,strcharinfo(0);
			set QUEST_VALENTINE2,1;
			return;
		}
		//6�ȊO�̑���
		mes "^4A4AFF-�ޏ��́A�킸���ɔ��΂��";
		mes "�ӂ�����񂵂�-^000000";
		next;
		mes "[�X�v���L]";
		mes "���́c�c��낵�����";
		mes "�܂��V�тɗ��Ă���܂��񂩁H";
		mes "���������ł���`�������Ă��܂�����";
		mes "���Ă���������Ɗ������ł��B";
		next;
		mes "[�X�v���L]";
		mes "���̒m�荇���Ƃ����΁A";
		mes "�Ō쏫�Z�l��N���Z�C�_�[�̕��X�A";
		mes "����ɑ吹���̐_���l��C�����l";
		mes "�����Ȃ̂ł����c�c";
		next;
		mes "[�X�v���L]";
		mes "�F����A���i�͖Z�����āc�c";
		next;
		if(select("�ł́A���Ԃ������ėV�тɗ��܂���","���߂�Ȃ����A�Z�����̂Łc�c")==2) {
			cutin "v_sprakki03",2;
			mes "[�X�v���L]";
			mes "�����ł����A�c�O�ł��B";
			mes "�ǂ��F�B�ɂȂ��Ǝv�����̂Ɂc�c";
			next;
			switch(getarg(0)) {
			case 1:
				mes "[�X�v���L]";
				mes "���A���Ă��܂����̂�";
				mes "������Ƌx�܂Ȃ��Ɓc�c";
				mes "�����o�čs���Ă��������B";
				return;
			case 2:
			case 5:
				mes "[�X�v���L]";
				mes "���������������|�����āA��ςł����B";
				mes "���Ă��܂��̂ŁA���ꂩ��x�݂܂��B";
				mes "�����o�čs���Ă��炦�܂����H";
				return;
			case 3:
				mes "[�X�v���L]";
				mes "���͍����Ă���d����";
				mes "�S�����Ȃ���΂Ȃ�Ȃ��̂�";
				mes "�������A�肭�������܂����H";
				return;
			case 4:
				mes "[�X�v���L]";
				mes "���낻��A�Ō쏫�Z�l��";
				mes "����{���ɗ��܂��B";
				mes "�����o�čs���Ă��������܂����H";
				return;
			}
			return;
		}
		cutin "v_sprakki02",2;
		mes "[�X�v���L]";
		mes "�{���ł���!? �������I";
		mes strcharinfo(0)+ "����A�ł��ˁH";
		mes "���̗F�B�ɂȂ��Ă��������I";
		next;
		switch(getarg(0)) {
		case 2:
			mes "[�X�v���L]";
			mes "���������������|�����āA��ςł����B";
			mes "���Ă��܂��̂ŁA���ꂩ��x�݂܂��B";
			next;
			mes "[�X�v���L]";
			mes "�܂��V�тɗ��Ă��������ˁB";
			mes "����������Ȃ��Ă��܂����̂ŁA";
			mes "������薰��܂��B";
			break;
		case 4:
			mes "[�X�v���L]";
			mes "���A�������B";
			mes "�ׂ̕����̊Ō쏫�Z�l��";
			mes "�C�Â��O�ɂ����𗣂�ĉ������B";
			mes "�{��Ɩ{���ɕ|���l�Ȃ�ł��I";
			next;
			mes "[�X�v���L]";
			mes "��قǁA�ߌ�ɂł�";
			mes "�V�тɗ��Ă��������ˁB";
			break;
		default:
			mes "[�X�v���L]";
			mes "�܂��V�тɗ��Ă��������ˁB";
			break;
		}
		next;
		mes "^4A4AFF-���Ȃ��ɑ΂���X�v���L�̍D���x��";
		mes "�㏸���܂���-^000000";
		if(.name$=="" || rand(3)==0)
			set .name$,strcharinfo(0);
		set QUEST_VALENTINE2,1;
		return;
	}

	function PatternB {	//case1�`9
		switch(getarg(1)) {
		case 1:
			if(rand(3)==0) {
				cutin "v_sprakki01",2;
				mes "[�X�v���L]";
				mes "���A" +strcharinfo(0)+ "����I";
				mes "���������Ă܂��񂩁H";
				mes "�����Ă�����A";
				mes "�����Ă������������̂ł����c�c";
				next;
				if(countitem(523)) {
					if(select("����܂���","���͎����Ă܂���")==1) {
						mes "["+strcharinfo(0)+"]";
						mes "�����Ă܂���B�ǂ����B";
						mes "���Ɏg����ł����H";
						next;
						mes "[�X�v���L]";
						mes "���Ă��������A���̐A���B";
						mes "�t�͌͂�A���͈ނтĂ��܂��āc�c";
						mes "���������Ă��A�����Ɋ�����";
						mes "���܂���ł��B";
						next;
						mes "[�X�v���L]";
						mes "�h�{���_�Ȑ�����������΁A";
						mes "���C�ɂȂ��Ă����Ǝv����ł��B";
						next;
						delitem 523,1;
						cutin "v_sprakki02",2;
						mes "[�X�v���L]";
						mes "�ǂ������肪�Ƃ��B";
						next;
						mes "^4A4AFF-���Ȃ��ɑ΂���X�v���L�̍D���x��";
						mes "�㏸���܂���-^000000";
						set QUEST_VALENTINE2,QUEST_VALENTINE2+1;
						return;
					}
				}
				mes "["+strcharinfo(0)+"]";
				mes "���͎����ĂȂ���ł��B";
				next;
				mes "[�X�v���L]";
				mes "�����ł����c�c�c�O�ł��B";
				mes "�����A�����Ɋ���Ė���Ă��Ȃ���c�c";
				next;
				mes "["+strcharinfo(0)+"]";
				mes "���̐������K�v�Ȃ�ł����H";
				next;
				cutin "v_sprakki03",2;
				mes "[�X�v���L]";
				mes "���Ă��������A���̐A���B";
				mes "�t�͌͂�A���͈ނтĂ��܂��āc�c";
				mes "���������Ă��A�����Ɋ�����";
				mes "���܂���ł��B";
				next;
				mes "[�X�v���L]";
				mes "�h�{���_�Ȑ�����������΁A";
				mes "���C�ɂȂ�Ǝv������ł����c�c";
				return;
			}
			if(getarg(0)==1) {
				cutin "v_sprakki01",2;
				mes "[�X�v���L]";
				mes "���傤�ǂ������������Ԃł��傤�H";
				mes "����������������������ł�����";
				mes "��������ł����ꏏ�������ł��ˁ`";
				next;
				mes "[�X�v���L]";
				mes "����Ȏ��͂Ȃ�ƂȂ�";
				mes "�H�׎c���Ă������N�b�L�[��";
				mes "�ЂƐ؂ꂵ���Ȃ��̂�";
				mes "�ɂ����ł��ˁc�c";
				next;
				if(countitem(538)) {
					if(select("�N�b�L�[��n��","�����ł���")==1) {
						mes "[�X�v���L]";
						mes "����A�����";
						mes "�悭�Ă����N�b�L�[�ł��ˁH";
						mes "����`��";
						if(Sex==0) {
							mes "����ς蓯�����̎q���m";
							mes "�ʂ���Ƃ��낪�����ł��傤���`";
						}
						next;
						cutin "v_sprakki02",2;
						mes "[�X�v���L]";
						mes "�N�b�L�[�ɍ��������ł��o���܂��ˁB";
						mes "�Ԃǂ��`�Ƀn�[�u����ꂽ�����ł��B";
						mes "�u�h�E�W���[�X�Ƃ��܂�";
						mes "�ς��܂��񂯂ǂˁB";
						next;
						mes "^4A4AFF-�X�v���L�������o����";
						mes "�����ȓ����݂ɂ́A�Y��ȔZ��";
						mes "���F�̃n�[�u�e�B�[��";
						mes "������Ă���-^000000";
						next;
						mes "^4A4AFF-�u�h�E���L�̂��_���ς�";
						mes "���肪�@�o����������-";
						mes "-������ނƌ��̒������ς���";
						mes "�Î_���ς����肪�L����-^000000";
						percentheal 100,0;
						misceffect 83,"";
						delitem 538,1;
						return;
					}
				}
				mes "[�X�v���L]";
				mes "���������͂܂Ƃ��ɗ�����";
				mes "�ł���΁A������������";
				mes "���������Ă������ł����ǁc�c";
				mes "�Ȃ��Ȃ����܂��ł��Ȃ��ł��ˁB";
				return;
			}
			if(getarg(0)==2) {
				cutin "v_sprakki02",2;
				mes "[�X�v���L]";
				mes "���������������������̂ł�����A";
				mes "�����ł�����ł��������B";
				mes "���ɂ��܂����H";
				next;
				switch(select("�O���[�v�n�[�u�e�B�[","�E�b�h�e�B�[","�~�b�N�X�n�[�u�e�B�[","���\�ł�")) {
				case 1:
					mes "[�X�v���L]";
					mes "�u�h�E�`�Ƀn�[�u����ꂽ�����ł��B";
					mes "�u�h�E�W���[�X�Ƃ��܂�";
					mes "�ς��܂��񂯂ǂˁB";
					next;
					mes "^4A4AFF-�X�v���L�������o����";
					mes "�����ȓ����݂ɂ́A�Y��ȔZ��";
					mes "���F�̃n�[�u�e�B�[��";
					mes "������Ă���-^000000";
					next;
					mes "^4A4AFF-�u�h�E���L�̂��_���ς�";
					mes "���肪�@�o����������-";
					mes "-������ނƌ��̒������ς���";
					mes "�Î_���ς����肪�L����-^000000";
					misceffect 83,"";
					return;
				case 2:
					mes "[�X�v���L]";
					mes "�؂̍�������������ł��ˁB";
					mes "�t�t�c�c�ӊO�ł��ˁB";
					mes "�E�b�h�e�B�[�͎�ɂ��N���̕���";
					mes "�D��ň��ނ��̂ł�����ˁB";
					next;
					mes "[�X�v���L]";
					mes "�t�F�C�����ł͖؂̍������₷���̂ŁA";
					mes "���N���̕����悭����ł܂�����B";
					mes "�E�B���[����̂ꂽ�؂̍���";
					mes "�G���_�[�E�B���[����̂ꂽ�؂̍��ł�";
					mes "�����Ⴄ�炵���ł��ˁB";
					next;
					mes "[�X�v���L]";
					mes "���ɂ͂����ς�킩��܂��񂪁c�c";
					mes "���Ȃ��͈Ⴂ���킩���ł����H";
					mes "�t�t�c�c�o���܂����B";
					mes "�����A�ǂ����B";
					next;
					mes "^4A4AFF-�ޏ��������o�����J�b�v�ɂ�";
					mes "���F�̉t�̂��g�X�ƒ�����Ă���";
					mes "�ٗl�ȍ���𔭂��Ă���-^000000";
					next;
					mes "["+strcharinfo(0)+"]";
					mes "������A�ȁA��������!!";
					mes "���������ꂢ!!�@����Ɂc�c";
					mes "�₽��ƃh���h�����ĂċC��������!!";
					misceffect 118,"";
					next;
					cutin "v_sprakki05",255;
					mes "[�X�v���L]";
					mes "���c�c���񂾂��ƂȂ������̂ł����H";
					mes "�E�b�h�e�B�[�͂����������̂ł���H";
					mes "�����A�ǂ����Ē���������ł���!!";
					return;
				case 3:
					cutin "v_sprakki01",2;
					mes "[�X�v���L]";
					mes "����ނ��̃n�[�u���������킹���A";
					mes "�~�b�N�X�n�[�u�e�B�[�ł��ˁB";
					mes "���肪���̐��������ł���B";
					next;
					mes "[�X�v���L]";
					mes "���́c�c";
					mes "����ł݂�΂킩��܂��c�c";
					next;
					mes "^4A4AFF-�ޏ��������o�����J�b�v�ɂ�";
					mes "�s���N�F�̉t�̂��g�X�ƒ�����Ă���";
					mes "�Ԃ��t���ꖇ�Y���Ă���-";
					mes "-�����āA��ῂ������";
					mes "����ȍ��������Ă���-^000000";
					next;
					mes "^4A4AFF-���́c�c-^000000";
					next;
					mes "[�X�v���L]";
					mes "�������Ɓc�c�\�������΁A";
					mes "���z�𕷂��K�v�͂Ȃ������ł��ˁc�c";
					mes "����͍�����y���ވ��ݕ��ł��ˁB";
					mes "����ȃn�[�u�̍�����������z���ƁA";
					mes "�����������肷���ł���B";
					misceffect 14,"";
					return;
				case 4:
					cutin "v_sprakki01",2;
					mes "[�X�v���L]";
					mes "�����ł����c�c�c�O�ł��B";
					return;
				}
			}
		case 2:
			if(rand(3)==0) {
				cutin "v_sprakki03",2;
				mes "[�X�v���L]";
				mes "�������c�c!!";
				mes "��������c�c�����āA";
				mes "�ǂ����Ă����h�W�Ȃ񂾂낤�c�c";
				next;
				menu "�ǂ�������ł����H",-;
				mes "[�X�v���L]";
				mes "���ꂪ�c�c";
				mes "�e�[�u����@���Ă����̂ł����A";
				mes "��������f�U�[�g�p�̂��M�𗎂Ƃ���";
				mes "�����Ă��܂����̂ł��c�c";
				next;
				mes "[�X�v���L]";
				mes "�͂��c�c����������ُ����Ȃ����";
				mes "�����Ȃ��ł��ˁc�c";
				mes "���A�܂������������M������΁A";
				mes "����ł��������ȁB";
				mes "����Ȃ��Ƃ𕷂��̂��ςł����A";
				mes "����Ɠ������M�A�����Ă܂��񂩁c�c�H";
				next;
				if(countitem(736)) {
					if(select("���M�����������Ǝv���܂��H","�����Ă��܂��B�����܂���")==2) {
						cutin "v_sprakki05",2;
						mes "[�X�v���L]";
						mes "��!?";
						mes "�������M�����������Ă�l�Ȃ�āA";
						mes "����킯�c�c";
						mes "���c�c���炩���Ă��ł��˂�!?";
						next;
						mes "[�X�v���L]";
						mes "^4A4AFF-�����甒���M�����o���A";
						mes "�ޏ��̑O�ɒu����-";
						mes "-���M�̕\�ʂ��L�����ƌ�����-^000000";
						next;
						mes "[�X�v���L]";
						mes "������!!�@�{���ɂ��M�������Ă�I";
						mes "����Ɂc�c";
						mes "�������������M�Ƃ�������!!";
						mes "����A�{���Ɏ��ɂ�������̂ł����H";
						next;
						delitem 736,1;
						cutin "v_sprakki02",2;
						mes "[�X�v���L]";
						mes "���肪�Ƃ��I";
						mes "���Ȃ��݂����ɗD�����l�́A";
						mes "���E�Ɉ�l�������Ȃ��ł��ˁI";
						next;
						mes "^4A4AFF-���Ȃ��ɑ΂���X�v���L�̍D���x��";
						mes "�㏸���܂���-^000000";
						set QUEST_VALENTINE2,QUEST_VALENTINE2+1;
						return;
					}
				}
				else {
					mes "["+strcharinfo(0)+"]";
					mes "�������ɂ��M�͎����Ă܂���ˁc�c";
					next;
				}
				mes "[�X�v���L]";
				mes "�ł���ˁc�c";
				mes "�������M�����������Ă�l�Ȃ�āA";
				mes "���܂����˂��c�c";
				mes "����ς�A��ŗ������Ɏӂ���";
				mes "�����Ȃ���_���ł��ˁB";
				next;
				mes "[�X�v���L]";
				mes "�͂��A�����ƐT�܂����s�����Ȃ���c�c";
				return;
			}
			if(getarg(0)==1) {
				cutin "v_sprakki01",2;
				mes "[�X�v���L]";
				mes "������ƐH���͐ۂ��Ă܂����H";
				mes "�d����`���������ł����ǁA";
				mes "���N����ԑ�؂ł���B";
				next;
				mes "[�X�v���L]";
				mes "�H��́A�y���U������Ɨǂ��ł���B";
				mes "�������̂���Șb������̂�����";
				mes "�炵�Ă܂��ˁc�c";
				next;
				cutin "v_sprakki02",2;
				mes "[�X�v���L]";
				mes "���͎��A���ꂩ��H��������";
				mes "�Ƃ���Ȃ̂ł��c�c";
				next;
				if(select("�����ꏏ�ɐH�ׂ����ł�","���A���炵�܂����B")==1) {
					cutin "v_sprakki03",2;
					mes "[�X�v���L]";
					mes "���c�c";
					mes "���O�҂̕��ƐH��������ƁA";
					mes "�������ɓ{���Ă��܂��܂��̂Łc�c";
					mes "���߂�Ȃ����B";
					next;
					mes "["+strcharinfo(0)+"]";
					mes "�����ł����A�c�O�ł��B";
					mes "�H���̎ז������Ⴂ�܂����ˁB";
					mes "���炵�܂��ˁB";
					mes "�����c�c�ǂ��ŉ���H�ׂ悤���ȁc�c";
					return;
				}
				mes "[�X�v���L]";
				mes "�t�t�c�c���߂�Ȃ����ˁA";
				mes "�C�����킹������āB";
				mes "�܂���ł����Ă�������΁A";
				mes "�����ł����y�����܂��ˁB";
				return;
			}
			if(getarg(0)==2) {
				cutin "v_sprakki01",2;
				mes "[�X�v���L]";
				mes "���̎��Ԃ͐Â��ŗǂ��ł��ˁB";
				mes "�܂�������Ƒ̂����邢����ǁA";
				mes "�p�͂ǂ�Ȉ���ɂȂ邩�Ȃ��`����";
				mes "�F�X�l�����ł��B";
				next;
				mes "[�X�v���L]";
				mes strcharinfo(0)+ "����́A";
				mes "�ǂ����Ă���Ȏ��Ԃ�";
				mes "����K�˂ė�����ł����H";
				next;
				if(select("�����ދ��Łc�c","�d���̂��łɗ����������ł�")==1) {
					cutin "v_sprakki02",2;
					mes "[�X�v���L]";
					mes "�����A���ċx�񂾂�ǂ��ł����H";
					mes "�łȂ��ƁA�̂������܂����H";
					return;
				}
				mes "[�X�v���L]";
				mes "���d���A��ςȂ�ł��ˁc�c";
				mes "�ł��A������Ƒ̂��x�߂Ă��������ˁB";
				mes "��΂Ȃ�ł����H";
				mes "�蓖�Ă͂����Əo���ł����H";
				next;
				cutin "v_sprakki03",255;
				mes "[�X�v���L]";
				mes "���͎��K���Ȃ̂ŁA";
				mes "��Ύ蓖���Ȃ���ł��c�c";
				mes "�׋��̂��߂Ȃ̂ł������Ȃ��̂ł����A";
				mes "������ƍ��܂������ɂȂ�܂��c�c";
				next;
				cutin "v_sprakki02",255;
				mes "[�X�v���L]";
				mes "�ł��A�����΂�����C�ɂ��ĂĂ�";
				mes "�����܂���ˁB";
				mes strcharinfo(0)+ "����̂悤��";
				mes "�D�����l�ɂ��o������c�c";
				mes "�˂��H";
				return;
			}
		case 3:
		case 5:
			if(rand(3)==0) {
				cutin "v_sprakki05",2;
				mes "[�X�v���L]";
				mes "������I�@����!!";
				mes "���A�����I�@�C������!!";
				next;
				mes "["+strcharinfo(0)+"]";
				mes "���H�@�Ȃ�ł��H";
				mes "���ɋC�������ł����H";
				next;
				mes "[�X�v���L]";
				mes "�|�������Ă����璆�Ɂc�c";
				mes "�V�[�c�𐮗����Ă����璆�Ɂc�c";
				mes "���A���́c�c����I�@���ꂪ!!";
				next;
				mes "[�X�v���L]";
				mes "���ꂪ�o����ł���!!";
				mes "�^�����ŁA������������";
				mes "��C�����牽�S�C�͂���ƌ���!!";
				next;
				if(select("���킠!!�@��߂�!!","��峂ł����H")==1) {
					mes "["+strcharinfo(0)+"]";
					mes "��峂Ȃ�āA�܂��҂炲�߂�!!!!";
					return;
				}
				mes "[�X�v���L]";
				mes "���A���̖��O�����ɏo���Ȃ���!!";
				next;
				mes "["+strcharinfo(0)+"]";
				mes "�����ŕ������Ƃ���";
				mes "��������Ȃ��ł����B";
				next;
				if(getarg(1)==3) monster "prt_castle",167,164,"����",1051,1,"Thiefbug#Valentine";
				if(getarg(1)==5) monster "prt_castle",33,165,"����",1051,1,"Thiefbug#Valentine";
				mes "^8C1010-�J�T�J�T-";
				mes "-�M�[�M�[�@�M�[�M�[-^000000";
				next;
				mes "[�X�v���L]";
				mes "�Łc�c�o��!!";
				next;
				mes "["+strcharinfo(0)+"]";
				mes "�����߂�܂��傤���H";
				mes "����Ȋ����ł���B";
				next;
				mes "^4A4AFF-���͂�����";
				mes "���峂̏�ɐL�΂���-^000000";
				next;
				killmonster "prt_castle","Thiefbug#Valentine";
				mes "^4A4AFF-�o���b�I-";
				mes "-�u�`���c�c-^000000";
				next;
				mes "["+strcharinfo(0)+"]";
				mes "�߂����I";
				mes "���܂��H�@�߂�܂�����B";
				mes "�ӂӂӂ��c�c";
				next;
				mes "[�X�v���L]";
				mes "���A�����ł��ˁc�c";
				mes "�́c�c�͂��c�c";
				next;
				mes "[�X�v���L]";
				mes "���A���肪�Ƃ��c�c";
				mes "���肪�Ƃ��������܂���!!";
				mes "�ł��A���̎�ŋߕt���Ȃ��ł�����!!";
				next;
				if(select("�͂��H�@�Ђǂ��Ȃ�!?","���v�A�߂Â��܂����")==1) {
					mes "["+strcharinfo(0)+"]";
					mes "���Ȃ��̂��߂��v����";
					mes "�߂��Ă������̂Ɂc�c";
					next;
					cutin "v_sprakki03",2;
					mes "[�X�v���L]";
					mes "�����A�͂��c�c���߂�Ȃ����c�c";
					mes "�ł��c�c�ł��c�c";
					mes "���ꂪ�A�{���ɕ|����ł��B";
					mes "�킩���Ă��������B";
					next;
					mes "[�X�v���L]";
					mes "�{���Ɋ��ӂ��Ă܂��c�c";
				}
				else {
					cutin "v_sprakki03",2;
					mes "[�X�v���L]";
					mes "���߂�Ȃ����c�c";
					mes "�{���ɕ|����ł��c�c";
					next;
					mes "["+strcharinfo(0)+"]";
					mes "�����A�킩��܂���B";
					mes "��峂������l�͑����ł����̂ˁB";
					next;
					mes "[�X�v���L]";
					mes "�����Ȃ�ł��c�c";
					mes "�������ŃV�[�c�̐�����";
					mes "�����邱�Ƃ��ł��܂��B";
					mes "�{���ɂ��肪�Ƃ��������܂��I";
				}
				next;
				mes "^4A4AFF-���Ȃ��ɑ΂���X�v���L�̍D���x��";
				mes "�㏸���܂���-^000000";
				set QUEST_VALENTINE2,QUEST_VALENTINE2+1;
				return;
			}
			if(getarg(0)==4) {
				mes "^4A4AFF-�@�̂��̂��Ȃ���";
				mes "�V�[�c�𐮗����Ă���ޏ���";
				mes "�Ȃ�ƂȂ��y�������Ɍ�����-^000000";
				next;
				cutin "v_sprakki02",2;
				mes "["+strcharinfo(0)+"]";
				mes "�Ȃ񂾂����@���ł��ˁH";
				next;
				mes "[�X�v���L]";
				mes "�͂��I�@��ő吹���֍s���̂ŁA";
				mes "�܂����̐l�������邩�Ȃ���";
				mes "�Ȃ�ƂȂ����҂�������āc�c";
				next;
				menu "���̐l�H",-;
				cutin "v_sprakki03",2;
				mes "[�X�v���L]";
				mes "���A�����A���ł��Ȃ���ł��B";
				mes "���ꂶ��A���̓V�[�c�̐�����";
				mes "�S���I��点�Ȃ��Ƃ����Ȃ�����";
				mes "������ƐȂ��O����";
				mes "���������܂��񂩁H";
				return;
			}
			if(getarg(0)==5) {
				cutin "v_sprakki02",2;
				mes "[�X�v���L]";
				mes "����`�A����`";
				mes "�V�[�c�̐������݂�ȏI����āA";
				mes "������o�Ȃ�����A";
				mes "���` �K��!!";
				next;
				mes "["+strcharinfo(0)+"]";
				mes "�Ȃ񂾂����@���ł��ˁH";
				next;
				mes "[�X�v���L]";
				mes "�͂��I�@�����͑����x�߂܂���B";
				mes "�ӂӁA�ŋߋx�ݎ��ԂɁA";
				mes "�������藿���̕׋������Ă��܂��B";
				next;
				mes "[�X�v���L]";
				mes "�f�U�[�g�S���̃A��������ɂ́A";
				mes "�����y�΂Ȃ�����ǁA";
				mes "�������w�͂��Ă����ł���B";
				mes "�����A�`���R���[�g�ł�";
				mes "����悤�ɂȂ�����A";
				mes "�����グ�܂���B";
				next;
				mes "[�X�v���L]";
				mes "�E�t�t�b�c�c";
				return;
			}
		case 4:
			if(QUEST_VALENTINE2_FLAG==1) {
				if(countitem(2608)) {
					mes "["+strcharinfo(0)+"]";
					mes "����c�c";
					mes "���̃��U���[���g���Ă��������B";
					mes "����̂����Ɏ����Ă��邱�Ƃ�";
					mes "�ł��Ȃ��Ă��߂�Ȃ����B";
					next;
					cutin "v_sprakki05",2;
					mes "[�X�v���L]";
					mes "�����H�@�{���Ă��ꂽ�̂ł����H";
					mes "�ǂ��Ō�������ł����H";
					next;
					mes "["+strcharinfo(0)+"]";
					mes "����A���������̂ł͂Ȃ��āc�c";
					mes "���́c�c���̂��̂Ȃ�ł��B";
					mes "�ǂ������炱����g���Ă��������B";
					next;
					mes "[�X�v���L]";
					mes "�����A�{���ɗǂ���ł����H";
					mes "���Ŏ󂯎�点�Ă��������܂��B";
					mes "�{���ɂ��肪�Ƃ��������܂��I";
					next;
					delitem 2608,1;
					cutin "v_sprakki02",2;
					mes "[�X�v���L]";
					mes strcharinfo(0)+ "�����";
					mes "���蕨���Ǝv���đ厖�ɂ��܂��ˁB";
					next;
					mes "^4A4AFF-���Ȃ��ɑ΂���ޏ��̍D���x��";
					mes "�啝�ɏ㏸���܂���-^000000";
					set QUEST_VALENTINE2,QUEST_VALENTINE2+3;
					if(QUEST_VALENTINE2 > 10)
						set QUEST_VALENTINE2,10;
					set QUEST_VALENTINE2_FLAG,2;
					return;
				}
				cutin "v_sprakki01",2;
				mes "[�X�v���L]";
				mes "���A���@���������ł����H";
				mes "�悭����܂������H";
				next;
				cutin "v_sprakki03",2;
				mes "[�X�v���L]";
				mes "�܂��A�������Ă��Ȃ��݂����ł��ˁB";
				mes "�����܂������邱�Ƃ�";
				mes "�ł��Ă��܂���B�~�T�͂��̂܂�";
				mes "�ڂ��蕷���߂����Ă��܂��܂����B";
				next;
				if(select("�K�������Ă����܂���","����ȏ�͏����邱�Ƃ��ł��܂���")==1) {
					cutin "v_sprakki02",2;
					mes "[�X�v���L]";
					mes "�����܂ł���������Ă���������Ȃ��";
					mes "�{���ɐ\����Ȃ��ł��B";
					mes "�ł��c�c���������ꂵ���ł��B";
					mes "�ꏏ�ɐS�z���Ă����l��";
					mes "���΂ɋ��Ă����Ȃ�āc�c";
					return;
				}
				mes "[�X�v���L]";
				mes "�������Ȃ��Ă������ł���B";
				mes "����l�ő{���Ă݂܂��B";
				mes strcharinfo(0)+ "�������������";
				mes "���d����������ł��傤����c�c";
				mes "���͑��v�ł��B";
				set QUEST_VALENTINE2_FLAG,2;
				return;
			}
			if(rand(3)==0) {
				if(QUEST_VALENTINE2_FLAG==2) {
					cutin "v_sprakki01",2;
					mes "[�X�v���L]";
					mes "���A���͂悤�������܂��B";
					mes "���������q���Ă͂��邯��ǁA";
					mes "���A�M�k�Ƃ����킯�ł͂Ȃ���ł��B";
					mes "��q�Ȃ�āA���܂łقƂ��";
					mes "�������ƂȂ��ł����c�c";
					next;
					mes "[�X�v���L]";
					mes "�����Ƃ���̒��ɂ���Ƒ��ꂵ��";
					mes "�Ȃ��Ă���̂ŁA�C���]����";
					mes "�����܂ő����^��ł݂���ł��B";
					mes "����ɁA�v�����e���̊X��";
					mes "�F�X���ĉ�肽�������́B";
					next;
					mes "[�X�v���L]";
					mes "�v�����e���̊X�����ĉ��Ȃ�A";
					mes "������q�ɎQ�����Ȃ��Ă������̂Ɂc�c";
					mes "�t�t�c�c������Ă�񂾂낤�A���B";
					next;
					mes "[�X�v���L]";
					mes "���͂��������Ō���K���I���̂ŁA";
					mes "�t�F�C�����ɋA���ł��B";
					mes "�����ƃv�����e���̊X��F�X��";
					mes "���Ă����Ηǂ������ȁc�c";
					mes "�ł��A���Ȃ��Ƃ��b���邱�Ƃ��ł�����";
					mes "��q�ɗ��ėǂ��������ȁB";
					next;
					mes "[�X�v���L]";
					mes "�_�Ɋ��ӂ̂��F�肵�Ȃ���ˁB";
					mes "���ɑ΂��銴�ӂ��͔閧�ł���";
					mes "�t�t�c�c";
					next;
					mes "^4A4AFF-�ޏ��͂��������ƐÂ��ɋF��n�߂�-^000000";
					return;
				}
				cutin "v_sprakki03",2;
				mes "[�X�v���L]";
				mes "�ǂ����悤�c�c";
				mes "��؂Ȃ��̂�";
				mes "�������Ă��܂��܂����c�c�B";
				next;
				if(select("�ǂ������̂������Ă݂�","�ʂɋC�ɂ��Ȃ�")==2) {
					mes "-�C�ɂ��Ȃ����Ƃɂ���-";
					return;
				}
				mes "["+strcharinfo(0)+"]";
				mes "����������ł����H";
				next;
				mes "[�X�v���L]";
				mes "���c�c" +strcharinfo(0)+ "����I";
				mes "���̓��U���[��";
				mes "�������Ă��܂�����ł��B";
				mes "���U���[���Ȃ��ƃ~�T���ł��܂���B";
				next;
				mes "[�X�v���L]";
				mes "���͎����̍��Ƃ���������̂�";
				mes "�������Ăǂ�����Đ����Ă�����";
				mes "�����̂ł��傤���c�c�B";
				next;
				if(select("�����{���Ă݂܂��傤","�悭�{���Ă݂ẮH�@�ǂ����ɂ���܂���")==2) {
					cutin "v_sprakki01",2;
					mes "[�X�v���L]";
					mes "�͂��A�悭�{���Ă݂܂��B";
					mes "�S�z���Ă���Ă��肪�Ƃ��B";
					return;
				}
				cutin "v_sprakki02",2;
				mes "[�X�v���L]";
				mes "�{���ɂ��肪�Ƃ��������܂��B";
				mes strcharinfo(0)+ "�����";
				mes "�ƂĂ��₳�������ł��ˁB";
				mes "�{���ɂ��肪�Ƃ��B";
				next;
				mes "["+strcharinfo(0)+"]";
				mes "�i���U���[���������";
				mes "�n���΂������ȁH�j";
				mes " ";
				mes "�����҂��ĂĂ��������B";
				mes "���U���[��{���Ă��܂��B";
				next;
				mes "[�X�v���L]";
				mes "�͂��B";
				mes "���������ɑ{���Ă݂܂��B";
				mes "�ł���΃~�T�ɒx�ꂽ������܂���B";
				mes "�ǂ�����낵�����肢���܂��c�c�B";
				set QUEST_VALENTINE2_FLAG,1;
				return;
			}
			cutin "v_sprakki01",2;
			mes "[�X�v���L]";
			mes "�^�ʖڂȂ�ł��ˁB";
			mes "�܂������Ȃ̂Ɂc�c";
			next;
			if(select("���Ȃ��ɉ�����ė��܂���","�F�X�ƖZ�����āc�c")==1) {
				if(QUEST_VALENTINE2 < 5) {
					cutin "v_sprakki02",2;
					mes "[�X�v���L]";
					mes "���ӂӁA���ꂵ���ł��B";
					mes "����Ȃ������ɂ�";
					mes "�x����܂����H";
					next;
					cutin "v_sprakki02",2;
					mes "[�X�v���L]";
					mes "�����Ő����グ��̂�";
					mes "�C���Ђ��܂��̂�";
					mes "��ł���ɗV�тɗ��Ă��������B";
					mes "�ꏊ�͒m���Ă��܂����H";
					set QUEST_VALENTINE2,QUEST_VALENTINE2+1;
					return;
				}
				mes "[�X�v���L]";
				mes "������k�͌����ł��B";
				next;
				if(select("��k�͂������ł����H","��k�ł��B���߂�Ȃ���")==1) {
					mes "[�X�v���L]";
					mes "�͂��B��k�₢������ł�����A";
					mes "�����΂��ĕ����Ă���Ԃ�";
					mes "��߂Ă��������B";
					mes "�ŏ��̐��񂭂炢�Ȃ�";
					mes "��k���Ǝv���܂����c�c�B";
					next;
					mes "["+strcharinfo(0)+"]";
					mes "���A�����Ӗ��Ŏ󂯎���Ă��������B";
					mes "�D�ӓI�ȈӖ��ł��c�c�B";
					next;
					cutin "v_sprakki02",2;
					mes "[�X�v���L]";
					mes "�킩��܂����B";
					mes "�����A�����֗����̂ł�����";
					mes "���F������܂��傤�H";
					mes "���������E�����a�ł���悤�ɁB";
					return;
				}
				cutin "v_sprakki02",2;
				mes "[�X�v���L]";
				mes "�킩��܂����B";
				mes "�ł́A���F������܂��傤���H";
				mes "���������E�����a�ł���悤�ɁB";
				return;
			}
			mes "[�X�v���L]";
			mes "�����Ȃ�ł����A��ςł��ˁB";
			next;
			mes "[�X�v���L]";
			mes "�������c�c�I";
			mes strcharinfo(0)+ "�����";
			mes "�����̉^�������Ă����܂��傤�B";
			next;
			mes "[�X�v���L]";
			mes strcharinfo(0)+ "�����";
			mes "�����̉^���́c�c";
			next;
			switch(rand(3)) {
				case 0:
					cutin "v_sprakki02",2;
					mes "[�X�v���L]";
					mes "�킟�`�A�������^���ǂ��݂����ł���H";
					mes "�����͉����Ƀ`�������W���Ă݂Ă�";
					mes "�������ł����H";
					mes "�z���O��������ɐ��B��";
					mes "���肢����̂��ǂ���������܂���ˁI";
					return;
				case 1:
					mes "[�X�v���L]";
					mes "���ʁc�c�݂����ł��ˁB";
					mes "�����ʂ蕽���Ȉ���ƂȂ肻���ł��B";
					mes "�����Ȃ̂́A�ǂ����Ƃł���ˁH";
					mes "�t�t�t�c�c";
					return;
				case 2:
					cutin "v_sprakki05",2;
					mes "[�X�v���L]";
					mes "���c�c����́c�c���`���Ɓc�c";
					mes "�����̉^���́c�c���́c�c���́c�c";
					mes "���厖�Ɂc�c";
					next;
					mes "[�X�v���L]";
					mes strcharinfo(0)+ "�����";
					mes "�������F���Ă܂��c�c";
					return;
			}
		case 6:
			cutin "v_sprakki01",2;
			mes "[�X�v���L]";
			mes "����`�A����`";
			mes "������҂�x�e�����ށ`��";
			next;
			mes "[�X�v���L]";
			mes "^4A4AFF" +.name$+ "^000000�����";
			mes "�������ł����H";
			mes "�ƂĂ��e�؂őf�G�ȕ��Ȃ�ł����c�c";
			next;
			mes "[�X�v���L]";
			mes "���A�ʂɂ��Ȃ��Ɣ�ׂ悤��";
			mes "�v�����킯�ł͂Ȃ������̂ł����B";
			return;
		case 7:
			cutin "v_sprakki01",2;
			mes "[�X�v���L]";
			mes "���́c�c��������o�Ă���܂����H";
			mes "�����͈��Ղɏo���肷��ꏊ�ł�";
			mes "����܂��񂩂�c�c";
			return;
		}
	}

	function PatternC {	//case10
		if(getarg(2)==2 || getarg(2)==4 || rand(3)) {
			cutin "v_sprakki01",2;
			mes "[�X�v���L]";
			mes "�Ђ���Ƃ��āA";
			mes "^4A4AFF" +.name$+ "^000000�����";
			mes "�������ł����H";
			mes "�Ƃ��Ă��I�V�����ȕ��Ȃ�ł���c�c";
			next;
			mes "[�X�v���L]";
			mes "�ł��A" +strcharinfo(0)+ "�����";
			mes "�ƂĂ��f�G�ł���B";
			return;
		}
		cutin "v_sprakki01",2;
		mes "[�X�v���L]";
		mes "�����Ɓc�c";
		mes "�ŋߎ��A���َq����";
		mes "���Ă����ł��B";
		mes "������񂱂����肵�Ă���̂ł����c�c";
		next;
		mes "[�X�v���L]";
		mes "����ŁA��x�`���R���[�g��";
		mes "����Ă݂����Ǝv������ł��B";
		mes "�ł��A���V�s�������Ă��Ȃ���ł��c�c";
		next;
		mes "[�X�v���L]";
		mes "�����m�̂Ƃ���A���͌ߑO����";
		mes "�~�T�ɍs�����ƈȊO�A������o�邱�Ƃ�";
		mes "�ł��Ȃ��̂ł��B�ł��̂Łc�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���ɁA����Ƀ��V�s��";
		mes "��ɓ���Ă��ė~������";
		mes "�����킯�ł��ˁH";
		next;
		mes "[�X�v���L]";
		mes "�͂��I�@���N�����ɂȂ��";
		mes "�`���R���[�g�������";
		mes "�����Ă�����X����������Ⴂ�܂��B";
		mes "�o�V�j�I�Ƃ̕��X�Ȃ̂ł����A";
		mes "���V�s��������Ɩ���Ă���";
		mes "����܂��񂩁H";
		next;
		if(select("��������p�ł�","����ȗ]�T�͂Ȃ��ł��ˁc�c")==2) {
			cutin "v_sprakki03",2;
			mes "[�X�v���L]";
			mes "�����ł����c�c";
			mes "���A�}���ł͂��܂��񂩂�";
			mes "���v�ł��B";
			mes "�ł��A���V�s�����Ă������ق���";
			mes "�����̂Ɂc�c";
			next;
			mes "[�X�v���L]";
			mes "�`���R���[�g�c�c";
			mes "���������������̂Ɂc�c";
			mes "�����v���܂��񂩁H";
			return;
		}
		mes "[�X�v���L]";
		mes "���肪�Ƃ��������܂��I";
		mes "���Ԃ�A�o�V�j�I�Ƃ̕��X��";
		mes "��N�ǂ���A���x���^��";
		mes "���������Ă���Ǝv���܂��B";
		next;
		mes "[�X�v���L]";
		mes "����ł͂��肢���܂��ˁI";
		set QUEST_VALENTINE2,11;
		set QUEST_VALENTINE2_FLAG,0;
		return;
	}

	function PatternD {	//case11
		cutin "v_sprakki01",2;
		mes "[�X�v���L]";
		mes "�o�V�j�I�Ƃ̕��X�͑��";
		mes "�A���x���^�ŏ��������Ă��܂��B";
		mes "�t�F�C�����ŕ�炵�Ă������A";
		mes "���т��іK�˂Ă̓`���R���[�g��";
		mes "�����Ă����肵�Ă��܂����B";
		next;
		mes "[�X�v���L]";
		mes "�������V�s��������";
		mes "�񑩂����܂�������A";
		mes "���̖��O���o���ΖႦ��Ǝv���܂��B";
		mes "��낵�����肢���܂��ˁB";
		return;
	}

	function PatternE {	//case12
		cutin "v_sprakki01",2;
		mes "[�X�v���L]";
		mes "���V�s�����Ă��Ă��ꂽ�̂ł���!?";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����A�����ɂ���܂���B";
		mes "�Ƃ���Ŗ{���ɍ���̂ł����H";
		mes "����ȍޗ��ŁH";
		mes "�J�J�I�A�~���N�c�c";
		mes "�g�їp�n�z�F�͂Ȃ��K�v�Ȃ̂ł����H";
		next;
		mes "^4A4AFF-�X�v���L�ɃV���R����������";
		mes "�`���R���[�g�̃��V�s��n����-^000000";
		next;
		mes "[�X�v���L]";
		mes "����Ă݂�Ε�����܂���B";
		mes "�ł��A�J�J�I���Ȃ�āc�c";
		mes "�J�J�I���ǂ���";
		mes "��ɓ����΂����̂ł��傤�H";
		mes "�܂��܂��O�r����ł��ˁB";
		next;
		cutin "v_sprakki02",2;
		mes "[�X�v���L]";
		mes "�Ƃɂ������肪�Ƃ��������܂��B";
		mes "���A����" +strcharinfo(0)+ "�����";
		mes "���肪�Ƃ����Ă΂��茾���Ă܂��ˁB";
		mes "�ł��c�c�{���ɂ��ꂵ���ł��B";
		next;
		mes "^4A4AFF-���Ȃ��ɑ΂���X�v���L�̐e���x��";
		mes "�㏸���܂���-^000000";
		set QUEST_VALENTINE2,13;
		return;
	}

	function PatternF {	//case13
		if(getarg(2)==1) {
			cutin "v_sprakki01",2;
			mes "[�X�v���L]";
			mes "�Ђ���Ƃ��āA";
			mes "^4A4AFF" +.name$+ "^000000�����";
			mes "�������ł����H";
			mes "�Ƃ��Ă��I�V�����ȕ��Ȃ�ł���c�c";
			next;
			mes "[�X�v���L]";
			mes "�ł��A" +strcharinfo(0)+ "�����";
			mes "�ƂĂ��f�G�ł���B";
			return;
		}
		cutin "v_sprakki01",2;
		mes "[�X�v���L]";
		mes "���́c�c�v�����e���̂ǂ�����";
		mes "�J�J�I�𔄂��Ă��邨�X������Ƃ���";
		mes "�b�𕷂��܂����B";
		mes "�ǂ��ɂ��邩�������ł����H";
		next;
		if(select("�����{���Ă݂܂��傤���H","�m��Ȃ��ł�")==2) {
			mes "[�X�v���L]";
			mes "����ς葼�̕��Ɠ�����";
			mes "�������Ȃ��ł����c�c";
			mes "��ŏڂ������Ȑl�ɐu���Ă݂܂��B";
			mes "�J�J�I�𔃂��̂�";
			mes "����Ȃɑ�ς��Ȃ�āc�c";
			return;
		}
		cutin "v_sprakki02",2;
		mes "[�X�v���L]";
		mes "�{���ł���!? �������I";
		mes "���ꂶ�Ⴀ�A�J�J�I��";
		mes "^4A4AFF5��^000000���肢���Ă������ł����H";
		mes strcharinfo(0)+ "�����";
		mes "�Ƃ��Ă��D�������ł��ˁI";
		set QUEST_VALENTINE2,14;
		return;
	}

	function PatternG {	//case14
		cutin "v_sprakki01",2;
		mes "[�X�v���L]";
		mes "���肢�����J�J�I�͂ǂ��Ȃ�܂������H";
		next;
		if(countitem(7182)>=5) {
			delitem 7182,5;
			set QUEST_VALENTINE2,15;
			cutin "v_sprakki01",2;
			mes "[�X�v���L]";
			mes "������" +strcharinfo(0)+ "����I";
			mes "����Ŏ����`���R���[�g��";
			mes "��邱�Ƃ��ł��܂��B";
			mes "���ӂӁA�{���ɂ��肪�Ƃ��I";
			next;
			mes "^4A4AFF-���Ȃ��ɑ΂���X�v���L�̐e���x��";
			mes "�㏸���܂���-^000000";
			return;
		}
		cutin "v_sprakki03",2;
		mes "[�X�v���L]";
		mes "���c�c�܂��J�J�I��";
		mes "��ɓ�����܂��񂩁B";
		mes "�c�c��͂�A�X�̒��֍s����";
		mes "���ڍ̂�Ȃ���΂Ȃ�Ȃ��ł��傤���H";
		mes "�ł��A����͊댯�ł����c�c";
		return;
	}

	function PatternH {	//case15
		cutin "v_sprakki02",2;
		mes "[�X�v���L]";
		mes "���ĂĂ��������ˁA";
		mes "�`���R���[�g�����܂���`�B";
		mes strcharinfo(0)+ "�����";
		mes "�񑩂ǂ���F�X�Ǝ�`���Ă��ꂽ����";
		mes "�`���R���[�g�����������܂��B";
		next;
		mes "[�X�v���L]";
		mes "�����N���Ƀv���[���g�������Ȃ�";
		mes "���ł��J�J�I��5��";
		mes "�W�߂Ă��Ă��������ˁB";
		mes "���܂���ł͂���܂���";
		mes "��������Ă����܂��B";
		next;
		mes "[�X�v���L]";
		mes "�����v�����e���ŉ߂����鎞�Ԃ�";
		mes "���Ə����ł��B";
		mes "�̋��ɋA�鏀����";
		mes "���Ȃ���΂����܂���B";
		mes "�ł��A����܂Ŏ��͂����ɂ��܂��B";
		next;
		mes "[�X�v���L]";
		mes "����ɂ͑���Ȃ���������܂���";
		mes "���ӂ̋C���������߂đ���܂��B";
		mes "�悩������󂯎���Ă��������ˁB";
		getitem 558,1;
		set QUEST_VALENTINE2,16;
		return;
	}

	function PatternI {	//case16
		if(getarg(2)!=1 && getarg(2)!=4) {
			cutin "v_sprakki01",2;
			mes "[�X�v���L]";
			mes "�Ђ���Ƃ��āA";
			mes "^4A4AFF" +.name$+ "^000000�����";
			mes "�������ł����H";
			mes "�Ƃ��Ă��I�V�����ȕ��Ȃ�ł���c�c";
			next;
			mes "[�X�v���L]";
			mes "�ł��A" +strcharinfo(0)+ "�����";
			mes "�ƂĂ��f�G�ł���B";
			return;
		}
		cutin "v_sprakki02",2;
		mes "[�X�v���L]";
		mes "�`���R���[�g�����܂��傤���H";
		mes "���́A���̃A����=�I�����A�������";
		mes "�`���R���[�g�����悤���܂˂�����";
		mes "����悤�ɂȂ�����ł���B";
		mes "���ӂӂ��B";
		next;
		mes "[�X�v���L]";
		mes "�`���R���[�g�ɖ��O�����邱�Ƃ�";
		mes "�ł���悤�ɂȂ�܂����I";
		next;
		mes "[�X�v���L]";
		mes "�ǂ��H�@�������ł��傤�H";
		mes "��������`���R�������Ă�����";
		mes "�n���Ă��������ˁB";
		mes "�����������f�G�Ȗ��O��";
		mes "����Ă����܂��傤�I";
		next;
		if(select("�`���R���[�g������Ă�������","���O�����Ă�������")==1) {
			if(countitem(7182)<5) {
				cutin "v_sprakki03",2;
				mes "[�X�v���L]";
				mes "�`���R���[�g������Ă�������";
				mes "�C�����͎R�X�Ȃ̂ł����c�c";
				mes "���́c�c�J�J�I���Ȃ���";
				mes "��邱�Ƃ��ł��Ȃ���ł��B";
				mes "���߂�Ȃ����c�c";
				return;
			}
			mes "[�X�v���L]";
			mes "�͂��I�@����΂��č��܂���I";
			mes "���̃`���R���[�g���󂯎�����";
			mes strcharinfo(0)+ "����̂��Ƃ�";
			mes "�z���Ă���Ă���Ƃ����ł��ˁ`";
			next;
			mes "[�X�v���L]";
			mes "�ł́c�c";
			next;
			mes "[�X�v���L]";
			mes "�o���܂����`�I";
			mes "���������ɗ��Ă�Ȃ��";
			mes "�������ł��I";
			if(rand(5)==0) {
				mes "����̓z���C�g�`���R��";
				mes "���Ă݂܂����B";
				getitem 560,1;
			}
			else
				getitem 558,1;
			return;
		}
		getinventorylist;
		for(set .@i,0; .@i<@inventorylist_count; set .@i,.@i+1) {
			if(@inventorylist_id[.@i] == 559 || @inventorylist_id[.@i] == 560) {
				if(@inventorylist_card3[.@i] && @inventorylist_card4[.@i]) {
					mes "[�X�v���L]";
					mes "�������O�������Ă��܂��ˁc�c";
					return;
				}
				mes "[�X�v���L]";
				mes "���Ȃ��������Ă���A����";
				mes getitemname(@inventorylist_id[.@i])+ "��";
				mes "���ږ��O�����܂��ˁB";
				next;
				mes "[�X�v���L]";
				mes "���ӂӁA" +strcharinfo(0)+ "����̖��O��";
				mes "����܂�����B";
				mes "�ǂ��ł��H�@��肭�ł��Ă܂����H";
				delitem @inventorylist_id[.@i],1;
				getitem2 @inventorylist_id[.@i],1,1,0,0,254,0,getcharid(0)&0xffff,(getcharid(0)>>16)&0xffff;
				return;
			}
		}
		cutin "v_sprakki03",2;
		mes "[�X�v���L]";
		mes "����`���R�łȂ���";
		mes "���O�����邱�Ƃ͂ł��Ȃ��ł��c�c";
		mes "���߂�Ȃ����c�c";
		return;
	}
}

prt_castle,0,0,0	script	V_SprakkiTimer	-1,{
	end;
Ontimer180000:
	set callfunc("ValentineSprakki",0),0;	//�����l�����A�^�b�`�h�~���b�N����
	end;
}

// �X�v���L 2�`4�� 11�`13��
prt_castle,133,99,3	script	�X�v���L#Valentine1	90,{
	if(gettime(3)>= 2 && gettime(3)< 4) callfunc "ValentineSprakki",2,1,1;
	if(gettime(3)>=11 && gettime(3)<13) callfunc "ValentineSprakki",1,1,1;
	end;
OnInit:
	hideonnpc;
	if((gettime(3)>=2 && gettime(3)<4) || (gettime(3)>=11 && gettime(3)<13))
		hideoffnpc;
	end;
OnClock0205:
OnClock1105:
	hideoffnpc;
	end;
OnHour04:
OnHour13:
	hideonnpc;
	end;
}

// �X�v���L 4�`6�� 15�`17��
prt_castle,33,106,3	script	�X�v���L#Valentine2	90,{
	if(gettime(3)>= 4 && gettime(3)< 6) callfunc "ValentineSprakki",2,2,1;
	if(gettime(3)>=15 && gettime(3)<17) callfunc "ValentineSprakki",1,2,1;
	end;
OnInit:
	hideonnpc;
	if((gettime(3)>=4 && gettime(3)<6) || (gettime(3)>=15 && gettime(3)<17))
		hideoffnpc;
	end;
OnClock0405:
OnClock1505:
	hideoffnpc;
	end;
OnHour06:
OnHour17:
	hideonnpc;
	end;
}

// �X�v���L 7�`9�� 21�`23��
prt_castle,169,168,3	script	�X�v���L#Valentine3	90,{
	if(gettime(3)>= 7 && gettime(3)< 9) callfunc "ValentineSprakki",4,3,1;
	if(gettime(3)>=21 && gettime(3)<23) callfunc "ValentineSprakki",5,3,1;
	end;
OnInit:
	hideonnpc;
	if((gettime(3)>=7 && gettime(3)<9) || (gettime(3)>=21 && gettime(3)<23))
		hideoffnpc;
	end;
OnClock0705:
OnClock2105:
	hideoffnpc;
	end;
OnHour09:
OnHour23:
	hideonnpc;
	end;
}

// �X�v���L 9�`11��
prt_church,92,115,7	script	�X�v���L#Valentine4	90,{
	callfunc "ValentineSprakki",6,4,2;
	end;
OnInit:
	if(gettime(3)<9 || gettime(3)>=11)
		hideonnpc;
	end;
OnClock0905:
	hideoffnpc;
	end;
OnHour11:
	hideonnpc;
	end;
}

// �X�v���L 13�`15��
prt_castle,32,168,3	script	�X�v���L#Valentine5	90,{
	callfunc "ValentineSprakki",3,5,3;
	end;
OnInit:
	if(gettime(3)<13 || gettime(3)>=15)
		hideonnpc;
	end;
OnClock1305:
	hideoffnpc;
	end;
OnHour15:
	hideonnpc;
	end;
}

// �X�v���L 17�`19��
prt_castle,172,102,3	script	�X�v���L#Valentine6	90,{
	callfunc "ValentineSprakki",1,6,4;
	end;
OnInit:
	if(gettime(3)<17 || gettime(3)>=19)
		hideonnpc;
	end;
OnClock1705:
	hideoffnpc;
	end;
OnHour19:
	hideonnpc;
	end;
}

// �X�v���L 19�`21��
prt_castle,165,28,3	script	�X�v���L#Valentine7	90,{
	callfunc "ValentineSprakki",3,7,2;
	end;
OnInit:
	if(gettime(3)<19 || gettime(3)>=21)
		hideonnpc;
	end;
OnClock1905:
	hideoffnpc;
	end;
OnHour21:
	hideonnpc;
	end;
}

// ��峗p�_�~�[�C�x���g
prt_castle,0,0,0	script	Thiefbug#Valentine	-1,{}


//==============================================================
alberta,26,243,3	script	�V���R��=�o�V�j�I	96,{
	if((Weight*100/MaxWeight) >= 90) {
		mes "[�V���R��=�o�V�j�I]";
		mes "���q�l�A�ו�����������";
		mes "�������̂悤�ł��ˁB";
		mes "�J�v������ɏ������a���ɂȂ���";
		mes "���Ă͂������ł��傤���H";
		close;
	}
	if(QUEST_VALENTINE1==7) {
		if(countitem(7182)<5) {
			mes "[�V���R��=�o�V�j�I]";
			mes "�J�c�c�J�J�I�c�c";
			next;
			mes "[�V���R��=�o�V�j�I]";
			mes "�����c�c���߂�Ȃ����B";
			mes "�J�J�I�������Ă��炵��";
			mes "�z�B���̕����Ǝv���܂����B";
			mes "����ς蒍����������";
			mes "�J�J�I���������ł͂���܂���ˁB";
			close;
		}
		mes "[�V���R��=�o�V�j�I]";
		mes "�J�c�c�J�J�I�[!!!";
		mes "���������̃J�J�I��";
		mes "�ǂǂ��ɁH";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�ǂ��ɂ��āc�c";
		mes "���͂����A�����͂���";
		mes "���������ł����ǁH";
		mes "�V���R��=�o�V�j�I����";
		mes "����Ȃ��̂ł����H";
		mes "�ԈႦ�����c�c";
		next;
		mes "[�V���R��=�o�V�j�I]";
		mes "�������I�@�悭���Ă��������܂����I";
		mes "����ɂ��Ă��A�Ȃ�����Ȃ�";
		mes "�x���Ȃ����̂ł��傤���c�c";
		mes "���X���J���Ȃ��Ȃ�Ƃ���ł�����`�B";
		next;
		mes "[�V���R��=�o�V�j�I]";
		mes "�����Ă��炵���J�J�I��";
		mes "���ւ��������ȁB";
		mes "�����A�x��������ł�����A";
		mes "�z�B���͂���ō\���܂���ł���H";
		delitem 7182,5;
		getitem 558,1;
		set QUEST_VALENTINE1,8;
		close;
	}
	if(QUEST_VALENTINE1 >= 8 && QUEST_VALENTINE2 != 11) {
		mes "[�V���R��=�o�V�j�I]";
		mes "��������Ⴂ�܂��A";
		mes "�u�o�V�j�I�`���R���[�g�v�ł��B";
		mes "���͐\����Ȃ���ł����A";
		mes "�����̔̔��͂��f�肳����";
		mes "���������Ă����ł��B";
		next;
		mes "[�V���R��=�o�V�j�I]";
		mes "�ł��A�J�J�I��";
		mes "�͂��Ă������������ł�����A";
		mes "�����肵�܂���B";
		mes "�`���R���[�g�������߂ł����H";
		mes "���2,000Zeny�ɂȂ�܂����c�c";
		next;
		if(select("�`���R���[�g����������","��߂�")==2) {
			mes "[�V���R��=�o�V�j�I]";
			mes "���`";
			mes "�`���R���[�g����������Ƃ�";
			mes "����������Ȃ���ł����H";
			mes "�u�`";
			mes "���������̂ɁA�c�O�ł���`�B";
			close;
		}
		mes "[�V���R��=�o�V�j�I]";
		mes "���N�̓}�}�����X���ł����A";
		mes "������l�ō��Ȃ��ƂȂ�Ȃ����A";
		mes "����ꂽ�����ɂ���";
		mes "�����肵�Ă���̂ŁA";
		mes "��������͂�����ł��܂���B";
		mes "�܂܂łł�����ǂ��ł���B";
		while(1) {
			next;
			input .@num;
			if(.@num==0) {
				mes "[�V���R��=�o�V�j�I]";
				mes "���`";
				mes "�`���R���[�g����������Ƃ�";
				mes "����������Ȃ���ł����H";
				mes "�u�`";
				mes "���������̂ɁA�c�O�ł���`�B";
				close;
			}
			if((.@num>5)||(.@num<0)) {
				mes "[�V���R��=�o�V�j�I]";
				mes "�\���󂠂�܂���A";
				mes "�Z�ȏ�͂��������������B";
				continue;
			}
			break;
		}
		if(Zeny<.@num*2000) {
			mes "[�V���R��=�o�V�j�I]";
			mes "���炠��c�c";
			mes "������������Ƒ���Ȃ��悤�ł���B";
			mes "���莝���̂�����";
			mes "�m���߂Ă��������ˁB";
			mes "���v�ł��A���҂����Ă��܂�����B";
			close;
		}
		mes "[�V���R��=�o�V�j�I]";
		mes "�͂��A������ł��ˁB";
		mes "�v���[���g�ɂ҂�����I";
		mes "���������`���R���[�g�ł��B";
		mes "�I�z�z�z�z";
		mes "�ǂ����������オ��ɂȂ��āA";
		mes "���Ђ����ɂ��Ă��������ˁI";
		set Zeny,Zeny-(.@num*2000);
		getitem 558,.@num;
		close;
	}
	mes "[�V���R��=�o�V�j�I]";
	mes "��������Ⴂ�܂��c�c";
	mes "�u�o�V�j�I�`���R���[�g�v��";
	mes "�V���R���ł��B";
	mes "���͍ޗ�������Ȃ��āA";
	mes "�`���R���[�g����邱�Ƃ�";
	mes "�ł��Ȃ���ł��́B";
	next;
	if(QUEST_VALENTINE2==11) {
		mes "[�V���R��=�o�V�j�I]";
		mes "�͂��H�@���V�s�ł����H";
		mes "�����A�X�v���L����!?";
		mes "����ł́A�ȒP�ȃ`���R���[�g��";
		mes "��邽�߂̃��V�s�������グ�܂���B";
		next;
		mes "[�V���R��=�o�V�j�I]";
		mes "���`��A�ł��A�ޗ����W�߂邱�Ƃ�";
		mes "�ł��邩�킩��܂����c�c";
		mes "�Ƃɂ����A��낵�����`�����������ˁB";
		next;
		mes "^4A4AFF �V���R���́A���������g�̉���";
		mes "�T���āA�������܂�ꂽ���؂��";
		mes "������ƁA�����n���Ă����B";
		mes "���Ԃ񂱂ꂪ���̃��V�s�Ȃ񂾂낤�B^000000";
		next;
		mes "[�V���R��=�o�V�j�I]";
		mes "�ޗ����͂��܂�����A";
		mes "�`���R���[�g��������������";
		mes "����܂�����A���̎��܂�";
		mes "�����ɂȂ��Ă��������ˁ`�B";
		set QUEST_VALENTINE2,12;
		close;
	}
	mes "[�V���R��=�o�V�j�I]";
	mes "�܂�����A���炵�Ă��������B";
	mes "�{���ɐ\���󂲂����܂���B";
	close;
}

prt_in,41,40,3	script	����p�e�B�V�G	86,{
	if(QUEST_VALENTINE1==18) {
		mes "[�A����=�I�����A��]";
		mes "�ǂ̂悤�Ȃ��p���ł����H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����l�ɁA�`���R���[�g��肪��肢";
		mes "�F�B������̂ŁA���Ȃ��̂Ƃ����";
		mes "�s���Ă݂Ȃ����ƌ����āc�c";
		next;
		mes "[�A����=�I�����A��]";
		mes "���A�u���C�h�ł����B";
		mes "����͂���́A";
		mes "�悭��������Ⴂ�܂����B";
		next;
		mes "[�A����=�I�����A��]";
		mes "���Ȃ����u���C�h��";
		mes "�d������`���Ă����������̂ł����H";
		mes "���������܂ŁA�J�J�I�̗��ʂ��ǂ��Ȃ�";
		mes "�������̗ǂ��ޗ���";
		mes "��ɓ������悤�ɂȂ�܂����B";
		next;
		mes "[�A����=�I�����A��]";
		mes "���܂肱��Ȃ��Ƃ͕��i���Ȃ��̂ł���";
		mes "�����`���R���[�g�������߂�";
		mes "�Ȃ肽�������炨���肢�����܂���B";
		mes "���ł����炵�Ă��������B";
		set QUEST_VALENTINE1,19;
		close;
	}
	if(QUEST_VALENTINE1>=19) {
		mes "[�A����=�I�����A��]";
		mes "��������Ⴂ�܂��B";
		mes "�`���R���[�g�������߂ł����H";
		next;
		switch(select("�͂��A���������","����ė~�����ł�","���\�ł��B�����A�ɗ��܂���")) {
		case 1:
			mes "[�A����=�I�����A��]";
			mes "�͂��A�������܂�܂����B";
			mes "�����2��Zeny�ƁA���X������";
			mes "�������邩������܂��񂪁A";
			mes "�^�S�����߂č�点�Ă���������";
			mes "����܂��̂Łc�c";
			next;
			mes "[�A����=�I�����A��]";
			mes "���l�B�Ɉ��Ɗ�]�ɖ�����";
			mes "�������K��񂱂Ƃ��c�c";
			mes "�͂��A���Ȃ�F������߂�";
			mes "����`���R�ł������܂��B";
			next;
			set Zeny,Zeny-20000;
			if(Sex==0) getitem 559,1;
			if(Sex==1) getitem 560,1;
			mes "[�A����=�I�����A��]";
			mes "�͂��A������ł��B";
			mes "���肪�Ƃ��������܂��B";
			mes "�܂����񂲗��p���������B";
			close;
		case 2:
			mes "[�A����=�I�����A��]";
			mes "����ł́A���ʂ̃`���R���[�g��";
			mes "7���������������܂����H";
			mes "�ō��̏����������";
			mes "����肢�����܂��B";
			if(countitem(558)<7) close;
			mes "�����A�����ޗ����������ł��ˁB";
			mes "����ł͑�������肵�܂��傤���H";
			next;
			if(select("���肢���܂�","���A�҂��Ă�������")==2) {
				mes "[�A����=�I�����A��]";
				mes "�����A�ǂ����܂������H";
				mes "���q�l�̓u���C�h�Ƃ��F�l��";
				mes "�悤�ł����̂Ń`���R���[�g��";
				mes "����肵�Ă��������悤�Ɓc�c";
				mes "�Ƃ͂����A�����ł���肷��";
				mes "�킯�ɂ��܂���܂���̂Łc�c";
				close;
			}
			mes "[�A����=�I�����A��]";
			mes "�`���R���[�g�ɂ́A���̊Â�����";
			mes "�����ɁA�ꖡ�����܂��Ă��܂��B";
			mes "�l�Ɛl�Ƃ̊֌W�ɂ́A";
			mes "�y�����o����������܂����A";
			mes "�߂������Ƃ�����܂��c�c";
			mes "�Ȃ�ƂȂ����Ă��܂���ˁc�c";
			next;
			mes "[�A����=�I�����A��]";
			mes "����̓v���[���g�p�ł���ˁH";
			mes "����͔h�肷�����A�n���ɂȂ�Ȃ��悤";
			mes "����΂��č��܂����B";
			mes "���C�ɏ����΍K���ł��B";
			next;
			delitem 558,7;
			getitem 559,1;
			mes "[�A����=�I�����A��]";
			mes "�͂��A������ł��B";
			mes "���肪�Ƃ��������܂��B";
			mes "�܂����񂲗��p���������B";
			close;
		case 3:
			mes "[�A����=�I�����A��]";
			mes "����͂���́B";
			mes "���������Ȃ����Ă����Ă��������B";
			mes "������낵����΁A�ޗ�����";
			mes "����������������΃`���R���[�g��";
			mes "����肵�܂��̂ŁA�����Ȃ�";
			mes "����������Ă��������B";
			next;
			mes "[�A����=�I�����A��]";
			mes "�`���R���[�g��7����������΁A";
			mes "����`���R�ɂ��Ă��������܂���B";
			close;
		}
	}
	mes "[�A����=�I�����A��]";
	mes "�ǂ̂悤�Ȃ��p���ł������";
	mes "�������ɂȂ����̂ł��傤�H";
	mes "������c�c����`���R��";
	mes "�����߂ɂ������������̂ł����H";
	next;
	mes "[�A����=�I�����A��]";
	mes "���A�ޗ��𑵂��Ă����";
	mes "����悪�A�ޗ����d����邱�Ƃ�";
	mes "�ł��Ă��Ȃ����߁A������ɂ�";
	mes "�͂��Ă��Ȃ��̂ł���c�c";
	next;
	mes "[�A����=�I�����A��]";
	mes "���������������ɂȂ����̂�";
	mes "�\����Ȃ��̂ł����c�c";
	close;
}


/*
// ���o�����^�C��
// Valentine Script 2004-02-12
alberta,26,243,4	script	�`���R���[�g���l	58,{	//�j���w���\
	mes "[�}���R=�o�W�j�I]";
	mes "���[���~�b�h�K�b�c�����ł͖ő���";
	mes "���킦�Ȃ����Y�i�I";
	mes "����H�ׂ�ΒN�ł��K���Ƀg���`��";
	mes "�Ƃ낯�邨�َq�I";
	mes "�����ŐH�ׂĂ��������A���蕨�ɂ�";
	mes "�s�b�^�����I";
	next;
	mes "[�}���R=�o�W�j�I]";
	mes "����ȃ`���R���[�g�� ^ff0000���";
	mes "5000zeny^000000�I";
	next;
	if(select("�`���R���[�g���������I","����܂���I")==1) {
		mes "[�}���R=�o�W�j�I]";
		mes "�E�z�I���肪�Ƃ��������܂��A���q�l�I";
		mes "���̃`���R���[�g�͐E�l�̍����l�܂���";
		mes "����ƌ����Ă��ߌ��ł͂Ȃ��̂ł��I";
		mes "�Ȃ̂ŁA���̂������グ�ɂ�";
		mes "^ff00005�܂�^000000�ƂȂ��Ă���܂��I";
		next;
		mes "[�}���R=�o�W�j�I]";
		mes "�����Ɨ~�����̂ł�����A�܂���ōčw";
		mes "�����˂������܂��I�ł́A�����~����";
		mes "�̂ł��傤���I";
		while(1) {
			next;
			input .@num;
			if(.@num>5) {
				mes "[�}���R=�o�W�j�I]";
				mes "�E�z�z�z�z�z�z�A�ʖځA�ʖڑʖځI";
				mes "���̂������グ��5�܂łƐ�������";
				mes "������ˁI���͂������[��̐l�ɁA����";
				mes "�`���R���[�g�𖡂���ė~�����̂ł��I";
				mes "����ɁA�H�ׂ�����Ƒ���܂��I";
				continue;
			}
			break;
		}
		if(.@num>0) {
			if(Zeny<.@num*5000) {
				mes "[�}���R=�o�W�j�I]";
				mes "�E�z�H���ꂠ��A�����c�c���q����I";
				mes "����������܂����B����ł̓`���R";
				mes "���[�g�𔄂邱�Ƃ͏o���܂���I";
				mes "���́A�������΂炭�����ɂ��܂�����";
				mes "�������o������܂��ǂ����I";
				close;
			}
			set Zeny,Zeny-.@num*5000;
			getitem 558,.@num;
			mes "[�}���R=�o�W�j�I]";
			mes "���肪�Ƃ��������܂��I";
			mes "���́A�������΂炭�����ɂ��܂�����";
			mes "�`���R���[�g���~�����Ȃ�����A�܂�";
			mes "�ǂ����I���҂����Ă���܂��I";
			close;
		}
	}
	mes "[�}���R=�o�W�j�I]";
	mes "�E�z�H���`��ȃX�y�V�����ȃ`���R���[";
	mes "�g���~�����Ȃ��Ɓc�c�c�O�ł��ˁI";
	mes "���������������Ȃ��X�y�V�����œ��ʂ�";
	mes "���َq�ł���I�l�������āA�`���R���[";
	mes "�g���~�����Ȃ����琥�񐥔񐥔�܂�";
	mes "���Ă��������I���҂����Ă���܂��I";
	close;
}

alberta,29,243,4	script	�`���R���[�g���l�̗��l	53,{
	if(Sex || countitem(7182)<5 || countitem(7134)<1 || countitem(519)<1 || countitem(612)<1) {
		mes "[�G�X�e��=���[�Y]";
		mes "����ɂ��́B���́A���̔ނ������Ă���";
		mes "�`���R���[�g�͎�������Ă����ł��B";
		mes "�O���ŁA�����@���w��ł����̂ł��B";
		next;
		mes "[�G�X�e��=���[�Y]";
		mes "�O���ł́A���̎����ɍD���Ȑl�Ƀ`���R";
		mes "���[�g���v���[���g���镗�K�������";
		mes "���B�Â��C�������A�Â��`���R���[�g��";
		mes "�����c�c���΂炵���Ǝv���܂��񂩁H";
		next;
		mes "[�G�X�e��=���[�Y]";
		mes "���̃`���R���[�g�������ł������ɗ���";
		mes "��΂ƁA�������񂽂�����A�`���R���[";
		mes "�g���������ł��B";
		next;
		mes "[�G�X�e��=���[�Y]";
		mes "�ނ́A����Ȏ������āu�����ɏo����";
		mes "���Ƃ�����񂾁v���Ċ撣���ă`���R";
		mes "���[�g�𔄂��Ă���Ă����ł��B";
		mes "���̋C���������������ǁA�`���R���[";
		mes "�g�𔃂��Ă��ꂽ���X�̏Ί炪�A�����";
		mes "�����K���ɂ��Ă�����ł��B";
		next;
		if(Sex) {	//�j�Ȃ�I��
			mes "[�G�X�e��=���[�Y]";
			mes "������A���厖�ɑ厖�ɍ����";
			mes "�����ł��B�����ł����������ł���";
			mes "�Ǝv���܂����A��x�����オ���Ă݂�";
			mes "���������ˁB�ӂ��A�撣���Ă�����";
			mes "���Ȃ���I";
			close;
		}
		mes "[�G�X�e��=���[�Y]";
		mes "��قǂ������܂������A�O���ł͂��̎���";
		mes "�D���Ȑl�Ƀ`���R���[�g���v���[���g";
		mes "�����ł��B�����A�D���ȕ�������Ȃ�";
		mes "�`���R���[�g�ƈꏏ�ɋC������`����";
		mes "�݂܂��񂩁H";
		next;
		mes "[�G�X�e��=���[�Y]";
		mes "�ޗ��������ė��Ă����΁A�`���R���[";
		mes "�g�����܂��B���̔ނ������Ă���`��";
		mes "�R���[�g�ł������̂ł����c�c";
		mes "�����Ŕ������A�����ŏW�߂��ޗ���";
		mes "������`���R���[�g�̂ق����A���́c�c";
		next;
		mes "[�G�X�e��=���[�Y]";
		mes "�����̋C����������ɓ`���悤�ȋC��";
		mes "���܂��񂩁H";
		next;
		mes "[�G�X�e��=���[�Y]";
		mes "�ޗ��ł����A�����̏����͂����ł����H";
		mes "^3355ff�J�J�I 5��";
		mes "�~���N 1��";
		mes "���� 1��";
		mes "�g�їp�n�z�F 1��^000000";
		next;
		mes "[�G�X�e��=���[�Y]";
		mes "�������ł�����A�����Ă��������B";
		mes "���������`���R���[�g����点��";
		mes "���������܂��B";
		close;
	}
	mes "[�G�X�e��=���[�Y]";
	mes "�������o������ł��ˁI�ł́A�����r��";
	mes "���킹�Ă��������܂��I";
	mes "���A�ׂɂ���ނɂ͓����ł���B";
	next;
	delitem 7182,5;
	delitem 7134,1;
	delitem 519,1;
	delitem 612,1;
	getitem 558,1;
	mes "[�G�X�e��=���[�Y]";
	mes "�͂��A�o���オ��܂����I";
	mes "�v���[���g�Ȃ���̂ł����H";
	mes "�C�������`���Ƃ����ł��ˁB";
	mes "�K���ɂȂ��Ă��������`�B";
	close;
}

prt_castle,42,35,3	script	���{�f�U�[�g�E�l	47,{
	if(Sex) {
		mes "[�V������=�I�����A��]";
		mes "�{���W���`��_���b�V���[�B���^�N�V��";
		mes "�y�������ꏊ����|�p�𐶂ݏo�����߁A";
		mes "���̃A�g���G�ɕ����~�肽�Ƃ���Ȃ�";
		mes "�ł��B";
		next;
		mes "[�V������=�I�����A��]";
		mes "�I�D�A�m���m���I���̐��炩�ȓ���";
		mes "���炵�������݂̂��f�����Ȃ̂ł��B";
		next;
		mes "[�V������=�I�����A��]";
		mes "�I�D�`�A����łȂ��Ă��Z�����̂�";
		mes "���̃V������=�I�����A����ς킹��";
		mes "�Ȃ�āB�I�D�`�A�m���m���m���B";
		close;
	}
	mes "[�V������=�I�����A��]";
	mes "�I�D�A�}�h���A�[���I";
	mes "�M���������ɂ��邾���ŁA���̂ނ�";
	mes "�ꂵ���ꏊ���V���ɓ������Ȃ�B";
	next;
	mes "[�V������=�I�����A��]";
	mes "�V�g�̂悤�Ɉ����邵���M����";
	mes "�����������p�ł����ɂ��炵���̂��ȁH";
	mes "���^�N�V�߂ł悯��΁A���ł��肢��";
	mes "�����܂��傤�B";
	next;
	if(select("�`���R���[�g������Ă���܂����H","�����l�ł��B")==2) {
		mes "[�V������=�I�����A��]";
		mes "�I�D�A���̈ꌾ�c�c���^�N�V�̑��݂�";
		mes "���ɋA���悤�ȁc�c���̕X�̐n�̂悤��";
		mes "�ꌾ���A���̐g�����A��������������";
		mes "�����Ă��܂��c�c";
		next;
		mes "[�V������=�I�����A��]";
		mes "�I�D�A�}�h���A�[���I";
		mes "�ǂ�����΂ǂ�����΁c�c�M���̐S��";
		mes "�Ăу��^�N�V�̗��Əo����̂�!?";
		close;
	}
	if(countitem(558)<3) {
		mes "[�V������=�I�����A��]";
		mes "�I�D�A�}�h���A�[���I";
		mes "���^�N�V�͐_�ł��B���p�t�ł��Ȃ��̂�";
		mes "���B�ςȍޗ�����|�p�i��n��o������";
		mes "�ȂǏo���܂���I�����āA���}�ȃA�C�e";
		mes "�����畽�}�ȍ�i�����ȂǁA�̑�Ȍ|";
		mes "�p�Ƃ̃��^�N�V�ɂ͕s�\!!";
		next;
		mes "[�V������=�I�����A��]";
		mes "���^�N�V���n�����镨�́A���E���̒N��";
		mes "�����Q�̂��ߑ���f���A�N�ɂ�����^��";
		mes "�o���Ȃ��|�p�i�Ȃ̂ł��B";
		next;
		mes "[�V������=�I�����A��]";
		mes "���^�N�V���M���̋�J�ɕ񂢂�ׂɂ�";
		mes "^3355ff�`���R���[�g3��^000000����ΕK�v�Ȃ̂ł��B";
		mes "����ȉ��ł��A����ȏ�ł��Ȃ��B";
		mes "�s�b�^��3�c�c�B";
		next;
		mes "[�V������=�I�����A��]";
		mes "�}�h���A�[���̌��P�����e�Ɖؚ��Ȑg��";
		mes "�B���ꂽ���x�Ȉӎu�Ȃ�A�����Ǝ��";
		mes "����Ă��邱�Ƃ��\�ł��傤�B";
		next;
		mes "[�V������=�I�����A��]";
		mes "�����ł����B^3355ff�`���R���[�g3��^000000��������";
		mes "���Ă��������B�o���邱�ƂȂ�΂̒�";
		mes "���̒��A�n���̒�ւł��A�M���ׂ̈�";
		mes "���^�N�V�����ڎ�ɓ���č����グ����";
		mes "���A���̃��^�N�V�͉��{�̋Ɩ��ɏI�n";
		mes "�I����g�c�c�I�D�c�c";
		next;
		mes "[�V������=�I�����A��]";
		mes "�I �����H���[ �}�h���A�[���c�c";
		mes "�M���̋A���S���炨�҂�����";
		mes "����܂��c�c";
		close;
	}
	mes "[�V������=�I�����A��]";
	mes "�I�D�A�}�h���A�[���I";
	mes "���^�N�V�̎��Ă�S�Ă̊�����������";
	mes "�M���̃`���R���[�g����������΂炵��";
	mes "���т₩�Ȍ|�p�ւƏ��؂����Ă�����";
	mes "���܂��傤�I";
	next;
	mes "[�V������=�I�����A��]";
	mes "�M���̓��Ƃ�����΂��A���E���̒N����";
	mes "��������A�����Ő_��I�Ȉ��̌������";
	mes "�悤�Ɂc�c";
	next;
	mes "[�V������=�I�����A��]";
	mes "�A�� �h�D �g���� �N�@�g���c�c";
	mes "�݂ɂ����A�q���̎q�������������ɕϐg";
	mes "�����悤�Ɂc�c���}�ȃ`���R���[�g����";
	mes "�����|�p�ɕϐg����̂��c�c!!";
	next;
	mes "[�V������=�I�����A��]";
	mes "�g������ݍ��݁c�c�����Ăӂ����";
	mes "�ω����邪�����I";
	mes "���x�ɂāA�̑�Ȃ鎞��̖����c�c�I";
	next;
	delitem 558,3;
	getitem 559,1;
	mes "[�V������=�I�����A��]";
	mes "�I�D�A�t�F���V�^�V�I���I�I�D�`������";
	mes "����ȑf�G�ȍ�i�����o����Ƃ́c�c";
	mes "���^�N�V�͂Ȃ�ƍߐ[���̂��c�c�I";
	mes "�}�h���A�[���A���̋M���̎��ɂ̔��΂�";
	mes "�Ƃ�������|�p�i�A�C�ɓ����Ă�������";
	mes "�����ȁB";
	next;
	mes "[�V������=�I�����A��]";
	mes "�ł́A�I �����H���`�B";
	close;
}
*/