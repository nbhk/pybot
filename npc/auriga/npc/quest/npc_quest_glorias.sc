//= Athena Script ==============================================================
// Ragnarok Online MakeGlorias Script	by refis
//==============================================================================

//============================================================
// �O�����A�X
//------------------------------------------------------------
yuno,335,38,2	script	�O�����A�X#yuno	813,{
	mes "[�O�����A�X]";
	mes "�悭�����ȁB";
	mes "���V�́A�O�����A�X�B";
	mes "����ȃA�C�e����";
	mes "�������Ă���u���b�N�X�~�X����B";
	next;
	mes "[�O�����A�X]";
	mes "�ŋ߁A���̒��ɏo���悤�ɂȂ���";
	mes "�uGvG�R�C���v�A�u�A���[�i�R�C���v�A";
	mes "�u�^�[�{�g���b�N�R�C���v�A";
	mes "�u�J�v���R�C���v�A";
	mes "�u�G���h���X�^���[�R�C���v��";
	mes "�m���Ă��邩�ˁH";
	next;
	mes "[�O�����A�X]";
	mes "���̃R�C���A";
	mes "���ɕs�v�c�ȗ͂��߂Ă����ĂȁB";
	mes "�������ƏW�߂Ă���񂶂Ⴊ�A";
	mes "�Ƃɂ����������K�v�łȁB";
	next;
	mes "[�O�����A�X]";
	mes "�����ŁA���V�̍����";
	mes "����ȃA�C�e����";
	mes "5��ނ̃R�C���ƌ���������";
	mes "�W�߂Ă���񂶂��B";
	next;
	mes "[�O�����A�X]";
	mes "���Ȃ݂Ƀ��V�̃A�C�e���́A";
	mes "���͂����邪�̂�";
	mes "��������t���Ă���B";
	mes "���l�ɓn������A�J�[�g�ɓ��ꂽ��A";
	mes "�J�v���T�[�r�X�ɗa������A";
	mes "�n�ʂɗ��Ƃ�����́A��΂ɂł���B";
	next;
	mes "[�O�����A�X]";
	mes "�ǂ����Ă�����������Ǝv������A";
	mes "�X�̓���Ȃǂɓn���΂����B";
	mes "���V�̎茳�ɖ߂��Ă���悤��";
	mes "�b�����Ă��邩��̂��B";
	next;
	mes "[�O�����A�X]";
	mes "�������A����������̕�����";
	mes "�\�͂̍����͐܂莆�t������I";
	mes "�]�ނ̂ł���΁A����̎����Ă���";
	mes "�R�C���ƃ��V�̍�����A�C�e����";
	mes "�����������̂��Ⴊ�A�ǂ�����낤���H";
	next;
	switch(select("����ƌ���","�h��ƌ���","��߂�")) {
	case 1:
		mes "[�O�����A�X]";
		mes "�t���c�c";
		mes "����Ƃ̌�����]�ނ̂��B";
		mes "�ǂ̕��킪�������ˁH";
		next;
		switch(select(
			"�O�����A�X�_�}�X�J�X","�O�����A�X�t�����x���W�F","�O�����A�X���C�s�A",
			"�O�����A�X�z�[���[�A���F���W���[","�O�����A�X�N���C���A","�O�����A�X�X�s�A",
			"�O�����A�X�����X","�O�����A�X�N���[���@�[","�O�����A�X�c�[�n���h�A�b�N�X",
			"�O�����A�X���[�j���O�X�^�[","�O�����A�X�u���b�f�B���A","�O�����A�X�W���}�_�n��",
			"�O�����A�X�^�u���b�g","�O�����A�X�َ��^","�O�����A�X�n���^�[�{�E",
			"�O�����A�X�N���[","�O�����A�X�t�B�X�g","�O�����A�X�A�[�N�����h",
			"�O�����A�X�����̏�","�O�����A�X�E�B�U�[�h�X�^�b�t",
			"�O�����A�X�M�^�[","�O�����A�X�����G�b�g",
			"�O�����A�X�n���h�K��","�O�����A�X���C�t��","�O�����A�X�K�g�����O�K��",
			"�O�����A�X�V���b�g�K��","�O�����A�X�O���l�[�h�K��","�O�����A�X�����藠��"
			)) {
		case 1:		//�O�����A�X�_�}�X�J�X
			set .@type$,"�Z��";
			set .@gain,13042;
			break;
		case 2:		//�O�����A�X�t�����x���W�F
			set .@type$,"�Ў茕";
			set .@gain,13416;
			break;
		case 3:		//�O�����A�X���C�s�A
			set .@type$,"�Ў茕";
			set .@gain,13417;
			break;
		case 4:		//�O�����A�X�z�[���[�A���F���W���[
			set .@type$,"�Ў茕";
			set .@gain,13418;
			break;
		case 5:		//�O�����A�X�N���C���A
			set .@type$,"���茕";
			set .@gain,1187;
			break;
		case 6:		//�O�����A�X�X�s�A
			set .@type$,"�Ў葄";
			set .@gain,1426;
			break;
		case 7:		//�O�����A�X�����X
			set .@type$,"���葄";
			set .@gain,1486;
			break;
		case 8:		//�O�����A�X�N���[���@�[
			set .@type$,"�Ў蕀";
			set .@gain,1310;
			break;
		case 9:		//�O�����A�X�c�[�n���h�A�b�N�X
			set .@type$,"���蕀";
			set .@gain,1382;
			break;
		case 10:	//�O�����A�X���[�j���O�X�^�[
			set .@type$,"�݊�";
			set .@gain,1546;
			break;
		case 11:	//�O�����A�X�u���b�f�B���A
			set .@type$,"�J�^�[��";
			set .@gain,1281;
			break;
		case 12:	//�O�����A�X�W���}�_�n��
			set .@type$,"�J�^�[��";
			set .@gain,1282;
			break;
		case 13:	//�O�����A�X�^�u���b�g
			set .@type$,"�{";
			set .@gain,1576;
			break;
		case 14:	//�O�����A�X�َ��^
			set .@type$,"�{";
			set .@gain,1577;
			break;
		case 15:	//�O�����A�X�n���^�[�{�E
			set .@type$,"�|";
			set .@gain,1743;
			break;
		case 16:	//�O�����A�X�N���[
			set .@type$,"��";
			set .@gain,1826;
			break;
		case 17:	//�O�����A�X�t�B�X�g
			set .@type$,"��";
			set .@gain,1827;
			break;
		case 18:	//�O�����A�X�A�[�N�����h
			set .@type$,"�Ў��";
			set .@gain,1640;
			break;
		case 19:	//�O�����A�X�����̏�
			set .@type$,"�Ў��";
			set .@gain,1641;
			break;
		case 20:	//�O�����A�X�E�B�U�[�h�X�^�b�t
			set .@type$,"�����";
			set .@gain,2002;
			break;
		case 21:	//�O�����A�X�M�^�[
			set .@type$,"�y��";
			set .@gain,1927;
			break;
		case 22:	//�O�����A�X�����G�b�g
			set .@type$,"��";
			set .@gain,1981;
			break;
		case 23:	//�O�����A�X�n���h�K��
			set .@type$,"�n���h�K��";
			set .@gain,13110;
			break;
		case 24:	//�O�����A�X���C�t��
			set .@type$,"���C�t��";
			set .@gain,13176;
			break;
		case 25:	//�O�����A�X�K�g�����O�K��
			set .@type$,"�K�g�����O�K��";
			set .@gain,13177;
			break;
		case 26:	//�O�����A�X�V���b�g�K��
			set .@type$,"�V���b�g�K��";
			set .@gain,13178;
			break;
		case 27:	//�O�����A�X�O���l�[�h�K��
			set .@type$,"�O���l�[�h�K��";
			set .@gain,13179;
			break;
		case 28:	//�O�����A�X�����藠��
			set .@type$,"�����藠��";
			set .@gain,13307;
			break;
		}
		mes "[�O�����A�X]";
		mes .@type$+ "��";
		mes "�u^FF0000" +getitemname(.@gain)+ "^000000�v��";
		mes "�����ɕK�v�ȃR�C���́A";
		mes "GvG�R�C�� 100���A";
		mes "�A���[�i�R�C�� 200���A";
		mes "�^�[�{�g���b�N�R�C�� 200���A";
		mes "�J�v���R�C�� 150���A";
		mes "�G���h���X�^���[�R�C�� 50������B";
		next;
		mes "[�O�����A�X]";
		mes "���Ȃ�R�C���ł͂Ȃ�";
		mes "�u^FF0000�O�����A�X��������`�P�b�g^000000�v";
		mes "1���Ƃ̌������s���Ă��邼�B";
		next;
		mes "[�O�����A�X]";
		mes "�u^FF0000" +getitemname(.@gain)+ "^000000�v��";
		mes "�������邩�ˁH";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�O�����A�X]";
			mes "�Ȃ񂶂�A�~�߂�̂��H";
			mes "�܂��A�D���ɂ����炦���B";
			close;
		}
		next;
		mes "[�O�����A�X]";
		mes "�R�C���ƃ`�P�b�g��";
		mes "�ǂ�����g�p���邩�ˁH";
		next;
		switch(select("�R�C���Ō���","�`�P�b�g�Ō���","�������Ȃ�")) {
		case 1:
			if(countitem(6364) < 100 || countitem(6365) < 200 || countitem(6366) < 200 ||
				countitem(6367) < 150 || countitem(6368) < 50) {
				mes "[�O�����A�X]";
				mes "��H";
				mes "�K�v�ȃR�C��������Ȃ��悤���ȁB";
				mes "������x�m�F���Ă��痈�Ȃ����B";
				close;
			}
			if(checkitemblank() == 0) {
				mes "�]�����A�C�e���̎�ސ���������";
				mes "�@�댯�ł��B";
				mes "�@�����A�C�e�������炵�Ă���A";
				mes "�@�ēx�b�������Ă��������]";
				close;
			}
			delitem 6364,100;
			delitem 6365,200;
			delitem 6366,200;
			delitem 6367,150;
			delitem 6368,50;
			break;
		case 2:
			if(countitem(6798) < 1) {
				mes "[�O�����A�X]";
				mes "��H";
				mes "�`�P�b�g���Ȃ��悤���ȁB";
				mes "������x�m�F���Ă��痈�Ȃ����B";
				close;
			}
			if(checkitemblank() == 0) {
				mes "�]�����A�C�e���̎�ސ���������";
				mes "�@�댯�ł��B";
				mes "�@�����A�C�e�������炵�Ă���A";
				mes "�@�ēx�b�������Ă��������]";
				close;
			}
			delitem 6798,1;
			break;
		case 3:
			mes "[�O�����A�X]";
			mes "�Ȃ񂶂�A�~�߂�̂��H";
			mes "�܂��A�D���ɂ����炦���B";
			close;
		}
		getitem .@gain,1;
		mes "[�O�����A�X]";
		mes "���V�̍��������́A";
		mes "���B����قǂ�";
		mes "���ʂȔ\�͂������̂���I";
		close;
	case 2:
		mes "[�O�����A�X]";
		mes "�t���c�c";
		mes "�h��Ƃ̌�����]�ނ̂��B";
		mes "�ǂ̖h��������ˁH";
		next;
		switch(select(
			"�O�����A�X�}�t���[",
			"�O�����A�X���y�p�V���[�Y","�O�����A�X�ʎY�^�V���[�Y","�O�����A�X�V���[�Y",
			"�O�����A�X���y�p�X�[�c","�O�����A�X�ʎY�^�X�[�c","�O�����A�X�X�[�c",
			"�O�����A�X���y�p�����O","�O�����A�X�ʎY�^�����O","�O�����A�X�����O"
			)) {
		case 1:		//�O�����A�X�}�t���[
			set .@type$,"���ɂ����镨";
			set .@gain,2549;
			set .@ticket,6799;
			set .@gvg,200;
			set .@arena,400;
			set .@tarbo,400;
			set .@kafra,300;
			set .@endless,100;
			break;
		case 2:		//�O�����A�X���y�p�V���[�Y
			set .@type$,"�C";
			set .@gain,2446;
			set .@ticket,6799;
			set .@gvg,10;
			set .@arena,20;
			set .@tarbo,20;
			set .@kafra,50;
			set .@endless,5;
			break;
		case 3:		//�O�����A�X�ʎY�^�V���[�Y
			set .@type$,"�C";
			set .@gain,2445;
			set .@ticket,6799;
			set .@gvg,30;
			set .@arena,50;
			set .@tarbo,50;
			set .@kafra,100;
			set .@endless,20;
			break;
		case 4:		//�O�����A�X�V���[�Y
			set .@type$,"�C";
			set .@gain,2444;
			set .@ticket,6799;
			set .@gvg,200;
			set .@arena,400;
			set .@tarbo,400;
			set .@kafra,300;
			set .@endless,100;
			break;
		case 5:		//�O�����A�X���y�p�X�[�c
			set .@type$,"�Z";
			set .@gain,2396;
			set .@ticket,6799;
			set .@gvg,10;
			set .@arena,20;
			set .@tarbo,20;
			set .@kafra,50;
			set .@endless,5;
			break;
		case 6:		//�O�����A�X�ʎY�^�X�[�c
			set .@type$,"�Z";
			set .@gain,2395;
			set .@ticket,6799;
			set .@gvg,30;
			set .@arena,50;
			set .@tarbo,50;
			set .@kafra,100;
			set .@endless,20;
			break;
		case 7:		//�O�����A�X�X�[�c
			set .@type$,"�Z";
			set .@gain,2394;
			set .@ticket,6799;
			set .@gvg,200;
			set .@arena,400;
			set .@tarbo,400;
			set .@kafra,300;
			set .@endless,100;
			break;
		case 8:		//�O�����A�X���y�p�����O
			set .@type$,"�A�N�Z�T���[";
			set .@gain,2774;
			set .@ticket,6800;
			set .@gvg,10;
			set .@arena,20;
			set .@tarbo,20;
			set .@kafra,50;
			set .@endless,5;
			break;
		case 9:		//�O�����A�X�ʎY�^�����O
			set .@type$,"�A�N�Z�T���[";
			set .@gain,2773;
			set .@ticket,6800;
			set .@gvg,100;
			set .@arena,200;
			set .@tarbo,200;
			set .@kafra,150;
			set .@endless,50;
			break;
		case 10:	//�O�����A�X�����O
			set .@type$,"�A�N�Z�T���[";
			set .@gain,2772;
			set .@ticket,6800;
			set .@gvg,1000;
			set .@arena,2000;
			set .@tarbo,2000;
			set .@kafra,1000;
			set .@endless,800;
			break;
		}
		mes "[�O�����A�X]";
		mes .@type$+ "��";
		mes "�u^FF0000" +getitemname(.@gain)+ "^000000�v��";
		mes "�����ɕK�v�ȃR�C���́A";
		mes "GvG�R�C�� " +.@gvg+ "���A";
		mes "�A���[�i�R�C�� " +.@arena+ "���A";
		mes "�^�[�{�g���b�N�R�C�� " +.@tarbo+ "���A";
		mes "�J�v���R�C�� " +.@kafra+ "���A";
		mes "�G���h���X�^���[�R�C�� " +.@endless+ "������B";
		next;
		mes "[�O�����A�X]";
		mes "���Ȃ�R�C���ł͂Ȃ�";
		mes "�u^FF0000" +getitemname(.@ticket)+ "^000000�v";
		mes "1���Ƃ̌������s���Ă��邼�B";
		next;
		mes "[�O�����A�X]";
		mes "�u^FF0000" +getitemname(.@gain)+ "^000000�v��";
		mes "�������邩�ˁH";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�O�����A�X]";
			mes "�Ȃ񂶂�A�~�߂�̂��H";
			mes "�܂��A�D���ɂ����炦���B";
			close;
		}
		next;
		mes "[�O�����A�X]";
		mes "�R�C���ƃ`�P�b�g��";
		mes "�ǂ�����g�p���邩�ˁH";
		next;
		switch(select("�R�C���Ō���","�`�P�b�g�Ō���","�������Ȃ�")) {
		case 1:
			if(countitem(6364) < .@gvg || countitem(6365) < .@arena || countitem(6366) < .@tarbo ||
				countitem(6367) < .@kafra || countitem(6368) < .@endless) {
				mes "[�O�����A�X]";
				mes "��H";
				mes "�K�v�ȃR�C��������Ȃ��悤���ȁB";
				mes "������x�m�F���Ă��痈�Ȃ����B";
				close;
			}
			if(checkitemblank() == 0) {
				mes "�]�����A�C�e���̎�ސ���������";
				mes "�@�댯�ł��B";
				mes "�@�����A�C�e�������炵�Ă���A";
				mes "�@�ēx�b�������Ă��������]";
				close;
			}
			delitem 6364,.@gvg;
			delitem 6365,.@arena;
			delitem 6366,.@tarbo;
			delitem 6367,.@kafra;
			delitem 6368,.@endless;
			break;
		case 2:
			if(countitem(.@ticket) < 1) {
				mes "[�O�����A�X]";
				mes "��H";
				mes "�`�P�b�g���Ȃ��悤���ȁB";
				mes "������x�m�F���Ă��痈�Ȃ����B";
				close;
			}
			if(checkitemblank() == 0) {
				mes "�]�����A�C�e���̎�ސ���������";
				mes "�@�댯�ł��B";
				mes "�@�����A�C�e�������炵�Ă���A";
				mes "�@�ēx�b�������Ă��������]";
				close;
			}
			delitem .@ticket,1;
			break;
		case 3:
			mes "[�O�����A�X]";
			mes "�Ȃ񂶂�A�~�߂�̂��H";
			mes "�܂��A�D���ɂ����炦���B";
			close;
		}
		getitem .@gain,1;
		mes "[�O�����A�X]";
		mes "���V�̖h��́A";
		mes "���͂��Ⴜ�I";
		close;
	case 3:
		mes "[�O�����A�X]";
		mes "�Ȃ񂶂�A�~�߂�̂��H";
		mes "�܂��A�D���ɂ����炦���B";
		close;
	}
}

