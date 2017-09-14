import { Angular4ClientPage } from './app.po';

describe('angular4-client App', function() {
  let page: Angular4ClientPage;

  beforeEach(() => {
    page = new Angular4ClientPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
