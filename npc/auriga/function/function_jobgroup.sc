//==============================================================================
// Ragnarok Online Job Group Functions
//==============================================================================
//	Grp_Novice  �F�@�@�m�[�r�X�n��i�m�[�r�X�A�X�[�p�[�m�[�r�X�j
//	Grp_Swordman�F�@�\�[�h�}���n��i�\�[�h�}���A�i�C�g�A�N���Z�C�_�[�j
//	Grp_Magician�F�@�}�W�V�����n��i�}�W�V�����A�E�B�U�[�h�A�Z�[�W�j
//	Grp_Archer  �F�@�A�[�`���[�n��i�A�`���A�n���^�A�o�[�h�A�_���T�[�j
//	Grp_Acolyte �F�@�A�R���C�g�n��i�A�R���C�g�A�v���[�X�g�A�����N�jk
//	Grp_Merchant�F�}�[�`�����g�n��i�}�[�`�����g�A�u���b�N�X�~�X�A�A���P�~�X�g�j
//	Grp_Thief   �F�@�@�@�V�[�t�n��i�V�[�t�A�A�T�V���A���[�O�j
//	Grp_TaeKwon �F�@�@�@�e�R���n��i�e�R���L�b�h�A�����A�\�E�������J�[�j
//------------------------------------------------------------------------------
function	script	JobGroup	{
	set .@cnt, 0;
	while(getargcount() > .@cnt) {
		switch(getarg(.@cnt)) {
		case Grp_Novice:
			if(Class == Job_Novice || Class == Job_SuperNovice)
				return 1;
			break;
		case Grp_Swordman:
			if(Class == Job_Swordman || Class == Job_Knight || Class == Job_Crusader)
				return 1;
			break;
		case Grp_Magician:
			if(Class == Job_Magician || Class == Job_Wizard || Class == Job_Sage)
				return 1;
			break;
		case Grp_Archer:
			if(Class == Job_Archer || Class == Job_Hunter || Class == Job_Bard || Class == Dancer)
				return 1;
			break;
		case Grp_Acolyte:
			if(Class == Job_Acolyte || Class == Job_Priest || Class == Job_Monk)
				return 1;
			break;
		case Grp_Merchant:
			if(Class == Job_Merchant || Class == Job_Blacksmith || Class == Job_Alchemist)
				return 1;
			break;
		case Grp_Thief:
			if(Class == Job_Thief || Class == Job_Assassin || Class == Job_Rogue)
				return 1;
			break;
		case Grp_TaeKwon:
			if(Class == Job_TaeKwon || Class == Job_StarGladiator || Class == Job_SoulLinker)
				return 1;
			break;
		}
		set .@cnt, .@cnt + 1;
	}
	return 0;
}