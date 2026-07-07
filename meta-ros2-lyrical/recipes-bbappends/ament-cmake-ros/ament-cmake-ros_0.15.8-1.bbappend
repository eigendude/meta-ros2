# rmw-test-fixture-implementation is skipped when meta-zenoh is absent.
# Do not leave ament-cmake-ros with a dangling runtime dependency on it.
RDEPENDS:${PN}:remove = "${@bb.utils.contains('BBFILE_COLLECTIONS', 'zenoh-layer', '', 'rmw-test-fixture-implementation', d)}"
