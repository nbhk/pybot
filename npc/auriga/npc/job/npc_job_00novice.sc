//====================================================================
// Ragnarok Online	Novice Script	by yukito
//
//�@�� CHANGE_NV
//	+0x1		�t�@���̃p�^�[���P
//	+0x2		�t�@���̃p�^�[���Q
//	+0x4		�t�@���I��
//	+0x8		��t�v���I��
//	+0x10		�C���^�[�t�F�[�X�����I��
//	+0x20		�X�L�������I��
//	+0x40		�A�C�e�������I��
//	+0x80		�J�v��BaseLvUp�I��
//	+0x100		�J�v��JobLvUp�I��
//	+0x200		�G���~���I��
//	+0x400		�퓬���K��t����I��
//	+0x800		�퓬���K��t�Q��ڏI��
//	+0x1000		�E�Ƌ����I��
//	+0x2000		�K�������I��
//====================================================================

//==========================================
// �C����O
//------------------------------------------

new_1-1,53,114,4	script	�t�@��#new_1-1	727,{
	switch(CHANGE_NV &0x7) {
	case 0:
		mes "[�t�@��]";
		mes "����A���߂Č���炩����H";
		mes "������̐��E�ւ��炵�����Ƃ�";
		mes "���}���܂��B";
		mes "�����ƁA�����O�́c�c";
		mes strcharinfo(0);
		mes "�c�c���������O�ˁB";
		next;
		mes "[�t�@��]";
		mes "�����ŉ�����̂������̉��ł��傤�B";
		mes "����`�����܂���B";
		mes "�ړ��͂ǂ�����΂����́H�Ƃ�";
		mes "�ǂ��֍s���΂����́H�Ƃ�";
		mes "�����A���ɕ����������Ƃ͂Ȃ��H";
		next;
		switch(select("�ǂ��֍s���΂����́H","��{����ɂ��ċ�����","���Ȃ��͒N�H")) {
			case 1:
				mes "[�t�@��]";
				mes "�������̐�ɂ������Ă��鋴���킩��H";
				mes "�ؐ��ŃL�C�L�C�������邯�ǁc�c";
				mes "�����n��Ƃ��邪����́B";
				mes "���̂���֓����Ă����΂����̂�B";
				next;
				mes "[�t�@��]";
				mes "�����̏����ȓ����̏���";
				mes "^4A4AFF�����܂��Ă����^000000������́B";
				mes "����͋�ԂƋ�Ԃ��Ȃ����́B";
				mes "�ǂ����ֈړ����鎞��";
				mes "�K���ʂ�Ȃ���΂Ȃ�Ȃ����̂�B";
				next;
				mes "[�t�@��]";
				mes "�����A�ړ��͂ł���H";
				mes "�ړ��������ꏊ�ɎO�p�̈��";
				mes "���킹�ăN���b�N�B";
				mes "���ɘb���������悤�ɂ���΂�����B";
				mes "���v��ˁH";
				next;
				mes "[�t�@��]";
				mes "���Ⴀ�A�����̋��̐��";
				mes "����A���S�ҏC����֍s���Ȃ����B";
				mes "������̋߂��Ɉē������Ă����";
				mes "���m�����邩��A���v��ˁH";
				mes "���ӂӂ��B";
				set CHANGE_NV,CHANGE_NV|0x1;
				close;
			case 2:
				mes "[�t�@��]";
				mes "��{����ˁc�c";
				mes "�N���b�N�A�_�u���N���b�N�A�h���b�O";
				mes "�Ƃ������t�͕�����H";
				mes "�}�E�X�̃{�^������x������";
				mes "�N���b�N��ˁH";
				mes "�A���œ�x�����̂��_�u���N���b�N�B";
				next;
				mes "[�t�@��]";
				mes "�h���b�O�̓}�E�X���N���b�N�����܂�";
				mes "�㉺���E�ɓ��������Ƃ�B";
				mes "���͂̑I�������鎞��";
				mes "�t�@�C�����ړ����鎞�Ƃ���";
				mes "�悭�g�����ˁB";
				next;
				mes "[�t�@��]";
				mes "����������{�I�Ȃ��Ƃ�";
				mes "�܂��������Ă����������������B";
				mes "�g���@���������ˁB";
				mes "�����āc�c";
				next;
				mes "[�t�@��]";
				mes "�`���ɕK�v�Ȃ��Ƃ�";
				mes "���̋���n������ɂ���";
				mes "��̒��Ŋw�Ԃ��Ƃ��ł����B";
				mes "�N�̂悤�Ȗ`���̏��S�҂̂��߂�";
				mes "�ꏊ������ˁB���Ⴀ�A";
				mes "���S�ҏC����֍s���Ă݂Ȃ����B";
				next;
				mes "[�t�@��]";
				mes "���������ɍs����";
				mes "^4A4AFF�����܂��Ă����^000000������́B";
				mes "�������N���b�N���Ĕ�э��߂΂�����B";
				mes "���ɂ͌W�̐l�����邩��";
				mes "���S���āB�ӂӂ��B";
				set CHANGE_NV,CHANGE_NV|0x1;
				close;
			case 3:
				mes "[�t�@��]";
				mes "���A���H���̓t�@����B";
				mes "���������āA���o�����";
				mes "����������̂��ȁH";
				mes "���A�Ⴄ�H";
				mes "�ށ`�I";
				mes "�������ƏC����֍s���Ȃ����I";
				set CHANGE_NV,CHANGE_NV|0x2;
				close;
		}
	case 1:
		mes "[�t�@��]";
		mes "����A�ǂ������́H";
		mes "���������āA�s���̂����߂���Ă�́H";
		mes "���S�ҏC����ł͗l�X�Ȃ��Ƃ�";
		mes "�w�ׂ���B�������A���ꂾ������Ȃ�";
		mes "�����񕜃A�C�e���Ȃǂ�";
		mes "�x�����Ă����́B";
		next;
		mes "[�t�@��]";
		mes "�Ⴆ�΁c�c�ق�";
		mes "����ȕ��Ɍo�����ς߂�̂�B";
		set CHANGE_NV,CHANGE_NV|0x4;
		getexp 9,0;
		next;
		mes "[�t�@��]";
		mes "�N�ɂƂ��Ă͂������";
		mes "��ςȂ��Ƃ�������Ȃ�����";
		mes "�s�����l�͏\���ɂ����B";
		mes "�����Ŋw�񂾂��Ƃ�";
		mes "���������Ɩ��ɗ��B";
		mes "�c�c���S�͖Y��Ȃ��łˁB";
		close;
	case 2:
		mes "[�t�@��]";
		mes "����A���C�����Ȏq�ˁB";
		mes "�܂����������������Ƃł�����́H";
		mes "�ӂӁA����Ƃ�����";
		mes "���b���������̂��ȁH";
		mes "���Ⴀ�A������`����";
		mes "�����܂��傤���c�c";
		next;
		mes "[�t�@��]";
		mes "�����ˁA���S�ҏC�����";
		mes "�s���Č���̂͂ǂ����ȁH";
		mes "�����Ɍ����鋴��n����";
		mes "�傫������̒��֓����čs����";
		mes "�����̂�B���֍s���΁A";
		mes "�W�̐l���ē����Ă���邩��ˁB";
		next;
		mes "[�t�@��]";
		mes "�����A�����������Ȃ�������";
		mes "�}�E�X���N���b�N�����܂�";
		mes "���E�փh���b�O���Ă݂�Ƃ�����B";
		mes "��������Ɖ�ʂ���]���āA";
		mes "������͂���B";
		next;
		mes "[�t�@��]";
		mes "���ꂶ��A�����Ă�����Ⴂ�B";
		mes "�����Ď��̂悤�ȃ��f�B�[�ւ�";
		mes "��V���g�ɂ��Ă��Ȃ����ȁB";
		mes "����́A������̑��蕨��B";
		set CHANGE_NV,CHANGE_NV|0x4;
		getexp 9,0;
		close;
	default:	//5,6�̂Ƃ�
		mes "[�t�@��]";
		mes "���S�ҏC����́A�����ɂ��鋴��";
		mes "�n������ɂ�����B";
		mes "�u�`��퓬�ȂǑ�ς�������Ȃ�����";
		mes "�����Ɩ��ɗ��Ǝv����B";
		mes "���ЁA�s���Ă݂Ȃ����B";
		close;
	}
}

