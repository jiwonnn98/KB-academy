package service;

import java.util.List;

import dao.BannerDao;
import dao.BannerDaoImpl;

public class BannerServiceImpl implements BannerService {
	
	private static BannerService instance = new BannerServiceImpl();
	private BannerServiceImpl() {}
	private BannerDao bannerDao = BannerDaoImpl.getInstance();
	public static BannerService getInstance() {
		return instance;
	}

	
	@Override
	public List<String> listBanner() {
		List<String> list = bannerDao.listBanner();
		if(list.isEmpty()) {
			throw new RuntimeException("리스트에 배너 목록이 없습니다");
		}
		return list;
	}

}