//============================================================
// �G���h���X�^���[�R�C������NPC
//------------------------------------------------------------
alberta,202,79,2	script	�D�F�̖���	803,{
	mes "[�D�F�̖���]";
	mes "���́A�D�F�̖����B";
	mes "�G���h���X�^���[�Ŏ�ɓ���";
	mes "�ł̊D����������҂��B";
	next;
	mes "[�D�F�̖���]";
	mes "���񂽁A�G���h���X�^���[��";
	mes "�o�����������邩���H";
	mes "�����A�ł̊D�������Ă���Ȃ�";
	mes "�G���h���X�^���[�R�C����";
	mes "�������Ȃ����ˁH";
	next;
	switch(select("��������","�������Ȃ�","�ł̊D���āH","���Ɏg���́H")) {
	case 1:
		break;
	case 2:
		mes "[�D�F�̖���]";
		mes "����H";
		mes "�������Ȃ��̂����H";
		mes "�܂��A���͍\��Ȃ����ˁc�c";
		close;
	case 3:
		mes "[�D�F�̖���]";
		mes "�ł̊D��m��Ȃ����āH";
		mes "����ł����񂽖`���҂����H";
		next;
		mes "[�D�F�̖���]";
		mes "�ł̊D�Ƃ́A�G���h���X�^���[��";
		mes "���K�w�ȏ�o��Ǝ�ɓ���A�C�e����";
		mes "�u�͂��܂�̏����v�Ƃ��������Ɏg����";
		mes "����K�w�Ƀ��[�v�����Ă����Ƃ���";
		mes "�s�v�c�ȊD���c�c";
		close;
	case 4:
		mes "[�D�F�̖���]";
		mes "�ł̊D����̉��Ɏg���������āH";
		mes "�q�b�q�b�q�c�c";
		mes "���̒��ɂ͒m��Ȃ�����";
		mes "�K���Ȏ�������񂾂�c�c";
		close;
	}
	mes "[�D�F�̖���]";
	mes "�����������������B";
	mes "�ł́A�ł̊D 1�ɂ��A";
	mes "�ꖇ�̃G���h���X�^���[�R�C����";
	mes "�������悤����Ȃ����B";
	next;
	mes "[�D�F�̖���]";
	mes "�����C���ς�����Ȃ�A";
	mes "0�ƌ����Ă�����B";
	mes "�����~�����񂾂��H";
	next;
	input .@num;
	if(.@num == 0) {
		mes "[�D�F�̖���]";
		mes "�C���ς�����̂����H";
		mes "�ł́A�܂��̋@��ɂ��悤���B";
		close;
	}
	if(.@num < 0 || .@num > 30000) {
		mes "[�D�F�̖���]";
		mes "�����������Ȃ��悤���ˁB";
		close;
	}
	if(countitem(6000) < .@num) {
		mes "[�D�F�̖���]";
		mes "�ł̊D�̐�������Ȃ��悤���ˁB";
		mes "�������ƃG���h���X�^���[��";
		mes "�o���Ă����ŁI";
		close;
	}
	if(checkitemblank() == 0) {
		mes "�]�����A�C�e���̎�ސ���������";
		mes "�@�댯�ł��B";
		mes "�@�����A�C�e�������炵�Ă���A";
		mes "�@�ēx�b�������Ă��������]";
		close;
	}
	delitem 6000,.@num;
	getitem 6368,.@num;
	mes "[�D�F�̖���]";
	mes "���肪�����B";
	mes "����ōX�Ɍ������i�ނ��낤�B";
	mes "�q�b�q�b�q�c�c";
	close;
}