new_2-1,53,114,4	duplicate(�t�@��#new_1-1)	�t�@��#new_2-1	727
new_3-1,53,114,4	duplicate(�t�@��#new_1-1)	�t�@��#new_3-1	727
new_4-1,53,114,4	duplicate(�t�@��#new_1-1)	�t�@��#new_4-1	727
new_5-1,53,114,4	duplicate(�t�@��#new_1-1)	�t�@��#new_5-1	727

//==============================================================
new_1-1,66,114,0	script	�Ŕ�#new_1-1	111,{
	mes "^FF0000=================================^000000";
	mes "^FF0000= ^E708AD[���}]�@^CE0000��^FF9400�S^7BFF00�� ^00FF00�C^00FFFF��^0000FF�� ^E708AD[���}] ^FF0000=^000000";
	mes "^FF0000=================================^000000";
	close;
}

new_2-1,66,114,4	duplicate(�Ŕ�#new_1-1)	�Ŕ�#new_2-1	111
new_3-1,66,114,4	duplicate(�Ŕ�#new_1-1)	�Ŕ�#new_3-1	111
new_4-1,66,114,4	duplicate(�Ŕ�#new_1-1)	�Ŕ�#new_4-1	111
new_5-1,66,114,4	duplicate(�Ŕ�#new_1-1)	�Ŕ�#new_5-1	111

//==============================================================
new_1-1,144,116,2	script	�x����#new_1-1_1	105,{
	mes "[���S�ҏC����x����]";
	mes "�悤�����I���S�ҏC����ցI";
	mes "��̒��ɓ���܂���";
	mes "���S�ҏC���ꂪ����܂��B";
	close;
}

new_2-1,144,116,2	duplicate(�x����#new_1-1_1)	�x����#new_2-1_1	105
new_3-1,144,116,2	duplicate(�x����#new_1-1_1)	�x����#new_3-1_1	105
new_4-1,144,116,2	duplicate(�x����#new_1-1_1)	�x����#new_4-1_1	105
new_5-1,144,116,2	duplicate(�x����#new_1-1_1)	�x����#new_5-1_1	105

new_1-1,144,107,2	script	�x����#new_1-1_2	105,{
	if(rand(2)) {
		mes "[���S�ҏC����x����]";
		mes "�悭�����ȁI";
		mes "���S�ҏC����ւ̗�������}����I";
		mes "�V���Ȑl������ݏo���N�珉�S�ҒB��";
		mes "�����𖁂��Ċ�]�ɖ�����������";
		mes "�z�����Ƃ��ł���悤��";
		mes "���S�ҏC����͑S�͂ŃT�|�[�g����I";
	}
	else {
		mes "[���S�ҏC����x����]";
		mes "�����I�@�����I�@���S�ҒB��I";
		mes "�N�炪�����čs�����̓��ɂ�";
		mes "�����̗z������I";
	}
	close;
}

new_2-1,144,107,2	duplicate(�x����#new_1-1_2)	�x����#new_2-1_2	105
new_3-1,144,107,2	duplicate(�x����#new_1-1_2)	�x����#new_3-1_2	105
new_4-1,144,107,2	duplicate(�x����#new_1-1_2)	�x����#new_4-1_2	105
new_5-1,144,107,2	duplicate(�x����#new_1-1_2)	�x����#new_5-1_2	105


//==========================================
// ��t
//------------------------------------------

new_1-2,100,29,4	script	���S�ҏC�����t�v��#new_1-2	86,{
	mes "[���S�ҏC�����t�v��]";
	mes "��������Ⴂ�܂��B";
	mes "^FF0000���S�ҏC����^000000�ł��B";
	mes "���O�i���N�I�����C����";
	mes "���߂ăv���C�������";
	mes "�܂�^019CFF���S�ҏC����Љ�^000000���j���[��I���";
	mes "�ڂ������e���������������B";
	while(1) {
		next;
		switch(select("���S�ҏC����\�������쐬����","�������O�i���N�I�����C�����n�߂�","^019CFF���S�ҏC����Љ�^000000","��߂�")) {
		case 1:
			mes "[���S�ҏC�����t�v��]";
			mes "���Ȃ��̐\�������󗝂���܂����B";
			mes "�C����̊e�R�[�X�Ɋւ���";
			mes "�ڂ����ē��́A�e�R�[�X�̈ē�����";
			mes "���₢���킹���������B";
			next;
			if((CHANGE_NV &0x8) == 0) {
				mes "[���S�ҏC�����t�v��]";
				mes "�C���⏕��A50Zeny��";
				mes "�x�����܂��B�R�[�X�i�s����";
				mes "�����킩��Ȃ���������܂�����";
				mes "�����z�[���̈ē��v����";
				mes "�����Ă��������B";
				mes "�ł́A���S�ҏC����Ɉړ����܂��B";
				set CHANGE_NV,CHANGE_NV|0x8;
				set Zeny,Zeny+50;
				close2;
			}
			warp "new_1-2",100,70;
			end;
		case 2:
			mes "[���S�ҏC�����t�v��]";
			mes "�͂��A�킩��܂����B";
			mes "���Ȃ��̐����ƌ������F��܂��B";
			close2;
			set CHANGE_NV,0;
			switch(rand(6)) {
				case 0: savepoint "prontera",273,354; 	break;
				case 1: savepoint "morocc",160,94; 		break;
				case 2: savepoint "geffen",120,100; 	break;
				case 3: savepoint "payon",70,100; 		break;
				case 4: savepoint "alberta",116,57; 	break;
				case 5: savepoint "izlude",94,103; 		break;
			}
			warp "SavePoint",0,0;
			end;
		case 3:
			mes "[���S�ҏC�����t�v��]";
			mes "���̏��S�ҏC����ł�";
			mes "�Q�[���u���O�i���N�I�����C���v��";
			mes "���߂ėV�ԃv���C���[��";
			mes "�y�����v���C�o����悤��";
			mes "���O�i���N�I�����C���̊�{�I��";
			mes "�������s���Ă��܂��B";
			next;
			mes "[���S�ҏC�����t�v��]";
			mes "�܂��A���ۃQ�[���Ōo������󋵂�";
			mes "�̌�����퓬�P���A�y��";
			mes "������S���v���Ƃ̉�b��ʂ���";
			mes "�v���C���[�ɍœK���Ǝv����";
			mes "�E�Ƃ𔻒f�����߂Ă���܂��̂�";
			mes "�Q�l�ɂ��Ă��������B";
			next;
			mes "[���S�ҏC�����t�v��]";
			mes "�{�C�����";
			mes "���S�҂ɏ�L������s����";
			mes "���[���~�b�h�K�b�c����";
			mes "����l�I�������̎x����";
			mes "�ݗ�����܂����B";
			next;
			mes "[���S�ҏC�����t�v��]";
			mes "�{�C�����2�̃R�[�X��";
			mes "������Ă���";
			mes "�e�R�[�X�ŗl�X�ȏC����ς݂܂��B";
			mes "��1�R�[�X�ł̓��O�i���N";
			mes "�I�����C���̃v���C�ɕK�v��";
			mes "��{�I�Ȏ��ɂ��Ĉē����܂��B";
			next;
			mes "[���S�ҏC�����t�v��]";
			mes "��2�R�[�X�ł�";
			mes "��1�R�[�X�ŏK�������_������";
			mes "�����X�^�[���o��ꏊ�Ő퓬���K��";
			mes "�s�����ƂɂȂ�܂��B";
			mes "�S�R�[�X�I����A�e�E�Ƃɂ���";
			mes "�����������Ă��������܂��B";
			next;
			mes "[���S�ҏC�����t�v��]";
			mes "�܂��A�A���P�[�g�ɓ����Ă�������";
			mes "���i���f�A�[�w�S����͂ɂ����";
			mes "�e�v���C���[�ɍœK�ȐE�Ƃ�������";
			mes "�E�ƓK���������s���܂��B";
			mes "���̌�A�ǂ̐E�Ƃ�I�����邩";
			mes "�f���܂��B";
			next;
			mes "[���S�ҏC�����t�v��]";
			mes "�Љ�����S�ҏC����ɓ������";
			mes "���̃��j���[��";
			mes "�u���S�ҏC����\�������쐬����v��";
			mes "�I��ł��������B";
			continue;
		case 4:
			mes "[���S�ҏC�����t�v��]";
			mes "��������肨�l�����������B";
			close;
		}
	}
}

new_2-2,100,29,4	duplicate(���S�ҏC�����t�v��#new_1-2)	���S�ҏC�����t�v��#new_2-2	86
new_3-2,100,29,4	duplicate(���S�ҏC�����t�v��#new_1-2)	���S�ҏC�����t�v��#new_3-2	86
new_4-2,100,29,4	duplicate(���S�ҏC�����t�v��#new_1-2)	���S�ҏC�����t�v��#new_4-2	86
new_5-2,100,29,4	duplicate(���S�ҏC�����t�v��#new_1-2)	���S�ҏC�����t�v��#new_5-2	86


//==========================================
// �����̕���
//------------------------------------------

new_1-2,99,105,3	script	�C���^�[�t�F�[�X����	751,{
	if((CHANGE_NV &0x10) == 0) {
		mes "[�����N���X]";
		mes "���߂Ă��ڂɂ�����܂��ˁB";
		mes "��u�؂������Ă��������܂����H";
		next;
		mes "[�����N���X]";
		mes "�͂��A����Ŗ�肠��܂���B";
		mes "�ł�" +strcharinfo(0)+ "�l��";
		mes "��{�I�ȃC���^�[�t�F�[�X�ɂ���";
		mes "�����܂��傤�B";
		next;
		mes "[�����N���X]";
		mes "����͋����Ƃ����킯�ł͂Ȃ��̂�";
		mes "�����A�����Ȃ��肽���̂Ȃ�A���̎|��";
		mes "����������Ă��������B";
		next;
		switch(select("�C���^�[�t�F�[�X�̍u�`���󂯂���","�b�����A������I","��߂�")) {
		case 1:
			mes "[�����N���X]";
			mes "�킩��܂����B";
			mes "�ł́A�u�`���s���܂��B";
			mes "��낵���ł����H";
			next;
			mes "[�����N���X]";
			mes "�S�ẴE�B���h�E�́A�h���b�O��";
			mes "�ʒu���ړ����邱�Ƃ��ł��܂����A";
			mes "�����i�K�̈ʒu����ɂ���";
			mes "�e�E�B���h�E�ɂ��Đ������܂��傤�B";
			next;
			mes "[�����N���X]";
			mes "�܂���ʂ̍�����������������B";
			mes "�������̖��O�⃌�x�������\�����ꂽ";
			mes "�E�B���h�E������܂��ˁB�����";
			mes "�ǂꂭ�炢�o���l�𓾂��̂���";
			mes "�킩��ł��傤�B���ꂪ�L�����N�^�[��";
			mes "^4A4AFF��{���^000000�ɂȂ�܂��B";
			next;
			if(BaseLevel < 8) {
				mes "[�����N���X]";
				mes "�ł́ABase�o���l�������܂��̂�";
				mes "��{���E�B���h�E�̌o���l������";
				mes "�ǂ̂悤�ɕω����邩���Ă��������B";
				mes "�ǂ��ł��H";
				if(BaseLevel == 7)	getexp 155,0;
				else if(BaseLevel == 6)	getexp 115,0;
				else if(BaseLevel == 5)	getexp 78,0;
				else if(BaseLevel == 4)	getexp 37,0;
				else if(BaseLevel == 3)	getexp 26,0;
				else if(BaseLevel == 2)	getexp 17,0;
				else if(BaseLevel == 1)	getexp 10,0;
			}
			else {
				mes "[�����N���X]";
				mes "�c�c���A�����������x����";
				mes "�����悤�ł��ˁB";
				mes "����ł�����o���l��";
				mes "��������Ȃ��ł���ˁB";
				mes "����ł́c�c";
			}
			set CHANGE_NV,CHANGE_NV|0x10;
			next;
			mes "[�����N���X]";
			mes "��{���E�B���h�E�ɕ\��";
			mes "����Ă��郁�j���[����";
			mes "�A�C�e����F�B���X�g�����邱�Ƃ�";
			mes "�ł��܂��B";
			next;
			mes "[�����N���X]";
			mes "���ꂩ��o���l�ł����A";
			mes "��قǏЉ��Base�o���l�Ƃ͕ʂ�";
			mes "Job�o���l�Ƃ������̂�����܂��B";
			mes "^4A4AFF�X�L�����g�����߂ɂ́A����";
			mes "Job�o���l���l�����A����ɂ��擾";
			mes "����X�L���|�C���g���K�v^000000�ɂȂ�܂��B";
			next;
			mes "[�����N���X]";
			mes "��ʍ����̃E�B���h�E�́A";
			mes "�`���b�g�E�B���h�E�ƌ����܂��B";
			mes "�ߋ��̉�b�͉E���̃o�[��";
			mes "�X�N���[������Ό��邱�Ƃ��ł��܂��B";
			next;
			mes "[�����N���X]";
			mes "�܂��A�E�̃{�^���őS�́A�p�[�e�B�[�A";
			mes "�M���h�����Ƃ������ɉ�b���ύX����";
			mes "���Ƃ��ł��܂��B";
			mes "�`���b�g�E�B���h�E�͏�ɉ�b�ł���";
			mes "��Ԃł��̂ŁA�m�荇���ɐ���";
			mes "�����₷���Ǝv���܂��B";
			next;
			mes "[�����N���X]";
			mes "��ʂ̉E��ɂ̓~�j�}�b�v������܂��B";
			mes "�����A�p�[�e�B�[�����o�[�A";
			mes "�M���h�����o�[�̌��݈ʒu��";
			mes "�\������܂��B";
			next;
			mes "[�����N���X]";
			mes "�X��t�B�[���h�ł́A";
			mes "^4A4AFF�Ԃ��_���}�b�v�̏o��^000000�ƂȂ�܂��̂�";
			mes "�Q�l�ɂ��Ă��������B";
			next;
			mes "[�����N���X]";
			mes "�ł́A��{���E�B���h�E�ɂ���";
			mes "�e���j���[��������";
			mes "��x�S�Ă��J���Ă݂Ă��������B";
			mes "�A�C�e���⑕���A�\�͒l�Ȃǂ�";
			mes "���邱�Ƃ��ł��܂���B";
			next;
			mes "[�����N���X]";
			mes "�ދ���������������܂���ˁB";
			if(JobLevel < 8) {
				mes "�����o���l�������܂��傤�B";
				mes "���x��Job�o���l�ł��B";
				mes "�X�L���E�B���h�E��";
				mes "�J���āA��{�X�L����";
				mes "�����Ă݂Ă��������B";
				if(JobLevel == 7)	getexp 0,205;
				else if(JobLevel == 6)	getexp 0,151;
				else if(JobLevel == 5)	getexp 0,91;
				else if(JobLevel == 4)	getexp 0,40;
				else if(JobLevel == 3)	getexp 0,28;
				else if(JobLevel == 2)	getexp 0,18;
				else if(JobLevel == 1)	getexp 0,10;
			}
			else {
				mes "�c�c���A�����������x����";
				mes "�����悤�ł��ˁB";
				mes "����ł�����o���l��";
				mes "��������Ȃ��ł���ˁB";
				mes "����ł́c�c";
			}
			next;
			mes "[�����N���X]";
			mes "���ڂ������e�ɂ��Ă�";
			mes "�u�t�G�h�E�B���ɒ����Ă��������B";
			mes "�ނȂ���ŋ����Ă���܂���B";
			mes "����́A������̂����₩��";
			mes "���蕨�ł��B";
			getitem 2352,1;
			close;
		case 2:
			mes "[�����N���X]";
			mes "�ł́A���ۂɐ퓬���o������";
			mes "���������܂��傤�B";
			mes "����Œm��������Ȃ��Ǝv������";
			mes "���ł��߂��Ă��Ă��������B";
			close2;
			warp "new_1-2",28,178;
			end;
		case 3:
			emotion 19;
			close;
		}
	}
	if((CHANGE_NV &0x20) ==  0 || (CHANGE_NV &0x40) == 0) {
		set .@word$,((CHANGE_NV &0x20) ==  0)? "�X�L��": "�A�C�e��";
		mes "[�����N���X]";
		mes "�ǂ�����܂����H";
		mes "��u�؂������Ă��������܂��H";
		mes "����A" +.@word$+ "�֘A�̍u�`��";
		mes "�܂��̂悤�ł��ˁB";
		mes .@word$+ "�����Ȃ玄��" +(CHANGE_NV &0x20? "�E": "��")+ "�ɂ��܂��B";
		next;
		switch(select("���Ⴀ�A"+.@word$+"�̍u�`���󂯂���","�b�΂��肾�Ƒދ��Łc�c","���A�����c�c")) {
		case 1:
			if(.@word$ == "�X�L��") {
				mes "[�����N���X]";
				mes "�X�L���̎g�������킩���";
				mes "�퓬�����Ȃ�y�ɂȂ�܂���B";
				mes "�ł́A�X�L�������̉���";
				mes "�����Ă����܂��傤�B";
				close2;
				warp "new_1-2",84,107;
				end;
			}
			mes "[�����N���X]";
			mes "�A�C�e���̎g������";
			mes "�V���[�g�J�b�g�̊��p�@�Ȃ�";
			mes "�����Ȃ��Ƃ������Ă���܂���B";
			mes "�ł́A�A�C�e�������̉���";
			mes "�����Ă����܂��傤�B";
			close2;
			warp "new_1-2",115,107;
			end;
		case 2:
			mes "[�����N���X]";
			mes "�ł́A��2�R�[�X�퓬���K�}�b�v��";
			mes "�����Ă����܂��傤�B";
			next;
			if(select("���A�܂�����","�����Ă��傤����")== 1) {
				mes "[�����N���X]";
				mes "�����ł����c�c";
				mes "�܂���������܂�����A";
				mes "���������Ă��������B";
				close;
			}
			mes "[�����N���X]";
			mes "�ł́A�������F��܂��I";
			close2;
			warp "new_1-2",28,178;
			end;
		case 3:
			emotion 19;
			close;
		}
	}
	mes "[�����N���X]";
	mes "�K�C�u�`��S�ďI�����悤�ł��ˁB";
	mes "�u�t�����̘b�������܂������H";
	mes "���͐퓬���K�ł����c�c";
	mes "��2�R�[�X�֐i�݂܂����H";
	next;
	switch(select("�͂��A���̃R�[�X�֐i�݂���","����A���������׋�������","�����X�֍s������")) {
	case 1:
		mes "[�����N���X]";
		mes "�킩��܂����B";
		mes "���̃R�[�X�͐퓬�̎��H�ł��B";
		mes "�S�������̘b���悭����";
		mes "�����ɗՂ�ł��������B";
		mes "�N�ɃI�[�f�B���̉��삠��񂱂Ƃ��B";
		close2;
		warp "new_1-2",28,178;
		end;
	case 2:
		mes "[�����N���X]";
		mes "�킩��܂����B";
		mes "�K�C�u�`�͊�{�I�Ȃ��Ƃ����S�ł��̂�";
		mes "����Ȃ������́A�u�t�����̘b��";
		mes "�����Ƃ悢�Ǝv���܂��B";
		mes "��������΂��[���w�ׂ�ł��傤�B";
		next;
		mes "[�����N���X]";
		mes "���������킩��Ȃ����Ƃ�����܂�����";
		mes "���ł��q�˂Ă��������B";
		close;
	case 3:
		mes "[�����N���X]";
		mes "�X�֍s�������̂ł����B";
		mes "�C����ŏ\���w�΂ꂽ��";
		mes "���̍��ɂ���^4A4AFF�J�v���E��^000000��";
		mes "�b�������Ă��������B";
		next;
		mes "[�����N���X]";
		mes "�J�v���T�[�r�X�́A�e�n���";
		mes "�s�s�Ԃ̈ړ���A�C�e���̕ۊ�";
		mes "�T�[�r�X���s���Ă��܂��B";
		mes "�ޏ������̃T�[�r�X�����ۂ�";
		mes "���p���Ă݂�Ƃ悢�ł��傤�B";
		next;
		mes "[�����N���X]";
		mes "�c�c������A���ɐ키����";
		mes "���邩������܂���B";
		mes "�Ȃ𖁂����Ƃ���ɂ��Y��Ȃ��悤�B";
		mes "�N�ɃI�[�f�B���̉��삠��񂱂Ƃ��B";
		close;
	}
}

//==============================================================
new_1-2,83,111,3	script	�X�L������	753,{
	if((CHANGE_NV &0x20) ==  0) {
		mes "[�����T�C]";
		mes strcharinfo(0)+ "�I";
		mes "���������I";
		mes "���ꂶ��A�u�`���n�߂悤���B";
		next;
		switch(select("���������Ă����́H","���ۂɐ킢�����I","��߂Ă���")) {
		case 1:
			mes "[�����T�C]";
			mes "���͌��ɑS�Ă�������j�I";
			mes "�����ł��O�ɂƂĂ��d�v��";
			mes "�K�E�Z���c�c";
			mes "����Ȃ��āA�X�L���̎g������";
			mes "�����Ă����悤�B";
			mes "�܂��A�X�L���������Ă�낤�B";
			next;
			mes "[�����T�C]";
			mes "�X�L���E�B���h�E��";
			mes "��{���E�B���h�E��";
			mes "^4A4AFFskill^000000�{�^����";
			mes "�����ΊJ���B";
			next;
			mes "[�����T�C]";
			mes "�t�ɕ��鎞��";
			mes "^4A4AFFalt�L�[���������܂�s�L�[^000000";
			mes "�������΂����B";
			mes "���ꂩ�炱�������\����";
			mes "�ualt+s�v�ƌ�������o���Ă����B";
			next;
			mes "[�����T�C]";
			mes "�E�B���h�E���J�������H";
			mes "��{�@�\�Ƃ����A�C�R���������邩�H";
			if(JobLevel < 8) {
				mes "�����ɂ̓X�L���|�C���g: 1 �Ƃ�";
				mes "������������Ă���B";
				mes "��{�X�L���̃A�C�R���̉��ɂ���";
				mes "�uLvUp�v�Ƃ����\���������Ă݂�I";
				if(JobLevel == 7)	getexp 0,205;
				else if(JobLevel == 6)	getexp 0,151;
				else if(JobLevel == 5)	getexp 0,91;
				else if(JobLevel == 4)	getexp 0,40;
				else if(JobLevel == 3)	getexp 0,28;
				else if(JobLevel == 2)	getexp 0,18;
				else if(JobLevel == 1)	getexp 0,10;
			}
			else {
				mes "���A���x�������������̂��c�c";
				mes "���ꂶ��A�uLvUp�v�Ƃ����\����";
				mes "�o�Ȃ��ȁB�܂��A���O�Ȃ�";
				mes "�킩���Ă邾�낤���炢����ȁB";
			}
			set CHANGE_NV,CHANGE_NV|0x20;
			next;
			mes "[�����T�C]";
			mes "�ǂ����H";
			mes "�����ƒm�肽��������u�t��";
			mes "�s�b�`�W���_�X�Ƃ����z�ɕ����B";
			mes "�c�c���`�ށA";
			mes "���������悤�Ǝv�����X�L����";
			mes "�������͂������c�c";
			next;
			mes "[�����T�C]";
			mes "�����A�������I";
			mes "�X�L���u���}�蓖�v�������Ă�낤�B";
			mes "����͉�������Ă��鎞��";
			mes "���Ȃ�𗧂X�L�����B";
			next;
			mes "^4A4AFF- �X�L���u���}�蓖�v���C�������B-^000000";
			skill 142,1,0;
			next;
			if(JobLevel < 8) {
				mes "^4A4AFF- Job�o���l���l�������B-^000000";
				if(JobLevel == 7)	getexp 0,205;
				else if(JobLevel == 6)	getexp 0,151;
				else if(JobLevel == 5)	getexp 0,91;
				else if(JobLevel == 4)	getexp 0,40;
				else if(JobLevel == 3)	getexp 0,28;
				else if(JobLevel == 2)	getexp 0,18;
				else if(JobLevel == 1)	getexp 0,10;
			}
			else {
				mes "^4A4AFF- Job���x���������̂� -";
				mes "- �����ɂ̓��x���� -";
				mes "- �オ��Ȃ��悤���B-^000000";
			}
			next;
			percentheal -50,0;
			mes "[�����T�C]";
			mes "�����A�X�L���E�B���h�E���J���Ă݂�I";
			mes "^4A4AFF���}�蓖^000000���\������Ă��邾��H";
			mes "�_�u���N���b�N�Ŏg�p�ł��邼�B";
			mes "�����A�g���Ă݂�I";
			next;
			mes "[�����T�C]";
			mes "�ǂ����H";
			mes "���Ȃ݂ɃX�L�����g���ƁA";
			mes "���ʂ�SP������邼�B";
			mes "���}�蓖�͎g�p����Ƒ�������";
			mes "�̗͂��񕜂���B";
			mes "�ŏ��̂����͏d�󂷂�X�L�����B";
			next;
			mes "[�����T�C]";
			mes "�b�𕷂��΂���ł͔�ꂽ���낤�B";
			if(BaseLevel < 8) {
				mes "�ق�A���J�����B";
				mes "���͑������Ȓj������ȁB";
				if(BaseLevel == 7)	getexp 155,0;
				else if(BaseLevel == 6)	getexp 115,0;
				else if(BaseLevel == 5)	getexp 78,0;
				else if(BaseLevel == 4)	getexp 37,0;
				else if(BaseLevel == 3)	getexp 26,0;
				else if(BaseLevel == 2)	getexp 17,0;
				else if(BaseLevel == 1)	getexp 10,0;
			}
			else {
				mes "�啪�撣���Ă�悤���ȁB";
				mes "�܂��߂��ˁI�@�n�b�n�b�n�b";
			}
			next;
			mes "[�����T�C]";
			mes "���̍u�`�͂����܂ł��B";
			mes "��H�b���Z���Ĉ��S�������H";
			mes "���ꂶ��A���̐l�̘b�������Ă����B";
			mes "�Ⴆ�΍u�t�̃s�b�`�W���_�X�Ȃ񂩂�";
			mes "�X�L���ɂ��Ă����Əڂ���";
			mes "�����Ă���邼�B";
			next;
			switch(select("����������ƌ��ĉ�肽��","�����A����ցI","����������")) {
				case 1:
					mes "[�����T�C]";
					mes "�悵�A���̋�����u�t��";
					mes "�b���Ă��ȁA�݂�ȉ���";
					mes "��`���Ă����͂����B";
					mes "�ق�A�撣��I";
					close;
				case 2:
					break;
				case 3:
					emotion 23;
					close;
			}
			//fall through
		case 2:
			mes "[�����T�C]";
			mes "�����A�А��������ȁB";
			mes "�m���Ɏ��ۂɐ퓬��";
			mes "�o������̂͂������Ƃ��B";
			mes "���Ⴀ�A�퓬���K�̃}�b�v��";
			mes "�����Ă�낤�B";
			mes "�v�������A����Ă����I";
			close2;
			warp "new_1-2",28,178;
			end;
		case 3:
			emotion 23;
			close;
		}
	}
	if((CHANGE_NV &0x10) == 0 || (CHANGE_NV &0x40) == 0) {
		set .@word$,((CHANGE_NV &0x10) == 0)? "�C���^�[�t�F�[�X": "�A�C�e��";
		mes "[�����T�C]";
		mes "���������������Ƃł����邩�H";
		mes "����H���O�A";
		mes .@word$+ "�u�`��";
		mes "�܂��̂悤���ȁB";
		mes "�Ȃ�΂܂�������󂯂Ă����I";
		mes "�͂͂͂͂͂��I";
		next;
		switch(select(.@word$+"�u�`���󂯂Ă���I","�b���A���킪����","����A�������Ă���")) {
		case 1:
			if(.@word$ == "�C���^�[�t�F�[�X") {
				mes "[�����T�C]";
				mes "�����A�������Ă����I";
				mes "�������A��b���厖������ȁB";
				mes "�C���^�[�t�F�[�X�����͒����ɂ��邼�B";
				mes "�͂͂͂͂͂��B";
				close;
			}
			mes "[�����T�C]";
			mes "�����A�������Ă����I";
			mes "�������A��b���厖������ȁB";
			mes "�A�C�e�������͉��̍����̕��ɂ��邼�B";
			mes "�悵�A�T�[�r�X���B�����Ă��B";
			close2;
			warp "new_1-2",115,107;
			end;
		case 2:
			mes "[�����T�C]";
			mes "�����A�А��������ȁB";
			mes "�m���Ɏ��ۂɐ퓬��";
			mes "�o������̂͂������Ƃ��B";
			mes "���Ⴀ�A�퓬���K�̃}�b�v��";
			mes "�����Ă�낤�B";
			mes "�v�������A����Ă����I";
			close2;
			warp "new_1-2",28,178;
			end;
		case 3:
			emotion 23;
			close;
		}
	}
	mes "[�����T�C]";
	mes "�ǂ������񂾁H";
	mes "�����S���̍u�`���I�������낤�H";
	mes "�͂́`��A���Ă͂��̉��ɍ��ꂽ�ȁB";
	mes "�c�c�́H�@�Ⴄ���āH";
	mes "������������Ȃ��āB";
	next;
	mes "[�����T�C]";
	mes "�Ƃ���ŁA�X�L���u�t�̘b��";
	mes "������ƒ�������ȁH";
	next;
	switch(select("���̃R�[�X�֐i�݂���","���A�u�t�H","�X�֍s������")) {
	case 1:
		mes "[�����T�C]";
		mes "�����I�@�퓬���K�����񂾂ȁB";
		mes "�����`�A���O�����̊댯�ȃ}�b�v��";
		mes "������֑���Ȃ����";
		mes "�Ȃ�Ȃ��Ȃ�āc�c";
		mes "���̌��͗܂ɔG��Ă���B";
		next;
		mes "[�����T�C]";
		mes "�������������O���g�̂��߂��B";
		mes "�������������Ă�낤�B";
		mes "�ł́A���̌����󂯎��I";
		close2;
		warp "new_1-2",28,178;
		end;
	case 2:
		mes "[�����T�C]";
		mes "���H���̗l�q����";
		mes "�m��Ȃ������悤���ȁB";
		mes "�����������͖{���ɑ厖��";
		mes "��b�𒆐S�ɋ����Ă���B";
		next;
		mes "[�����T�C]";
		mes "�����A���ꂾ�����Ƃ������";
		mes "������Ȃ���ȁH";
		mes "�܂��A���������킩���";
		mes "�������Đl�����邾�낤���A";
		mes "���ɂ͕��L���m�肽������";
		mes "�l�����邾��H";
		next;
		mes "[�����T�C]";
		mes "�����ł��A����Ȋ撣�艮�����";
		mes "���߂ɍu�t������������Ă킯���B";
		mes "�����A��ɍs���Ă����I";
		next;
		mes "[�����T�C]";
		mes "���Ɂu�s�b�`�W���_�X�v�Ƃ����z��";
		mes "�X�L���Ɋւ��ďڂ���";
		mes "�����Ă����͂����B�܂��A";
		mes "������Ɗ�Ȃ������������邪�ȁc�c";
		mes "���ЁA�Q�l�ɂ��Ă���I";
		mes "�͂͂͂͂��I";
		close;
	case 3:
		mes "[�����T�C]";
		mes "�X�Ȃ�c�c�����獶�̕�����";
		mes "�����Ƃ��������";
		mes "�J�v���E�������邾��H";
		mes "�ޏ��ɗ��߂Α����Ă�����B";
		mes "�n�b�n�b�n�b!";
		mes "�b�������Ă݂�񂾂ȁB";
		close;
	}
}

//==============================================================
new_1-2,115,111,3	script	�A�C�e������	726,{
	if((CHANGE_NV &0x40) == 0) {
		mes "[�����A���X]";
		mes "����ɂ��́[�I";
		mes "���߂܂��āA���ȁH";
		mes "�A�C�e���̍u�`�����Ă����悤���H";
		next;
		switch(select("����A����I�A�C�e���I","���[�A����͂�����Ɓc�c","����A�X�ɍs�������I")) {
		case 1:
			mes "[�����A���X]";
			mes "���[�����I";
			mes "����A�u�`���n�߂܂��傤�I";
			mes "�A�C�e���E�B���h�E���J���Ă݂āB";
			next;
			mes "[�����A���X]";
			mes "��{���E�B���h�E��";
			mes "item�Ƃ����{�^����������";
			mes "�\��������B";
			mes "���Ȃ݂ɃA�C�e����";
			mes "���Օi�A�����i�A���W�i��";
			mes "���ނ����́B";
			next;
			mes "[�����A���X]";
			mes "�ǂ��H�@�킩�������ȁH";
			mes "���S�җp�|�[�V�����������邩��A";
			mes "�_�u���N���b�N�Ŏg���Ă݂āB";
			set CHANGE_NV,CHANGE_NV|0x40;
			getitem 569,1;
			allowuseitem;
			percentheal -50,0;
			next;
			if(countitem(569) < 1) {
				mes "[�����A���X]";
				mes "�悭�ł�����ˁ[�B";
				if(BaseLevel < 8) {
					mes "�͂��A���J����B";
					if(BaseLevel == 7)	getexp 155,0;
					else if(BaseLevel == 6)	getexp 115,0;
					else if(BaseLevel == 5)	getexp 78,0;
					else if(BaseLevel == 4)	getexp 37,0;
					else if(BaseLevel == 3)	getexp 26,0;
					else if(BaseLevel == 2)	getexp 17,0;
					else if(BaseLevel == 1)	getexp 10,0;
				}
				else {
					mes "���������Ȃ�";
					mes "���x�������������̂��Ƃ͂����ˁB";
				}
			}
			else {
				mes "[�����A���X]";
				mes "�ق�A�_�u���N���b�N�Ŏg�p���Ă݂āB";
			}
			mes "�c�c���͑����ˁB";
			allowuseitem -1;
			next;
			mes "[�����A���X]";
			mes "�A�C�e���E�B���h�E�̍�����";
			mes "equip�������Ă݂āB";
			mes "�����͑����\�ȃA�C�e����";
			mes "�\������鏊�Ȃ́B";
			next;
			mes "[�����A���X]";
			mes "�����ł���A�C�e���������邩��";
			mes "�����ɑ��������Ă݂܂���I";
			mes "�܂�^4A4AFF�T���_�����_�u���N���b�N�I^000000";
			getitem 2510,1;
			getitem 2414,1;
			getitem 5055,1;
			allowuseitem;
			next;
			if(getequipid2(6) == 2414) {
				mes "[�����A���X]";
				mes "�悭�ł�����ˁ[�B";
				if(BaseLevel < 8) {
					mes "�͂��A���J����B";
					if(BaseLevel == 7)	getexp 155,0;
					else if(BaseLevel == 6)	getexp 115,0;
					else if(BaseLevel == 5)	getexp 78,0;
					else if(BaseLevel == 4)	getexp 37,0;
					else if(BaseLevel == 3)	getexp 26,0;
					else if(BaseLevel == 2)	getexp 17,0;
					else if(BaseLevel == 1)	getexp 10,0;
				}
				else {
					mes "���������Ȃ����x��������������";
					mes "���Ƃ͂����ˁB";
				}
			}
			else {
				mes "[�����A���X]";
				mes "�ق�A�_�u���N���b�N�ő������Ă݂āB";
			}
			mes "���̃A�C�e���������悤�ɑ������ĂˁB";
			allowuseitem -1;
			next;
			mes "[�����A���X]";
			mes "����A����^4A4AFFF12^000000�������Ă݂āB";
			mes "�����Ȏl�p������";
			mes "9�\�����ꂽ�ł���B";
			next;
			mes "[�����A���X]";
			mes "����̓V���[�g�J�b�g�E�B���h�E��";
			mes "�����ĉ񕜃A�C�e����";
			mes "�X�L���A�����A�C�e�����}�E�X��";
			mes "���������Ă���Ɠo�^�ł���́B";
			next;
			mes "[�����A���X]";
			mes "�����Ċe���ɑΉ�����";
			mes "^4A4AFFF1����F9^000000�܂ł̃L�[��";
			mes "�����΁A�g�p�ł����B";
			next;
			mes "[�����A���X]";
			mes "�X�L���̍u�`���󂯂��";
			mes "���}�蓖�������Ă��炦��ł���B";
			mes "���̃A�C�R�����A";
			mes "�����ɃV���[�g�J�b�g�E�B���h�E��";
			mes "�o�^���Ă݂悤�I";
			next;
			mes "[�����A���X]";
			mes "�ǂ��H�킩�������ȁB";
			mes "���������A�X�L�����g���ɂ�";
			mes "�X�L���|�C���g���K�v��B";
			mes "�ł͊�{�X�L���̓p�b�V�u������";
			mes "�V���[�g�J�b�g�E�B���h�E�ɂ�";
			mes "�o�^�ł��Ȃ����ǂˁB";
			if(JobLevel < 8) {
				if(JobLevel == 7)	getexp 0,205;
				else if(JobLevel == 6)	getexp 0,151;
				else if(JobLevel == 5)	getexp 0,91;
				else if(JobLevel == 4)	getexp 0,40;
				else if(JobLevel == 3)	getexp 0,28;
				else if(JobLevel == 2)	getexp 0,18;
				else if(JobLevel == 1)	getexp 0,10;
			}
			next;
			mes "[�����A���X]";
			mes "�ȒP�ŃT�|�[�g���S�ȃA���X��";
			mes "�u�`�͂����܂ŁI�@�Ō�ɁA�������";
			mes "�𗧂A�C�e����������B�������c�c";
			mes "^FF0000�n�G�̉H�A���̉H��";
			mes "�����Ŏg�����Ⴞ�߂�B^000000";
			mes "���q�ɂȂ����Ⴄ�Ƃ����Ȃ�����ˁB";
			getitem 601,10;
			getitem 602,2;
			getitem 569,50;
			next;
			mes "[�����A���X]";
			mes "�����Ă��ꂪ�c�c";
			if(JobLevel < 8) {
				mes "�]�E�����Ƃ��Ă�Job�o���l�I";
				if(JobLevel == 7)	getexp 0,205;
				else if(JobLevel == 6)	getexp 0,151;
				else if(JobLevel == 5)	getexp 0,91;
				else if(JobLevel == 4)	getexp 0,40;
				else if(JobLevel == 3)	getexp 0,28;
				else if(JobLevel == 2)	getexp 0,18;
				else if(JobLevel == 1)	getexp 0,10;
			}
			else {
				mes "���ƁA�o���l�������悤�Ǝv��������";
				mes "���Ȃ��A���x���������ˁ[�B";
				mes "�Ȃ�A���J���͂����������ȁB";
			}
			mes "����ꂳ�܁I";
			next;
			switch(select("���ꂩ��ǂ�����H","��������ցI","���Ⴀ�ˁI")) {
				case 1:
					mes "[�����A���X]";
					mes "�܂�����ĂȂ�������������A�u�`��";
					mes "�󂯂Ă�������������B";
					mes "���݂����ɐF�X�Ə����Ă���邩�炳�B";
					mes "���ꂩ�A�����������ĉ��Ƃ�����B";
					next;
					mes "[�����A���X]";
					mes "�u�t�����̘b���\���Q�l�ɂȂ�͂��B";
					mes "�N�ɘb��������΂����̂�";
					mes "�킩��Ȃ��Ȃ�����A";
					mes "�߂��ɂ���l�ɕ����Ă݂āB";
					close;
				case 2:
					break;
				case 3:
					mes "[�����A���X]";
					mes "�c�c����A�܂��ˁI";
					close;
			}
			break;
		case 2:
			mes "[�����A���X]";
			mes "���킪�����̂ˁB";
			mes "�����ɍs�������̂��ȁH";
			mes "�����Ɓc�c���������ɂ�";
			mes "�S���������ˁH";
			mes "�����̍u�`�͑S���󂯂�����";
			mes "��΂�������B";
			next;
			if(select("����A����I","������Ƒ҂��āI")==1)
				break;
			mes "[�����A���X]";
			mes "�킩������B";
			mes "���Ⴀ�A�����Ƒ��̐l�̘b��";
			mes "�����Ă��Ȃ����B�u�t�����̘b��";
			mes "�Q�l�ɂȂ�͂���B";
			close;
		case 3:
			mes "[�����A���X]";
			mes "�X�֍s�������Ȃ�A�������ɂ���";
			mes "�J�v���E���ɂ��肢���Ȃ����B";
			mes "�v�����e���A�����N�A�t�F�C�����c�c";
			mes "���Ȃ����s�������X�֑����Ă�����B";
			close;
		}
		mes "[�����A���X]";
		mes "�����A���C�ˁI";
		mes "���Ⴀ�A�����Ă����悤�B";
		mes "��������ɂ���S���̐l��";
		mes "�b�͂����ƕ����̂�B";
		mes "�퓬�͖������I�@������ˁB";
		mes "�ł́A�����Ă������[���I";
		close2;
		warp "new_1-2",28,178;
		end;
	}
	if((CHANGE_NV &0x10) == 0 || (CHANGE_NV &0x20) == 0) {
		set .@word$,((CHANGE_NV &0x10) == 0)? "�C���^�[�t�F�[�X": "�X�L��";
		mes "[�����A���X]";
		mes "��������`�����悤���H";
		if(.@word$ == "�C���^�[�t�F�[�X") {
			mes "����A�C���^�[�t�F�[�X�̍u�`��";
			mes "�󂯂Ă��Ȃ��݂����ˁB";
			mes "�N���X����̘b�𕷂��Ă�������";
		}
		else {
			mes "����A^4A4AFF�X�L���̍u�`^000000���󂯂�";
			mes "���Ȃ��݂����ˁB";
			mes "�T�C����̘b�𕷂��Ă�������";
		}
		mes "�������B";
		next;
		switch(select(.@word$+"�̍u�`���󂯂���","�b���A���킪�����I","�X�ւ͂ǂ�����čs���́H")) {
		case 1:
			if(.@word$ == "�C���^�[�t�F�[�X") {
				mes "[�����A���X]";
				mes "�����̃N���X�����";
				mes "���̕����̒����ɂ����B";
				mes "�����֍s���ăN���X�����";
				mes "�b�������Ă݂Ȃ����B";
				mes "�����Ɩ��ɗ��͂���B";
				close;
			}
			mes "[�����A���X]";
			mes "�����̃T�C�����";
			mes "���̉E���ɂ����B";
			mes "�����֍s���ăT�C�����";
			mes "�b�������Ă݂Ȃ����B";
			mes "���Ⴀ�A�T�C����̉��֑����Ă�����B";
			close2;
			warp "new_1-2",84,107;
			end;
		case 2:
			mes "[�����A���X]";
			mes "���킪�����̂ˁB";
			mes "�����ɍs�������̂��ȁH";
			mes "�����Ɓc�c���������ɂ�";
			mes "�S���������ˁH";
			mes "�����̍u�`�͑S���󂯂�����";
			mes "��΂�������B";
			next;
			if(select("����A����I","������Ƒ҂��āI")==1) {
				mes "[�����A���X]";
				mes "�����A���C�ˁI";
				mes "���Ⴀ�A�����Ă����悤�B";
				mes "��������ɂ���S���̐l��";
				mes "�b�͂����ƕ����̂�B";
				mes "�퓬�͖������I�@������ˁB";
				mes "�ł́A�����Ă������[���I";
				close2;
				warp "new_1-2",28,178;
				end;
			}
			mes "[�����A���X]";
			mes "�킩������B";
			mes "���Ⴀ�A�����Ƒ��̐l�̘b��";
			mes "�����Ă��Ȃ����B�u�t�����̘b��";
			mes "�Q�l�ɂȂ�͂���B";
			close;
		case 3:
			mes "[�����A���X]";
			mes "�X�֍s�������Ȃ�A�������ɂ���";
			mes "�J�v���E���ɂ��肢���Ȃ����B";
			mes "�v�����e���A�����N�A�t�F�C�����c�c";
			mes "���Ȃ����s�������X�֑����Ă�����B";
			close;
		}
	}
	mes "[�����A���X]";
	mes "�ǂ������́H";
	mes "���������Ă�̂��ȁH";
	mes "�u�`�́c�c�S�Ď󂯂��݂����ˁB";
	mes "�ǂ����s�������́H";
	next;
	switch(select("�ǂ��ɍs���΂����́H","�X�֍s������","���ł��Ȃ�")) {
	case 1:
		mes "[�����A���X]";
		mes "�����ˁc�c";
		mes "�A�C�e���̎g�������������Ă邵";
		mes "�X�L�����w�񂾂��c�c���Ⴀ�A";
		mes "�c���Ă�̂͐퓬���K���ˁB";
		mes "����Ȃ���K�}�b�v�̓������";
		mes "�����Ă����悤���H";
		next;
		if(select("�����āI�����āI","������Ƒ҂��āI")==1) {
			mes "[�����A���X]";
			mes "�����������A�C�e����";
			mes "������Ǝ����Ă�����ˁH";
			mes "�����h��͑��������H";
			mes "���ꂶ��A�����Ă�����I";
			close2;
			warp "new_1-2",28,178;
			end;
		}
		mes "[�����A���X]";
		mes "�킩������B";
		mes "�܂�������������";
		mes "���ł��Ă�ł��傤�����B";
		close;
	case 2:
		mes "[�����A���X]";
		mes "�X�֍s�������Ȃ�A�������ɂ���";
		mes "�J�v���E���ɂ��肢���Ȃ����B";
		mes "�v�����e���A�����N�A�t�F�C�����c�c";
		mes "���Ȃ����s�������X�֑����Ă�����B";
		close;
	case 3:
		mes "[�����A���X]";
		mes "�c�c����A�܂��ˁI";
		close;
	}
}

//==============================================================
new_1-2,118,108,3	script	�J�v���E��	117,{
	mes "[�J�v���E��]";
	mes "��������Ⴂ�܂��B";
	mes "���͏��S�҂̕���";
	mes "���ē����邽�߂�";
	mes "�J�v���{�Ђ���h������܂����B";
	mes "��낵�����肢�������܂��B";
	next;
	mes "[�J�v���E��]";
	mes "�䂪�J�v���T�[�r�X��";
	mes "�~�b�h�K���h�嗤���S�Ă�";
	mes "�������Ǘ����Ă���ƌ�����悤��";
	mes "�قڑS�Ă̊X�ŁA�`���҂̊F�l�ւ�";
	mes "�T�[�r�X��񋟂����Ă���������";
	mes "����܂��B";
	next;
	mes "[�J�v���E��]";
	mes "��������Ⴂ�܂��B";
	mes "�J�v���T�[�r�X��";
	mes "�����F�l�̂��΂ɂ��܂��B";
	mes "��������`���������܂��傤�H";
	next;
	mes "[�J�v���E��]";
	mes "��Ԉړ��T�[�r�X�ɂ���";
	mes "��ɂ��ē������Ă��������܂��B";
	mes "���A�X�ֈړ�����܂��ƁA";
	mes "^4A4AFF��x�Ə��S�ҏC����ւ�";
	mes "�߂�Ȃ��Ȃ�܂��B^000000";
	mes "���炩���߂��������������B";
	next;
	if(select("��Ԉړ��T�[�r�X","�J�v���T�[�r�X�ɂ͉�������́H")==1) {
		if((CHANGE_NV &0x70) == 0) {
			mes "[�J�v���E��]";
			mes "�X�֍s�����̂ł��ˁB";
			mes "�ł́A�ȒP�Ɏ�v�s�s�����Љ�";
			mes "���܂��傤�B";
			mes "�܂��A���[���~�b�h�K�b�c������";
			mes "��s�v�����e���A�����Ă��̉q���s�s";
			mes "�C�Y���[�h������܂��B";
			next;
			mes "[�J�v���E��]";
			mes "^4A4AFF�����N�͍����̓s�s�ŁA�V�[�t��";
			mes "�A�T�V��^000000�������W�܂��Ă���X�ł��B";
			mes "^4A4AFF�t�F�C�����͎R�x�Ɉʒu���Ă���A";
			mes "���̂����߂��ɋ|�葺^000000������܂��B";
			next;
			mes "[�J�v���E��]";
			mes "^4A4AFF�Q�t�F���͖��@�s�s�ƌ����Ă��܂��B";
			mes "�����}�W�V�����ɂȂ肽���̂ł�����A";
			mes "�Q�t�F��^000000�֍s�����Ɨǂ��ł��傤�B";
			next;
			mes "[�J�v���E��]";
			mes "^4A4AFF�A���x���^�͍`�X�ł��āA";
			mes "���l�g��^000000������܂��B";
			mes "�܂��A�D�ňړ��������̂ł�����A";
			mes "�A���x���^���C�Y���[�h�֍s��";
			mes "�K�v������܂��B";
			mes "�ł́A�ړI�n�����I�т��������B";
			next;
		}
		switch (select(((CHANGE_NV&0x70) == 0)? "": "��2�R�[�X�i�퓬���K�j","�v�����e��","�����N","�t�F�C����","�A���x���^","�Q�t�F��")) {
		case 1:
			mes "[�J�v���E��]";
			mes "��2�R�[�X�֑���܂��傤�B";
			close2;
			warp "new_1-2",28,178;
			end;
		case 2:
			mes "[�J�v���E��]";
			mes "���[���~�b�h�K�b�c�����̎�s";
			mes "�v�����e���ł��ˁB";
			mes "�ł́A�v�����e���֑���܂��傤�B";
			mes "���肪�Ƃ��������܂����B";
			mes "����Ƃ��J�v���T�[�r�X����낵��";
			mes "���肢���܂��B";
			close2;
			savepoint "prontera",118,72;
			warp "prontera",150,50;
			break;
		case 3:
			mes "[�J�v���E��]";
			mes "�����̓s�s�����N�ł��ˁB";
			mes "�����̃I�A�V�X���f�G�ȏ��ł��B";
			mes "�ł́A�����N�֑���܂��傤�B";
			mes "���肪�Ƃ��������܂����B";
			mes "����Ƃ��J�v���T�[�r�X����낵��";
			mes "���肢���܂��B";
			close2;
			savepoint "morocc",151,98;
			warp "morocc",155,110;
			break;
		case 4:
			mes "[�J�v���E��]";
			mes "����H�@�A�[�`���[�ɂȂ肽����";
			mes "�ł����H";
			mes "�ł́A�t�F�C�����֑���܂��傤�B";
			mes "���肪�Ƃ��������܂����B";
			mes "����Ƃ��J�v���T�[�r�X����낵��";
			mes "���肢���܂��B";
			close2;
			savepoint "payon",160,58;
			warp "payon",166,67;
			break;
		case 5:
			mes "[�J�v���E��]";
			mes "�`�X�A���x���^�ł��ˁB";
			mes "���[���~�b�h�K�b�c������";
			mes "�f�Ջ��_�ł��ˁB";
			mes "�܂��A���n��֑D�ւ�";
			mes "�A���x���^����o�Ă��܂��B";
			mes "���l�g���ɂł��������ł��傤���H";
			next;
			mes "[�J�v���E��]";
			mes "�ł́A�A���x���^�֑���܂��傤�B";
			mes "���肪�Ƃ��������܂����B";
			mes "����Ƃ��J�v���T�[�r�X����낵��";
			mes "���肢���܂��B";
			close2;
			savepoint "alberta",31,233;
			warp "alberta",114,58;
			break;
		case 6:
			mes "[�J�v���E��]";
			mes "���@�s�s�Q�t�F���ł��ˁB";
			mes "�Q�t�F���͒����̃Q�t�F���^���[��";
			mes "���h�ł��B�ł́A�Q�t�F���̕�����";
			mes "�߂��֑���܂��傤�B";
			next;
			mes "[�J�v���E��]";
			mes "���肪�Ƃ��������܂����B";
			mes "����Ƃ��J�v���T�[�r�X����낵��";
			mes "���肢���܂��B";
			close2;
			savepoint "geffen",118,37;
			warp "geffen",121,65;
			break;
		}
		if((CHANGE_NV &0x70) == 0) {
			getitem 569,100;
			getitem 1243,1;
			getitem 2414,1;
			getitem 2510,1;
			getitem 2352,1;
			getitem 2112,1;
			getitem 601,10;
			getitem 602,2;
		}
		set CHANGE_NV,0;
		end;
	}
	mes "[�J�v���E��]";
	mes "�J�v���T�[�r�X�̐��������܂��傤�B";
	mes "�m�肽���T�[�r�X�����I�����������B";
	while(1) {
		next;
		switch(select("�ʒu�Z�[�u�T�[�r�X","�q�ɃT�[�r�X","��Ԉړ��T�[�r�X","�J�[�g�T�[�r�X","�b����߂�")) {
		case 1:
			mes "[�J�v���E��]";
			mes "�퓬�s�\���̕����n�_��ۑ�����";
			mes "�T�[�r�X�ł��B�e�X�̃J�v���E����";
			mes "�Z�[�u���܂��ƁA�Y���̃J�v���E����";
			mes "�S�����Ă���Z�[�u�ʒu�����";
			mes "�������\�ł��B";
			next;
			mes "[�J�v���E��]";
			mes "�܂��A�Z�[�u�ʒu�͈�ԍŌ��";
			mes "�ۑ������ꏊ���L���ɂȂ�܂��B";
			mes "���ꂩ��u���̉H�v�Ƃ����A�C�e����";
			mes "���p����ƃZ�[�u�ʒu�֖߂邱�Ƃ�";
			mes "�ł��܂��B";
			next;
			mes "[�J�v���E��]";
			mes "���̈ʒu�Z�[�u�T�[�r�X�͖����ł��̂�";
			mes "���ЁA�����p���������B";
			if((CHANGE_NV &0x80) == 0) {
				if(BaseLevel < 8) {
					if(BaseLevel == 7)	getexp 155,0;
					else if(BaseLevel == 6)	getexp 115,0;
					else if(BaseLevel == 5)	getexp 78,0;
					else if(BaseLevel == 4)	getexp 37,0;
					else if(BaseLevel == 3)	getexp 26,0;
					else if(BaseLevel == 2)	getexp 17,0;
					else if(BaseLevel == 1)	getexp 10,0;
				}
				set CHANGE_NV,CHANGE_NV|0x80;
			}
			continue;
		case 2:
			mes "[�J�v���E��]";
			mes "�䂪�J�v���T�[�r�X�͒��N�̗��j��";
			mes "�`�����ւ�A�嗤�ő��";
			mes "�����Z���^�[�ł��B";
			next;
			mes "[�J�v���E��]";
			mes "�`���҂̊F�l�̕i����";
			mes "�ۊǂ����Ă�������";
			mes "�q�ɂ��A�䂪�J�v���T�[�r�X�ɂ�";
			mes "�񋟂��Ă���܂��B";
			next;
			mes "[�J�v���E��]";
			mes "�J�v���T�[�r�X�́A�قڑS�Ă�";
			mes "�X�ŉc�Ƃ��Ă���܂��̂�";
			mes "���ЁA�����p���������B";
			next;
			mes "[�J�v���E��]";
			mes "�ו��������ƈړ���퓬���A�v���悤��";
			mes "�����Ȃ����Ƃ�������ł��傤�B";
			mes "����Ȏ��A�䂪�J�v���T�[�r�X�̑q�ɂ�";
			mes "���܂�g�p���Ȃ��A�C�e����a�����";
			mes "�悢�Ǝv���܂��B";
			next;
			mes "[�J�v���E��]";
			mes "�q�ɂ̂����p�͂�����x�o����";
			mes "�ς܂ꂽ����Ώۂɂ�����";
			mes "���������Ă���܂��B";
			mes "�����Ă����p�̍ۂɂ́A";
			mes "���z�̑q�ɗ��p����";
			mes "���������Ă���܂��B";
			next;
			mes "[�J�v���E��]";
			mes "�q�ɂ̂����p�ɂ�";
			mes "^4A4AFF��{�X�L���̃��x����6";
			mes "�ȏ�^000000�K�v�ł��B";
			next;
			mes "[�J�v���E��]";
			mes "�q�ɂ̓A�C�e���Ɠ��������Օi�A�����i";
			mes "���̑��A�C�e���Ƃ�������";
			mes "���ނ���Ă���܂��B";
			next;
			mes "[�J�v���E��]";
			mes "�܂��A�ō�300��ނ̃A�C�e����";
			mes "�a���邱�Ƃ��ł��܂��B";
			mes "�����A�C�e���̍ő�ۊǉ\����";
			mes "3���ƂȂ�܂��B";
			next;
			mes "[�J�v���E��]";
			mes "����A�J�E���g���̃L�����N�^�[��";
			mes "���ʂ̑q�ɂ𗘗p���邱�ƂɂȂ�܂��B";
			mes "�e�X���Ƃɑq�ɗ��p���͈قȂ�܂��̂�";
			mes "�����p�̍ۂɂ͂����ӂ��������B";
			if((CHANGE_NV &0x100) == 0) {
				if(JobLevel < 8) {
					if(JobLevel == 7)	getexp 0,205;
					else if(JobLevel == 6)	getexp 0,151;
					else if(JobLevel == 5)	getexp 0,91;
					else if(JobLevel == 4)	getexp 0,40;
					else if(JobLevel == 3)	getexp 0,28;
					else if(JobLevel == 2)	getexp 0,18;
					else if(JobLevel == 1)	getexp 0,10;
				}
				set CHANGE_NV,CHANGE_NV|0x100;
			}
			continue;
		case 3:
			mes "[�J�v���E��]";
			mes "�䂪�J�v���T�[�r�X�ł�";
			mes "���N�̃m�E�n�E�𐶂����A�F�l�̗���";
			mes "�����K�ɂȂ�悤�ɂƁA";
			mes "��Ԉړ��T�[�r�X�����񋟂���";
			mes "���܂��B";
			next;
			mes "[�J�v���E��]";
			mes "����͂Ƃ����ԏp�t�̔\�͂�";
			mes "���p�������̂ŁA�F�l������]�̒n���";
			mes "�]������Ƃ������̂ł��B";
			mes "�]���\�Ȓn��͊e�X���Ƃ�";
			mes "���߂��Ă��܂��̂ŁA�����p�̍ۂɂ�";
			mes "�s��������킹�Ă��m�F���������B";
			next;
			mes "[�J�v���E��]";
			mes "���q�l�̂��v�]�ɐ^�S��������";
			mes "����������̂�";
			mes "�䂪�J�v���T�[�r�X�̕��j�ł��B";
			mes "������J�v���T�[�r�X����낵��";
			mes "���肢���܂��B";
			continue;
		case 4:
			mes "[�J�v���E��]";
			mes "�䂪�J�v���T�[�r�X�ł́A���l�n�E�Ƃ�";
			mes "���̂��߂ɉ^����i�̈�ł���";
			mes "�u�J�[�g�v��݂��o���Ă���܂��B";
			mes "���X�̓A���x���^���l�g����";
			mes "�s���Ă����̂ł����A�J�v���ɂ�";
			mes "�Ɩ����s���邱�ƂɂȂ�܂����B";
			next;
			mes "[�J�v���E��]";
			mes "����ɂ��֗��Ɏ�y�ɗ��p�ł���";
			mes "�悤�ɂȂ�܂����B";
			mes "�J�[�g�̂����p�͏��l�n�E�Ƃł���";
			mes "���l�A�u���b�N�X�~�X�A�A���P�~�X�g��";
			mes "���̏�ʐE�Ƃ̕��݂̂Ƃ�����";
			mes "���������Ă���܂��B";
			next;
			mes "[�J�v���E��]";
			mes "���A���ꂩ�畷�����b�Ȃ̂�";
			mes "���m�ł͂���܂��񂪁c�c";
			mes "�X�[�p�[�m�[�r�X�̕����J�[�g��";
			mes "�����p�ɂȂ��ꍇ�����邻���ł��B";
			next;
			mes "[�J�v���E��]";
			mes "�����p�ɂ̓X�L���u�v�b�V���J�[�g�v��";
			mes "�K�v�ł��B";
			mes "�܂��A�J�[�g�݂̑��o��������";
			mes "�X���ƂɈقȂ�܂��̂ŁA�����p�̍ۂ�";
			mes "�����ӂ��������B";
			continue;
		case 5:
			mes "[�J�v���E��]";
			mes "�䂪�J�v���T�[�r�X�ɂ���";
			mes "���������������܂����ł��傤���H";
			mes "����Ƃ��J�v���T�[�r�X����낵��";
			mes "���肢���܂��B";
			close;
		}
	}
}

//==============================================================
new_1-2,121,101,2	script	�ē��v��	105,{
	mes "[�ē��v��]";
	mes "�������ē��v���͊X�̓�����";
	mes "�����Ȃǂ̈ʒu���ɂ���";
	mes "���ē����Ă��܂��B";
	mes "���߂ĖK�ꂽ�X�ł́A";
	mes "���̂悤�Ȉē��v�������K��";
	mes "���������B";
	next;
	mes "[�ē��v��]";
	mes "�e�X�̈ē��v���́A�X�̓��F";
	mes "�ɂ���ĕ������قȂ��Ă�����";
	mes "���܂��̂ŁA���̓_�ɂ͋C��";
	mes "���Ă��������ˁB";
	next;
	mes "[�ē��v��]";
	mes "�X�ɍs�������ꍇ�́A";
	mes "�J�v���E���̋�Ԉړ�";
	mes "�T�[�r�X�𗘗p���Ă��������B";
	close;
}


//==========================================
// �E�̕���
//------------------------------------------

new_1-2,161,182,6	script	�C���^�[�t�F�[�X�u�t	92,{
	mes "[�G�h�E�B��]";
	mes "���̓C���^�[�t�F�[�X�ɂ���";
	mes "�ڂ��������Ă���u�t��B";
	mes "���A�m�肽�����ڂ�I��łˁB";
	while(1) {
		next;
		switch(select("��{���E�B���h�E�ɂ���","�p�[�e�B�[�E�B���h�E�ɂ���","�A�C�e���E�B���h�E�ɂ���","�I�v�V�����E�B���h�E�ɂ���","�����E�B���h�E�ɂ���","��߂�")) {
		case 1:
			mes "[�G�h�E�B��]";
			mes "����ł͊�{���E�B���h�E��";
			mes "���Ă݂悤�B";
			mes "���Ȃ��̖��O��������Ă���";
			mes "�x�[�X���x���ƐE�Ƃ̃��x����";
			mes "������Ă����ˁB";
			next;
			mes "[�G�h�E�B��]";
			mes "�x�[�X���x��^8408FF(Base Lv)^000000�́A";
			mes "�L�~�̊�{�I�ȃ��x���̂��Ƃ�";
			mes "�����́B";
			next;
			mes "[�G�h�E�B��]";
			mes "����^8408FFJob Lv^000000�͐E�ƃ��x���ˁB";
			mes "�����Ƌ����̍u�`���󂯂�";
			mes "�����̂Ȃ�A������̈Ⴂ��";
			mes "�킩���Ă���Ǝv����B";
			next;
			mes "[�G�h�E�B��]";
			mes "��{���E�B���h�E������ƁA";
			mes "���݂̎����̌o���l���킩���B";
			mes "�o���l�� % �ŕ\����āA��͂�";
			mes "Base Lv�� Job Lv�ɕ�����Ă�";
			mes "�ł���B�o���l��100%�ɂȂ�ƁA";
			mes "���ꂼ�ꂪ���x���A�b�v�����B";
			next;
			mes "[�G�h�E�B��]";
			mes "HP�̓L�~�̗̑͂�\���Ă���B";
			mes "HP��0�ɂȂ�ƋC�₵�āA�퓬�s�\";
			mes "�ɂȂ��B���̎��A�X�ɖ߂邩�A";
			mes "�N�������������Ă����̂�";
			mes "�҂��Ȃ���΂Ȃ�Ȃ���B";
			next;
			mes "[�G�h�E�B��]";
			mes "�t�B�[���h��_���W�����Ő퓬�s�\��";
			mes "�Ȃ��Ă��܂��ƁA^4A4AFF�o���l -1% ��";
			mes "�y�i���e�B^000000���󂯂邩��";
			mes "�C�����ĂˁB";
			next;
			mes "[�G�h�E�B��]";
			mes "SP�̓X�L�����g�����ɏ����";
			mes "���l�ˁB��ŐE�ƂɏA���悤�ɂȂ��";
			mes "�g����X�L�����o�����邩��A";
			mes "���̂Ƃ��Ɏ����Ă݂ĂˁB";
			mes "�X�L���̐����̓X�L��������";
			mes "���Ă�����B";
			next;
			mes "[�G�h�E�B��]";
			mes "���݂̎����̏������E�ʂ�";
			mes "�m�肽����΁A��{���E�B���h�E��";
			mes "���̕���weight�̒l�������";
			mes "������B";
			next;
			mes "[�G�h�E�B��]";
			mes "/ �̌��̕������������E�ʂŁA";
			mes "�����d�ʂ�50%�𒴂����";
			mes "�����I��HP/SP���񕜂��Ȃ�";
			mes "�悤�ɂȂ邩��C�����ĂˁB";
			next;
			mes "[�G�h�E�B��]";
			mes "�������E�ʂ̌�̐��l�́A";
			mes "���݃L�~�������Ă��邨����";
			mes "�\���Ă���́B";
			mes "�~�b�h�K���h�̉ݕ��P�ʂ�";
			mes "Zeny(�[�j�[)��B";
			next;
			mes "[�G�h�E�B��]";
			mes "��{���E�B���h�E�̉E���ɂ���";
			mes "�{�^���́A�ʂ̃C���^�[�t�F�[�X";
			mes "���j���[�Ȃ̂ŁA1��������";
			mes "�����\������邩�m�F���Ă݂ĂˁB";
			next;
			mes "[�G�h�E�B��]";
			mes "���ƁA��{���E�B���h�E�́A";
			mes "�ualt+v�v�ōŏ�/�ő剻��";
			mes "�ł��邩��Q�l�ɂ��ĂˁB";
			continue;
		case 2:
			mes "[�G�h�E�B��]";
			mes "�p�[�e�B�[�E�B���h�E�́A";
			mes "��{���E�B���h�E��";
			mes "friend�{�^���ŕ\���ł��A";
			mes "�ualt+z�v�ł��J�����Ƃ�";
			mes "�ł����B";
			next;
			mes "[�G�h�E�B��]";
			mes "���݃p�[�e�B�[�ɑ����Ă���";
			mes "�p�[�e�B�[�����o�[������";
			mes "���X�g�����邱�Ƃ��ł���́B";
			next;
			mes "[�G�h�E�B��]";
			mes "�p�[�e�B�[����������";
			mes "�p�[�e�B�[���[�_�[�́A";
			mes "�o���l�̕��z������";
			mes "�ύX���邱�Ƃ��ł����B";
			next;
			mes "[�G�h�E�B��]";
			mes "�܂��A�p�[�e�B�[�����o�[�̈ʒu��";
			mes "��ʉE��̃~�j�}�b�v��";
			mes "�\������邩��o���Ă����ĂˁB";
			next;
			mes "[�G�h�E�B��]";
			mes "�p�[�e�B�[�E�B���h�E�Ƃ͕ʂɁA";
			mes "�F�B���X�g���p�ӂ���Ă��āA";
			mes "�F�B�ɓo�^�����l������";
			mes "�m�F�ł����B";
			mes "�o�^�����l�Ƀ��b�Z�[�W��";
			mes "���邱�Ƃ��ł���̂�B";
			next;
			mes "[�G�h�E�B��]";
			mes "�p�[�e�B�[�̌������@�́A";
			mes "�X�L��������S�����Ă���l��";
			mes "�����Ă�����B";
			mes "���������̂͒��ڂ���Ă݂�̂�";
			mes "��Ԃ�ˁB";
			continue;
		case 3:
			mes "[�G�h�E�B��]";
			mes "�A�C�e���E�B���h�E�́A3��";
			mes "�^�u�ɕ�����Ă��āA";
			mes "�uitem�v�ɂ͏��Օi������́B";
			mes "�uequip�v�ɂ͑����A�C�e���A";
			mes "�uetc�v�ɂ͂���ȊO�̃A�C�e����";
			mes "�����B";
			next;
			mes "[�G�h�E�B��]";
			mes "�������E�ʂ𒴂�����A";
			mes "100��ނ�葽���̃A�C�e����";
			mes "�����Ƃ��ł��Ȃ�����A";
			mes "�J�v���T�[�r�X�̑q�ɂ𗘗p�����";
			mes "�ǂ���ˁB";
			next;
			mes "[�G�h�E�B��]";
			mes "���Օi�Ƒ����A�C�e���́A";
			mes "�V���[�g�J�b�g�E�B���h�E�ɓo�^����";
			mes "�g�����Ƃ��ł�����B";
			mes "�ƂĂ��֗�������A�o���Ă����ĂˁB";
			next;
			mes "[�G�h�E�B��]";
			mes "^4A4AFF�V���[�g�J�b�g�E�B���h�E�� F12^000000";
			mes "�ŊJ�����Ƃ��ł����B";
			mes "�o�^���ꂽ�A�C�e���̎g�p�́A";
			mes "F1����F9�܂ł̃L�[�Ɋ��蓖��";
			mes "���邩��ˁB";
			next;
			mes "[�G�h�E�B��]";
			mes "�Ō�ɁA�A�C�e���E�B���h�E��";
			mes "�ualt+e�v�ł��J���邱�Ƃ��ł���";
			mes "���炱����o���Ă����ĂˁB";
			continue;
		case 4:
			mes "[�G�h�E�B��]";
			mes "�I�v�V�����E�B���h�E��";
			mes "��{���E�B���h�E��option";
			mes "�{�^���ł��J�����Ƃ��ł��邯�ǁA";
			mes "�ualt+o�v�ł������B";
			mes "�I�v�V�����ł́A���̒��߂Ƃ�";
			mes "�X�L���̕ύX�Ȃǂ��ł����B";
			next;
			mes "[�G�h�E�B��]";
			mes "���̒��߂�BGM�� on/off";
			mes "������A�傫����ς����āA";
			mes "Effect�͌��ʉ��̉��ʂ�";
			mes "���߂ł����B";
			next;
			mes "[�G�h�E�B��]";
			mes "�X�L���̕����̓C���^�[�t�F�[�X��";
			mes "�X�L����ύX���邱�Ƃ��ł���́B";
			mes "�K�p�������X�L�������X�g����";
			mes "�I������΂�����B";
			next;
			mes "[�G�h�E�B��]";
			mes "�X�i�b�v�̕����́A";
			mes "�����I�ɋ߂��̖ڕW�ɃJ�[�\����";
			mes "���킹�Ă����@�\�̂��ƂˁB";
			mes "attack�͍U���ڕW�A";
			mes "skill�̓X�L�����g���ΏہA";
			mes "item�͐������Ȃ��Ă��������ˁB";
			next;
			mes "[�G�h�E�B��]";
			mes "�g�����ɂ���Ă͕֗��ɂȂ�����";
			mes "�ז��ɂȂ����肷�邯�ǁc�c";
			mes "�����Ɏg���₷���ݒ肷��Ƃ�����B";
			next;
			mes "[�G�h�E�B��]";
			mes "���ۂ���Ă݂Ȃ���o����̂�";
			mes "��ԂˁB�I�v�V�����ɂ��Ă�";
			mes "���ꂭ�炢�ŏI���ɂ��܂���B";
			continue;
		case 5:
			mes "[�G�h�E�B��]";
			mes "��{���E�B���h�E��";
			mes "equip�{�^������������A";
			mes "�ualt+q�v�������Ă݂āB";
			mes "���݁A�L�~�̃L�����N�^�[��";
			mes "�������Ă���A�C�e����";
			mes "���邱�Ƃ��ł���ł���B";
			next;
			mes "[�G�h�E�B��]";
			mes "������Ԃł̓i�C�t��";
			mes "�R�b�g���V���c�𑕔����Ă���́B";
			mes "�A�C�e���̑����̓A�C�e���E�B���h�E��";
			mes "�����������A�C�e�����_�u���N���b�N";
			mes "������A�N���b�N�����܂�";
			mes "�����ӏ��Ƀh���b�O���Ă�������B";
			next;
			mes "[�G�h�E�B��]";
			mes "F12�𗘗p���ăV���[�g�J�b�g";
			mes "�E�B���h�E�ɓo�^���Ă����ƁA";
			mes "�����̎����ւ����X���[�Y��";
			mes "�ł��āA�G�ɍ��킹�đ�����";
			mes "�ς��鎞�Ȃ񂩂ɂ������֗���B";
			continue;
		case 6:
			mes "[�G�h�E�B��]";
			mes "�킩��Ȃ����Ƃ���������";
			mes "���ł������ĂˁB";
			close;
		}
	}
}

//==============================================================
new_1-2,182,182,3	script	�X�e�[�^�X�u�t	754,{
	mes "[�[�����I�b�g]";
	mes "���ɏ��߂̈���𓥂ݏo��";
	mes "�`���҂ł��ˁB";
	mes "���[�����I�b�g�͂��Ȃ���";
	mes "�X�e�[�^�X�c�c�܂�\��";
	mes "�ɂ��āA�ǂ̂悤�Ȍ�����";
	mes "��ɐ��藧���Ă���̂��������܂��B";
	next;
	mes "[�[�����I�b�g]";
	mes "�܂��͒m�肽���\�͒l�ɂ���";
	mes "���₵�Ă݂Ȃ����B";
	next;
	mes "[�[�����I�b�g]";
	mes "���A�����Y��܂����ˁB";
	mes "�X�e�[�^�X�́A";
	mes "��(Str)�A����(Agi)�A";
	mes "�̗�(Vit)�A�m��(Int)";
	mes "�Z(Dex)�A������";
	mes "�^(Luk)�Ő��藧���Ă��܂��B";
	while(1) {
		next;
		switch(select("Str��Agi","Vit��Int","Dex��Luk","��߂�")) {
		case 1:
			mes "[�[�����I�b�g]";
			mes "Str�́A���ړI�ȍU����";
			mes "����ɗ^����_���[�W�Ɋ֌W����";
			mes "Atk�ƁA�A�C�e���������Ƃ��ł���";
			mes "�ő及���ʂɊ֌W���Ă��܂��B";
			next;
			mes "[�[�����I�b�g]";
			mes "Str��1��������ƁA���ڍU����";
			mes "�_���[�W��1�������܂��B";
			mes "����ɁA10�P�ʂōU���͂Ƀ{�[�i�X";
			mes "���ǉ�����܂��B";
			next;
			mes "[�[�����I�b�g]";
			mes "�Ⴆ�΋�̓I�ɐ�������ƁA";
			mes "���Ȃ���Str�� 48+1 �Ɖ��肵��";
			mes "�݂܂��傤�B";
			mes "���Ȃ��̏�����Str��48�ŁA";
			mes "+1��JobLv�⑕���A�C�e���Ȃǂ�";
			mes "�����d�l�ł��B";
			next;
			mes "[�[�����I�b�g]";
			mes "�����āA49��^4A4AFF�\�̈�";
			mes "4���悷��ƁA(4x4)��16";
			mes "�ƂȂ�A����16���U���͂ւ�";
			mes "�{�[�i�X^000000�ƂȂ�܂��B";
			next;
			mes "[�[�����I�b�g]";
			mes "���̌�A���x�����オ��Str��";
			mes "49+1�ɂȂ����ꍇ�A���v50";
			mes "�ł�����A5x5��25�ɂȂ�܂��ˁB";
			mes "Str��100�Ȃ�A10x10��";
			mes "100�̃{�[�i�X���^������̂ł��B";
			mes "�킩��܂����H";
			next;
			mes "[�[�����I�b�g]";
			mes "�ł́AAgi�ɂ��Đ������܂��傤�B";
			mes "^4A4AFFAgi��^000000 ����̍U����";
			mes "������邱�Ƃ��ł��鐔�l�ł���";
			mes "^4A4AFF���(Flee)��";
			mes "�U���X�s�[�h(Aspd)^000000�ɉe����^���܂��B";
			next;
			mes "[�[�����I�b�g]";
			mes "Agi��1��������ƁA��𗦂�";
			mes "1�オ��A���x����1�������Ă�";
			mes "��𗦂�1�オ��܂��B";
			mes "�܂�A^4A4AFFFlee^000000��";
			mes "^4A4AFFAgi + BaseLv^000000�ł��B";
			next;
			mes "[�[�����I�b�g]";
			mes "��̓I�ȗ�������܂��傤�B";
			mes "���Ȃ��̃��x����40�ŁA";
			mes "Agi��40�Ȃ�AFlee��80";
			mes "�Ƃ������ƂɂȂ�܂��ˁB";
			next;
			mes "[�[�����I�b�g]";
			mes "�܂��AFlee�́A";
			mes "�ʏ���+���S���";
			mes "�Ƃ����ӂ��ɕ\������܂��B";
			mes "^4A4AFFAgi�͒ʏ��𗦂����Ɋ֌W^000000";
			mes "���܂��B";
			next;
			mes "[�[�����I�b�g]";
			mes "���S��𗦂́ALuk�̒l��";
			mes "�֌W����̂ŁALuk�̂Ƃ����";
			mes "�������܂��傤�B";
			next;
			mes "[�[�����I�b�g]";
			mes "���ƁA�U���X�s�[�h(Aspd)��";
			mes "�オ��قǁA�U������܂ł̎��ԂƁA";
			mes "�U����̍d��(�f�B���B)���Ԃ�";
			mes "����܂��B";
			mes "Aspd�͐E�Ƃ��Ƃł��Ⴂ��";
			mes "������̂ŁA�Q�l�ɂ��Ă��������B";
			continue;
		case 2:
			mes "[�[�����I�b�g]";
			mes "Vit��Int�ł��ˁB";
			mes "^4A4AFFVit�̓L�����N�^�[�̍ő�HP��";
			mes "HP�񕜗ʁA���ꂩ��󂯂�";
			mes "�_���[�W�̌����Ɋ֘A����";
			mes "�X�e�[�^�X�ł��B^000000";
			next;
			mes "[�[�����I�b�g]";
			mes "Vit��1�����������ɏ㏸����";
			mes "HP�̒l�͐E�Ƃ��ƂɈႢ�܂���";
			mes "���m�n�E�Ƃ���ԍ����Ȃ�܂��B";
			next;
			mes "[�[�����I�b�g]";
			mes "�_���[�W�̌����ɂ��ẮA";
			mes "Def�̒l�Ɋ֘A���A";
			mes "�O�̒l + ���̒l�ƕ\�������";
			mes "���܂����A���̌��̒l��";
			mes "Vit�̒l�ɂȂ�܂��B";
			next;
			mes "[�[�����I�b�g]";
			mes "�ł͑O�̒l�͉��ł��傤���H";
			mes "����͑��������h��ɂ��";
			mes "�l�Ȃ̂ł��B";
			next;
			mes "[�[�����I�b�g]";
			mes "�h��̖h��͂ŁA����̍U����";
			mes "%�v�Z�Ō��������A��������";
			mes "�_���[�W������̒l��";
			mes "�������_���[�W���A���Ȃ���";
			mes "�󂯂�_���[�W�ɂȂ�܂��B";
			next;
			mes "[�[�����I�b�g]";
			mes "�������A����͂����܂Ŋ�{�I��";
			mes "�v�Z�������Ă��܂���̂ŁA";
			mes "���̗v�f�����߂΁A�܂�";
			mes "�󂯂�_���[�W���ω�����ł��傤�B";
			next;
			mes "[�[�����I�b�g]";
			mes "�����āA���Ȃ��̓}�W�V������";
			mes "�Ȃ����͂���܂��񂩁H";
			mes "�܂��c�c��k�ł����A";
			mes "Int�ɂ��Ă��b���܂��傤���B";
			next;
			mes "[�[�����I�b�g]";
			mes "Int�͍ő�SP��SP�񕜗ʁA";
			mes "Matk�AMdef�Ɋ֌W���Ă��܂��B";
			next;
			mes "[�[�����I�b�g]";
			mes "Matk�͖��@�U���́A";
			mes "Mdef�͖��@�h��͂�";
			mes "�\���Ă��܂��B";
			mes "�c�c������Ɨ]�k�ł���";
			mes "Int1������ŏ㏸����SP�̒l��";
			mes "�E�Ƃ��Ƃɍ�������܂��B";
			next;
			mes "[�[�����I�b�g]";
			mes "Mdef��Def�Ɠ����悤�ɁA";
			mes "�O�̒l + ���̒l�Ƃ���";
			mes "�\���ɂȂ��Ă���Ǝv���܂��B";
			mes "��͂���̒l���AInt�ɂ��";
			mes "���̂ł��ˁB";
			next;
			mes "[�[�����I�b�g]";
			mes "���̂����镨���\�����錳�f�ɂ���";
			mes "������������΁AInt���Ȃ킿�m�͂�";
			mes "�������Ƃ��K�v�ł��B";
			mes "���̂悤�Ȋw�҂▂�@�t������";
			mes "Int�ɏd����u���Ă��܂��B";
			continue;
		case 3:
			mes "[�[�����I�b�g]";
			mes "Dex��Luk�ł��ˁB";
			mes "�^�Ő��������߂�l�����邪";
			mes "�w�͂ɂ���ď�����邱�Ƃ�";
			mes "�d�v���c�c�ӂށB";
			mes "���A�Ƃ茾�ł��B";
			mes "����ł͎n�߂܂��傤���B";
			next;
			mes "[�[�����I�b�g]";
			mes "Dex��Hit(������)��Aspd��";
			mes "�傫���e����^���A";
			mes "�U���͂ɂ������̉e����";
			mes "�^���܂��B";
			mes "���ɁA�ŏ��_���[�W�̒�グ�ł��B";
			next;
			mes "[�[�����I�b�g]";
			mes "�ŏ��_���[�W�����シ��΁A";
			mes "����ɗ^����_���[�W��";
			mes "���ʓI�Ɍ��サ�܂�����A";
			mes "Dex�̑��݂��d�v�ł��ˁB";
			next;
			mes "[�[�����I�b�g]";
			mes "^4A4AFF�|���g���ꍇ^000000�́A";
			mes "^4A4AFF�U���͂�Dex�̒l��^000000���܂�܂��̂�";
			mes "���Ȃ�������A�[�`���[��n���^�[";
			mes "�ɂȂ낤�Ǝv������Dex��";
			mes "���낻���ɂ��Ă͂Ȃ�܂���B";
			next;
			mes "[�[�����I�b�g]";
			mes "�܂��AHit��BaseLv + Dex";
			mes "�Ő��藧���Ă��܂��B";
			next;
			mes "[�[�����I�b�g]";
			mes "���Ȃ��̃��x����40�ŁA";
			mes "Dex��20���Ƃ�����A";
			mes "Hit��40 + 20��";
			mes "60�ɂȂ�܂��B�킩��܂����H";
			next;
			mes "[�[�����I�b�g]";
			mes "�܂��A���@�Ȃǂ̉r����K�v�Ƃ���";
			mes "�X�L�����g�p���鎞�A";
			mes "^4A4AFF�L���X�e�B���O(�r��)���Ԃ�";
			mes "����������^000000���Ƃ��ł��܂��B";
			next;
			mes "[�[�����I�b�g]";
			mes "���āALuk�͌��t�̒ʂ�ł����A";
			mes "Critical(�N���e�B�J����)��";
			mes "Flee(���)�A������";
			mes "�U���͂ɂ������e��������܂��B";
			next;
			mes "[�[�����I�b�g]";
			mes "Critical��";
			mes "^4A4AFFLuk3��1����^000000�オ��A";
			mes "�N���e�B�J���U���́A����̖h���";
			mes "�𖳎������_���[�W��^���邱�Ƃ�";
			mes "�ł��܂��B";
			next;
			mes "[�[�����I�b�g]";
			mes "�܂��ALuk��10�P�ʂ�";
			mes "���S��𗦂�1���㏸���܂��B";
			mes "���S�������������ƁA";
			mes "�L�����N�^�[�̓����Lucky";
			mes "�Ƃ����\�����o�܂��B";
			mes "���̎��A����̍U�����������܂��B";
			next;
			mes "[�[�����I�b�g]";
			mes "�K�^�Ƃ������t�͗ǂ����t�ł����A";
			mes "����ɗ����Ă΂���͂����܂���B";
			mes "���āA���͑��v�ł��傤���H";
			continue;
		case 4:
			mes "[�[�����I�b�g]";
			mes "���v�Ȃ悤�ł��ˁB";
			mes "�{���瓾��m�����ǂ��ł����A";
			mes "�o������w�Ԃ��Ƃ��d�v�ł��B";
			mes "����΂��Ă��������ˁB";
			close;
		}
	}
}

//==============================================================
new_1-2,184,172,2	script	�X�L���u�t	47,{
	emotion 30;
	mes "[�s�b�`�W���_�X]";
	mes "�悤�����I";
	mes "�񂪔��������ɂȂ�ق�";
	mes "���҂����Ă܂�����`";
	mes "�j���[�t�F�C�X�͂��킢���I";
	mes "���̃s�b�`�搶���X�L���ɂ���";
	mes "�^�S�������ċ����܂���I";
	while(1) {
		next;
		switch(select("�p�b�V�u�X�L���ƃA�N�e�B�u�X�L��","�p�b�V�u�I ��{�X�L�����w�ڂ�","�G���[�V�����Ŋ���\��","��߂�")) {
		case 1:
			mes "[�s�b�`�W���_�X]";
			mes "�p�b�V�u�ƃA�N�e�B�u�X�L���I";
			mes "�p�b�V�u����������邩��";
			mes "�ǂ������Ă��������`";
			mes "��Ɂualt+s�v�ŃX�L���E�B���h�E��";
			mes "�J���Ă��������[�B";
			next;
			mes "[�s�b�`�W���_�X]";
			mes "�g�p�\�ȃX�L���������܂����H";
			mes "��{�X�L��������ƁA�E����";
			mes "�p�b�V�u�Ə����Ă���ł��傤�`";
			mes "����ł͊�{�X�L���̃A�C�R����";
			mes "�E�N���b�N���Ă݂܂��傤���B";
			next;
			mes "[�s�b�`�W���_�X]";
			mes "��{�I�ȃC���^�[�t�F�[�X�ɂ��Ă�";
			mes "�X�L�����g�����Ƃ��ł���B";
			mes "�Ə����Ă���܂��ˁ`�B";
			mes "�F����̐����ɕK�v�ȃX�L���ł��B";
			mes "�����āA�����̃X�L�����g���̂�";
			mes "SP�͕K�v����܂���B";
			next;
			mes "[�s�b�`�W���_�X]";
			mes "�p�b�V�u�X�L���́A";
			mes "SP��������Ɍ��ʂ�";
			mes "�K�p�����X�L���̂��Ƃ�";
			mes "�����܂��B";
			next;
			mes "[�s�b�`�W���_�X]";
			mes "�t�ɁA�A�N�e�B�u�X�L����";
			mes "SP������銈���I�ȃX�L����";
			mes "���Ƃ��w���A�X�L�����g�p����";
			mes "���ɔ������܂��B���m�̃o�b�V����";
			mes "�A�R���C�g�̃q�[���Ȃǂ�";
			mes "�����ł��ˁB";
			next;
			mes "[�s�b�`�W���_�X]";
			mes "�����̎��Ƃ���������󂯂Ă�����";
			mes "���}�蓖�̃X�L�����K������";
			mes "����͂��ł��B�ǂ��ł��傤�`�H";
			mes "�����K�����Ă�����A�_�u���N���b�N";
			mes "�ň�x�g���Ă݂Ă��������B";
			mes "SP������āA�������܂���ˁH";
			next;
			mes "[�s�b�`�W���_�X]";
			mes "����ȃX�L�����A�N�e�B�u�X�L��";
			mes "�Ȃ̂ł��B";
			next;
			mes "[�s�b�`�W���_�X]";
			mes "�����̋Z�p��̗͓I�ɁA��������";
			mes "���_�I�ɏC���������̂͑��";
			mes "�p�b�V�u�X�L���ƂȂ�A";
			mes "���@�̂悤�Ɏg�p���鎞��";
			mes "����������̂̓A�N�e�B�u�X�L��";
			mes "�ƂȂ�܂��B�����ł��ˁH";
			next;
			mes "[�s�b�`�W���_�X]";
			mes "���`��c�c�����͓���Ȃ�";
			mes "�ł����H�@��������������x";
			mes "�������܂���`";
			continue;
		case 2:
			mes "[�s�b�`�W���_�X]";
			mes "�p�b�V�u�X�L���̐^���I";
			mes "���킢���m�[�r�X���o����";
			mes "�͂��߂ẴX�L���I";
			mes "�����ɕK�v�Ȋ�{�X�L����";
			mes "�׋����鎞�Ԃł��I";
			next;
			mes "[�s�b�`�W���_�X]";
			mes "�X�L���E�B���h�E�ŃA�C�R����";
			mes "����E�N���b�N����Ɛ�������";
			mes "�ǂ߂܂����A��{�X�L����";
			mes "���ނ��č��ڂɕ����Ă݂܂����B";
			while(1) {
				next;
				switch(select("����ƌ���","�p�[�e�B�[�̌����ƎQ��","�`���b�g���[���J��","�q�ɂ̗��p","�S�ĕ������Ă��܂�")) {
				case 1:
					mes "[�s�b�`�W���_�X]";
					mes "���̐l�Ǝ�������邽�߂ɂ�";
					mes "��{�X�L����1�ȏ�Ȃ����";
					mes "�����܂���B";
					next;
					mes "[�s�b�`�W���_�X]";
					mes "�����v�����鎞�ɂ́A";
					mes "�������d�v�ł��I";
					mes "����̂������܂ŋ߂Â���";
					mes "����������������������";
					mes "�E�N���b�N���܂��B1�񂾂��ł���B";
					next;
					mes "[�s�b�`�W���_�X]";
					mes "���̌�A^4808FF����v��^000000��";
					mes "�I������Α���Ɏ���v��";
					mes "���b�Z�[�W���\������܂��̂ŁA";
					mes "���肪OK����΁A�����E�B���h�E��";
					mes "�J����܂��B����Ƃ̋�����";
					mes "�J���ƒ��f����܂��̂ŋC�����āB";
					next;
					mes "[�s�b�`�W���_�X]";
					mes "�����āA�����E�B���h�E�̍�����";
					mes "�A�C�e���E�B���h�E����n������";
					mes "�A�C�e�����h���b�O���Ēu���܂��B";
					mes "Zeny��n�����͋��z��";
					mes "���͂���Ηǂ��ł��B";
					next;
					mes "[�s�b�`�W���_�X]";
					mes "�n���A�C�e�����m�F���鎞��";
					mes "�Y���̃A�C�e�����E�N���b�N����";
					mes "�ڂ������e�����܂��傤�B";
					next;
					mes "[�s�b�`�W���_�X]";
					mes "OK�������Ċm�F��������ɁA";
					mes "�utrade�v�{�^����������";
					mes "�������̌����A�C�e����";
					mes "�m�肳��܂��B";
					mes "���葤�ɂ������悤��trade";
					mes "����������A������������܂��B";
					next;
					mes "[�s�b�`�W���_�X]";
					mes "trade�������O�Ȃ�A";
					mes "������L�����Z�����邱�Ƃ�";
					mes "�ł��܂��̂ŁA�o���Ă����Ă��������B";
					continue;
				case 2:
					mes "[�s�b�`�W���_�X]";
					mes "���ꂩ��׋�����̂́`";
					mes "�p�[�e�B�[�ɂ��Ăł��I";
					mes "�p�[�e�B�[�ƌ����΁A����ς�";
					mes "���ꂢ�ȏƖ��ɂ���߂��h���X�I";
					next;
					mes "[�s�b�`�W���_�X]";
					mes "�ł͂Ȃ��c�c���ԂƂ̖`����";
					mes "�����Ă����p�[�e�B�[�V�X�e��";
					mes "�̂��Ƃł��c�c";
					next;
					mes "[�s�b�`�W���_�X]";
					mes "�p�[�e�B�[��";
					mes "^4A4AFF/organize [�p�[�e�B�[��]^000000";
					mes "�̃R�}���h�Ō������邱�Ƃ��ł��܂��B";
					mes "�������A^4A4AFF��{�X�L����7�ȏ�^000000";
					mes "�Ȃ���΂����܂���B";
					next;
					mes "[�s�b�`�W���_�X]";
					mes "�܂��A��{���E�B���h�E��";
					mes "�ufriend�v��������";
					mes "�p�[�e�B�[����\���ł��܂��B";
					next;
					mes "[�s�b�`�W���_�X]";
					mes "�p�[�e�B�[���������Čo���l�̕��z";
					mes "�`����ύX��������ł��܂����A";
					mes "����͌�Ŏ��ۂɂ���Ă݂�";
					mes "���������B";
					mes "�{���͎��������ɋ삯����";
					mes "����`����������ł����c�c";
					next;
					mes "[�s�b�`�W���_�X]";
					mes "����A�p�[�e�B�[�ɎQ�����邽�߂ɂ�";
					mes "�p�[�e�B�[���[�_�[�����";
					mes "�v�����󂯂āA��������Ηǂ��̂ł��B";
					mes "����ɂ̓��x���̐����͂���܂���B";
					next;
					emotion 30;
					mes "[�s�b�`�W���_�X]";
					mes "�p�[�e�B�[�Ɋւ��鎄����̐�����";
					mes "�ȏ�ł��B";
					mes "�ӂӂ�";
					continue;
				case 3:
					mes "[�s�b�`�W���_�X]";
					mes "�`���b�g���[���̊J�݂́A";
					mes "��{�X�L�����x����";
					mes "4�ȏ゠��Ɖ\�ɂȂ�܂��B";
					mes "��{���E�B���h�E�́ucomm�v";
					mes "�{�^�����������A�uAlt+c�v";
					mes "�ŊJ�݂��邱�Ƃ��ł��܂��B";
					next;
					mes "[�s�b�`�W���_�X]";
					mes "�`���b�g���[�����J�݂�����ŁA";
					mes "�����̖��O��l���Ȃǂ�";
					mes "�ݒ��ύX���邱�Ƃ��ł��܂��B";
					next;
					mes "[�s�b�`�W���_�X]";
					mes "�`���b�g�ɎQ�����Ă��鎞��";
					mes "�`���b�g���[���̊O�̐���";
					mes "�������܂���B";
					mes "�Q�l�ɂ��Ă��������B";
					next;
					mes "[�s�b�`�W���_�X]";
					mes "�c�c";
					mes "�c�c�c�c";
					mes "�����`���b�g���[�����J�������c�c";
					mes "���̐g���ł͂�������Ȃ��܂���B";
					mes "�g�z�z�z�z�c�c";
					continue;
				case 4:
					mes "[�s�b�`�W���_�X]";
					mes "�~�b�h�K���h�S��ɂ�";
					mes "�J�v���Ƃ�������ȕ����T�[�r�X";
					mes "�����݂��Ă��āA���l������";
					mes "��������ۊǂ��Ă����Ȃǂ�";
					mes "�֗��ȃT�[�r�X������Ă��܂��B";
					mes "������܂������H";
					next;
					mes "[�s�b�`�W���_�X]";
					mes "�q�ɂ̎g�p�͊�{�X�L����";
					mes "6�ȏ�ɂȂ�Ɖ\�ł��B";
					mes "�J�v���T�[�r�X�̗��p�Ɋւ���";
					mes "�����́A�J�v���E�����ʂ�";
					mes "�s���Ă���ł��傤�B";
					next;
					mes "[�s�b�`�W���_�X]";
					mes "��x�ɂ�������̃A�C�e��������";
					mes "�d�����čU�����ł��Ȃ��Ȃ�����A";
					mes "�񕜂��ł��Ȃ��Ȃ邱�Ƃ�����܂��B";
					mes "���i�g��Ȃ��A�C�e���Ȃǂ�";
					mes "�q�ɂɕۊǂ��Ă����Ɨǂ��ł��傤�B";
					continue;
				case 5:
					mes "[�s�b�`�W���_�X]";
					mes "���ׂĕ������Ă���������";
					mes "�Ȃ�āI";
					mes "���̃s�b�`�������܂����I";
					next;
					mes "[�s�b�`�W���_�X]";
					mes "���x�͑��̂��Ƃ�";
					mes "�׋����Ă݂܂��傤���B";
				}
				break;
			}
			continue;
		case 3:
			mes "[�s�b�`�W���_�X]";
			mes "�����\�����߂̎�i��";
			mes "1�Ƃ��Ă悭�g����";
			mes "�G���[�V�����́A�F�����";
			mes "�R�~���j�P�[�V�����ɕ��L��";
			mes "�Ή����Ă����ł��傤�B";
			next;
			mes "[�s�b�`�W���_�X]";
			mes "�X�L�����x����2�ȏ��";
			mes "�Ȃ�Ǝg����悤�ɂȂ�܂��B";
			next;
			mes "[�s�b�`�W���_�X]";
			mes "�uAlt+L�v�uAlt+M�v��";
			mes "�G���[�V�������X�g���\��";
			mes "����܂��̂ŁA�ݒ肵�Ďg��";
			mes "���Ƃ��ł��܂��B";
			next;
			mes "[�s�b�`�W���_�X]";
			mes "�����A�L���Ȋ���\������";
			mes "�l�̊֌W�ɂ����ĕK���K�v��";
			mes "���̂ł͂Ȃ��ł��傤���I";
			mes "���t�œ`���Â炢���A����";
			mes "�g���Ă݂Ă��������ˁI";
			next;
			mes "[�s�b�`�W���_�X]";
			mes "���A����Ŏg�����Ȃ�ł����A";
			mes "�uAlt+M�v�œo�^�������̂�";
			mes "�g������A�`���b�g�E�B���h�E��";
			mes "���ځu/e1�v�̂悤��";
			mes "���͂���Ǝg�����Ƃ��ł��܂��B";
			next;
			mes "[�s�b�`�W���_�X]";
			mes "Ctrl +�u;�v�u-�v�u\\�v";
			mes "�ŁA�u�O�[�v�u�`���L�v�u�p�[�v";
			mes "���o�����Ƃ��ł��܂���I";
			next;
			emotion 3;
			mes "[�s�b�`�W���_�X]";
			mes "�u/help�v��u/emotion�v";
			mes "�R�}���h�ŁA���ꂼ���";
			mes "�G���[�V�����̃R�}���h��";
			mes "�m�F���邱�Ƃ��ł���̂�";
			mes "���Q�l�ɁB";
			mes "�ӂӁc�c";
			continue;
		case 4:
			mes "[�s�b�`�W���_�X]";
			mes "����ȏ㋳���邱�Ƃ�";
			mes "�����悤�ł��ˁc�c";
			mes "����ł͂����C�ŁI";
			close;
		}
	}
}


//==========================================
// ���̕���
//------------------------------------------

new_1-2,17,182,5	script	�i�s�v��	84,{

	function Battle {
		mes "[�G���~��]";
		mes "�܂��A�퓬�����邽�߂ɂ�";
		mes "�����X�^�[�ɃJ�[�\�������킹�܂�";
		mes "�����č��N���b�N�������";
		mes "�����X�^�[���U�����܂��B";
		next;
		mes "[�G���~��]";
		mes "�����ƃN���b�N���Ă���̂��ʓ|�ȏꍇ";
		mes "�uCtrl�v����������ԂōU�������";
		mes "�����X�^�[��|���܂ōU����";
		mes "�����܂��B";
		next;
		mes "[�G���~��]";
		mes "�����Ctrl�����������Ȃ��Ƃ�������";
		mes "^E79C29/nc^000000 �ƃ`���b�g�E�B���h�E��";
		mes "���͂��Ă݂Ă��������B";
		mes "�����Ctrl����������";
		mes "���N���b�N������";
		mes "�U���𑱂���悤�ɂȂ�܂��B";
		next;
		mes "[�G���~��]";
		mes "�����X�^�[�̑�����";
		mes "�s��(�A���f�b�h)�̏ꍇ�A";
		mes "�q�[���̃X�L���𗘗p���Ă�";
		mes "�U�����\�ł��B";
		mes "���̎��́A�uShift�v��";
		mes "�����Ȃ���q�[�����g���Ηǂ��ł��B";
		next;
		mes "[�G���~��]";
		mes "���������Shift��";
		mes "���������Ȃ�����^E79C29/ns^000000 �Ƃ���";
		mes "�֗��ȃR�}���h������܂��B�����";
		mes "Shift�������Ȃ��Ă������X�^�[��";
		mes "�q�[�����g�����Ƃ��ł��܂��B";
		return;
	}

	if((CHANGE_NV &0x200) == 0) {
		mes "[�G���~��]";
		mes "���R�[�X�͂ǂ��ł����H";
		mes "�������O�i���N�I�����C���̐��E��";
		mes "�����ԗ������Ă��������܂������H";
		next;
		mes "[�G���~��]";
		mes "�����ł́A�퓬�̊�{�ɂ���";
		mes "�o���Ă������������Ǝv���܂��B";
		mes "���_�̍u�`����������󂯂�";
		mes "����΁A������x�̑������x��";
		mes "���ꂽ�͂��ł��B";
		next;
		mes "[�G���~��]";
		mes "�ꉞ�A�퓬������O�Ɏ�����";
		mes "�������m�F���Č��Ă��������B";
		mes "�����͐����܂������H";
		next;
		if(select("�o�b�`���ł�","�܂��ł�")==2) {
			mes "[�G���~��]";
			mes "�x�����ꂽ�����͑厖��";
			mes "�g���Ă��������ˁB";
			mes "�����Ԉ���ĂȂ����Ă��܂��Ă�";
			mes "������x�x�����邱�Ƃ͂ł��܂���B";
			close;
		}
		Battle;
		next;
		mes "[�G���~��]";
		mes "��܂��ł����퓬�̊�{�m��";
		mes "�ɂ��Ă͗����ł��܂������H";
		mes "����ł́A�����X�^�[�̐����Ƒ����A";
		mes "�퓬��̌o���l��A�C�e���Ȃǂ�";
		mes "���Đ����������܂��B";
		next;
		mes "[�G���~��]";
		mes "�ꉞ�A�퓬�ɂ͊댯�������܂��̂ŁA";
		mes "������x�킦��悤�ɗ͂�������";
		mes "���܂��傤���B";
		next;
		mes "[�G���~��]";
		mes "�����I�@��[��!!";
		if(BaseLevel == 7)	getexp 153,0;
		else if(BaseLevel == 6)	getexp 112,0;
		else if(BaseLevel == 5)	getexp 77,0;
		else if(BaseLevel == 4)	getexp 36,0;
		else if(BaseLevel == 3)	getexp 25,0;
		else if(BaseLevel == 2)	getexp 16,0;
		else if(BaseLevel == 1)	getexp 9,0;
		set CHANGE_NV,CHANGE_NV|0x200;
		next;
		mes "[�G���~��]";
		mes "�ӂ��c�c";
		mes "�����ɗ��Ă�Ηǂ��ł��ˁB";
		mes "����ł́A���ɂ���";
		mes "�m�肽���ł����H";
	}
	else {
		mes "[�G���~��]";
		mes "�܂����ɂ��m�肽�����Ƃ�";
		mes "����悤�ł��ˁB";
		mes "���𕷂������ł����H";
		set .@word$,"�퓬�Ɋւ����{����";
	}
	while(1) {
		next;
		switch (select("�����X�^�[�̐����Ƒ���","�퓬���̌o���l�̊l��","�A�C�e���̊l��",.@word$,(.@word$ == "")? "�����Ȃ�": "�b����߂�")) {
		case 1:
			mes "[�G���~��]";
			mes "�����X�^�[�����̒��ɂ�";
			mes "�U�������O�ɐ�ɍU������������";
			mes "����^�C�v�̃����X�^�[�����܂��B";
			mes "�܂��A�����̒��Ԃ��U�������ꍇ";
			mes "�W�܂��Ă��čU�����Ă��郂���X�^�[��";
			mes "����̂ŋC�����Ă��������B";
			next;
			mes "[�G���~��]";
			mes "�����ă����X�^�[�����͂����Ȍ`�Ԃ�";
			mes "�傫���A�����������Ă��܂��B";
			mes "�`�Ԃɂ͐l�ԁA�����A�s���A����";
			mes "�Ȃǂ�����A������悭�c�������";
			mes "������x�퓬���y�ɂȂ�ł��傤�B";
			next;
			mes "[�G���~��]";
			mes "�Ⴆ�΁A����̌`�Ԃւ̃_���[�W��";
			mes "����������J�[�h��}���������";
			mes "����̌`�Ԃ���̃_���[�W������";
			mes "������J�[�h��}�����h���";
			mes "���p����΁A�퓬��L���ɐi�߂�";
			mes "���Ƃ��ł���ł��傤�B";
			next;
			mes "[�G���~��]";
			mes "�����X�^�[�̑傫���͏��^�A���^�A��^";
			mes "�ƕ������܂��B";
			mes "������傫���ɂ���ă_���[�W�𑝉�";
			mes "������J�[�h��}��������𗘗p";
			mes "����΁A�퓬���y�ɂȂ�ł��傤�B";
			next;
			mes "[�G���~��]";
			mes "���킲�Ƃɓ���������A���ꂼ���";
			mes "�傫���ɂ���ă_���[�W��";
			mes "�ς��ꍇ������܂��B";
			mes "�Ⴆ�΁A�Z���͏��^�̑Ώۂ�100%��";
			mes "�З͂𔭊����܂����A��^�ɂ�50%";
			mes "�̈З͂����������܂���B";
			next;
			mes "[�G���~��]";
			mes "�����́A";
			mes "��,��,�n,��,��,�s��,��,�O,��";
			mes "������܂��B";
			mes "��{�I�ɁA�����X�^�[�̑����ɔ�����";
			mes "�����ōU������Ƃ��傫��";
			mes "�_���[�W��^�����܂��B";
			next;
			mes "[�G���~��]";
			mes "�܂��A��������Ń_���[�W���^��";
			mes "���Ȃ��ꍇ����������A�t��";
			mes "��������ōU�����Ȃ����";
			mes "�_���[�W��^�����Ȃ��ꍇ��";
			mes "����܂��B";
			next;
			mes "[�G���~��]";
			mes "�Ⴆ�΁A�O�����̏ꍇ�A";
			mes "�������̍U�������Ă��_���[�W��";
			mes "�قƂ�Ǘ^����ꂸ�A���������";
			mes "�U������ƃ_���[�W��";
			mes "�^���邱�Ƃ��ł��܂��B";
			continue;
		case 2:
			mes "[�G���~��]";
			mes "�o���l�́A��ʓI�Ƀ����X�^�[��";
			mes "��������_���[�W��^�����l��";
			mes "��葽���̌o���l�����炦�܂��B";
			mes "�����X�^�[��HP�ƃ_���[�W�ɔ�Ⴕ��";
			mes "�o���l���^������̂ł��B";
			next;
			mes "[�G���~��]";
			mes "�Ⴆ��A���񂪁A";
			mes "�o���l�u1000�v������";
			mes "HP���u100�v�̃����X�^�[��";
			mes "�U�����āu65�v�̃_���[�W��";
			mes "�^���Ă�����AA�����";
			mes "�o���l�u650�v���l�����܂��B";
			next;
			mes "[�G���~��]";
			mes "�܂������u65�v�̃_���[�W��";
			mes "�^���Ă������X�^�[��HP��";
			mes "����Ċl���ł���o���l��";
			mes "�ς��܂��B";
			next;
			mes "[�G���~��]";
			mes "�����A���̐l�������_���[�W��";
			mes "�^�����ꍇ�́A��ɍU������";
			mes "�l��2/3�̌o���l������A";
			mes "�ォ��U�������l�ɂ�";
			mes "1/3�̌o���l��������܂���B";
			next;
			mes "[�G���~��]";
			mes "�p�[�e�B�[�v���C���̌o���l�́A";
			mes "�����ɕ��z���Ă���ꍇ��";
			mes "�p�[�e�B�[�S�̂��l�������o���l��";
			mes "�p�[�e�B�[�����o�[�ŋϓ���";
			mes "�������܂��B";
			next;
			mes "[�G���~��]";
			mes "���̐l�ƈꏏ�Ƀ����X�^�[��";
			mes "�|���ꍇ�́A������x���ꂽ��";
			mes "�p�[�e�B�[�v���C�����p�����";
			mes "�ǂ��ł��傤�B";
			continue;
		case 3:
			mes "[�G���~��]";
			mes "�����X�^�[��|�����ꍇ�A����m����";
			mes "�A�C�e���𗎂Ƃ����Ƃ�����܂��B";
			mes "���̑��A�u�X�e�B�[���v�X�L����";
			mes "�A�C�e���𓐂ނ��Ƃ��ł��܂��B";
			next;
			mes "[�G���~��]";
			mes "�X�e�B�[���ɂ���ă����X�^�[����";
			mes "�A�C�e���𓐂�ł��A���̃����X�^�[";
			mes "��|�������ɂ̓A�C�e���𗎂Ƃ��Ȃ�";
			mes "�Ȃ�킯�ł͂���܂���B";
			next;
			mes "[�G���~��]";
			mes "���̐l�ƈꏏ�Ƀ����X�^�[��|����";
			mes "�ꍇ�A��{�I�ɂ̓����X�^�[�Ɉ��";
			mes "�����̃_���[�W��^�����l��";
			mes "�A�C�e�����E���D�挠���������܂��B";
			continue;
		case 4:
			Battle;	//CHANGE_NV &0x200 == 0�Ȃ�o�Ȃ�
			continue;
		case 5:
			mes "[�G���~��]";
			mes "�܂���������܂�����A";
			mes "���������Ă��������B";
			close;
		}
	}
}

//==============================================================
new_1-2,38,182,3	script	��t�v��	92,{
	if((CHANGE_NV &0x200) == 0) {
		mes "[�P�[��]";
		mes "�퓬�̊�{����m��Ȃ���Ԃ�";
		mes "���K���Ȃ��邨����ł����H";
		mes "�\���󂠂�܂��񂪁A���̉E�ɂ���";
		mes "�i�s�v���ɁA�퓬�̊�b�ɂ���";
		mes "�����Ă�����Ă��炨�������������B";
		close;
	}
	if((CHANGE_NV &0x400) == 0) {
		mes "[�P�[��]";
		mes "��2�R�[�X�́A���܂Ŋw�񂾒m����";
		mes "�g�ɂ��Ă��邩�����ۂ̐퓬��";
		mes "�m�F���܂��B�ǂꂾ������Ŋ��p";
		mes "�ł��邩�A���ꂪ�퓬���K�̉ۑ��";
		mes "�Ȃ�܂��B";
		next;
		mes "[�P�[��]";
		mes "���K�p�̃}�b�v�ɂ́A�l�X��";
		mes "�����X�^�[�����܂��B���܂Ŕ|����";
		mes "�m������ɐ킢�����Ă��������B";
		next;
		mes "[�P�[��]";
		mes "������ł͓��ɁA�ڕW�̋�����s����";
		mes "�����͍s���܂���B�퓬�����ۂ�";
		mes "�̌��ł���ꏊ�֍s���A���̒��x��";
		mes "�l���Ă��������č\���܂���B";
		next;
		mes "[�P�[��]";
		mes "��2�R�[�X�̎��K�}�b�v��i�ނƁA";
		mes "���̖k���̓����ɐi�s�v�������܂��B";
		mes "�ނ����̎��̏ꏊ�֑���܂��̂�";
		mes "�������������������B����ł́A";
		mes "���K���n�߂܂����H";
		next;
		if(select("�͂��A���肢���܂��I","������Ə������Ă��܂�")==2) {
			mes "[�P�[��]";
			mes "�������܂����B";
			mes "�Ȃ�A���̉E���ɂ���i�s�v����";
			mes "�b�𕷂��Ă݂�Ƃ悢�ł��傤�B";
			mes "�������ł�����A���������������B";
			close;
		}
		mes "[�P�[��]";
		mes "�������܂����B";
		mes "�����Ė����͂��Ȃ��ł��������ˁB";
		mes "�ł́A�A�C�e�����x�����܂��̂�";
		mes "�댯�Ɋׂ����Ƃ��ɂ����p���������B";
		mes "���ꂩ��c�c�ꏏ�ɕ���Ə���";
		mes "�x�����܂��傤�B";
		set CHANGE_NV,CHANGE_NV|0x400;
		getitem 602,1;
		getitem 601,9;
		getitem 1243,1;
		getitem 2112,1;
		getitem 611,2;
		getitem 569,30;
	}
	else {
		mes "[�P�[��]";
		mes "�����͂��Ȃ��悤��";
		mes "�ƒ��ӂ��Ă����܂�����ˁH";
		mes "�܂��u���s�͐����̌��v�Ƃ������t��";
		mes "����܂����ˁB���Ȃ��̂��߂�";
		mes "�Ȃ��Ă��邱�Ƃ�]�݂܂��B";
		next;
		mes "[�P�[��]";
		mes "�܂����킵�܂����H";
		next;
		if(select("�͂��A���ЁI","������Ə��������Ă��܂�")==2) {
			mes "[�P�[��]";
			mes "�������܂����B";
			mes "�Ȃ�A���̉E���ɂ���i�s�v����";
			mes "�b�𕷂��Ă݂�Ƃ悢�ł��傤�B";
			mes "�������ł�����A���������������B";
			close;
		}
		mes "[�P�[��]";
		mes "�������܂����B";
		mes "�����₩�ł͂���܂���";
		if((CHANGE_NV &0x800) == 0) {
			mes "������̉����̕i�ł��B";
			if(BaseLevel >= 8)	getexp 200,0;
			else if(BaseLevel == 7)	getexp 153,0;
			else if(BaseLevel == 6)	getexp 112,0;
			else if(BaseLevel == 5)	getexp 77,0;
			else if(BaseLevel == 4)	getexp 36,0;
			else if(BaseLevel == 3)	getexp 25,0;
			else if(BaseLevel == 2)	getexp 16,0;
			if(JobLevel == 7)	getexp 0,205;
			else if(JobLevel == 6)	getexp 0,151;
			else if(JobLevel == 5)	getexp 0,91;
			else if(JobLevel == 4)	getexp 0,40;
			else if(JobLevel == 3)	getexp 0,28;
			else if(JobLevel == 2)	getexp 0,18;
			else if(JobLevel == 1)	getexp 0,10;
			getitem 569,50;
			set CHANGE_NV,CHANGE_NV|0x800;
		}
		else {
			mes "������̉����̋C�����ł��B";
		}
		percentheal 100,100;
		mes "�ł́A�C�����čs���Ă��������B";
	}
	close2;
	savepoint "new_1-2",24,189;
	switch(rand(5)) {
		case 0:	warp "new_1-3",96,21; break;
		case 1:	warp "new_2-3",96,21; break;
		case 2:	warp "new_3-3",96,21; break;
		case 3:	warp "new_4-3",96,21; break;
		case 4:	warp "new_5-3",96,21; break;
	}
	end;
}

new_1-2,28,185,3	shop	�������薺	90,516


//==========================================
// �퓬���K
//------------------------------------------

-	script	NoviceTraining		-1,{
	mes "[�t�[�}��]";
	mes "�჌�x�������X�^�[�Ƃ�����";
	mes "�Â�����ƒɂ��ڂɂ����܂���B";
	mes "���������Ƒ���������̂�";
	mes "�C�����Ă��������ˁB";
	next;
	mes "[�t�[�}��]";
	mes "���������A���܂ɐ搧�U����";
	mes "�������Ă��郂���X�^�[��";
	mes "���܂��̂ŁA�����ӂ��I";
	mes "����ł́A�撣���Ď��K��";
	mes "��萋���Ă�������!!";
	next;
	mes "[�t�[�}��]";
	mes "�c�c���������Ė{���́A";
	mes "�����̃����X�^�[�����͎ア�I";
	mes "�Ǝv���Ă��܂��H";
	mes "���͂���ȕ��̂��߂ɃT�[�r�X!!";
	mes "����������Ƌ��������X�^�[��";
	mes "�o�鏊�֑����Ă����܂��傤�B";
	next;
	mes "[�t�[�}��]";
	mes "������ƁA���킵�Ă݂܂��H";
	next;
	//NPC������\�����Ȃ��ԍ������o���Ă��̃��j���[���󕶎��Ŗ��߂�
	set .@num,strnpcinfo(2);
	setarray .@serv$,"��߂̃����X�^�[�Ɛ킢����","������Ƌ��������X�^�[�Ɛ킢����","���������X�^�[�ɒ��킵�����I";
	set .@serv$[.@num],"";
	switch (select(.@serv$[0],.@serv$[1],.@serv$[2],"����A��߂Ă����c�c")) {
	case 1:
		mes "[�t�[�}��]";
		mes "�������܂����[�I";
		mes "����ł́A��߂̃����X�^�[��";
		mes "���鏊�֑����Ă����܂��傤�B";
		mes "�����^���F��܂��I";
		next;
		warp "new_1-3",96,21;
		end;
	case 2:
		mes "[�t�[�}��]";
		mes "�������܂����[�I";
		mes "����ł́A������Ƌ��������X�^�[��";
		mes "���鏊�֑����Ă����܂��傤�B";
		mes "�����^���F��܂��I";
		next;
		warp "new_"+rand(2,3)+"-3",96,21;
		end;
	case 3:
		mes "[�t�[�}��]";
		mes "�E�C��������ł��ˁc�c";
		mes "�ł́A���̂���]�ɉ����܂��傤�I";
		mes "�����Ă������[���I";
		next;
		warp "new_"+rand(4,5)+"-3",96,21;
		end;
	case 4:
		mes "[�t�[�}��]";
		mes "�p�S�[�����ł��ˁc�c";
		mes "�m���ɁA���K���m���ɂ��Ȃ����Ƃ̕���";
		mes "�厖�ł���ˁB�����^���F��܂��I";
		close;
	}
}

new_1-3,95,30,4	duplicate(NoviceTraining)	�P�����v��#0	84
new_2-3,95,30,4	duplicate(NoviceTraining)	�P�����v��#1	84
new_3-3,95,30,4	duplicate(NoviceTraining)	�P�����v��#1	84
new_4-3,95,30,4	duplicate(NoviceTraining)	�P�����v��#2	84
new_5-3,95,30,4	duplicate(NoviceTraining)	�P�����v��#2	84

//==============================================================
-	script	NoviceManager	85,{
	mes "[�V�[�}��]";
	mes "�c�c�Ȃ񂾁H";
	mes "�퓬���K�͂�����Ƃ�����̂��B";
	mes "���Ⴀ�A���̃}�b�v�֑����Ă�낤���H";
	next;
	if(select("�͂��A���肢���܂��I","�܂������ł�")==1) {
		mes "[�V�[�}��]";
		mes "�悵�A���ꂩ���A�F�X�Ȃ��Ƃ�";
		mes "���邾�낤���A���A�w�񂾂��Ƃ�";
		mes "�����ĖY���ȁI����ł�";
		mes "�悢�`���ɂȂ邱�Ƃ��F��I";
		close2;
		warp "new_1-4",99,10;
		end;
	}
	mes "[�V�[�}��]";
	mes "�ӂށB����Ȃ̖��n����F�߂�̂�";
	mes "�������Ƃ��I���O�̋C���ςނ܂�";
	mes "���K�ɂ͂���ł����I";
	close;
}

new_1-3,96,174,3	duplicate(NoviceManager)	�����ē�	85
new_2-3,96,174,3	duplicate(NoviceManager)	�����ē�	85
new_3-3,96,174,3	duplicate(NoviceManager)	�����ē�	85
new_4-3,96,174,3	duplicate(NoviceManager)	�����ē�	85
new_5-3,96,174,3	duplicate(NoviceManager)	�����ē�	85


//==========================================
// �E�ƓK������
//------------------------------------------

new_1-4,91,22,3	script	�E�Ƌ���	57,{
	mes "[�u���[�X]";
	mes "�����܂ŗ���͖̂{���ɑ��";
	mes "�������ł��傤�B����J�l�ł����B";
	mes "^8C2121" +strcharinfo(0)+ "^000000�l";
	mes "����ł��Ċ������ł��B";
	mes "���́A���[���~�b�h�K�b�c��������";
	mes "�h�����ꂽ�u���[�X�Ɛ\���܂��B";
	next;
	mes "[�u���[�X]";
	mes "���S�҂̕��ւ̐E�ƑI����";
	mes "�菕���Ƃ��āA�e�E�Ƃ̊T�v��";
	mes "���������邱�Ƃ��A���̔C���ł��B";
	next;
	mes "[�u���[�X]";
	mes "�������Љ��E�Ƃ́A";
	mes "^0000FF���m�A�}�W�V�����A�A�[�`���[�A";
	mes "���l�A�V�[�t�A�A�R���C�g�A";
	mes "����ꎟ�E^000000�ł��B";
	next;
	mes "[�u���[�X]";
	mes "�ǂ̐E�Ƃɂ��Ēm�肽���ł����H";
	while(1) {
		next;
		switch (select("���m","�}�W�V����","�A�[�`���[","���l","�V�[�t","�A�R���C�g","����ꎟ�E","�b����߂�")) {
		case 1:
			mes "[�u���[�X]";
			mes "���m�Ƃ͕����ʂ�A���������҂̂��Ƃ�";
			mes "�����܂��B�\�[�h�}���ƌĂ΂�邱�Ƃ�";
			mes "����܂��B���܂Ɍ��̑����";
			mes "�������g���ɂȂ�������܂��B";
			next;
			mes "[�u���[�X]";
			mes "���m�̗͑͂�����܂��̂ŁA";
			mes "�d���Z�═��𑕔����邱�Ƃ�";
			mes "�ł��܂��B";
			mes "�܂��|�A��A�J�^�[���A�i�b�N������";
			mes "�����قƂ�ǂ̕�����������Ƃ�";
			mes "�ł��܂��B";
			next;
			mes "[�u���[�X]";
			mes "�������A��{�I�ɖ��@���g���Ȃ��̂�";
			mes "���̓_���Z���ł͂���܂����A";
			mes "����͑������t�^���ꂽ�����";
			mes "�������邱�Ƃŕ₦�܂��B";
			next;
			mes "[�u���[�X]";
			mes "���m�͂��̋��x�ȑ̗͂ɂ��A";
			mes "�G�̍U�������̂Ƃ����܂���B";
			mes "�܂��A�����̐g�̈��S��";
			mes "�}��p���g�ɂ��Ă��܂��B";
			next;
			mes "[�u���[�X]";
			mes "�X�ɋ��͂ȃX�L������g����悤�ɂȂ�";
			mes "�ƑO�q�Ƃ��ẮA�ő�̈З͂�";
			mes "�������܂��B";
			mes "�S�ǂƂ����Ă��ߌ��ł͂Ȃ��ł��傤�B";
			next;
			mes "[�u���[�X]";
			mes "���m�͂��̓��̂𐶂����A�̗͂��ア";
			mes "���E�Ƃ�ی삷�������S���Ă��܂��B";
			mes "�p�[�e�B�[�v���C���̃��[�_�[�𖱂߂�";
			mes "�@��������ł��傤�B";
			next;
			mes "[�u���[�X]";
			mes "^8C2121���m����̓i�C�g��";
			mes "�N���Z�C�_�[�ɓ]�E���邱�Ƃ�";
			mes "�ł��܂��B^000000";
			break;
		case 2:
			mes "[�u���[�X]";
			mes "�}�W�V�����͎���̖��͂����";
			mes "�΁A���A�n�A�����̑����𗘗p";
			mes "���āA���@�U�����ł���E�Ƃł��B";
			next;
			mes "[�u���[�X]";
			mes "����͏�Ɩ{����ŁA���̑��ɂ�";
			mes "�����ł�����̂͂���܂����A";
			mes "�̗͂��R�����̂ŁA�y��������";
			mes "�����ł��Ȃ��Ƃ����Z���͂���܂��B";
			next;
			mes "[�u���[�X]";
			mes "��������������ė]�肠�����";
			mes "���͂ȍU���́A�}�W�V�������l�X��";
			mes "�D�܂�闝�R�̈�ł�����܂��B";
			next;
			mes "[�u���[�X]";
			mes "�}�W�V�����́A�p�[�e�B�[�v���C��";
			mes "���͂Ȗ��@�ŁA�G�ɑ�_���[�W��";
			mes "�^����S�������ԂƂ��Ċ��􂷂�";
			mes "���Ƃł��傤�B";
			next;
			mes "[�u���[�X]";
			mes "^8C2121�}�W�V��������̓E�B�U�[�h";
			mes "�܂��̓Z�[�W�ɓ]�E���邱�Ƃ�";
			mes "�ł��܂��B^000000";
			break;
		case 3:
			mes "[�u���[�X]";
			mes "�A�[�`���[�͋|�𗘗p�����U����";
			mes "���ӂƂ��A�������U�����ł���̂�";
			mes "�G�ɑ_��ꂸ�ɒ��Ԃ����T�|�[�g";
			mes "�ł���Ƃ��������������Ă��܂��B";
			next;
			mes "[�u���[�X]";
			mes "�Z���Ƃ��đ̗͎͂ア���A�G����";
			mes "�������ꂽ�ʒu����U�����ł���̂�";
			mes "�g�̈��S��ۂ��Ȃ���키���Ƃ�";
			mes "�ł��܂��B";
			next;
			mes "[�u���[�X]";
			mes "�A�[�`���[�͍����������ƍU���͂�";
			mes "�G���߂Â��O�̑����i�K�ŁA�f����";
			mes "�_�������ɂ��邱�Ƃ��ł��܂��B";
			next;
			mes "[�u���[�X]";
			mes "^8C2121�A�[�`���[����̓n���^�[��";
			mes "�]�E���邱�Ƃ��ł��܂��B";
			mes "�܂����̑��ɂ��A�j���̏ꍇ��";
			mes "�o�[�h�A�����̏ꍇ�̓_���T�[";
			mes "�ɓ]�E���邱�Ƃ��ł��܂��B^000000";
			break;
		case 4:
			mes "[�u���[�X]";
			mes "���l�͕����ʂ�i���𔄔�����";
			mes "���v���グ�邱�Ƃ��E���̐E�Ƃł��B";
			mes "�����ԁA���������Ă����m�E�n�E��";
			mes "�������A���E�Ƃ������ƈ������i��";
			mes "�i�����w��������A��荂�����i��";
			mes "�i���𔄋p���邱�Ƃ��ł��܂��B";
			next;
			mes "[�u���[�X]";
			mes "�܂��A��葽���̃A�C�e�����J�[�g��";
			mes "�ς�ŉ^�Ԃ��Ƃ��ł����A����";
			mes "���X���J�����Ƃ��ł��܂��B";
			next;
			mes "[�u���[�X]";
			mes "^8C2121���l����̓u���b�N�X�~�X��";
			mes "�A���P�~�X�g�ɓ]�E���邱�Ƃ�";
			mes "�ł��܂��B^000000";
			break;
		case 5:
			mes "[�u���[�X]";
			mes "�V�[�t�͒Z�����g�����f�����U����";
			mes "�g�̌y���𐶂�����������𗦂�";
			mes "�����ł��B";
			next;
			mes "[�u���[�X]";
			mes "����ȊO�ɂ��ł��g������";
			mes "�g���B���Z�p���g�ɂ��邱�Ƃ�";
			mes "�ł��܂��B�����ꂻ�̓łɂ������ꂽ";
			mes "�ꍇ�A���̐l�͏������̗͂�";
			mes "�D���Ă����܂��B";
			next;
			mes "[�u���[�X]";
			mes "��@�I�󋵂Ɋׂ����ہA";
			mes "�f�����g���B���A�w�ォ��U����";
			mes "�d�|���Č`�����t�]���邱�Ƃ�";
			mes "�ł��܂��B";
			next;
			mes "[�u���[�X]";
			mes "^8C2121�V�[�t����̓A�T�V����";
			mes "���[�O�ɓ]�E���邱�Ƃ��ł��܂��B^000000";
			break;
		case 6:
			mes "[�u���[�X]";
			mes "�A�R���C�g�͐_�l�Ɏd���A����";
			mes "�M��l�X�ɋ����邾���łȂ��A";
			mes "���l�̂��߂ɂ͎�������i���";
			mes "�]���ɂ����d�̐E�Ƃł��B";
			next;
			mes "[�u���[�X]";
			mes "�A�R���C�g�͐퓬�ɂ͒��ړI��";
			mes "�ւ��̂ł͂Ȃ��A��Ղɂ��";
			mes "���Ԃ̔\�͂������o������A����";
			mes "�������Ԃ������ڂ�S���܂��B";
			next;
			mes "[�u���[�X]";
			mes "�p�[�e�B�[�v���C���Ɍ������Ȃ�";
			mes "�E�Ƃ̈�ƌ����Ă��܂��B";
			next;
			mes "[�u���[�X]";
			mes "^8C2121�A�R���C�g����̓v���[�X�g";
			mes "�܂��̓����N�ɓ]�E���邱�Ƃ�";
			mes "�ł��܂��B^000000";
			break;
		case 7:
			mes "[�u���[�X]";
			mes "����ꎟ�E�ɂ�";
			mes "�e�R���L�b�h�A";
			mes "�E�ҁA";
			mes "�X�[�p�[�m�[�r�X�A";
			mes "�K���X�����K�[������܂��B";
			mes "�ǂ̐����𕷂��܂����H";
			while(1) {
				next;
				switch(select("�e�R���L�b�h","�E��","�X�[�p�[�m�[�r�X","�K���X�����K�[","�b����߂�")) {
				case 1:
					mes "[�u���[�X]";
					mes "���������̍�����`����Ă����A";
					mes "��ɏR��ō\�����ꂽ�i���Z�p��";
					mes "�g�����Ȃ��E�Ƃł��B";
					next;
					mes "[�u���[�X]";
					mes "���̐E�Ƃ�ʂ��A";
					mes "��苭���U���p����������A";
					mes "�l�X�ȍ��𑀂�A���̐l��������";
					mes "�\�E�������J�[�ւ̓]�E��";
					mes "�\�ɂȂ�܂��B";
					break;
				case 2:
					mes "[�u���[�X]";
					mes "�f���������𓾈ӂƂ���E�҂́A";
					mes "��ʕ��킾���ł͂Ȃ��A";
					mes "���������E�p���g�����Ȃ��܂��B";
					mes "�܂��A�l�X�ȉ���X�L���Ƌ��ɁA";
					mes "�����A���@�U�����g�����Ȃ�";
					mes "���ʐ��̂���E�Ƃł��B";
					next;
					mes "[�u���[�X]";
					mes "�E�҂͒Z���y�сA�����藠���A";
					mes "�������镐���A���@�Ɏ��Ă���";
					mes "�u�E�p�v���g���ēG�Ɛ킢�܂��B";
					break;
				case 3:
					mes "[�u���[�X]";
					mes "�m�[�r�X�̐S����Y�ꂸ�ɁA";
					mes "����Ƀm�[�r�X�Ƃ��Ă�";
					mes "���Ȃ𖁂����E�Ƃł��B";
					mes "���̐E�Ƃ̈�Ԃ̖��͂́A";
					mes "����1���E�̃X�L���̖w�ǂ�";
					mes "�K�����鎖���\�Ȏ��ł��B";
					next;
					mes "[�u���[�X]";
					mes "�X�[�p�[�m�[�r�X�ɂȂ�ƁA";
					mes "���̐E�Ƃւ̓]�E�͕s�\��";
					mes "�Ȃ�܂����A������";
					mes "�L�����N�^�[�ƂȂ鎖���\�ł��B";
					break;
				case 4:
					mes "[�u���[�X]";
					mes "�|�S�̓s�s�u�A�C���u���b�N�v��";
					mes "���삳�ꂽ�e��������E�ƂŁA";
					mes "�������U���ɗD�ꂽ�\�͂�����";
					mes "�E�Ƃł��B���͂ȉΗ͂�";
					mes "�ڎw�����ɂ����߂��܂��B";
					break;
				case 5:
					mes "[�u���[�X]";
					mes "�c�c���v�݂����ł��ˁB";
					mes "�ł́A�w�C�X���ɘb��������";
					mes "���������B";
					close;
				}
				if((CHANGE_NV &0x1000) == 0)
					set CHANGE_NV,CHANGE_NV|0x1000;
			}
		case 8:
			mes "[�u���[�X]";
			mes "�c�c���v�݂����ł��ˁB";
			mes "�ł́A�w�C�X���ɘb�������Ă��������B";
			close;
		}
		if((CHANGE_NV &0x1000) == 0)
			set CHANGE_NV,CHANGE_NV|0x1000;
	}
}

//==============================================================
new_1-4,100,29,4	script	�K��������	46,{

	function Transport {
		set CHANGE_NV,0;
		switch(rand(6)) {
			case 0:
				savepoint "izlude",94,103;
				warp "prt_fild08",357,212;
				break;
			case 1:
				savepoint "payon",256,242;
				warp "pay_fild01",334,354;
				break;
			case 2:
				savepoint "morocc",149,100;
				warp "moc_fild07",198,39;
				break;
			case 3:
				savepoint "geffen",120,38;
				warp "gef_fild07",327,188;
				break;
			case 4:
				savepoint "prontera",116,72;
				warp "prt_fild08",170,371;
				break;
			case 5:
				savepoint "alberta",31,231;
				warp "pay_fild03",388,70;
				break;
		}
		return;
	}

	function Place {
		switch(getarg(0)) {
			case 1:
				mes "�����͉q���s�s�C�Y���[�h�ł��B";
				mes "�X�̐����Ɍ��m�M���h������܂��̂�";
				break;
			case 2:
				mes "�����͖��@�s�s�Q�t�F���ł��B";
				mes "�X�̖k���ɖ��@�w�Z������܂��̂�";
				break;
			case 3:
				mes "�����͍`�̓s�s�A���x���^�ł��B";
				mes "�X�̓쐼�ɏ��l�g��������܂��̂�";
				break;
			case 4:
				mes "�����͍����̓s�s�����N�ł��B";
				mes "�X�̖k���ɂ���s���~�b�h�̒n��1�K��";
				mes "�V�[�t�M���h������܂��̂�";
				break;
			case 5:
				mes "�����͎R�x�̓s�s�t�F�C�����ł��B";
				mes "�X�̖k���ɂ���|�葺��";
				mes "�A�[�`���[�M���h������܂��̂�";
				break;
			case 6:
				mes "�����͎�s�v�����e���ł��B";
				mes "�X�̖k���Ƀv�����e���吹����";
				mes "����܂��̂�";
				break;
		}
		return;
	}

	if((CHANGE_NV &0x1000) == 0) {
		mes "[�w�C�X��]";
		mes "����ɂ��́B";
		mes "���͐E�ƓK��������S�����Ă���";
		mes "�u�w�C�X���v�Ɛ\���܂��B�����O�́c�c";
		mes "^8C2121" +strcharinfo(0)+ "^000000�l�ł��ˁB";
		next;
		mes "[�w�C�X��]";
		mes "�܂������̑O�Ɏ��̑O�ɂ���";
		mes "�u���[�X����E�Ƃ̐�����";
		mes "�󂯂Ă��������B";
		close;
	}
	if(CHANGE_NV &0x2000) {
		mes "[�w�C�X��]";
		mes "����A�ǂ��Ȃ����܂����H";
		mes "���ɐE�ƓK�������͏I���Ă܂���";
		mes "�x���i�����n�����Ă܂���ˁB";
		mes "�ł́A�߂��̊X�ɂ����肵�܂��傤�B";
		next;
		Transport;
		end;
	}
	mes "[�w�C�X��]";
	mes "����ɂ��́A^8C2121" +strcharinfo(0)+ "^000000�l�B";
	mes "�����܂ŗ���̂ɂ悭���撣��܂����B";
	mes "�����l�ł��B�c�c�ӂނӂ�";
	mes "�E�Ɛ����͊��Ɏ󂯂��悤�ł��ˁB";
	mes "�ł͍Ō�ɁA�E�ƓK���������s���܂��B";
	mes "�ł����A����͋����������܂���B";
	next;
	mes "[�w�C�X��]";
	mes "�����󂯂����Ȃ���΃p�X������";
	mes "���Ƃ��\�Ƃ������Ƃł��B";
	mes "����ɑ΂��A�������󂯂��";
	mes "���̕��̕�V�͂���܂��B";
	next;
	mes "[�w�C�X��]";
	mes "�܂��A�����̉ߒ��Ŏx������";
	mes "�񕜃A�C�e��������܂��B";
	mes "����͖`���̏��Ղł��Ȃ����";
	mes "�����Ƃł��傤�B";
	next;
	mes "[�w�C�X��]";
	mes "���Ɍ�����A^882420" +strcharinfo(0)+ "^000000�l��";
	mes "�ӂ��킵���E�Ƃ������߂��܂��B";
	mes "���̌�A����]���ꂽ�E�ƂɊ֌W�̂���";
	mes "�X�ւ����肵�܂��B���̑��ɂ�����";
	mes "�x���i������܂��B";
	next;
	mes "[�w�C�X��]";
	mes "����ł́A�ǂ�����܂����H";
	mes "�����ɖ`�����n�߂邩�A";
	mes "�E�ƓK���������󂯂邩�B";
	mes "�������ł��傤�H";
	next;
	if(select("�E�ƓK���������󂯂܂�","�������܂�")==2) {
		mes "[�w�C�X��]";
		mes "�킩��܂����B����ł͂�����";
		mes "�X�֑����Ă����܂��傤�B";
		next;
		mes "[�w�C�X��]";
		mes "�X�Ȃ�m����Z�p�́A���ۂ̖`����";
		mes "�o����ς݂Ȃ���g�ɂ��Ă��������B";
		next;
		mes "[�w�C�X��]";
		mes strcharinfo(0)+ " �l��";
		mes "���ꂩ��̐����ƌ��������F�肵�܂��B";
		mes "�ł́A���悤�Ȃ�B";
		next;
		Transport;
		end;
	}
	mes "[�w�C�X��]";
	mes "�킩��܂����B";
	mes "�^�̖`���҂�ڎw���Ȃ�A���̌�����";
	mes "�Q������̂͐������I���ł��B";
	mes "���������Ȃ����Ă�����A���Ȃ���";
	mes "�ƂĂ��������Ă������Ƃł��傤�B";
	next;
	mes "[�w�C�X��]";
	mes "�ł́A�E�ƓK���������n�߂܂��B";
	mes "���������āA���i�Ɠ����悤��";
	mes "�����Ă��������B����ɑ΂���";
	mes "�����̍s���X���ƈ�ԋ߂���";
	mes "�v������̂�I��ł��������B";
	next;
	mes "[�w�C�X��]";
	mes "���̌����́A�����P�ɂ��Ȃ��̐��i��";
	mes "���͂��邽�߂̂��̂ŁA�ǂ�������";
	mes "����܂���B�ł́A�n�߂܂��B";
	next;
	//�K��������������
	//.@point�z��ɉ��Z���Ă����A�v�f�ԍ���1-���m,2-�}�W,3-���l,4-�V�[�t,5-�A�`��,6-�A�R
	mes "[�w�C�X��]";
	mes "���̒��Ŏ����ƈ�ԋ߂��Ǝv����";
	mes "�P���I��ł��������B";
	next;
	switch( select("�Ε�","����","��d","���\") ) {
		case 1:
			set .@point[2],.@point[2]+1;
			break;
		case 2:
			set .@point[1],.@point[1]+1;
			set .@point[4],.@point[4]+1;
			break;
		case 3:
			set .@point[6],.@point[6]+1;
			break;
		case 4:
			set .@point[4],.@point[4]+1;
			break;
	}
	switch( select("�ω�","�i�v") ) {
		case 1: set .@point[2],.@point[2]+1; break;
		case 2: set .@point[6],.@point[6]+1; break;
	}
	switch( select("�����","�̔���","���Y��") ) {
		case 1:
			set .@point[1],.@point[1]+1;
			set .@point[4],.@point[4]+1;
			set .@point[6],.@point[6]+1;
			break;
		case 2:
			set .@point[3],.@point[3]+1;
			break;
		case 3:
			set .@point[2],.@point[2]+1;
			break;
	}
	switch( select("�v��","�T�d") ) {
		case 1: set .@point[4],.@point[4]+1; break;
		case 2: set .@point[5],.@point[5]+1; break;
	}
	switch( select("���_","�o��") ) {
		case 1: set .@point[2],.@point[2]+1; break;
		case 2: set .@point[1],.@point[1]+1; break;
	}
	switch( select("�ߋ�","����","����") ) {
		case 1:
			set .@point[5],.@point[5]+1;
			break;
		case 2:
			set .@point[3],.@point[3]+1;
			set .@point[4],.@point[4]+1;
			break;
		case 3:
			set .@point[2],.@point[2]+1;
			break;
	}
	mes "[�w�C�X��]";
	mes "���̎���Ɂu�͂��v�Ɓu�������v��";
	mes "�����Ă��������B";
	next;
	mes "[�w�C�X��]";
	mes "�ڋ��ɐ�������";
	mes "�������ʕ����}�V���B";
	next;
	switch( select("�͂�","������") ) {
		case 1:
			set .@point[1],.@point[1]+1;
			break;
		case 2:
			set .@point[3],.@point[3]+1;
			set .@point[4],.@point[4]+1;
			break;
	}
	mes "[�w�C�X��]";
	mes "�l�̕s�K�͖��̖�������B";
	next;
	switch( select("�͂�","������") ) {
		case 1: set .@point[3],.@point[3]+1; break;
		case 2: set .@point[6],.@point[6]+1; break;
	}
	mes "[�w�C�X��]";
	mes "�댯�ȏꏊ�ł����C�Ői�ށB";
	next;
	switch( select("�͂�","������") ) {
		case 1: set .@point[1],.@point[1]+1; break;
		case 2: set .@point[2],.@point[2]+1; break;
	}
	mes "[�w�C�X��]";
	mes "�ǂ�Ȃ��Ƃł��O�ɏo��^�C�v���B";
	next;
	switch( select("�͂�","������") ) {
		case 1: set .@point[1],.@point[1]+1; break;
		case 2: set .@point[5],.@point[5]+1; break;
	}
	mes "[�w�C�X��]";
	mes "�_���W������T�����A�˂��������";
	mes "�Ԃ������B�ǂ��悭���ׂĂ݂��";
	mes "�u�����v�Ƃ���������������Ă���";
	mes "�悤�ȐՂ�����B���̐Ղ̂��΂ɂ�";
	mes "�{�^���̂悤�ȓ˂��o���΂�����B";
	mes "�����������c�c";
	next;
	mes "[�w�C�X��]";
	mes "�u�����v�Ə����Ă͂��邪�A";
	mes "�t�Ɉ��������Ȃ�B";
	next;
	switch( select("�͂�","������") ) {
		case 1: set .@point[4],.@point[4]+1; break;
		case 2: set .@point[1],.@point[1]+1; break;
	}
	mes "[�w�C�X��]";
	mes "���܂Ɍ����ɂ͂���͂����Ȃ�";
	mes "�񌻎��I�Ȍ��ۂ�������B";
	next;
	switch( select("�͂�","������") ) {
		case 1: set .@point[6],.@point[6]+1; break;
		case 2: set .@point[2],.@point[2]+1; break;
	}
	mes "[�w�C�X��]";
	mes "���ォ���э~���ƁA";
	mes "����ׂ邩������Ȃ��B";
	next;
	switch( select("�͂�","������") ) {
		case 1: set .@point[6],.@point[6]+1; break;
		case 2: set .@point[2],.@point[2]+1; break;
	}
	mes "[�w�C�X��]";
	mes "���̒��͂������S�āB";
	mes "������������Ή��ł��ł���B";
	mes "������������΁A�����̂���";
	mes "���蔃���ł���Ǝv���B";
	next;
	switch( select("�͂�","������") ) {
		case 1: set .@point[5],.@point[5]+1; break;
		case 2: set .@point[3],.@point[3]+1; break;
	}
	mes "[�w�C�X��]";
	mes "���x�͖��`����������ƕς��܂��B";
	mes "���������Č����ɗՂ�ł��������B";
	mes "�ł́A����ɑ΂��Ď����̍s���X����";
	mes "��ԋ߂��Ǝv������̂�I���";
	mes "���������B";
	next;
	mes "[�w�C�X��]";
	mes "���Ԓʂ�ɓ������Ƃ́c�c";
	next;
	switch( select("�@�B�̂悤�Ɋ����đ��ꂵ��","�ǂ������Ǝv��","�֌W�Ȃ��A���͉����ɂ������Ȃ�") ) {
		case 1:
			set .@point[1],.@point[1]+1;
			set .@point[4],.@point[4]+1;
			break;
		case 2:
			set .@point[2],.@point[2]+1;
			set .@point[6],.@point[6]+1;
			break;
		case 3:
			set .@point[3],.@point[3]+1;
			set .@point[5],.@point[5]+1;
			break;
	}
	mes "[�w�C�X��]";
	mes "���X�łƂĂ��~�������̂��������B";
	mes "�Փ������̗U�f��������B";
	mes "�����ł��Ȃ��͂���𔃂��O�Ɂc�c";
	next;
	switch( select("�K�v�ȕ����m�F����","���A�����������炠�邩�m�F����","��������ɍl����") ) {
		case 1: set .@point[5],.@point[5]+1; break;
		case 2: set .@point[3],.@point[3]+1; break;
		case 3: set .@point[4],.@point[4]+1; break;
	}
	mes "[�w�C�X��]";
	mes "���Ȃ��͑����̐l�B��";
	mes "�������邱�Ƃ��c�c";
	next;
	switch( select("�D����","������","�ǂ���Ƃ������Ȃ�") ) {
		case 1:
			set .@point[3],.@point[3]+1;
			break;
		case 2:
			set .@point[4],.@point[4]+1;
			break;
		case 3:
			set .@point[1],.@point[1]+1;
			set .@point[6],.@point[6]+1;
			break;
	}
	mes "[�w�C�X��]";
	mes "��l�ł͏d���d�������Ȃ����";
	mes "�Ȃ�Ȃ��B���������ł͓r�����Ȃ�";
	mes "���Ԃ������邪�A�吨�ł��΂��Ȃ�";
	mes "�������I���邱�Ƃ��ł���B";
	mes "����Ȏ����Ȃ��Ȃ�c�c";
	next;
	switch( select("��ς��Ƃ��Ă����������ł��","�m�荇���ɏ��������߂�") ) {
		case 1: set .@point[2],.@point[2]+1; break;
		case 2: set .@point[3],.@point[3]+1; break;
	}
	mes "[�w�C�X��]";
	mes "���Ȃ��ɏ��������߂�l��������c�c";
	next;
	switch( select("�����ɏ�����","�󋵂����Ă��画�f����","�����Ɗ֌W�Ȃ���Ζ�������") ) {
		case 1:
			set .@point[6],.@point[6]+1;
			break;
		case 2:
			set .@point[1],.@point[1]+1;
			set .@point[5],.@point[5]+1;
			break;
		case 3:
			set .@point[2],.@point[2]+1;
			set .@point[3],.@point[3]+1;
			set .@point[4],.@point[4]+1;
			break;
	}
	mes "[�w�C�X��]";
	mes "��������Ă�Ƌ��R�u���v���������B";
	mes "���Ȃ��Ȃ�ǂ��v���H";
	next;
	switch( select("�u�L���u�����h�А����v","�u���̕��̎�����͒N���H�v","�u�����ċA�낤�v","�u���̂܂܂ɂ��Ă������v") ) {
		case 1:
			set .@point[3],.@point[3]+1;
			break;
		case 2:
			set .@point[6],.@point[6]+1;
			break;
		case 3:
			set .@point[3],.@point[3]+1;
			set .@point[4],.@point[4]+1;
			break;
		case 4:
			set .@point[2],.@point[2]+1;
			break;
	}
	mes "[�w�C�X��]";
	mes "��b�̓r���ŗ��ꂪ�ꂵ���Ȃ������c�c";
	next;
	switch( select("��k�ɂ��Ă��܂���","�b���ς���","�O��I�Ɍ�����ǋ�","���͂Ƃ�����ӂ�") ) {
		case 1: set .@point[4],.@point[4]+1; break;
		case 2: set .@point[1],.@point[1]+1; break;
		case 3: set .@point[2],.@point[2]+1; break;
		case 4: set .@point[6],.@point[6]+1; break;
	}
	mes "[�w�C�X��]";
	mes "���Ȃ��̗��l���A�K�v���Ȃ�";
	mes "������Ȃ��L�O�i�𔃂��Ă����";
	mes "�����Ă����炠�Ȃ��́c�c";
	next;
	switch( select("�ǂ�ȕ��ł����l���]�ނȂ甃��","�f��","���x�����Ă�����ƌ����Ă��܂���") ) {
		case 1: set .@point[1],.@point[1]+1; break;
		case 2: set .@point[3],.@point[3]+1; break;
		case 3: set .@point[4],.@point[4]+1; break;
	}
	mes "[�w�C�X��]";
	mes "�����͂���ŏI���ł��B";
	mes "�����ď��S�ҏC����̉ߒ���";
	mes "�S�ďI�����܂����B";
	mes "����ꂳ�܂ł����B";
	next;
	mes "[�w�C�X��]";
	mes "����͐E�ƓK�������̕�V�ɂȂ�܂��B";
	mes "�󂯎���Ă��������B";
	next;
	set CHANGE_NV,CHANGE_NV|0x2000;
	getitem 501,4;
	getitem 503,2;
	getitem 506,2;
	
	getitem 7059,5; // �J�v���q�ɖ������p��
	getitem 7060,5; // ��Ԉړ��������p��
	set Zeny,Zeny+10000;
	
	next;
	mes "[�w�C�X��]";
	mes "�����]���̔��\��";
	mes "^882420" +strcharinfo(0)+ "^000000�l��";
	mes "�K�����E�Ƃ����������܂��傤�B";
	mes "���X���҂��������B";
	next;
	mes "[�w�C�X��]";
	mes "�c�c�c�c�c�c�c�c";
	mes "�����ɏI���܂��̂ŁB";
	mes "�c�c�c�c�c�c�c�c�c�c�c�c�c�c�c�c";
	next;
	mes "[�w�C�X��]";
	mes "�c�c�c�c�c�c�c�c!!";
	next;
	mes "[�w�C�X��]";
	mes "���ʂ��o�܂����B";
	mes "^882420" +strcharinfo(0)+ "^000000�l��";
	mes "�����]���𔭕\���܂��B";
	next;
	//�|�C���g���ő�̓Y������.@i�Ɋi�[����
	set .@i,1;
	for(set .@j,1; .@j<=5; set .@j,.@j+1) {
		if(.@point[.@i] < .@point[.@j+1])
			set .@i,.@j+1;
	}
	setarray .@name$[1],"���m","�}�W�V����","���l","�V�[�t","�A�[�`���[","�A�R���C�g";
	switch(.@i) {
		case 1:
			mes "[�w�C�X��]";
			mes "�P���Œ����I�Ȑ��i������";
			mes "�M�O�������āA���E�ɑ傫�ȉe����";
			mes "�^����l�ɂȂ邱�Ƃ�]��ł���B";
			mes "�ア�l����낤�Ƃ���`�������^�C�v�B";
			next;
			mes "[�w�C�X��]";
			mes "���Ȏ咣���������Ȃ���";
			mes "^696969���m^000000����Ԏ������܂��B";
			break;
		case 2:
			mes "[�w�C�X��]";
			mes "�l�ɋ����Ɍ����Ȃ��悤�A";
			mes "���ׂĂ𗝉����悤�Ƃ���A��l��";
			mes "�d��������Ɨ��I�ȃ^�C�v�B";
			mes "���m�I�Ŕ��f�͂������B";
			mes "�����I�A���͓I�œ��@�͂�";
			mes "�����Ă���^�C�v�B";
			next;
			mes "[�w�C�X��]";
			mes "�ώ@���D���Ȃ��Ȃ��ɂ�";
			mes "^696969�}�W�V����^000000����Ԏ������܂��B";
			break;
		case 3:
			mes "[�w�C�X��]";
			mes "�l�X�̐S�����悭�c������";
			mes "��O�I�Ȋ��o���D��Ă���B";
			mes "�g�D�I�Ō��f�͂�����B";
			mes "�ڕW�w���I�ŁA�ӔC����������";
			mes "��{�I�Ɋy�ϓI�B";
			next;
			mes "[�w�C�X��]";
			mes "���A�~���������Ȃ��ɂ�";
			mes "^696969���l^000000����Ԏ������܂��B";
			break;
		case 4:
			mes "[�w�C�X��]";
			mes "�l��������ɉ߂������Ƃ���";
			mes "�~���������B�����V�����d����";
			mes "�T���Ȃ���A���E�Ɋ�^���邱�Ƃ�";
			mes "�]�ރ^�C�v�B";
			next;
			mes "[�w�C�X��]";
			mes "�`���S�L���Ȃ��Ȃ��ɂ�";
			mes "^696969�V�[�t^000000�̐E�Ƃ���Ԏ������܂��B";
			break;
		case 5:
			mes "[�w�C�X��]";
			mes "���i�����ł�������Ȃ��Ȃ�";
			mes "�F��Ȋ���𗝉����悤�Ɠw�͂��A";
			mes "�Ȃ����̐l�ɂ��������ĖႦ��悤";
			mes "�w�͂���^�C�v�B";
			mes "�܂��A���}�ȓ���ɖ��������A";
			mes "���������̐l�������o�����Ƃ���B";
			next;
			mes "[�w�C�X��]";
			mes "���󐫂��L���Ń��}���h�̂��Ȃ��ɂ�";
			mes "^696969�A�[�`���[^000000����Ԏ������܂��B";
			break;
		case 6:
			mes "[�w�C�X��]";
			mes "�S���������A�D�����A�l�ɔz������B";
			mes "�N�ɂł������u�ĂȂ��ڂ��A";
			mes "�����悤�Ƃ���B�l�̐��b������";
			mes "���Ƃ��D���ȃ^�C�v�B�����͐l��";
			mes "�������K�v�Ȃ��悤�ɋC�����A����";
			mes "�l�ɗ�����`�҂ƌĂ΂��^�C�v�B";
			next;
			mes "[�w�C�X��]";
			mes "�l�������邱�Ƃ��D���Ȃ��Ȃ��ɂ�";
			mes "^696969�A�R���C�g^000000����Ԏ������܂��B";
			//mes "*���Ȃ̋]���ɂ�葼�̍K�����肤��*";
			break;
	}
	mes "�c�c�Ə����Ă���܂��B";
	next;
	mes "[�w�C�X��]";
	mes "���Ȃ��̑����]���̌��ʂ͂ǂ��ł���";
	mes "����͈�̎Q�l�ޗ��ɉ߂��܂���B";
	mes "����ł́A�ǂ̐E�Ƃ���]����܂����H";
	mes "�������ʂ�" +.@name$[.@i]+ "�A�������͑���";
	mes "�E�Ƃł��傤���H";
	next;
	mes "[�w�C�X��]";
	mes "�Q�l�ޗ��Ƃ��Č����Ă����܂����A";
	mes "�������ʂƓ����E�Ƃ�I�΂���";
	mes "��葽���̎x�����󂯂邱�Ƃ�";
	mes "�ł��܂��B�ł́A���I�т��������B";
	next;
	if(select(.@name$[.@i]+"�ŁI","�����]�ސE�ƂŁI")==1) {
		mes "[�w�C�X��]";
		mes "�������܂����B";
		mes "�������ʂ�M����̂ł��ˁB";
		mes "����ł͕��i�̎x����ɁA�E�Ƃ�";
		mes "�֌W����X�ւ����肵�܂��傤�B";
		next;
		mes "^882420[�x������]^000099";
		switch(.@i) {
		case 1:
			mes "�t�@���V�I�� 1��";
			getitem 1104,1;
			break;
		case 2:
			mes "���b�h 1��";
			mes "�J�b�^�[ 1��";
			getitem 1601,1;
			getitem 1204,1;
			break;
		case 3:
			mes "�o�g���A�b�N�X 1��";
			getitem 1351,1;
			break;
		case 4:
			mes "�}�C���S�[�V�� 1��";
			getitem 1207,1;
			break;
		case 5:
			mes "�R���|�W�b�g�{�E 1��";
			getitem 1704,1;
			break;
		case 6:
			mes "���C�X 1��";
			getitem 1504,1;
			break;
		}
		mes "�v���R�� 7��";
		mes "���S�җp�|�[�V���� 10��^000000";
		getitem 1010,7;
		getitem 569,10;
		next;
		mes "[�w�C�X��]";
		mes "�x���i���S�Ă�����Ă��邩";
		mes "���m�F���������B����ł�";
		mes "�x�����ꂽ�A�C�e���ɂ���";
		mes "�ȒP�ɂ��������܂��傤�B";
		next;
		mes "[�w�C�X��]";
		switch(.@i) {
		case 1:
			mes "�u�t�@���V�I���v�͌��m�ɓ]�E�����ہA";
			break;
		case 2:
			mes "�u���b�h�v��u�J�b�^�[�v��";
			mes "�}�W�V�����ɓ]�E�����ہA";
			break;
		case 3:
			mes "�u�o�g���A�b�N�X�v��";
			mes "���l�ɓ]�E�����ہA";
			break;
		case 4:
			mes "�u�}�C���S�[�V���v��";
			mes "�V�[�t�ɓ]�E�����ہA";
			break;
		case 5:
			mes "�u�R���|�W�b�g�{�E�v��";
			mes "�A�[�`���[�ɓ]�E�����ہA";
			break;
		case 6:
			mes "�u���C�X�v�̓A�R���C�g�ɓ]�E�����ہA";
			break;
		}
		mes "���S�җp�}�C���S�[�V���̑����";
		mes "�悭�g���悤�ɂȂ镐��ł��B";
		next;
		mes "[�w�C�X��]";
		mes "�u�v���R���v�́A�b�艮��";
		mes "���탌�x��1�̃A�C�e������i�K";
		mes "�A�b�v�O���[�h�����鎞�Ɏg�p����";
		mes "�A�C�e���ł��B�������̊X�ɂ�";
		mes "�b��E�l���c�Ƃ��Ă��鐸�B����";
		mes "����܂��B";
		next;
		mes "[�w�C�X��]";
		mes "�]�E��ɂł��v���R����������";
		mes "�s���Ă݂Ă͂������ł��傤�B";
		Place .@i;
		mes "��x�s���Ă݂�Ɨǂ��ł��傤�B";
	}
	else {
		mes "[�w�C�X��]";
		mes "�������܂����B";
		mes "�ł́A����]�̐E�Ƃ�";
		mes "���I�т��������B";
		next;
		set .@name$[.@i],"";	//�������ʂƓ����E�Ƃ͋󕶎��Ŗ��߂�
		set .@i,select(.@name$[1],.@name$[2],.@name$[3],.@name$[4],.@name$[5],.@name$[6]);
		mes "[�w�C�X��]";
		mes .@name$[.@i]+ "�ł��ˁB";
		Place .@i;
		next;
		mes "[�w�C�X��]";
		mes "����ł͕��i�̎x����ɁA�E�Ƃ�";
		mes "�֌W����X�ւ����肵�܂��傤�B";
		next;
		mes "^882420[�x������]";
		mes "^000030�A�h�x���`���[�X�[�c 1��";
		mes "^000099���S�җp�|�[�V���� 10��^000000";
		getitem 2305,1;
		getitem 569,10;
		next;
		mes "[�w�C�X��]";
		mes "�x���i���S�Ă�����Ă��邩";
		mes "���m�F���������B����ł�";
		mes "�x�����ꂽ�A�C�e���ɂ���";
		mes "�ȒP�ɂ��������܂��傤�B";
		next;
		mes "[�w�C�X��]";
		mes "�A�h�x���`���[�X�[�c�́A����";
		mes "�x������Ă��鏉�S�җp�E�҃X�[�c";
		mes "�̎��ɒ��邱�ƂɂȂ镞�ł��B";
	}
	next;
	mes "[�w�C�X��]";
	mes "�ł́A����܂��B";
	mes "^882420" +strcharinfo(0)+ "^000000�l��";
	mes "�����^���F��܂��B���悤�Ȃ�B";
	close2;
	set CHANGE_NV,0;
	switch(.@i) {
		case 1:
			savepoint "izlude",94,103;
			warp "izlude_in",74,167;
			break;
		case 2:
			savepoint "geffen",120,38;
			warp "geffen_in",163,98;
			break;
		case 3:
			savepoint "alberta",31,231;
			warp "alberta_in",62,44;
			break;
		case 4:
			savepoint "morocc",149,100;
			warp "moc_ruins",155,44;
			break;
		case 5:
			savepoint "payon",256,242;
			warp "payon_in02",64,65;
			break;
		case 6:
			savepoint "prontera",116,72;
			warp "prt_church",172,19;
			break;
	}
	end;
}